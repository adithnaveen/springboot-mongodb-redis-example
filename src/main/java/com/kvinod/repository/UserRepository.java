package com.kvinod.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kvinod.entity.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
	public List<User> findByCity(String city);
}
