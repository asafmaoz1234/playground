package com.asaf.maoz.playground.api.requests;


import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;

@Service
public class SampleRequest {
    @NotNull(message = "sample_param is missing")
    @JsonProperty("sample_param")
    private String sampleParam;

    @Nullable
    @JsonProperty("another_sample_param")
    private String anotherSampleParam;

    public SampleRequest() {
    }

    public String getSampleParam() {
        return sampleParam;
    }

    public void setSampleParam(String sampleParam) {
        this.sampleParam = sampleParam;
    }

    public String getAnotherSampleParam() {
        return anotherSampleParam;
    }

    public void setAnotherSampleParam(String anotherSampleParam) {
        this.anotherSampleParam = anotherSampleParam;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SampleRequest{");
        sb.append("sampleParam='").append(sampleParam).append('\'');
        sb.append(", anotherSampleParam='").append(anotherSampleParam).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
