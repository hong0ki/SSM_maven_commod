/**
 * @Package: proTest
 * @author: 李卓宏
 * @date: 2018年7月21日 上午10:18:10 
 */
package proTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import cn.lzh.common.mapper.UserMapper;
import cn.lzh.common.po.User;

/**
 * @ClassName: JdbcTest
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月21日 上午10:18:10 
 */
public class JdbcTest {
	@Test
	public void test() {
		InputStream in = null;
		
		//加载Mybatis配置文件
		try {
			in = Resources.getResourceAsStream("mybatis-t-Config.xml");
			//根据相关的mybatis配置文件， 创建连接SQLSessionFactory连接对象
			SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
			//创建出SQLSession对象
			SqlSession sqlSeesion = factory.openSession();
			//通过sqlSession取到映射接口
			UserMapper userMapper = sqlSeesion.getMapper(UserMapper.class);
			User user = userMapper.getUserByname("admin");
			System.out.println(user);
			List<User> list=userMapper.getAllUser();
			System.out.println(list);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
