package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author 张致邦
 *
 * 2020年3月11日下午8:16:18
 */
public class Statement_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		SQL_Update();
		SQL_Query();
		
	}
	
	private static void SQL_Query() {
		Connection conn = null;
		Statement state = null;
		ResultSet re = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// @note MySql8.0以上版本加载驱动需要在后面奖赏  时区?serverTimezone=UTC
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC", "root", "root");
			
			state = conn.createStatement();
			
			/*
			 * 模拟SQL注入   账号：'任意值 ' or 1=1 -- ' 密码：任意值
			 */
			String uid = "lkjlkjlkj ' or 1=1 -- ";
			int upwd = 24245;
			
			String sql = "select count(1) from stu where uname='"+uid+"' and uage="+upwd+"";
			System.out.println(sql);
			re = state.executeQuery(sql);
			
			int count = -1;
			if (re.next())
				count = re.getInt(1);
			
			if (count > 0)
				System.out.println("登录成功！");
			else 
				System.out.println("登录失败！");
			
//			while (re.next()) {
//				int id = re.getInt("uid");
//				String name = re.getString("uname");
//				System.out.println(id+"----"+name);
//			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	private static void SQL_Update() {
		Connection conn = null;
		Statement state = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// mysql8.0版本需要设置serverTimezone时区，useSSL随意
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC&useSSL=false", "root", "root");
			state = conn.createStatement();
			// 增加语句
//			String sql = "insert into stu values(1232,'zzb2',20,1)";
			// 修改语句
//			String sql = "update stu set uname='zyj',uage=18,uid=1000 where uid=1";
			// 删除语句
			String sql = "delete from stu where uid=1000";
			System.out.println(sql);
			int flag = state.executeUpdate(sql);
			
			if (flag > 0)
				System.out.println("执行成功!");
			else
				System.out.println("没有此数据！");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			
				try {
					if (state != null)
						state.close();
					if (conn != null) 
						conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
		}
	}

}
