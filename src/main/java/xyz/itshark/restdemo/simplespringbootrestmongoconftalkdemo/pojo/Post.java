package xyz.itshark.restdemo.simplespringbootrestmongoconftalkdemo.pojo;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="posts")
public class Post {

	@Id
	private final String id;
	
	//private final String authourId;
	
	@NotNull
	private String authorId;
	
	private final String title;
	private final String body;
}
