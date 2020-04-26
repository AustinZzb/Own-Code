/**
 * ���ô洢���̵Ĳ���
 * I.  �������ô洢���̵Ķ���conntecion.CallableStatement("�洢����name")
 * II. ͨ��set�������� �����������ֵ
 * III.ͨ��state.registerOutParameter(3, java.sql.Types.INTEGER);�����������
 * IV. state.execute()ִ��
 * V.  ���� ������� get() 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author ���°�
 *
 * 2020��3��11������9:28:05
 */
public class CallableStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQL_Update();
	}
	
	private static void SQL_Update() {
		Connection conn = null;
		java.sql.CallableStatement state = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			// mysql8.0�汾��Ҫ����serverTimezoneʱ����useSSL����
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC&useSSL=false", "root", "root");
			state = conn.prepareCall("{call addTwoNum(?, ?, ?)}");
			state.setInt(1, 1110);
			state.setInt(2, 10);
			
			// ���������������
			state.registerOutParameter(3, java.sql.Types.INTEGER);
			state.execute(); // ִ�д洢����, ֮ǰ������������Լ�����������ͣ� ֮�����������
			
			int result = state.getInt(3); // ��ȡ������out   result
			System.out.println(result);
			
			// �������
//			String sql = "insert into stu values(1232,'zzb2',20,1)";
			// �޸����
//			String sql = "update stu set uname='zyj',uage=18,uid=1000 where uid=1";
			// ɾ�����
			
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
	
	private static void SQL_Query() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstate = null;
		ResultSet re = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC", "root", "root");
			
			String sql = "select * from stu";
			pstate = conn.prepareStatement(sql);
			
			re = pstate.executeQuery();
			
			while (re.next()) {
				int id = re.getInt("uid");
				String name = re.getString("uname");
				System.out.println(id+"----"+name);
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if (re != null)
					re.close();
				if (pstate != null)
					pstate.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
		}
			
	}

}
