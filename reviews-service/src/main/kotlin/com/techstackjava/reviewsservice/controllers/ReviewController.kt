package com.techstackjava.reviewsservice.controllers

import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ReviewController{
    val reviews = mapOf(
            "1" to arrayOf("""Misery and Stand By Me were the best adaptations up until this one, now you can add Shawshank to that list.

                This is simply one of the best films ever made and I know I am not the first to say that and I certainly won't be the last. The standing on the IMDb is a true barometer of that. #3 as of this date and I'm sure it could be number 1. So I'll just skip all the normal praise of the film because we all know how great it is. But let me perhaps add that what I find so fascinating about Shawshank is that Stephen King wrote it.""",
                    "I have never seen such an amazing film since I saw The Shawshank Redemption. Shawshank encompasses friendships, hardships, hopes, and dreams. And what is so great about the movie is that it moves you, it gives you hope. Even though the circumstances between the characters and the viewers are quite different, you don't feel that far removed from what the characters are going through."),
            "2" to arrayOf("""This must rank as the best film (along with part 2)of all time.An ensemble performance that has no weak spot.

Particularly, John Cazale ( Fredo) and Richard Castellano ( Clemenza) give wonderfully understated performances. You just have to believe that Castellano WAS Clemenza, he brings a real touch to his role.""",
                    "Tell me a movie that is more famous than this. Tell me a movie that has had more parodies spinned off its storyline than this. Tell me one movie that has been as quoted as a much as this. The answer is you can't. No movie has had as much of an impact as The Godfather has had ever since it was released."),
            "3" to arrayOf("The second part of Francis Ford Coppola's Epic and violent Gangster Trilogy, follows the reign of Don Michael Corleone as the head of the Corleone family. As well the film shows us the early years of Vito Corleone (Marlon Brando) played flawlessly by Academy Award Winner Robert De Niro, and how he created his empire of money, gambling and respect.")
    )

    @RequestMapping("/reviews/{movieId}")
    fun getReviews(@PathVariable("movieId") movieId:String)
        = reviews.get(movieId)
}