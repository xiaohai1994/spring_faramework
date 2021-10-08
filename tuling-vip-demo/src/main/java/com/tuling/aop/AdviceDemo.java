package com.tuling.aop;

import com.tuling.UserService;
import com.tuling.aop.advice.ZhouyuThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author 周瑜
 */
public class AdviceDemo {

	public static void main(String[] args) {
		UserService userService = new UserService();
		ProxyFactory proxyFactory = new ProxyFactory(userService);
		proxyFactory.setProxyTargetClass(true);
//		proxyFactory.addAdvice(new ZhouyuBeforeAdvise());
//		proxyFactory.addAdvice(new ZhouyuAfterReturningAdvise());
		proxyFactory.addAdvice(new ZhouyuThrowsAdvice());
//		proxyFactory.addAdvice(new ZhouyuAroundAdvise());
		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.test("zhouyu123");
	}
}
