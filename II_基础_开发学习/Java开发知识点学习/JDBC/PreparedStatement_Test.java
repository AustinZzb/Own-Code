package JDBC;
/*
 * JDBC推荐使用PreparedStatement（预编译、占位符）
 * 并且预编译提高了性能，安全有效的防止SQL注入
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 张致邦
 *
 * 2020年3月11日下午8:14:06
 */
public class PreparedStatement_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQL_Update();
		SQL_Query();
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

	private static void SQL_Update() {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstate = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC", "root", "root");
			
			String sql = "insert into stu values(?, ?, ?, ?)";
			// PrearedStatement 会用？占位符预编译，防止Sql注入，强烈建议使用
			pstate = conn.prepareStatement(sql);
			
			pstate.setInt(1, 1520);
			pstate.setString(2, "张英俊");
			pstate.setInt(3, 1314);
			pstate.setInt(4, 1);
			
			pstate.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
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
