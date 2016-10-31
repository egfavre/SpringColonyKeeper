package com.egfavre.repositories;

import com.egfavre.entities.Cage;
import org.apache.catalina.startup.CredentialHandlerRuleSet;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface CageRepository extends CrudRepository <Cage, Integer> {
}
