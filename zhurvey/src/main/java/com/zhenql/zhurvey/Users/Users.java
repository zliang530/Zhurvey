package com.zhenql.zhurvey.Users;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Users {

    
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String username;

    @Column
    private String password;
}
