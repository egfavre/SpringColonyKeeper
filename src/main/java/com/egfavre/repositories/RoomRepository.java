package com.egfavre.repositories;

import com.egfavre.entities.Room;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by user on 10/31/16.
 */
public interface RoomRepository extends CrudRepository <Room, Integer> {
}
