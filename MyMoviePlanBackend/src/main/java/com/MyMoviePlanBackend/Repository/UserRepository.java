package com.MyMoviePlanBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyMoviePlanBackend.Entity.user;


@Repository
public interface UserRepository extends JpaRepository<user, String> {

}
