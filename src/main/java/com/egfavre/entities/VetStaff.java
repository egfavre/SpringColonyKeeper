package com.egfavre.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by user on 10/31/16.
 */
@Entity
@Table(name = "vetStaffs")
public class VetStaff {
    @Id
    @GeneratedValue
    int it;

    public VetStaff(int it) {
        this.it = it;
    }

    public int getIt() {
        return it;
    }

    public void setIt(int it) {
        this.it = it;
    }
}
