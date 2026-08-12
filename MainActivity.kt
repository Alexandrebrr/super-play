
package com.supplay.player.ui
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.supplay.player.data.DeviceManager
import com.supplay.player.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val deviceId = DeviceManager.getOrCreateDeviceId(this)
        binding.txtId.text = deviceId
    }
}
