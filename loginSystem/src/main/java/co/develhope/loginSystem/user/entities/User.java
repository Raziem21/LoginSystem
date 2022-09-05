package co.develhope.loginSystem.user.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "User_s")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String surname;

    @Column(unique = true)
    private String email;
    private String password;
    private LocalDateTime jwtCreatedOn;

    private boolean isActive;
    @Column(length = 36)
    private String activationCode;

    @Column(length = 36)
    private String passwordResetCode;

    public User() {}

    public User(long id, String name, String surname, String email, String password, LocalDateTime jwtCreatedOn, boolean isActive, String activationCode, String passwordResetCode) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.jwtCreatedOn = jwtCreatedOn;
        this.isActive = isActive;
        this.activationCode = activationCode;
        this.passwordResetCode = passwordResetCode;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setJwtCreatedOn(LocalDateTime jwtCreatedOn) {
        this.jwtCreatedOn = jwtCreatedOn;
    }

    public LocalDateTime getJwtCreatedOn() {
        return jwtCreatedOn;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public boolean getIsActive() {
        return isActive;
    }

    public void setActivationCode(String activationCode) {
        this.activationCode = activationCode;
    }

    public String getActivationCode() {
        return activationCode;
    }

    public void setPasswordResetCode(String passwordResetCode) {
        this.passwordResetCode = passwordResetCode;
    }

    public String getPasswordResetCode() {
        return passwordResetCode;
    }
}