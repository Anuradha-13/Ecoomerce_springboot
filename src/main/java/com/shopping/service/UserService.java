package com.shopping.service;

import java.util.List;

import com.shopping.entity.Order;

public interface UserService {
	
	public List<Order> getAllOrders(int userid);

}
