package com.example.appwspro.service;

import com.example.appwspro.shared.dto.AddressDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {
    List<AddressDto> getAddresses(String userId);
    AddressDto getAddress(String addressId);
}
