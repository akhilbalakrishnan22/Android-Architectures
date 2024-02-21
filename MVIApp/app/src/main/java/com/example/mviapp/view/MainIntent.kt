package com.example.mviapp.view

sealed class MainIntent {

    data object FetchAnimal : MainIntent()

}