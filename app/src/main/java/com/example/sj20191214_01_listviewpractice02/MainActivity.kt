package com.example.sj20191214_01_listviewpractice02

import android.os.Bundle

class MainActivity : BassActivity() {
    override fun setUpEvents() {
    }

    override fun setValues() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvents()
        setValues()
    }
}
