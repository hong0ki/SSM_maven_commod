/**
 * @Package: proTest
 * @author: 李卓宏
 * @date: 2018年7月23日 下午4:05:25 
 */
package proTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lzh.common.mapper.UserMapper;
import cn.lzh.common.po.User;
import cn.lzh.common.service.UserService;

/**
 * @ClassName: ssmTest
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月23日 下午4:05:25 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis-t.xml")
public class ssmTest {
	@Autowired
	UserMapper userMapper;
	@Autowired
	UserService userService;

	@Test
	public void gettu() {
//		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-t.xml");
//		UserMapper indexService =  (UserMapper) ac.getBean("userMapper");
		//List<User_qch> list=indexService.getUser();
		List<User> list=userMapper.getAllUser();
		System.out.println(list);
	}
}
