package com.MyMoviePlanBackend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.MyMoviePlanBackend.Entity.Admin;
import com.MyMoviePlanBackend.Entity.Movies;
import com.MyMoviePlanBackend.Repository.AdminRepository;
import com.MyMoviePlanBackend.Service.AdminService;
import com.MyMoviePlanBackend.Service.MovieService;


@RestController
@CrossOrigin(origins="http://localhost:4200")
public class MovieController {
	
	@Autowired
	MovieService movieserv;
	
	@Autowired
	AdminService adminserv;
	
	@GetMapping("/listmovies")
	public ResponseEntity<List<Movies>> listmovies() {
		
		List<Movies> movies=movieserv.ListMovies();
		System.out.println(movies);
		return new ResponseEntity<List<Movies>>(movies,HttpStatus.OK);
		
	}
	@PostMapping("/addMovie")
	public Movies addMovie(@RequestBody Movies mov) {
		System.out.println("entered");
		Movies mov1=movieserv.addMedicine(mov);
		return mov1;
	}
	@GetMapping("/deleteMovie/{id}")
	public String deleteMedicine(@PathVariable("id") long id) {
		movieserv.deleteMovie(id);
		return "Medicine Deleted Successfully";
	}
	@PostMapping("/updatepass")
	public Admin updatepass(@RequestBody Admin admin) {
		System.out.println("entered update backend "+admin.getEmailid()+" "+admin.getPass());
		return adminserv.updatepass(admin);
	}
	@PostMapping("/updateMovie/{id}")
	public Movies updateMovie(@RequestBody Movies mov, @PathVariable("id") long id) {
		System.out.println("entered update backend");
		return movieserv.updateMovie(mov, id);
	}
	@GetMapping("/{id}")
	public Movies getMovieById(@PathVariable("id") long id) {
		System.out.println("Entered get movie by id");
		return movieserv.getMovieById(id).get();
	}




}
