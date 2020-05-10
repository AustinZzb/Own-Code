/*
 *	用户登录信息实体类
 */
package Entity;

/**
 * 	@author 张致邦
 *
 * 	2020年5月9日-下午12:49:06
 */
public class Login {
	private String id;
	private String upwd;
	private int admin;   // @param 用户权限
	
	public Login() {
	}
	
	public Login(String id, String upwd) {
		this.id = id;
		this.upwd = upwd;
	}
	
	public Login(String id, String upwd, int admin) {
		this.id = id;
		this.upwd = upwd;
		this.admin = admin;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public int getAdmin() {
		return admin;
	}
	public void setAdmin(int admin) {
		this.admin = admin;
	}
	
	
}
