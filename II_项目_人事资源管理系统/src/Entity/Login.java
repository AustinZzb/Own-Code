/*
 *	�û���¼��Ϣʵ����
 */
package Entity;

/**
 * 	@author ���°�
 *
 * 	2020��5��9��-����12:49:06
 */
public class Login {
	private String id;
	private String upwd;
	private int admin;   // @param �û�Ȩ��
	
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
