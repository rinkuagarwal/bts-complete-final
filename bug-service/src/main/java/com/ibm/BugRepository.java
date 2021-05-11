package com.ibm;
import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ibm.Bug;
public interface BugRepository extends MongoRepository<Bug,String> {
//@Query("{'name':?0}")
List<Bug> findByStatus(STATUS status);
//ignore case sensitive in bug name
@Query("{name : {$regex : ?0,'$options':'i'}}")
List<Bug> findByNameIgnoreCase(String bugName);
@Query("{status: ?0,name : {$regex : ?1,'$options':'i'}}")
List<Bug> findByStatusAndNameIgnoreCase(STATUS status, String name);
Optional<Bug> findByName(String bugName);

	

}

