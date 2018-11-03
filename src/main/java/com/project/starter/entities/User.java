package com.project.starter.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.starter.enums.Gender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T_USER", uniqueConstraints = @UniqueConstraint(columnNames = "USR_EMAIL"), indexes = {@Index(name = "USR_LOGIN_INDEX", columnList = "USR_LOGIN")})

public class User implements Serializable {

    private static final Logger LOGGER = LoggerFactory.getLogger(User.class);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID", unique = true, nullable = false)

    private int id;

    @Column(name = "USR_FIRSTNAME")
    private String firstname;

    @Column(name = "USR_LASTNAME")
    private String lastname;

    @Column(name = "USR_EMAIL", nullable = true, length = 200, unique = true)
    private String email;

    @Column(name = "USR_ADRESS", nullable = true, length = 200)
    private String address;

    @Column(name = "USR_PHONE", nullable = true, length = 30)
    private String phone;

    @Column(name = "USR_LOGIN", nullable = false, unique = true, length = 200)
    private String username;

    @Column(name = "USR_PASSWORD", nullable = false, length = 200)
    private String password;

    @Column(name = "USR_ENABLED")
    private boolean enabled;

    @Column(name = "USER_GENDER", nullable = true)
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "USR_DELETED", nullable = true)
    private boolean deleted;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TJ_USER_ROLE", joinColumns = {@JoinColumn(name = "USR_ID", nullable = true, updatable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "ROL_ID", nullable = true, updatable = true)})
    private Set<Role> roles = new HashSet<>(0);


    public User() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}