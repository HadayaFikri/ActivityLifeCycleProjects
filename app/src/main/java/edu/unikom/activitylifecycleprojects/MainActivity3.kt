package edu.unikom.activitylifecycleprojects

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


class MainActivity3 : AppCompatActivity() {
    companion object{
        private const val  TAG = "MainActivity3"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main3)
        Log.d(TAG,  "onCreat Main3 Terpanggil:")

    }
}
