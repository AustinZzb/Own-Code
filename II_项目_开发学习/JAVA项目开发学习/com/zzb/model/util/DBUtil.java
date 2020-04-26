package com.zzb.model.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * ��װJDBC�������ݿ�Ĳ���
 * @author ���°�
 *
 * 2020��2��25��-����9:32:01
 */
public class DBUtil {

	    private  Connection conn = null;
	    private  Statement state = null;
	    private  ResultSet res = null;

	      //  ����д�����޷����ã�������Ҫ���N��connection���������޷����
//	    public DButil(){
//	        try{
//	            Class.forName("com.mysql.jdbc.Driver");
//	            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb", "", "");
//	        }catch (SQLException e){
//	            e.printStackTrace();
//	        }
//	    }

	    // ������������
	    private Connection connectionToDB(){
	        Connection myconn = null;
	        try{
				Class.forName("com.mysql.jdbc.Driver");
	            myconn = DriverManager.getConnection("jdbc:mysql://localhost:3306/zhangzb", "", "");
	        }catch (SQLException e){
	            e.printStackTrace();
	        }catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return myconn;
	    }
	    
	    public DBUtil(){
	        this.conn = connectionToDB();
	    }

	    public int update(String sql){
	        int n = -1;
	        try{
	            this.state = this.conn.createStatement();
	            n = this.state.executeUpdate(sql);
	        }catch (SQLException e){
	            e.printStackTrace();
	        }
	        return n;
	    }

	    public ResultSet query(String sql){
	        try{
	            this.state = this.conn.createStatement();
	            this.res = this.state.executeQuery(sql);
	        }catch(SQLException e){
	            e.printStackTrace();
	        }
	        return this.res;
	    }

	    public void close(){
	        try{
	            if(this.res != null){
	                this.res.close();
	                this.res = null;
	            }
	            if(this.state != null){
	                this.state.close();
	                this.state = null;
	            }
	            if(this.conn != null){
	                this.conn.close();
	                this.conn = null;
	            }
	        }catch (SQLException e){
	            e.printStackTrace();
	        }

	    }

	
}
