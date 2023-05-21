package io.dev.deneb.enrichment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class EnrichmentStepFacadeTest {

    @Autowired
    List<EnrichmentStep> stepList;

    @Test
    void step_순서확인() {
        assertThat(stepList).isNotNull();
        assertThat(stepList).hasSize(3);
    }


}