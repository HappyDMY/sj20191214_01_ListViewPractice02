package com.example.sj20191214_01_listviewpractice02

import android.os.Bundle
import android.os.UserHandle
import com.example.sj20191214_01_listviewpractice02.datas.GameData
import java.util.ArrayList

class MainActivity : BaseActivity() {

    val gameList = ArrayList<GameData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvents()
        setValues()
    }
    override fun setUpEvents() {
    }

    override fun setValues() {
        addGames()
    }

    fun addGames(){
        gameList.add(GameData("아스팔트8 : 어어본", "gameLoft"))
        gameList.add(GameData("아스팔트7 : 어어본", "gameComp7"))
        gameList.add(GameData("아스팔트6 : 어어본", "gameComp6"))
        gameList.add(GameData("아스팔트5 : 어어본", "gameComp5"))
        gameList.add(GameData("아스팔트4 : 어어본", "gameComp4"))

    }


}
