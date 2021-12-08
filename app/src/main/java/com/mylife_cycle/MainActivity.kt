package com.mylife_cycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG = "Poem"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Сорока-ворона")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Кашу варила,")

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Деток кормила.")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Этому дала,")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Этому дала,")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "А этому не дала.")


    }

    }


