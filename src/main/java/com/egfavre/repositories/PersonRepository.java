package com.egfavre.repositories;

import com.egfavre.entities.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface PersonRepository extends CrudRepository <Person, Integer> {
    public Person findFirstByUsername(String username);
}
