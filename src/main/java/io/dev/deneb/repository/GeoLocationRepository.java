package io.dev.deneb.repository;

import java.util.Optional;

public interface GeoLocationRepository {
  Optional<GeoLocation> findGeoLocationByIp(String ip);
}
