package com.example.rayosimverfinal

import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class MainViewModel(private val sharedPreferences: SharedPreferences): ViewModel() {

    private val _luckyNumber: MutableLiveData<String> = MutableLiveData()
    val luckyNumber: LiveData<String> = _luckyNumber

    fun onBtnRollPressed() {
        val randomNumber = Math.random()  // generates a random number between 0 and 1
        val maxLuckyNumber = sharedPreferences.getInt("MAX_LUCKY_NUMBER", 11)
        val randomNumberFrom0To100 = (randomNumber * maxLuckyNumber).toInt()
        _luckyNumber.postValue(randomNumberFrom0To100.toString())
    }

    // just put it to remind you that it exits
    override fun onCleared() {
        super.onCleared()
    }
}