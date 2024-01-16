package com.hejoseph.springboot.service;

import com.hejoseph.springboot.model.User;
import com.hejoseph.springboot.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
