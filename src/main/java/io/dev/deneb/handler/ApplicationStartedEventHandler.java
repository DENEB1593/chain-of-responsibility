package io.dev.deneb.handler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartedEventHandler {
    private static final Logger log = LoggerFactory.getLogger(ApplicationStartedEventHandler.class);

    @EventListener(ApplicationStartedEvent.class)
    public void onStarted() {
        log.info("=== application started ===");
    }

}
