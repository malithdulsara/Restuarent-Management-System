package edu.icet.dto;

import edu.icet.utill.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Integer userId;
    private String username;
    private String address;
    private String phoneNumber;
    private String email;
    private String password;
    private Integer restaurantId;
    private Role role;
}
