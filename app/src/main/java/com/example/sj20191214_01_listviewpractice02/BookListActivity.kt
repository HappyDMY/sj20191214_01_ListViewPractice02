package com.example.sj20191214_01_listviewpractice02

import android.os.Bundle
import com.example.sj20191214_01_listviewpractice02.adepters.BookAdepter
import com.example.sj20191214_01_listviewpractice02.datas.BookData
import kotlinx.android.synthetic.main.activity_book_list.*
import java.util.ArrayList

class BookListActivity : BaseActivity() {

    val bookList = ArrayList<BookData>()
    var bookAdapter: BookAdepter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_list)
    }

    override fun setUpEvents() {
    }

    override fun setValues() {
        addBooks()

        bookAdapter = BookAdepter(mContext, R.layout.game_list_item,bookList)
        bookListView.adapter = bookAdapter
    }

    fun addBooks() {
        bookList.add(BookData("드래곤볼 ", "일본"))
        bookList.add(BookData("해리포터", "영국"))
        bookList.add(BookData("반지의 제왕", "미국"))
    }
}
