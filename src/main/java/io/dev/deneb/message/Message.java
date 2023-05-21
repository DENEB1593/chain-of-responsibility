package io.dev.deneb.message;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class Message {

    private Map<String, String> content;

    private Message() { }

    public Message(Map<String, String> content) {
        this.content = content;
    }

    public Optional<String> getValue(String key) {
        return Optional.ofNullable(content.get(key));
    }

    public Message with(String field, String value) {
        final var contentCopy = new HashMap<>(content);
        contentCopy.put(field, value);
        return new Message(contentCopy);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        return Objects.equals(content, message.content);
    }

    @Override
    public int hashCode() {
        return content != null ? content.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Message{" +
                "content=" + content +
                '}';
    }
}
