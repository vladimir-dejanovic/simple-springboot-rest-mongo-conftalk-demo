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
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository.AuthorRepository;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository.CommentRepository;
import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository.PostRepository;

@RestController
public class SimpleRestController {

	@Autowired
	AuthorRepository authRepo;
	
	@Autowired
	PostRepository postRepo;
	
	@Autowired
	CommentRepository commentRepo;
	
	@RequestMapping(path="/authors")
	public List<Author> getAllAuthors() {
		return authRepo.findAll();
	}

	@RequestMapping(path="/authors/{id}")
	public Author getAuthorById(@PathVariable String id) {
		return authRepo.findOne(id);
	}
	
	@RequestMapping(path="/posts")
	public List<Post> getAllPosts(@RequestParam(value="author_id",required = false) String authId) {
		if(authId == null) 
			return postRepo.findAll();
		else 
			return postRepo.findByAuthorId(authId);
	}
		

	@RequestMapping(path="/comments")
	public List<Comment> getAllComments(@RequestParam(value="post_id",required = false) String postId) {
		if(postId == null)
			return commentRepo.findAll();
		else
			return commentRepo.findByPostId(postId);
	}
	
}
