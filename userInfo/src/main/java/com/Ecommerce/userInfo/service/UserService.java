package com.Ecommerce.userInfo.service;

import com.Ecommerce.userInfo.Repository.UserRepository;
import com.Ecommerce.userInfo.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDTO addUser(UserDTO userDTO) {
        return new UserDTO(25, "John Doe", "something", "205", "Bengaluru");
    }
}
