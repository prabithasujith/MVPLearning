package com.prabitha.kotlin.mvpmockitolearning

interface BaseView<T> {

    fun setPresenter(presenter:T)
}