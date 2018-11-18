package com.example.movieservice.model

data class Movie(
        val id:String,
        val name:String,
        val description:String,
        val director:String
){
    private var reviews:Array<String> = arrayOf()

    fun withReviews(reviews:Array<String>): Movie{
        this.reviews = reviews
        return this
    }
}