package io.dev.deneb.enrichment.impl;

import io.dev.deneb.enrichment.AbstractEnrichmentStep;
import io.dev.deneb.message.Message;
import io.dev.deneb.repository.AgeRepository;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
//@Order(1) // ChainSupply에 순선를 지정하는 경우 Order 지정
class AgeEnrichmentStep extends AbstractEnrichmentStep {
    private final AgeRepository ageRepository;

    AgeEnrichmentStep(AgeRepository ageRepository) {
        this.ageRepository = ageRepository;
    }

    // Message에서 userId를 확인하여 나이 값을 가져온다
    @Override
    protected Optional<Message> enrichAndApplyNext(Message message) {
        return message.getValue("userId")
                .flatMap(ageRepository::findAgeByUserId)
                .map(age -> message.with("age", String.valueOf(age)));
    }
}
