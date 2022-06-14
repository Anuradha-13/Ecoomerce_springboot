package com.shopping.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Order;
import com.shopping.repository.OrderRepository;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private OrderRepository orderRepository;
	
	
	@Override
	public List<Order> getAllOrders(int userid) {
		return this.orderRepository.findByUserId(userid);
		
	}

}
