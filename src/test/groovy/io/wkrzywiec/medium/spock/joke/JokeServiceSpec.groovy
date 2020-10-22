package io.wkrzywiec.medium.spock.joke

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.springframework.test.context.jdbc.Sql
import spock.lang.Specification

@DataJpaTest
class JokeServiceSpec extends Specification{

    private JokeService jokeService
    @Autowired
    private JokeRepository repository

    def setup(){
        jokeService = new JokeService(repository)
    }


    @Sql(scripts = "classpath:data/sample-joke.sql")
    def "Get Joke by id"(){

        when: "get joke by id"
        def jokeOpt = jokeService.fetchJoke(1)

        then: "joke is fetched"
        jokeOpt.get().value == "Chuck Norris doesn’t read books. He stares them down until he gets the information he wants."
    }
}