package com.example.mongo.repository;


import com.example.mongo.model.Spacecraft;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpacecraftRepository extends MongoRepository<Spacecraft, String> {

}
