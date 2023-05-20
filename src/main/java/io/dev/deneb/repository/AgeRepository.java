package io.dev.deneb.repository;

import java.util.Optional;

public interface AgeRepository {
  Optional<Integer> findAgeByUserId(String userId);
}
