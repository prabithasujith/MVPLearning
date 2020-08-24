package com.prabitha.kotlin.mvpmockitolearning


interface  MainContract{
    interface Presenter:BasePresenter
    {
        fun loadIdea()
    }
    interface View:BaseView<Presenter>
    {
      fun  updateUI(ideas:CurrentIdea)
    }
}