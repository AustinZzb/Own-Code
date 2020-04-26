package zhujiemian;

import java.sql.Connection;
import java.sql.DriverManager;

public class ku {
	public Connection SQLku() {
		Connection con = null;
		try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb?characterEncoding=gbk&serverTimezone=GMT%2B8","root","root");
		}catch(Exception e) {
			e.getStackTrace();
			e.printStackTrace();
		}
		return con;
	}
}
