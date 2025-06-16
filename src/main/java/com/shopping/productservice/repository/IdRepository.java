package com.shopping.productservice.repository;

import org.bson.codecs.IdGenerator;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdRepository extends MongoRepository<IdGenerator, String>{

}



