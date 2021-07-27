package com.zhouyu.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Before;

//@Aspect
//@Component
public class ZhouyuAspect {

	@Before("execution(public void com.zhouyu.service.UserService.test())")
	public void tulingBefore(JoinPoint joinPoint) {
		System.out.println("zhouyuBefore");
	}


}
