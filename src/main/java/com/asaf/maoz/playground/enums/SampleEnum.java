package com.asaf.maoz.playground.enums;

import org.apache.commons.lang3.StringUtils;

public enum SampleEnum {
    SAMPLE_ONE("sample_identifier_one") {
        @Override
        public void execute(String message) {
            System.out.println(message);
        }
    },
    SAMPLE_TWO("sample_identifier_two") {
        @Override
        public void execute(String message) {
            System.out.println(message);
        }
    };

    private final String identifier;

    SampleEnum(String identifier) {
        this.identifier = identifier;
    }

    @Override
    public String toString() {
        return "SampleEnum{" +
                "identifier='" + identifier + '\'' +
                '}';
    }

    public String getIdentifier() {
        return identifier;
    }

    public abstract void execute(String message);

    public static SampleEnum getSampleByIdentifier(String identifier) throws Exception {
        if(StringUtils.isBlank(identifier)) {
            throw new Exception("missing identifier");
        }

        for (SampleEnum sample : SampleEnum.values()) {
            if(sample.getIdentifier().equals(identifier)){
                return sample;
            }
        }
        throw new Exception(identifier);
    }
}