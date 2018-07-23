/**
 * @Package: cn.lzh.common.service.impl
 * @author: 李卓宏
 * @date: 2018年7月23日 下午2:44:33 
 */
package cn.lzh.common.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.lzh.common.mapper.UserMapper;
import cn.lzh.common.po.User;
import cn.lzh.common.service.UserService;

/**
 * @ClassName: UserServiceImpl
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月23日 下午2:44:33 
 */
@Service("userServiceImpl")
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;

	/* Title: getUserByName
	 * @Description: TODO
	 * @see cn.lzh.common.service.UserService#getUserByName(java.lang.String)
	 */
	@Override
	public User getUserByName(String name) {
		
		return userMapper.getUserByname(name);
	}

	/* Title: getAllUser
	 * @Description: TODO
	 * @see cn.lzh.common.service.UserService#getAllUser()
	 */
	@Override
	public List<User> getAllUser() {
		
		return userMapper.getAllUser();
	}

}
