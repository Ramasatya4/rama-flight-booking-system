package com.fair.repositary;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.fair.model.Fair;


@Repository
public interface FairRepo extends MongoRepository<Fair,String> 
 {

}
