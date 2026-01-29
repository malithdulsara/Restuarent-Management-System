package edu.icet.service.impl;

import edu.icet.dto.UserDto;
import edu.icet.entity.UserEntity;
import edu.icet.repository.UserRepository;
import edu.icet.service.UserService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final ModelMapper modelMapper;
    private final UserRepository repository;
    @Override
    public String saveUser(UserDto userDto) {
        repository.save(modelMapper.map(userDto, UserEntity.class));
        return "User saved successfully";
    }

    @Override
    public List<UserDto> getAllUsers() {
       List<UserEntity>userEntities = repository.findAll();
         List<UserDto>userDtos = new ArrayList<>();
            userEntities.forEach(userEntity ->
                userDtos.add(modelMapper.map(userEntity,UserDto.class))
            );
            return userDtos;
    }
}
