package ua.microserviceslibrary.userservice.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "users")
@Data
public class Account {

    @Id
    @Column(name = "user_login")
    private String login;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_lastname")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "user_email")
    private String email;

    @Column(name = "role")
    private String role;


}
