package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 10/31/16.
 */
@Entity
@Table (name = "labs")
public class Lab {
    @Id
    @GeneratedValue
    int id;

    @Column
    String labName;

    @ManyToOne
    Person administrator;

    @ManyToMany
    Person user;

    @ManyToMany
    Protocol protocol;

    @ManyToMany
    Person businessContact;


}
