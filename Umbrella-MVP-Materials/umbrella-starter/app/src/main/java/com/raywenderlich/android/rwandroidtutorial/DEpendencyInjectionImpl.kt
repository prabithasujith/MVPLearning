package com.raywenderlich.android.rwandroidtutorial

import DependencyInjection

class DependencyInjectionImpl : DependencyInjection{
    override fun weatherRepository(): WeatherRepository {
return WeatherRepositoryImpl()

    }
}