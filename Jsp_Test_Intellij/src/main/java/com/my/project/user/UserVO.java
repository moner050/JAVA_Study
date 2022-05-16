package com.my.project.user;

import lombok.Data;


@Data
public class UserVO {
    private String id;
    private String password;
    private String name;
    private String role;
}
