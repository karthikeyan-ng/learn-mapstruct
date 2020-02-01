package com.techstack.demo.vo;

import lombok.Builder;
import lombok.Data;

@Data @Builder
public class Address {

    private String id;
    private String allotmentNumber;
    private CountryCode countryCode;
    private String cityName;
    private int houseNumber;
    private String houseNumberExtension;
    private boolean inactiveFlag;
    private String postalAddressName;
    private String postalCode;
    private String streetAddress;
    private String streetName;
    private String streetSuffix;
    private String shortCityName;
    private String shortStreetName;

}
