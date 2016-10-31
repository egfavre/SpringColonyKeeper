package com.egfavre.repositories;

import com.egfavre.entities.Lab;
import org.h2.command.ddl.CreateUserDataType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface LabRepository extends CrudRepository <Lab, Integer> {
}
