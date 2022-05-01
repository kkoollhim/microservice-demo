package com.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@SpringBootApplication
//@EnableEurekaClient
public class UserApplication {

	@Bean
//	@LoadBalanced
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(UserApplication.class, args);


		//Practice
		ArrayList<String> list = new ArrayList<>();
		list.add("Himanshu");
		list.add("Deepanshu");
		list.add("Sudhanshu");
		list.add("Priyanshu");
		list.add("Himanshu");

		//using for each
//		list.forEach(System.out::println);

//		using iterator
		for (String s : list) {
			System.out.println(s);
		}

		ArrayList<Integer> int_list = new ArrayList<>(1);
		int_list.add(1);
		int_list.add(1, 10);

//		for(int a: int_list){
//			System.out.println(a);
//		}
		System.out.println(int_list.size());
		System.out.println(list);

		//sorting
//		Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

//		Set<String> s = new HashSet<>(list);
//		System.out.println(s);

		String[] item = list.toArray(new String[list.size()]);
		for(String s: item){
			System.out.println(s);
		}

		//array to arraylist
		List<String> li = new ArrayList<>();
		li = Arrays.asList(item);
		System.out.println(li);






	}

}
