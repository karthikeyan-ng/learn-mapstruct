package com.techstack.demo;

import com.techstack.demo.mapper.AddressMapper;
import com.techstack.demo.vo.Address;
import com.techstack.demo.vo.AddressVO;
import com.techstack.demo.vo.CountryCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

public class TestAddress {

    public static void main(String[] args) {

        testAddressToAddressVO();
        testAddressVOToAddress();

    }

    private static void testAddressToAddressVO() {

        CountryCode india = CountryCode.INDIA;
        Address address = Address.builder()
                .cityName("Chennai")
                .countryCode(india)
                .houseNumber(13)
                .houseNumberExtension("3rd Extn")
                .postalCode("123456")
                .streetName("ABC Street")
                .streetSuffix("Jr").build();

        AddressVO addressVO = AddressMapper.MAPPER.addressToAddressVO(address);
        System.out.println(addressVO.toString());
    }

    private static void testAddressVOToAddress() {

        AddressVO addressVO = AddressVO.builder()
                .cityName("London")
                .countryCode("UK")
                .countryName("United Kingdom")
                .houseNumber("1234")
                .houseNumberExtension("4th Avenue")
                .postalCode("45324")
                .streetName("Mathews Street")
                .streetSuffix("Jr")
                .build();

        Address address = AddressMapper.MAPPER.addressVOToAddress(addressVO);
        System.out.println(address);
        System.out.println(address.getCountryCode() == CountryCode.UK);
    }
}
