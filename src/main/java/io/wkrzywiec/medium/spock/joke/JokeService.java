package io.wkrzywiec.medium.spock.joke;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class JokeService {

    private final JokeRepository repository;

    public Optional<Joke> fetchJoke(Long id){
        return repository.findById(id);
    }
}
