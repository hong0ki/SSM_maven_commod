/**
 * @Package: proTest
 * @author: 李卓宏
 * @date: 2018年7月21日 上午11:04:53 
 */
package proTest;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.lzh.common.mapper.UserMapper;
import cn.lzh.common.po.User;


/**
 * @ClassName: jdbcTestSpringMybatis
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月21日 上午11:04:53 
 */

public class jdbcTestSpringMybatis {

	@Test
	public void gettu() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring-t.xml");
		UserMapper indexService =  (UserMapper) ac.getBean("userMapper");
		//List<User_qch> list=indexService.getUser();
		List<User> list=indexService.getAllUser();
		System.out.println(list);
	}
	
//	@SuppressWarnings("resource")
//	@Test
//	public void testDataSource() throws SQLException {
//		ApplicationContext aContext = new ClassPathXmlApplicationContext("spring-t.xml");
//		SqlSessionFactory factory = (SqlSessionFactory) aContext.getBean("sqlSessionFactory");
//		SqlSession session = factory.openSession();
//		System.out.println(session);
//	}
}
