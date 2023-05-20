package io.dev.deneb.repository;

import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
class StubPhoneNumberRepository implements
    PhoneNumberRepository {

  @Override
  public Optional<String> findPhoneNumber(String sessionId) {
    return Optional.of("78005553535");
  }
}
