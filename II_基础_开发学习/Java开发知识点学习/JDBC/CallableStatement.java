/**
 * 调用存储过程的步骤
 * I.  产生调用存储过程的对象conntecion.CallableStatement("存储过程name")
 * II. 通过set（）方法 处理输入参数值
 * III.通过state.registerOutParameter(3, java.sql.Types.INTEGER);处理输出参数
 * IV. state.execute()执行
 * V.  接受 输出参数 get() 
 */
package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author 张致邦
 *
 * 2020年3月11日下午9:28:05
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
			// mysql8.0版本需要设置serverTimezone时区，useSSL随意
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?serverTimezone=UTC&useSSL=false", "root", "root");
			state = conn.prepareCall("{call addTwoNum(?, ?, ?)}");
			state.setInt(1, 1110);
			state.setInt(2, 10);
			
			// 设置输出参数类型
			state.registerOutParameter(3, java.sql.Types.INTEGER);
			state.execute(); // 执行存储过程, 之前处理输入参数以及输出参数类型， 之后处理输出参数
			
			int result = state.getInt(3); // 获取第三个out   result
			System.out.println(result);
			
			// 增加语句
//			String sql = "insert into stu values(1232,'zzb2',20,1)";
			// 修改语句
//			String sql = "update stu set uname='zyj',uage=18,uid=1000 where uid=1";
			// 删除语句
			
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
