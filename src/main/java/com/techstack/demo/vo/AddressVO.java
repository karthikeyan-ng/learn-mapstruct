package com.techstack.demo.vo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Data @Builder
public class AddressVO implements Serializable {
    private static final long serialVersionUID = -822837896213811708L;

    private String streetName;
    private String streetSuffix;
    private String postalCode;
    private String houseNumber;
    private String houseNumberExtension;
    private String cityName;
    private String countryName;
    private String countryCode;
}

