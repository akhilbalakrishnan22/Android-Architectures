package com.example.mviapp.api

import com.example.mviapp.model.Animal

class AnimalRepository(private val api: AnimalApi) {
    suspend fun getAnimals(): List<Animal> = api.getAnimals()
}