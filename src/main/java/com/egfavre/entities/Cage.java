package com.egfavre.entities;

import org.springframework.aop.interceptor.SimpleTraceInterceptor;

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

    @ManyToOne
    Room room;









}
