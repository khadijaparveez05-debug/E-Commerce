package com.Ecommerce.userInfo.dto;

import lombok.AllArgsConstructor;
import lombok.Value;

@Value
@AllArgsConstructor
public class UserDTO {
    Integer userId;
    String userName;
    String password;
    String address;
    String city;
}
