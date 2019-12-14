package com.example.sj20191214_01_listviewpractice02

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity(){
    val mContext = this
    abstract fun setUpEvents()
    abstract fun setValues()

}