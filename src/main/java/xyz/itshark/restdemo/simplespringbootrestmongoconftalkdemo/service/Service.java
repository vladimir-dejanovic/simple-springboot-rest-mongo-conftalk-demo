package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.service;

import java.util.List;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Author;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Comment;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Post;

public interface Service {

	List<Author> getAllAuthors();
	Author getAuthorById(String id);
	
	List<Post> getAllPosts();	
	List<Post> getAllPostByAuthorId(String authId);

	List<Comment> getAllComments();
	List<Comment> getAllCommentsForPost(String postId);

}
