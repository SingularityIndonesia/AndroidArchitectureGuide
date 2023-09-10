package com.singularity_indonesia.core_common.util

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.provider.Settings
import android.widget.Toast

/**
 * Created by: stefanus
 * 10/09/23 03.34
 * Design by: stefanus.ayudha@gmail.com
 */
context(Activity)
fun preparePluto() {
    if (!Settings.canDrawOverlays(this@Activity)) {
        val intent = Intent(
            Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
            Uri.parse("package:$packageName")
        )

        startActivityForResult(intent, 0)

        Toast.makeText(
            this@Activity,
            "Allow Pluto to display over window.",
            Toast.LENGTH_SHORT
        ).show()
    }
}