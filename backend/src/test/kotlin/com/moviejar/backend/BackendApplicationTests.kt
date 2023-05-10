package com.moviejar.backend

import com.moviejar.backend.domain.Movie
import com.moviejar.backend.repositories.MovieRepository
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers.equalTo
import org.hamcrest.Matchers.`is`
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment.RANDOM_PORT
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus

@SpringBootTest(webEnvironment = RANDOM_PORT)
class BackendApplicationTests {

    @Autowired
    private lateinit var api: TestRestTemplate

    @Autowired
    private lateinit var movieRepository: MovieRepository

    @Test
    fun `Devuelve una lista de movies`() {
        val movies = listOf(
            Movie("Titanic", "James Cameron"),
            Movie("Jurassic Park", "Spielberg")
        ).let{movieRepository.saveAll(it)}

        val response = api.getForEntity("/api/movies", Array<Movie>::class.java)

        assertThat(response.statusCode, `is`(HttpStatus.OK))
        assertThat(response.body, equalTo(movies.toTypedArray()))
    }
}
