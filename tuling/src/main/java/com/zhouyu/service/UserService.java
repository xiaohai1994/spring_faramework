package com.zhouyu.service;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.event.TransactionalEventListener;
import org.springframework.transaction.support.TransactionSynchronization;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import javax.annotation.PostConstruct;

/**
 * @author 周瑜
 */
@Component
public class UserService {

	private OrderService orderService;

	@Autowired(required = false)
	private UserService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Autowired(required = false)
	public UserService(OrderService orderService, OrderService orderService1) {
		this.orderService = orderService;
	}

	@Autowired(required = false)
	private UserService(OrderService orderService, OrderService orderService1, OrderService orderService2) {
		this.orderService = orderService;
	}

	public void test() {
		System.out.println(orderService);

	}
}
