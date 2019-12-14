package com.example.sj20191214_01_listviewpractice02

import android.content.Intent
import android.os.Bundle
import android.os.UserHandle
import android.widget.Toast
import com.example.sj20191214_01_listviewpractice02.adepters.GameAdepter
import com.example.sj20191214_01_listviewpractice02.datas.GameData
import kotlinx.android.synthetic.main.activity_main.*
import java.util.ArrayList

class MainActivity : BaseActivity() {

    var gameAdepter:GameAdepter? = null

    val gameList = ArrayList<GameData>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpEvents()
        setValues()
    }
    override fun setUpEvents() {

        gameListView.setOnItemLongClickListener { parent, view, position, id ->

            val clickedGameData = gameList.get(position)

//            Toast.makeText(mContext, "${clickedGameData.title} 을 삭제하려고 함", Toast.LENGTH_SHORT).show()

            gameList.removeAt(position)

            return@setOnItemLongClickListener true
        }

        gameListView.setOnItemClickListener { parent, view, position, id ->

            val clickedGameData = gameList.get(position)
            Toast.makeText(mContext, "${clickedGameData.title} 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(mContext, GameDetailActivity::class.java)
            intent.putExtra("gameData", clickedGameData)
            startActivity(intent)

        }
    }

    override fun setValues() {
        addGames()
        gameAdepter = GameAdepter(mContext, R.layout.game_list_item,gameList)
        gameListView.adapter = gameAdepter
    }

    fun addGames() {
        gameList.add(GameData("아스팔트 8 : 에어본", "Gameloft"))
        gameList.add(GameData("MineCraft - Pocket Edition", "Mojang"))
        gameList.add(GameData("아스팔트 7 : 히트", "Gameloft"))
        gameList.add(GameData("팔라독(Paladog)", "FazeCat"))
        gameList.add(GameData("Plants Vs. Zombie", "EA Swiss Sarl"))
        gameList.add(GameData("스왐피 (Swampy)", "Disney"))
    }


}

private fun Intent.putExtra(s: String, clickedGameData: GameData) {

}
