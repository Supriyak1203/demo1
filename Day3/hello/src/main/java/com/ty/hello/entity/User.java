package com.ty.hello.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Data
@Table(name="UserEntity")
public class User {
     @Id
    private int id;
    private String uName;
    private String email;
    private String password;

    
}
