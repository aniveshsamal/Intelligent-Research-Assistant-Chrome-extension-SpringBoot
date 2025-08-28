package com.research.assistant;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import lombok.Data;

import javax.swing.text.AbstractDocument;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeminiResopnse {
    private List<Candidate> candidates;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Candidate{
        private Content content;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Content{
        private List<Part> parts;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Part{
        private String text;
    }
}
