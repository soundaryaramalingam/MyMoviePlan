package com.MyMoviePlanBackend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MyMoviePlanBackend.Entity.order;
import com.MyMoviePlanBackend.Repository.OrderRepository;


@Service
public class OrderService {
	@Autowired
	OrderRepository orderrepo;
	
	public order addOrder(order order) {
		return orderrepo.save(order);
	}
}
