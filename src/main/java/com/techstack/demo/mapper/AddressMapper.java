package com.techstack.demo.mapper;


import com.techstack.demo.vo.Address;
import com.techstack.demo.vo.AddressVO;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    AddressMapper MAPPER = Mappers.getMapper(AddressMapper.class);

    @Mappings({
            @Mapping(source = "address.countryCode.localName", target = "countryName"),
            @Mapping(target = "houseNumber", expression = "java(Integer.toString(address.getHouseNumber()))"),
            @Mapping(source = "address.countryCode.code", target = "countryCode"),
    })
    AddressVO addressToAddressVO(Address address);

    @InheritInverseConfiguration
    Address addressVOToAddress(AddressVO addressVO);
}
