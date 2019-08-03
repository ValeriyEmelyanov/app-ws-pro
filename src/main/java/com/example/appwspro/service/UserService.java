package com.example.appwspro.service;

import com.example.appwspro.shared.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    UserDto createUser(UserDto user);
}
