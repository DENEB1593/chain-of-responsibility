package io.dev.deneb.repository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class StubAgeRepository implements AgeRepository {

  @Override
  public Optional<Integer> findAgeByUserId(String userId) {
    return Optional.of(42);
  }
}
