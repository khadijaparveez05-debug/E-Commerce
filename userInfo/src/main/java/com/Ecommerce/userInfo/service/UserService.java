package com.Ecommerce.userInfo.service;

import com.Ecommerce.userInfo.Repository.UserRepository;
import com.Ecommerce.userInfo.dto.UserDTO;
import com.Ecommerce.userInfo.entity.User;
import com.Ecommerce.userInfo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserDTO addUser(UserDTO userDTO) {
        User savedUser = userRepository.save(UserMapper.INSTANCE.mapUserDTOToUser(userDTO));
        return UserMapper.INSTANCE.mapUserToUserDTO(savedUser);
    }
}
