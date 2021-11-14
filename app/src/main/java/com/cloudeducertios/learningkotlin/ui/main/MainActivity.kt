package com.cloudeducertios.learningkotlin.ui.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import com.cloudeducertios.learningkotlin.databinding.ActivityMainBinding
import com.cloudeducertios.learningkotlin.databinding.ActivityMainBinding.inflate

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val TAG = "Lifecycle"
    private var count = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("key")
        }
        binding.textCount.text = count.toString()
        Log.e(TAG, "On Create call")

        gameScore()
    }

    /**
     * this method tell us
     * any value save to the bundle...
     */
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putInt("key", count)
        super.onSaveInstanceState(outState)

    }


    override fun onStart() {
        super.onStart()
        Log.e(TAG, "On start call.")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "On resume call.")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "On pause call.")
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "On stop call.")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "On restart call.")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "On destroy call.")
    }

    private fun gameScore() {
        binding.btnClick.setOnClickListener {
            count++
            Toast.makeText(this, "click", Toast.LENGTH_SHORT).show()
            binding.textCount.text = count.toString()
        }


    }
}


