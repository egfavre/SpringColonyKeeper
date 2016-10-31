package com.egfavre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by user on 10/31/16.
 */
@Entity
@Table (name = "protocols")
public class Protocol {
    @Id
    @GeneratedValue
    int id;

    public Protocol() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
