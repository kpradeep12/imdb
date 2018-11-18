package com.example.movieservice.clients

import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(value = "reviews-service", url = "http://localhost:8761")
interface ReviewsFeignClient{

    @RequestMapping(method = [RequestMethod.GET], value = ["/reviews/{movieId}"])
    fun getReviews(@PathVariable("movieId") movieId:String) : Array<String>
}