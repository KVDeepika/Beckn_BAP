package com.tibil.BecknBAP.controller;

import java.io.IOException;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tibil.BecknBAP.controller.api.SelectApi;
import com.tibil.BecknBAP.dto.beckn.InlineResponse200;
import com.tibil.BecknBAP.dto.internal.SelectedItem;
import com.tibil.BecknBAP.service.internal.SelectRequestService;


import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")
@RestController
public class SelectApiController implements SelectApi {

    private static final Logger log = LoggerFactory.getLogger(SelectApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;
    private final SelectRequestService selectService;

    @org.springframework.beans.factory.annotation.Autowired
    public SelectApiController(ObjectMapper objectMapper, HttpServletRequest request,SelectRequestService selectService) {
        this.objectMapper = objectMapper;
        this.request = request;
        this.selectService = selectService;
    }

    public String selectPost(@Parameter(in = ParameterIn.DEFAULT, description = "TODO", schema=@Schema()) @Valid @RequestBody SelectedItem body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
			return selectService.processInternalRequest(body);

//            try {
//                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("{\n  \"message\" : {\n    \"ack\" : {\n      \"status\" : \"ACK\"\n    }\n  },\n  \"error\" : {\n    \"path\" : \"path\",\n    \"code\" : \"code\",\n    \"type\" : \"CONTEXT-ERROR\",\n    \"message\" : \"message\"\n  }\n}", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
//            } catch (IOException e) {
//                log.error("Couldn't serialize response for content type application/json", e);
//                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
//            }
        }

        return " ";
    }

}
