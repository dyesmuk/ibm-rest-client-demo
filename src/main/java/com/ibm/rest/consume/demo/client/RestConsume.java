package com.ibm.rest.consume.demo.client;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import com.ibm.rest.consume.demo.model.Employee;

@Component
public class RestConsume implements CommandLineRunner {

	private final RestClient restClient;
	private final String apiUrl = "https://jsonplaceholder.typicode.com/users";

	public RestConsume(RestClient.Builder builder) {
		this.restClient = builder.baseUrl(apiUrl) // change as needed
				.build();
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(restClient.get().uri("/", "2").retrieve());

	}
}

//package com.ibm.rest.consume.demo.client;
//
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestClient;
//
//import com.ibm.rest.consume.demo.model.Employee;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class RestConsume implements CommandLineRunner {
//
//	private final RestClient restClient;
//	private final String apiUrl = "https://jsonplaceholder.typicode.com/users";
//
//	public RestConsume(RestClient.Builder builder) {
//		this.restClient = builder.baseUrl(apiUrl) // change as needed
//				.build();
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
////		// 1. GET all employees
////		System.out.println("---- GET ALL ----");
////		List<Employee> employees = Arrays.asList(restClient.get().retrieve().body(Employee[].class));
////		employees.forEach(System.out::println);
//
//		// 2. GET employee by ID
//		System.out.println("---- GET BY ID ----");
//		Employee emp = restClient.get().uri("/", "2").retrieve().body(Employee.class);
//		System.out.println(emp);
//
////		// 3. CREATE employee (POST)
////		System.out.println("---- CREATE ----");
////		Employee newEmp = new Employee();
////		newEmp.setFirstName("John");
////		newEmp.setLastName("Doe");
////		newEmp.setEmail("john@example.com");
////		newEmp.setPhone("9999999999");
////		newEmp.setAge(30);
////
////		Employee created = restClient.post().body(newEmp).retrieve().body(Employee.class);
////
////		System.out.println("Created: " + created);
////
////		// 4. UPDATE employee (PUT)
////		System.out.println("---- UPDATE ----");
////		created.setFirstName("UpdatedName");
////
////		restClient.put().uri("/{id}", created.getId()).body(created).retrieve().toBodilessEntity();
////
////		System.out.println("Updated Successfully");
////
////		// 5. DELETE employee
////		System.out.println("---- DELETE ----");
////		restClient.delete().uri("/{id}", created.getId()).retrieve().toBodilessEntity();
////
////		System.out.println("Deleted Successfully");
//	}
//}