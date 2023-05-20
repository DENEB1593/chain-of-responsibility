package io.dev.deneb.repository;

import java.util.Optional;

public interface PhoneNumberRepository {
    Optional<String> findPhoneNumber(String sessionId);
}
