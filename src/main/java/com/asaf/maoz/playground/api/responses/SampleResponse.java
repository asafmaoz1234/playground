package com.asaf.maoz.playground.api.responses;

import com.google.gson.Gson;

public class SampleResponse {
    private String status;
    private String message;

    @Override
    public String toString() {
        return new Gson().toJson(this).toString();
    }

    public SampleResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    public SampleResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    public SampleResponse buildFailResponse(String failMessage) {
        String message = String.format("Could not complete request, %s ", failMessage);
        return this.withStatus(Status.FAIL.name()).withMessage(message);
    }

    public enum Status {
        FAIL,
        SUCCESS
    }
}
