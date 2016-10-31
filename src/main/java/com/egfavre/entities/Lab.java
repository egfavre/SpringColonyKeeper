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

    @Column
    Person administrator;

    @Column
    Person user;

    @Column
    Protocol protocol;

    @Column
    Person businessContact;

    public Lab() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public Person getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Person administrator) {
        this.administrator = administrator;
    }

    public Person getUser() {
        return user;
    }

    public void setUser(Person user) {
        this.user = user;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Person getBusinessContact() {
        return businessContact;
    }

    public void setBusinessContact(Person businessContact) {
        this.businessContact = businessContact;
    }
}
