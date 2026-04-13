package com.ibm.rest.consume.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.ibm.rest.consume.demo.model.Employee;

@Component
public class RestConsume implements CommandLineRunner {

	private final RestClient restClient;

	private final String baseUrl = "http://localhost:8090";

	public RestConsume(RestClient.Builder builder) {
		this.restClient = builder.baseUrl(baseUrl).build();
	}

	@Override
	public void run(String... args) throws Exception {

		// 🔹 STEP 1: LOGIN → GET TOKEN (as String)
		String token = restClient.post().uri("/login?username=sonu&password=sonu").retrieve().body(String.class);

		System.out.println("JWT Token: " + token);

		// 🔹 STEP 2: CALL SECURED API
		Employee emp = restClient.get().uri("/api/v1/employees/{id}", "oid_03027")
				.header("Authorization", "Bearer " + token).retrieve().body(Employee.class);

		System.out.println("Employee: " + emp);
	}
}

//package com.ibm.rest.consume.demo.client;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestClient;
//
//import com.ibm.rest.consume.demo.model.Post;
//
//@Component
//public class RestConsume implements CommandLineRunner {
//
//	private final RestClient restClient;
//
//	private final String apiUrl = "https://jsonplaceholder.typicode.com/posts";
//
//	public RestConsume(RestClient.Builder builder) {
//		this.restClient = builder.baseUrl(apiUrl) // change as needed
//				.build();
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		Post post = restClient.get().uri("/{id}", "2").retrieve().body(Post.class);
//
//		System.out.println(post.toString());
//
//	}
//}
//
