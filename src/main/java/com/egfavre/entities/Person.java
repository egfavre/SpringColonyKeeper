package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 10/31/16.
 */
@Entity
@Table (name = "people")
public class Person {
    @Id
    @GeneratedValue
    int id;

    @Column
    String firstName;

    @Column
    String lastName;

    @Column
    String username;

    @Column
    String password;

    @Column
    String email;

    @Column
    int phone;

    @Column
    int pager;

    @Column
    Boolean userRole;

    @Column
    Boolean adminRole;

    @Column
    Boolean piRole;

    @Column
    Boolean vetRole;

    @Column
    Boolean vetTechRole;

    @ManyToOne
    Training training;

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getPager() {
        return pager;
    }

    public void setPager(int pager) {
        this.pager = pager;
    }

    public Boolean getUserRole() {
        return userRole;
    }

    public void setUserRole(Boolean userRole) {
        this.userRole = userRole;
    }

    public Boolean getAdminRole() {
        return adminRole;
    }

    public void setAdminRole(Boolean adminRole) {
        this.adminRole = adminRole;
    }

    public Boolean getPiRole() {
        return piRole;
    }

    public void setPiRole(Boolean piRole) {
        this.piRole = piRole;
    }

    public Boolean getVetRole() {
        return vetRole;
    }

    public void setVetRole(Boolean vetRole) {
        this.vetRole = vetRole;
    }

    public Boolean getVetTechRole() {
        return vetTechRole;
    }

    public void setVetTechRole(Boolean vetTechRole) {
        this.vetTechRole = vetTechRole;
    }

    public Training getTraining() {
        return training;
    }

    public void setTraining(Training training) {
        this.training = training;
    }
}
