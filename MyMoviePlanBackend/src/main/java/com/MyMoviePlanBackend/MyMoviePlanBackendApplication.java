package com.MyMoviePlanBackend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


import com.MyMoviePlanBackend.Entity.Movies;
import com.MyMoviePlanBackend.Repository.MovieRepository;

@SpringBootApplication
@ComponentScan(basePackages = "com.MyMoviePlanBackend.*")
public class MyMoviePlanBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MyMoviePlanBackendApplication.class, args);
		System.out.println("Server started...");
	}

	@Autowired
	MovieRepository movierepo;
	
	@Override
	public void run(String... args) {
	 
		   
			this.movierepo.save(new Movies("Maaveran","Tamil Movie","Humour","2023-07-15",150,"08:15:00"));
		
	}

}
