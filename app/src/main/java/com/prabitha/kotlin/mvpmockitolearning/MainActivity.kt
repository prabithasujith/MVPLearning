package com.prabitha.kotlin.mvpmockitolearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,MainContract.View{

internal  lateinit var presenter : MainContract.Presenter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setPresenter(MainPresenter(this))
        presenter.loadIdea()
        button.setOnClickListener { v: View? -> presenter.loadIdea()}

    }



    override fun updateUI(idea: CurrentIdea) {

     textView.text=idea.idea    }

    override fun setPresenter(presenter: MainContract.Presenter) {
        this.presenter=presenter
    }




}