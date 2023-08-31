package com.micro.user.UserService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int userId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "PHONE")
    private String mobileNumber;

    @Column(name = "ABOUT")
    private String about;

    //when we use transient annotation we do not save the data in database
    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
