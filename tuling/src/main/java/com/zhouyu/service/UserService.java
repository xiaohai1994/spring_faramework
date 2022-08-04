package com.zhouyu.service;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import java.util.Date;

@Component
public class UserService {

	@Autowired
	private OrderService orderService;

	public void test(){
		System.out.println(orderService);
	}

	@Scheduled(fixedDelayString = "${fixedDelayString}")
	public void scheduleMethod(){
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("任务1"+ Thread.currentThread().getName());
	}

	@Scheduled(fixedDelayString = "${fixedDelayString}")
	public void scheduleMethod2(){
		System.out.println("任务2"+ Thread.currentThread().getName());
	}




}
