package com.singularity_indonesia.navigation_ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.singularity_code.codebase.pattern.Register
import com.singularity_indonesia.core_common.pattern.Back
import com.singularity_indonesia.core_common.pattern.Destination
import com.singularity_indonesia.core_common.util.automate
import com.singularity_indonesia.core_common.util.createRegister
import com.singularity_indonesia.navigation_domain.MainNavigation
import com.singularity_indonesia.navigation_domain.MainNavigationEvent
import com.singularity_indonesia.navigation_domain.payload.DashboardScreenPayload
import com.singularity_indonesia.navigation_domain.payload.LoginScreenPayload
import com.singularity_indonesia.navigation_domain.screen.DashboardDestination
import com.singularity_indonesia.navigation_domain.screen.DashboardScreen
import com.singularity_indonesia.navigation_domain.screen.LoginDestination
import com.singularity_indonesia.navigation_domain.screen.LoginScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import org.koin.dsl.bind
import org.koin.dsl.module
import org.koin.java.KoinJavaComponent

/**
 * Created by: stefanus
 * 10/09/23 11.44
 * Design by: stefanus.ayudha@gmail.com
 */
data class Screens(
    val loginScreen: Lazy<LoginScreen> = KoinJavaComponent.inject(
        clazz = LoginScreen::class.java
    ),
    val dashboardScreen: Lazy<DashboardScreen> = KoinJavaComponent.inject(
        clazz = DashboardScreen::class.java
    )
)

data class MainNavigationImpl(
    private val uiScope: CoroutineScope
) : MainNavigation {

    override val event: Register<MainNavigationEvent> by lazy {
        with(uiScope) {
            createRegister(MainNavigationEvent.Idle)
        }
    }

    private val destination by lazy {
        with(uiScope) {
            MutableStateFlow<Destination<*>?>(null)
                .automate {
                    event.data.collect { event ->
                        when (event) {

                            is MainNavigationEvent.GoToLogin -> {
                                emit(
                                    LoginDestination(
                                        payload = null
                                    )
                                )
                            }

                            is MainNavigationEvent.GoToDashboard -> {
                                emit(
                                    DashboardDestination(
                                        payload = null
                                    )
                                )
                            }

                            is MainNavigationEvent.GoBack -> {
                                emit(Back())
                            }

                            else -> {
                                // do nothing
                            }
                        }
                    }
                }
        }
    }

    @Composable
    override fun Content() {
        val navController = rememberNavController()
        val screens = remember { Screens() }
        val destination = destination.collectAsState().value
        val viewModelStoreOwner = checkNotNull(LocalViewModelStoreOwner.current) {
            "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
        }

        LaunchedEffect(destination) {
            destination?.let {
                if (it is Back)
                    navController.popBackStack()
                else
                    navController.navigate(it.route)
            }
        }

        NavHost(
            navController = navController,
            startDestination = LoginScreen.ROUTE
        ) {
            composable(LoginScreen.ROUTE) {
                val payload = (destination?.payload as? LoginScreenPayload)
                    ?: LoginScreenPayload(
                        mainNavigation = this@MainNavigationImpl,
                        viewModelStoreOwner = viewModelStoreOwner
                    )
                screens.loginScreen.value(
                    payload
                )
            }
            composable(DashboardScreen.ROUTE) {
                // clear event
                val payload = (destination?.payload as? DashboardScreenPayload)
                    ?: DashboardScreenPayload(
                        mainNavigation = this@MainNavigationImpl
                    )
                screens.dashboardScreen.value(
                    payload
                )
            }
        }
    }
}