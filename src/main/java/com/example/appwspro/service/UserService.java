package com.example.appwspro.service;

import com.example.appwspro.shared.dto.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    UserDto createUser(UserDto user);
}
