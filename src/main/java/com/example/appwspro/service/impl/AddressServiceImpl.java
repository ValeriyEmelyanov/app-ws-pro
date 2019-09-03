package com.example.appwspro.service.impl;

import com.example.appwspro.io.entity.AddressEntity;
import com.example.appwspro.io.entity.UserEntity;
import com.example.appwspro.io.repository.AddressRepository;
import com.example.appwspro.io.repository.UserRepository;
import com.example.appwspro.service.AddressService;
import com.example.appwspro.shared.dto.AddressDto;
import com.example.appwspro.shared.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public List<AddressDto> getAddresses(String userId) {
        List<AddressDto> returnValue = new ArrayList<>();

        UserEntity userEntity = userRepository.findByUserId(userId);

        if (userEntity == null) {
            return null;
        }

        Iterable<AddressEntity> addresses = addressRepository.findAllByUserDetails(userEntity);
        ModelMapper modelMapper = new ModelMapper();
        for (AddressEntity addressEntity : addresses) {
            returnValue.add(modelMapper.map(addressEntity, AddressDto.class));
        }


        return returnValue;
    }

    @Override
    public AddressDto getAddress(String addressId) {
        AddressDto returnValue = null;

        AddressEntity addressEntity = addressRepository.findByAddressId(addressId);

        if (addressEntity != null) {
            returnValue = new ModelMapper().map(addressEntity, AddressDto.class);
        }

        return returnValue;
    }
}
