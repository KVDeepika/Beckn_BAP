/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.41).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.tibil.BecknBAP.controller.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tibil.BecknBAP.dto.beckn.InlineResponse200;
import com.tibil.BecknBAP.dto.beckn.OnSupportBody;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import jakarta.validation.Valid;

@jakarta.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-07T06:09:48.574791157Z[GMT]")
@Validated
public interface OnSupportApi {

    @Operation(summary = "", description = "Contact Support", security = {
        @SecurityRequirement(name = "GatewaySubscriberAuth"),
@SecurityRequirement(name = "GatewaySubscriberAuthNew"),
@SecurityRequirement(name = "SubscriberAuth")    }, tags={ "Beckn App Platform (BAP)" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Acknowledgement of message received", content = @Content(mediaType = "application/json", schema = @Schema(implementation = InlineResponse200.class))) })
    @RequestMapping(value = "/on_support",
        produces = { "application/json" }, 
        consumes = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> onSupportPost(@Parameter(in = ParameterIn.DEFAULT, description = "TODO", schema=@Schema()) @Valid @RequestBody OnSupportBody body);

}

