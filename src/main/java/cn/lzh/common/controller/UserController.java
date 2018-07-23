/**
 * @Package: cn.lzh.common.controller
 * @author: 李卓宏
 * @date: 2018年7月23日 下午7:25:38 
 */
package cn.lzh.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.lzh.common.service.UserService;

/**
 * @ClassName: UserController
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月23日 下午7:25:38 
 */
@Controller
public class UserController {
	@Autowired
	UserService userService;
	
	@RequestMapping("/user/getAllUser")
	@ResponseBody
	public String getAllUser(String type) {
		System.out.println(type);
		
		return "9999";
	}
	

}
