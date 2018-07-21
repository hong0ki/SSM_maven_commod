/**
 * @Package: cn.lzh.common.po
 * @author: 李卓宏
 * @date: 2018年7月21日 上午9:21:25 
 */
package cn.lzh.common.po;

import java.io.Serializable;

/**
 * @ClassName: User
 * @Description: TODO
 * @author 李卓宏
 * @date: 2018年7月21日 上午9:21:25 
 */
public class User implements Serializable{

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 5472426010078301090L;
	
	private int id;
	private String username;
	private String password;
	private int status;
	public User() {
		super();
		
	}
	public User(String username, String password, int status) {
		super();
		this.username = username;
		this.password = password;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", status=" + status + "]";
	}
	
	

}
