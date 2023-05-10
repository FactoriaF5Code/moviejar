package com.moviejar.backend.controllers

import com.moviejar.backend.domain.Movie
import com.moviejar.backend.repositories.MovieRepository
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@CrossOrigin
class MovieController(private val movieRepository: MovieRepository) {

    @GetMapping("/api/movies")
    fun allMovies(): List<Movie> = movieRepository.findAll()
}