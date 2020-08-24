package com.prabitha.kotlin.mvpmockitolearning


class MainPresenter( view : MainContract.View) : MainContract.Presenter    {

    private var view: MainContract.View? =view
    override fun loadIdea() {
        val  currentIdeaRepo = CurrentIdeaImpl()

        val idea=currentIdeaRepo.getIdea()
        view?.updateUI(idea)
    }

    override fun onDestroy() {
        this.view=null
    }




}

