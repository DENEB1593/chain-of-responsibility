package io.dev.deneb.enrichment.impl;

import io.dev.deneb.enrichment.AbstractEnrichmentStep;
import io.dev.deneb.message.Message;
import io.dev.deneb.repository.GeoLocationRepository;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
//@Order(2)
class GeoLocationEnrichmentStep extends AbstractEnrichmentStep {

    private final GeoLocationRepository geoLocationRepository;

    public GeoLocationEnrichmentStep(GeoLocationRepository geoLocationRepository) {
        this.geoLocationRepository = geoLocationRepository;
    }

    @Override
    protected Optional<Message> enrichAndApplyNext(Message message) {
        return message.getValue("ip")
                .flatMap(geoLocationRepository::findGeoLocationByIp)
                .map(geo -> message.with("geo", geo.toString()));
    }
}
