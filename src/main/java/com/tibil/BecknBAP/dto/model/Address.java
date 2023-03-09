package com.tibil.BecknBAP.dto.model;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Describes a postal address
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({ @JsonSubTypes.Type(value = FullAddress.class, name = "FullAddress"),
		@JsonSubTypes.Type(value = StructuredAddress.class, name = "StructuredAddress") })
public interface Address {

}
