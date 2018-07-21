/**
 * @Package: cn.lzh.common.mapper
 * @author: 李卓宏
 * @date: 2018年7月21日 上午9:29:02 
 */
package cn.lzh.common.mapper;

import java.util.List;

import cn.lzh.common.po.User;

/**
 * @ClassName: UserMapper
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月21日 上午9:29:02 
 */
public interface UserMapper {
	
	User getUserByname(String name);
	
	List<User> getAllUser();

}
