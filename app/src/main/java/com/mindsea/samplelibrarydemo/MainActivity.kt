package com.mindsea.samplelibrarydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mindsea.library.Logger
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logger = Logger()
        helloTextView.text = logger.message
    }
}
