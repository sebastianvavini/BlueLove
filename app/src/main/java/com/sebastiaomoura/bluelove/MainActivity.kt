package com.sebastiaomoura.bluelove

import android.bluetooth.BluetoothManager
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lateinit var mBluetoothManager: BluetoothManager
        fun foo(context: Context){
            mBluetoothManager = context.getSystemService(Context.BLUETOOTH_SERVICE) as BluetoothManager
        }


    }
}