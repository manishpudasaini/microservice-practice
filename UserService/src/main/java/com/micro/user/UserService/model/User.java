package com.micro.user.UserService.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user_",uniqueConstraints = {
        @UniqueConstraint(name = "uk_user_email",columnNames = "EMAIL"),
        @UniqueConstraint(name = "uk_user_mobile",columnNames = "PHONE")
})
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    @GeneratedValue(generator = "USER_SEQ_GEN",strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "USER_SEQ_GEN",sequenceName = "USER_SEQ",initialValue = 1,allocationSize = 1)
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
