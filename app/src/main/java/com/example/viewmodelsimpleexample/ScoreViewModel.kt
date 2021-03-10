package com.example.viewmodelsimpleexample

import androidx.lifecycle.ViewModel

class ScoreViewModel: ViewModel() {

    var score = 0

    fun increaseScore(){
        score++
    }

    fun resetScore(){
        score = 0
    }

}