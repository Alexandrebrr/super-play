
package com.supplay.player.data
import android.content.Context
import kotlin.random.Random
object DeviceManager {
    fun getOrCreateDeviceId(context: Context): String {
        val prefs = context.getSharedPreferences("superplay_prefs", Context.MODE_PRIVATE)
        var id = prefs.getString("device_id", null)
        if (id == null) {
            val chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            id = (1..4).map { chars[Random.nextInt(chars.length)] }.joinToString("") + "-" +
                 (1..4).map { chars[Random.nextInt(chars.length)] }.joinToString("")
            prefs.edit().putString("device_id", id).apply()
        }
        return id
    }
}
