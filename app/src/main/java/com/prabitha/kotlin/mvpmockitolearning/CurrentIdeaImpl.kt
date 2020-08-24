package com.prabitha.kotlin.mvpmockitolearning

import kotlin.random.Random

class CurrentIdeaImpl    : CurrentIdeaRepo {

    private val ideas= arrayListOf<CurrentIdea>()

    override fun getIdea() : CurrentIdea {
        ideas.clear()
        ideas .add( CurrentIdea(1,"Coffee",10))
        ideas .add(  CurrentIdea(2,"Tea",10))
        ideas .add(  CurrentIdea(3,"Boost",10))

        return (ideas.get(0))

    }
}

interface  CurrentIdeaRepo{
    fun getIdea():CurrentIdea
}