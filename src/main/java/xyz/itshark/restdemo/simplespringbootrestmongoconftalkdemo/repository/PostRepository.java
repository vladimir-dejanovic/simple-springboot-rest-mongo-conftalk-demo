package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Post;


public interface PostRepository extends MongoRepository<Post,String> {
	List<Post> findByAuthorId(String authorId);

}
