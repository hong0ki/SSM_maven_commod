/**
 * @Package: cn.lzh.common.service
 * @author: 李卓宏
 * @date: 2018年7月23日 下午2:43:08 
 */
package cn.lzh.common.service;

import java.util.List;

import cn.lzh.common.po.User;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月23日 下午2:43:08 
 */
public interface UserService {
	User getUserByName(String name);
	List<User> getAllUser();

}
