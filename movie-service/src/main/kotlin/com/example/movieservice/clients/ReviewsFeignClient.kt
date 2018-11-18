package com.example.movieservice.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@FeignClient("reviews-service")
interface ReviewsFeignClient{

    @RequestMapping("/reviews/{movieId}")
    fun getReviews(@PathVariable("movieId") movieId:String) : Array<String>
}