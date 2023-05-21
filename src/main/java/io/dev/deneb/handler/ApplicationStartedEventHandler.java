package io.dev.deneb.handler;

import io.dev.deneb.enrichment.EnrichmentStepFacade;
import io.dev.deneb.message.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class ApplicationStartedEventHandler {
    private static final Logger log = LoggerFactory.getLogger(ApplicationStartedEventHandler.class);

    private final EnrichmentStepFacade enrichmentStepFacade;

    public ApplicationStartedEventHandler(EnrichmentStepFacade enrichmentStepFacade) {
        this.enrichmentStepFacade = enrichmentStepFacade;
    }


    @EventListener(ApplicationStartedEvent.class)
    public void onStarted() {
        log.info("Result message: {}", enrichmentStepFacade.enrich(
                new Message(
                        Map.of(
                                "ip", "10.10.10.10",
                                "userId", "someId",
                                "SESSIONID", "dfsjklfdjsafsdfadfa"
                        )
                )
        ));

    }

}
