package com.ibm;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.Project;

public interface ProjectRepository extends MongoRepository<Project,String> {

}
