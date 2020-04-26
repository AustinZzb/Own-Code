import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 *	�������ݿ⹤����
 */

/**
 * 	@author ���°�
 *
 * 	2020��4��6��-����2:07:29
 */
public class DButil {
	private String url = "jdbc:mysql://localhost:3306/yishu?serverTimezone=UTC";
	private String name = "root";
	private String password = "root";
	private Connection con = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * @method ʹ��Ĭ�����ݿ�yishu
	 */
	public DButil() {
	}

	/**
	 * @method �������ݿ�
	 * @param url
	 * @param name
	 * @param password
	 */
	public DButil(String url, String name, String password) {
		this.url = url;
		this.name = name;
		this.password = password;
	}
	
	/**
	 * @method ��ȡ���ݿ�����
	 */
	private void getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.con = DriverManager.getConnection(url, name, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @method ��ȡStatement
	 */
	private void createStatement() {
		try {
			this.stmt = this.con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @method ��ȡPreparStatement
	 */
	private void createPreparStatement(String sql) {
		try {
			this.pstmt = this.con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * @method �޸����ݿ�
	 * @param String sql
	 */
	public boolean executeUpdate(String sql) {
		getConnection();
		createStatement();
		
		int result = -1;
		try {
			result = this.stmt.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result > 0;
	}
	
	/**
	 * @method �޸����ݿ�
	 * @param String sql, Object[] params
	 */
	public boolean executeUpdate(String sql, Object[] params) {
		getConnection();
		createPreparStatement(sql);
		
		int index = 1, result = -1;
		try {
			if (params != null) 
				for (Object param : params) 
					this.pstmt.setObject(index++, param);
			result = this.pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result > 0;
	}
	
	/**
	 * @method ��ѯ���ݿ�
	 * @param String sql
	 */
	public ResultSet executeQurey(String sql) {
		getConnection();
		createStatement();
		
		try {
			this.rs = this.stmt.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.rs;
	}
	
	/**
	 * @method ��ѯ���ݿ�
	 * @param String sql, Object[] params 
	 */
	public ResultSet executeQurey(String sql, Object[] params) {
		getConnection();
		createPreparStatement(sql);
		
		int index = 1;
		try {
			if (params != null) 
				for (Object param : params) 
					this.pstmt.setObject(index++, param);
			this.rs = this.pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return this.rs;
	}
	
	/**
	 * @method �ر����ݿ�
	 */
	public void close() {
		try {
			if (this.rs != null) this.rs.close();
			if (this.pstmt != null) this.pstmt.close();
			if (this.stmt != null) this.stmt.close();
			if (this.con != null) this.con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}





























