package com.egfavre.repositories;

import com.egfavre.entities.Animal;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface AnimalRepository extends CrudRepository<Animal, Integer> {
}