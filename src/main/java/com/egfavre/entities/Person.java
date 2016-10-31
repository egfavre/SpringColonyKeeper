package com.egfavre.entities;

import org.hibernate.validator.constraints.Email;

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

    @Column
    Training training;

}
