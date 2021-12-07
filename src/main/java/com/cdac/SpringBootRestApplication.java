package com.cdac;


import java.net.URI;
import java.net.URISyntaxException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class SpringBootRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestApplication.class, args);
		
		RestTemplate resttemplate = new RestTemplate();
//		String response = resttemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);
//		System.out.println(response);
//		
//		List response1 = resttemplate.getForObject("https://jsonplaceholder.typicode.com/posts", List.class);
//		response1.forEach(post ->{
//			System.out.println(post);
//			System.out.println("------------------------------------------------");
//		});
//		
//		ResponseEntity<String>responseentity = resttemplate.getForEntity("https://jsonplaceholder.typicode.com/posts", String.class);
//		String resp = responseentity.getBody();
//		HttpHeaders head = responseentity.getHeaders();
//		System.out.println(resp);
//		System.out.println(head);
//		
//		Post post = resttemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", Post.class);
//		System.out.println(post.getTitle());
// 	System.out.println(post.getBody());
//			 
//		ResponseEntity<Post>posteentity = resttemplate.getForEntity("https://jsonplaceholder.typicode.com/posts/1", Post.class);
//	    Post post = posteentity.getBody();
//    System.out.println(post.getBody());
	    
	    RequestEntity request = new RequestEntity(HttpMethod.GET, new URI("https://jsonplaceholder.typicode.com/posts/1"));
	    ResponseEntity<Post>posteentity = resttemplate.exchange(request, Post.class);
	    Post post = posteentity.getBody();
	    System.out.println(post.getBody());
	}

}
