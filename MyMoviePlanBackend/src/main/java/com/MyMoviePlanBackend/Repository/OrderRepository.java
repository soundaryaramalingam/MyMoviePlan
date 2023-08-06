package com.MyMoviePlanBackend.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MyMoviePlanBackend.Entity.order;


@Repository
public interface OrderRepository extends JpaRepository<order, String>{

}
