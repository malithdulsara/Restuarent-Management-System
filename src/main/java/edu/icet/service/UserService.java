package edu.icet.service;

import edu.icet.dto.UserDto;

import java.util.List;

public interface UserService {
    String saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
