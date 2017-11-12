package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Author;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Comment;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Post;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.service.Service;

@RestController
public class SimpleRestController {

	
	@Autowired
	Service service;
	
	@RequestMapping(path="/authors")
	public List<Author> getAllAuthors() {
		return service.getAllAuthors();
	}

	@RequestMapping(path="/authors/{id}")
	public Author getAuthorById(@PathVariable String id) {
		return service.getAuthorById(id);
	}
	
	@RequestMapping(path="/posts")
	public List<Post> getAllPosts(@RequestParam(value="author_id",required = false) String authId) {
		if(authId == null) 
			return service.getAllPosts();
		else 
			return service.getAllPostByAuthorId(authId);
	}
		

	@RequestMapping(path="/comments")
	public List<Comment> getAllComments(@RequestParam(value="post_id",required = false) String postId) {
		if(postId == null)
			return service.getAllComments();
		else
			return service.getAllCommentsForPost(postId);
	}
	
}
