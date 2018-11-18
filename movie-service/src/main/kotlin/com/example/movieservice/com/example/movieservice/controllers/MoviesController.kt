package com.example.movieservice.com.example.movieservice.controllers

import com.example.movieservice.clients.ReviewsFeignClient
import com.example.movieservice.model.Movie
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MoviesController(val reviewsFeignClient: ReviewsFeignClient){

    val movies = mapOf(
            "1" to Movie("1","The Shawshank Redemption","Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency. ","Frank Darabont"),
            "2" to Movie("2","The Godfather", "The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son. ","Francis Ford Coppola"),
            "3" to Movie("3", "The Godfather: Part II", "The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate. ", "Francis Ford Coppola")
    )

    @RequestMapping("/movies/{movieId}")
    fun getMovie(@PathVariable("movieId") movieId:String) : Movie? {
        return movies[movieId]?.withReviews(reviewsFeignClient.getReviews(movieId))
    }

}