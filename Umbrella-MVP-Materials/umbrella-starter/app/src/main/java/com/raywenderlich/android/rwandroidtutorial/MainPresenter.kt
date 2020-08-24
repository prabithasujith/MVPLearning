package com.raywenderlich.android.rwandroidtutorial

import DependencyInjection

class MainPresenter(view: MainContract.View, dependencyInjection: DependencyInjection) :MainContract.Presenter {


    private val weatherRepository: WeatherRepository
            = dependencyInjection.weatherRepository()

    private var view: MainContract.View? = view
    override fun onViewCreated() {
        loadWeather()
    }


    override fun onLoadWeatherTapped() {
        loadWeather()
    }

    override fun onDestroy() {
        this.view=null
    }

    private fun loadWeather() {
        val weather = weatherRepository.loadWeather()
        val weatherState = weatherStateForWeather(weather)
        view?.displayWeatherState(weatherState)
    }

    private fun weatherStateForWeather(weather: Weather) : WeatherState {
        if (weather.rain!!.amount!! > 0) {
            return WeatherState.RAIN
        }
        return WeatherState.SUN
    }
}