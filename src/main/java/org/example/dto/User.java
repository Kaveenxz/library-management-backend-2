package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String firstName;
    private String lasttName;
    private String userName;
    private String email;
    private String password;
    private String address;
    private String address2;
    private String country;
    private String phoneNummber;
}
