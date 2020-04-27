/*
package com.yy.bbs;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = Application.class)
class BbsApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private DiscussPostMapper discussPostMapper;

	@Test
	public  void contextLoads() {
		User user = userMapper.selectById(101);
		System.out.println(user);

	}

	@Test
	public void test(){
		List<DiscussPost> discussPosts = discussPostMapper.selectDiscussPosts(11, 0, 1);
		for (DiscussPost post : discussPosts){
			System.out.println(post);
		}

		System.out.println("=============================================");

		int i = discussPostMapper.selectDiscussPostRows(0);
		System.out.println(i);
	}


}
*/
