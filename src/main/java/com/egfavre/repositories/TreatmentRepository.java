package com.egfavre.repositories;

import com.egfavre.entities.Treatment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface TreatmentRepository extends CrudRepository <Treatment, Integer> {
}
