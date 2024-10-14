package com.LearnNext.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer>
{

	boolean existsByEmail(String email);
	
	User getByEmail(String email);
}
