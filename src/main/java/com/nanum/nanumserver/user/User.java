package com.nanum.nanumserver.user;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;

    protected User() {
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }

}
