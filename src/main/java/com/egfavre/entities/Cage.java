package com.egfavre.entities;

import javax.persistence.*;

/**
 * Created by user on 10/31/16.
 */
@Entity
@Table (name="cages")
public class Cage {
    @Id
    @GeneratedValue
    int id;

    @Column
    Protocol protocol;

    @Column
    Person person;

    @Column
    Room room;

    public Cage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Protocol getProtocol() {
        return protocol;
    }

    public void setProtocol(Protocol protocol) {
        this.protocol = protocol;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }
}
