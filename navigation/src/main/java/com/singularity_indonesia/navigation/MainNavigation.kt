package com.singularity_indonesia.navigation

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.singularity_code.codebase.pattern.Payload
import com.singularity_indonesia.core.core_common.navigation.Destination
import com.singularity_indonesia.core.core_common.navigation.Navigation
import com.singularity_indonesia.dashboard_domain.payload.DashboardScreenPayload
import com.singularity_indonesia.dashboard_domain.screen.DashboardScreen
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import org.koin.java.KoinJavaComponent.inject

/**
 * Created by: stefanus
 * 09/09/23 20.35
 * Design by: stefanus.ayudha@gmail.com
 */

data class Screens(
    val dashboardScreen: Lazy<DashboardScreen> = inject(
        clazz = DashboardScreen::class.java
    )
)

class MainNavigation(
    private val uiScope: CoroutineScope
) : Navigation {

    private lateinit var navController: NavHostController
    private val destination = MutableStateFlow<Destination<*>?>(null)

    override fun <D : Destination<P>, P : Payload> navigate(
        destination: D,
        clearBackStack: Boolean
    ) {
        if (clearBackStack) {
            uiScope.launch {
                clearBackStack()
            }
        }
    }

    private suspend fun clearBackStack() {
        val currentBackStack = navController.currentBackStack.first()
        currentBackStack.forEach {
            navController.clearBackStack(it.id)
        }
    }

    override fun goBack(): Boolean {
        TODO("Not yet implemented")
    }

    @Composable
    override fun Content() {
        navController = rememberNavController()

        val screens = remember { Screens() }
        val destination = destination.collectAsState().value

        LaunchedEffect(destination) {
            destination?.let {
                navController.navigate(it.route)
            }
        }

        NavHost(
            navController = navController,
            startDestination = DashboardScreen.ROUTE
        ) {
            composable("start") {
                Text("Start")
            }
            composable(DashboardScreen.ROUTE) {
                val payload = destination?.payload as? DashboardScreenPayload
                screens.dashboardScreen.value.invoke(payload)
            }
        }
    }

}