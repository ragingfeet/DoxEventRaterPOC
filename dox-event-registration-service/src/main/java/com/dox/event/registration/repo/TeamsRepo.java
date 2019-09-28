package com.dox.event.registration.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.dox.event.registration.model.Teams;

public interface TeamsRepo extends MongoRepository<Teams, String> {

	
    @Query("{team_id:'?0'}")
    List<Teams> teamsById(String teamId);
}
