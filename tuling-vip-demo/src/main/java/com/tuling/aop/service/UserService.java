package com.tuling.aop.service;

import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.SpringProxy;

/**
 * @author 周瑜
 */
public class UserService implements UserInterface {

	public void test() {
		System.out.println("test...");
//		throw new NullPointerException();
	}


}
