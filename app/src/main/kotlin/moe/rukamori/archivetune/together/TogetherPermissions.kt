/*
 * ArchiveTune (2026)
 * © Rukamori — github.com/rukamori
 * GPL-3.0 License | Contributors: see git history
 * Do not remove or alter this notice. - Per GPL-3.0 Section 4 & Section 5
 */

package moe.rukamori.archivetune.together

import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import androidx.core.content.ContextCompat

object TogetherPermissions {
    const val ACCESS_LOCAL_NETWORK = "android.permission.ACCESS_LOCAL_NETWORK"

    fun localNetworkPermission(): String? =
        if (Build.VERSION.SDK_INT >= 37) ACCESS_LOCAL_NETWORK else null

    fun hasLocalNetwork(context: Context): Boolean {
        val permission = localNetworkPermission() ?: return true
        return ContextCompat.checkSelfPermission(context, permission) == PackageManager.PERMISSION_GRANTED
    }
}
