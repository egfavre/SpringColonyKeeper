package com.egfavre.repositories;

import com.egfavre.entities.Protocol;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface ProtocolRepository extends CrudRepository <Protocol, Integer> {
}
