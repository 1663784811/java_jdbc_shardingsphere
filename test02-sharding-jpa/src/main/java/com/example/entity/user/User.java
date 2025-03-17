package com.example.entity.user;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table(name = "t_user")
@Entity
public class User {
    @Id
    @Column(name = "id", columnDefinition = "int COMMENT 'id'")
    private Long id;
    private String name;
    private String username;
    private String email;
}