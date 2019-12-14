package com.example.sj20191214_01_listviewpractice02.adepters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.example.sj20191214_01_listviewpractice02.R
import com.example.sj20191214_01_listviewpractice02.datas.GameData

class GameAdepter(context:Context, resID: Int, list:ArrayList<GameData>)
    :ArrayAdapter<GameData>(context, resID,list){

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null){
            tempRow = inf.inflate(R.layout.game_list_item, null)

        }
        val row = tempRow!!

        val data = mList.get(position)

        val gameTitleTxt = row.findViewById<TextView>(R.id.gameTitleTxt)
        val gameCompanyTxt= row.findViewById<TextView>(R.id.gameCompanyTxt)

        return row
    }

}