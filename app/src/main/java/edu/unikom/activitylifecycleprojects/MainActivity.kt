package edu.unikom.activitylifecycleprojects

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    companion object{
        private const val  TAG = "MainActivity"
    }

    fun launchMainActivity2(view: View){
        startActivity(Intent(this, MainActivity2::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreat Terpanggil")

    }



    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart Terpanggil")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume Terpanggil")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart Terpanggil")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause Terpanggil")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop Terpanggil")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestrot Terpanggil")
    }

}