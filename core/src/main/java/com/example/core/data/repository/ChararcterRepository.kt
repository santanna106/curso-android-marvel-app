package com.example.core.data.repository

interface ChararcterRepository<T> {
    fun getCharacters(query:String): T

}