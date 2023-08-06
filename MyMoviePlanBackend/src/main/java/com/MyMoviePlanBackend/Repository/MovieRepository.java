package com.MyMoviePlanBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyMoviePlanBackend.Entity.Movies;

@Repository
public interface MovieRepository extends JpaRepository<Movies, Long>{

}
