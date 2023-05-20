package io.dev.deneb.enrichment;

import org.springframework.util.CollectionUtils;

import java.util.List;

public interface ChainElement<T> {

    void setNext(T step);


    static <T extends ChainElement<T>> T buildChain(List<T> elements, T last) {
        if (CollectionUtils.isEmpty(elements)) {
            return last;
        }
        for (int i = 0; i < elements.size(); i++) {
            var current = elements.get(i);
            var next = i < elements.size() - 1 ? elements.get(i + 1) : last;
            current.setNext(next);
        }
        return elements.get(0);
    }

}
