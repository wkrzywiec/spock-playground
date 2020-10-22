package io.wkrzywiec.medium.spock.joke;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface JokeRepository extends CrudRepository<Joke, Long> {
}
