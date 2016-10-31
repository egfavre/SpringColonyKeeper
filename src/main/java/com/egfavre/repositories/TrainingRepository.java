package com.egfavre.repositories;

import com.egfavre.entities.Training;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface TrainingRepository extends CrudRepository <Training, Integer> {
}
