package com.LearnNext.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LearnNext.Entity.Comments;
import com.LearnNext.UserRepository.CommentRepository;

@Service
public class CommentServiceImplimentation implements CommentService{
	
	@Autowired
	CommentRepository commentrepo;

	@Override
	public List<Comments> commentList() {
		// TODO Auto-generated method stub
		return commentrepo.findAll();
	}

	@Override
	public String addComment(Comments comment) {
		// TODO Auto-generated method stub
		commentrepo.save(comment);
		return "comment added";
	}


	

}
