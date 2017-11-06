package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Comment;

public interface CommentRepository extends MongoRepository<Comment,String> {
	List<Comment> findByPostId(String postId);
}
