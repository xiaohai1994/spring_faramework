package com.tuling.aop;

import com.tuling.aop.advice.ZhouyuBeforeAdvise;
import com.tuling.aop.service.UserInterface;
import com.tuling.aop.service.UserService;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.ProxyFactory;

/**
 * @author 周瑜
 */
public class TargetSourceDemo {

	public static void main(String[] args) {
		ProxyFactory proxyFactory = new ProxyFactory();
		proxyFactory.setTargetSource(new TargetSource() {
			@Override
			public Class<?> getTargetClass() {
				return UserService.class;
			}

			@Override
			public boolean isStatic() {
				return false;
			}

			@Override
			public Object getTarget() throws Exception {
				return new UserService();
			}

			@Override
			public void releaseTarget(Object target) throws Exception {

			}
		});

		proxyFactory.addAdvice(new ZhouyuBeforeAdvise());

		UserService proxy = (UserService) proxyFactory.getProxy();
		proxy.test();
	}
}
