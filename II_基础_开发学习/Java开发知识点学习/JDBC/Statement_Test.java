package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * @author ���°�
 *
 * 2020��3��11������8:16:18
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
			// @note MySql8.0���ϰ汾����������Ҫ�ں��潱��  ʱ��?serverTimezone=UTC
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC", "root", "root");
			
			state = conn.createStatement();
			
			/*
			 * ģ��SQLע��   �˺ţ�'����ֵ ' or 1=1 -- ' ���룺����ֵ
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
				System.out.println("��¼�ɹ���");
			else 
				System.out.println("��¼ʧ�ܣ�");
			
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
			// mysql8.0�汾��Ҫ����serverTimezoneʱ����useSSL����
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC&useSSL=false", "root", "root");
			state = conn.createStatement();
			// �������
//			String sql = "insert into stu values(1232,'zzb2',20,1)";
			// �޸����
//			String sql = "update stu set uname='zyj',uage=18,uid=1000 where uid=1";
			// ɾ�����
			String sql = "delete from stu where uid=1000";
			System.out.println(sql);
			int flag = state.executeUpdate(sql);
			
			if (flag > 0)
				System.out.println("ִ�гɹ�!");
			else
				System.out.println("û�д����ݣ�");
			
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
