package com.moviejar.backend.domain

import jakarta.persistence.*

@Entity
@Table(name = "movies")
data class Movie(
    var title: String,
    var director: String,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null
)
