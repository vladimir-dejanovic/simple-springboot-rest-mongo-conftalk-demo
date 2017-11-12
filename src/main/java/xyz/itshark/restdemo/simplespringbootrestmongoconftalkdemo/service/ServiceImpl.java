package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Author;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Comment;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Post;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository.AuthorRepository;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository.CommentRepository;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository.PostRepository;


public class ServiceImpl implements Service {

	@Autowired
	AuthorRepository authRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	CommentRepository commentRepo;

	
	public List<Author> getAllAuthors() {
		return authRepo.findAll();
	}

	public Author getAuthorById(String id) {
		return authRepo.findOne(id);
	}
	
	public List<Post> getAllPosts() {
			return postRepo.findAll();
	}
	
	public List<Post> getAllPostByAuthorId(String authId) {
		return postRepo.findByAuthorId(authId);
	}
		

	public List<Comment> getAllComments() {
			return commentRepo.findAll();
	}
	
	public List<Comment> getAllCommentsForPost(String postId) {
		return commentRepo.findByPostId(postId);

	}	
}
