package io.dev.deneb.repository;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
class StubGeoLocationRepository implements
    GeoLocationRepository {

  @Override
  public Optional<GeoLocation> findGeoLocationByIp(String ip) {
    return Optional.of(new GeoLocation(12, 13));
  }
}
