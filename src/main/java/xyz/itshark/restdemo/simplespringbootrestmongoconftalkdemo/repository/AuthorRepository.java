package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {

}