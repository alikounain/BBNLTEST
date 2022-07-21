package com.bbnl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bbnl.entity.User;
import com.bbnl.entity.VerificationToken;

public interface UserRepository extends JpaRepository<User, String>{
	
	@Query("select u from User u where u.email = :id")
	public User getUserByUserId(@Param("id") String id);
	
	/*
	 * @Query("select u from User u where u.email = :id") public User
	 * findByEmail(@Param("id") String email);
	 */
	// User findByToken(String token);
	
	User findByEmail(String email);
}
