package com.techstack.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum CountryCode {

    INDIA("IN", "India"),
    USA("US", "United States of America"),
    UK("UK", "United Kingdom"),
    GERMANY("DE", "German");

    /** The code of the Country. */
    private final String code;

    /** The local String value of the Country. */
    private final String localName;

}
