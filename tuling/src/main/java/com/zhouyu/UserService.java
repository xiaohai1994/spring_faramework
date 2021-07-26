package com.zhouyu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 周瑜
 */
@Component
public class UserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Transactional
	public void test(){
		System.out.printf("hello spring！！！");

		jdbcTemplate.execute("insert t1 values(1,1,1,1,1)");
		throw new NullPointerException();
	}
}
