package com.egfavre.entities;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by user on 10/31/16.
 */
@Entity
@Table (name = "animals")
public class Animal {
    @Id
    @GeneratedValue
    int id;

    @Column
    String strain;

    @Column
    String color;

    @Column
    String sex;

    @Column
    Date dob;

    @Column
    int dod;

    @Column
    int lastLitter;

    @Column
    int plug;

    @Column
    int expectedDelivery;

    @Column
    int wean;

    @ManyToOne
    Cage cage;

    @ManyToOne
    Treatment treatment;

    @Column
    String genotype;

    public Animal() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public int getDod() {
        return dod;
    }

    public void setDod(int dod) {
        this.dod = dod;
    }

    public int getLastLitter() {
        return lastLitter;
    }

    public void setLastLitter(int lastLitter) {
        this.lastLitter = lastLitter;
    }

    public int getPlug() {
        return plug;
    }

    public void setPlug(int plug) {
        this.plug = plug;
    }

    public int getExpectedDelivery() {
        return expectedDelivery;
    }

    public void setExpectedDelivery(int expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public int getWean() {
        return wean;
    }

    public void setWean(int wean) {
        this.wean = wean;
    }

    public Cage getCage() {
        return cage;
    }

    public void setCage(Cage cage) {
        this.cage = cage;
    }

    public Treatment getTreatment() {
        return treatment;
    }

    public void setTreatment(Treatment treatment) {
        this.treatment = treatment;
    }

    public String getGenotype() {
        return genotype;
    }

    public void setGenotype(String genotype) {
        this.genotype = genotype;
    }
}