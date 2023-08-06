package com.MyMoviePlanBackend.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.MyMoviePlanBackend.Entity.Movies;
import com.MyMoviePlanBackend.Repository.MovieRepository;

@Service
public class MovieService {

	@Autowired
	MovieRepository movierepo;

	public List<Movies> ListMovies() {
		// TODO Auto-generated method stub
		return (List<Movies>) movierepo.findAll();

	}

	public void deleteMovie(long id) {
		movierepo.deleteById(id);
		
	}

	public Movies addMedicine(Movies mov) {
		return movierepo.save(mov);
	}
	public Movies updateMovie(Movies mov,Long id) {
		Movies movi=movierepo.findById(id).get();
		movi.setCategory(mov.getCategory());
		movi.setDescr(mov.getDescr());
	//	medic.setExpirydate(med.getExpirydate());
		movi.setName(mov.getName());
		movi.setPrice(mov.getPrice());
		movi.setShowdate(mov.getShowdate());	
		movi.setShowtimings(mov.getShowtimings());
		return movierepo.save(movi);
	}

	public Optional<Movies> getMovieById(long id) {
		return movierepo.findById(id);
	}

	
}
