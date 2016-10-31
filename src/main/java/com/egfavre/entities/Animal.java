package com.egfavre.entities;

import javax.persistence.*;
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
    Date dod;

    @Column
    Date lastLitter;

    @Column
    Date plug;

    @Column
    Date expectedDelivery;

    @Column
    Date wean;

    @ManyToOne
    Cage cage;

    @ManyToOne
    Treatment treatment;

    @Column
    String Genotype;

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

    public Date getDod() {
        return dod;
    }

    public void setDod(Date dod) {
        this.dod = dod;
    }

    public Date getLastLitter() {
        return lastLitter;
    }

    public void setLastLitter(Date lastLitter) {
        this.lastLitter = lastLitter;
    }

    public Date getPlug() {
        return plug;
    }

    public void setPlug(Date plug) {
        this.plug = plug;
    }

    public Date getExpectedDelivery() {
        return expectedDelivery;
    }

    public void setExpectedDelivery(Date expectedDelivery) {
        this.expectedDelivery = expectedDelivery;
    }

    public Date getWean() {
        return wean;
    }

    public void setWean(Date wean) {
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
        return Genotype;
    }

    public void setGenotype(String genotype) {
        Genotype = genotype;
    }
}
