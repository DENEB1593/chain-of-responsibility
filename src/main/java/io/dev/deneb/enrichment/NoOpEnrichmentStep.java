package io.dev.deneb.enrichment;

import io.dev.deneb.message.Message;

public class NoOpEnrichmentStep implements EnrichmentStep{

    @Override
    public void setNext(EnrichmentStep step) {
        // DO Nothing
    }

    @Override
    public Message enrich(Message message) {
        return message;
    }

}
