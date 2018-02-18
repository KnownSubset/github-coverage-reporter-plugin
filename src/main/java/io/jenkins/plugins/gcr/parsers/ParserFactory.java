package io.jenkins.plugins.gcr.parsers;

import io.jenkins.plugins.gcr.models.CoverageType;

import java.util.HashMap;
import java.util.Map;

public class ParserFactory {

    public static final ParserFactory instance = new ParserFactory();

    private Map<String, CoverageParser> parsers = new HashMap<>();

    private ParserFactory() {
        parsers.put(CoverageType.COBERTURA, new CoberturaParser());
        parsers.put(CoverageType.JACOCO, new JacocoParser());
    }

    public CoverageParser parserForType(String type) {
        return parsers.get(type);
    }

}
