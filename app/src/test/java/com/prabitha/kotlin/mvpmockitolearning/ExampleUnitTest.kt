package com.prabitha.kotlin.mvpmockitolearning

import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

   lateinit var presenter: MainPresenter

   lateinit var view:MainPresenter.View
    @Test
    fun addition_isCorrect() {
presenter.loadIdeasFromRepo()
    }

    @Before
    fun setValues(){
       view= mock()
        presenter=MainPresenter(view )
    }
}