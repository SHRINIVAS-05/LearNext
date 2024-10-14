package com.LearnNext.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LearnNext.Entity.Comments;

public interface CommentRepository extends JpaRepository<Comments, Integer>
{

}
