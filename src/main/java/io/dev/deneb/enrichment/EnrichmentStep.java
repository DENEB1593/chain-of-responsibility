package io.dev.deneb.enrichment;


import io.dev.deneb.message.Message;

public interface EnrichmentStep extends ChainElement<EnrichmentStep> {
    Message enrich(Message message);
}
