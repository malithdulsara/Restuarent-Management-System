package edu.icet.controller;

import edu.icet.dto.UserDto;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
   private final UserService service;

    @PostMapping("/add")
    public void addUser(UserDto userDto) {
        service.saveUser(userDto);
    }

    @GetMapping("/getAll")
    public List<UserDto> getAllUsers() {
        return service.getAllUsers();
    }

}
