package com.asaf.maoz.playground.api.controllers;


import com.asaf.maoz.playground.api.requests.SampleRequest;
import com.asaf.maoz.playground.api.responses.SampleResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
public class SampleController {
    static final String REQUEST_PARAM = "identifier";

    @RequestMapping(value = "sample", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> sampleApi(@Valid @RequestBody SampleRequest sampleRequest,
                                            @RequestParam(REQUEST_PARAM) final String urlIdentifier) {
        SampleResponse sampleResponse = new SampleResponse();
        if (StringUtils.isBlank(urlIdentifier)) {
            return ResponseEntity.badRequest().body(sampleResponse.buildFailResponse("missing urlIdentifier").toString());
        }

        return ResponseEntity.ok().body(sampleResponse
                .withStatus(SampleResponse.Status.SUCCESS.name())
                .withMessage(sampleRequest.toString()).toString());
    }
}
