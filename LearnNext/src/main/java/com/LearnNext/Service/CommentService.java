package com.LearnNext.Service;

import java.util.List;

import com.LearnNext.Entity.Comments;

public interface CommentService 
{
	List<Comments>commentList();
	
	 public String addComment(Comments comment);

}
