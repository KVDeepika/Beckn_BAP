package com.tibil.BecknBAP.controller;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibil.BecknBAP.controller.api.OnSearchApi;
import com.tibil.BecknBAP.dto.beckn.InlineResponse2001;
import com.tibil.BecknBAP.dto.beckn.OnSearchBody;
import com.tibil.BecknBAP.service.internal.OnSearchRequestService;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")
@RestController
public class OnSearchApiController implements OnSearchApi {

    private static final Logger log = LoggerFactory.getLogger(OnSearchApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private OnSearchRequestService onSearchrequestService;

    @org.springframework.beans.factory.annotation.Autowired
    public OnSearchApiController(ObjectMapper objectMapper, HttpServletRequest request, OnSearchRequestService onSearchrequestService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.onSearchrequestService = onSearchrequestService;
    }

    public ResponseEntity<InlineResponse2001> onSearchPost(@Parameter(in = ParameterIn.DEFAULT, description = "TODO", schema=@Schema()) @Valid @RequestBody OnSearchBody body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            return onSearchrequestService.processExternalRequest(body);
        }

        return new ResponseEntity<InlineResponse2001>(HttpStatus.NOT_IMPLEMENTED);
    }

}
