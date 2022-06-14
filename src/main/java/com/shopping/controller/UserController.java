package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Order;
import com.shopping.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
		@Autowired
		UserService userService;
		
		
		public UserController(UserService userService) {
			this.userService = userService;
		}

		@GetMapping("/{userid}/orders")
		public ResponseEntity<List<Order>> list(@PathVariable(name = "userid") int userid) {
			
			List<Order> order = userService.getAllOrders(userid);
			return ResponseEntity.ok().body(order);
}

}
