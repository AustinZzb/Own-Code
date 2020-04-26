package zhujiemian;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class zhangkuan {
	
	public zhangkuan(int m,int n,String s_1) {
		
		ku k = new ku();
		Connection con = k.SQLku();
		Statement state = null;
		
		
		//采购
		if(n==0) {
				String[] s = new String[10];
				String[] s1 = new String[12];
				try {
					//读取caigou_hn
					state = con.createStatement();
					ResultSet rs = null;
					if(m==0) {
						rs = state.executeQuery("select * from caigou_hn where bookid='"+s_1+"'");
					}else if(m==1) {
						rs = state.executeQuery("select * from caigou_bj where bookid='"+s_1+"'");
					}else if(m==2) {
						rs = state.executeQuery("select * from caigou_sh where bookid='"+s_1+"'");
					}else if(m==3) {
						rs = state.executeQuery("select * from caigou_xn where bookid='"+s_1+"'");
					}
					rs.last();
					rs.beforeFirst();
					while(rs.next()) {
						s[0] = rs.getString(1);
						s[1] = rs.getString(2);
						s[2] = rs.getString(3);
						s[3] = rs.getString(4);
						s[4] = rs.getString(5);
						s[5] = rs.getString(6);
						s[6] = rs.getString(7);
						s[7] = rs.getString(8);
						s[8] = rs.getString(9);
						s[9] = rs.getString(10);
					}
					rs.close();
					
					ResultSet rs_1 = null;
					if(m==0) {
						rs_1 = state.executeQuery("select kucun_0 from kucun_hn where bookid='"+s_1+"'");
					}else if(m==1) {
						rs_1 = state.executeQuery("select kucun_0 from kucun_bj where bookid='"+s_1+"'");
					}else if(m==2) {
						rs_1 = state.executeQuery("select kucun_0 from kucun_sh where bookid='"+s_1+"'");
					}else if(m==3) {
						rs_1 = state.executeQuery("select kucun_0 from kucun_xn where bookid='"+s_1+"'");
					}
					
					rs_1.last();
					rs_1.beforeFirst();
					if(rs_1.next()) {
						String s_2 = rs_1.getString(1);
						
						int i = (int)(Math.random()*10000000);
						DecimalFormat df_1=new DecimalFormat("00000000"); // 字符串长度<=6时带前导零，>6时照常显示
						s1[0] = df_1.format(i);
						s1[1] = "支出";
						int b_1 = Integer.valueOf(s[8]);
						s1[2]=b_1+"";
						s1[3] = s[5];
						s1[4] = s_1;
						s1[5] = s[4];
						s1[6] = s[7]+"本";
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
						s1[7] = df.format(new Date());
						s1[8] = s_2+"本";
						if(m==0) {
							s1[9] = "河南分区";
						}else if(m==1) {
							s1[9] = "北京分区";
						}else if(m==2) {
							s1[9] = "上海分区";
						}else if(m==3) {
							s1[9] = "西南分区";
						}
						Calendar ca = Calendar.getInstance(); 
						s1[10] =ca.get(Calendar.YEAR)+"";//获取年份
						int n_11 = ca.get(Calendar.MONTH)+1;
						String s_123 = null;
						if(n_11 == 1) {
							s_123 = "一月";
						}else if(n_11 ==2) {
							s_123 = "二月";
						}else if(n_11 ==3) {
							s_123 = "三月";
						}else if(n_11 ==4) {
							s_123 = "四月";
						}else if(n_11 ==5) {
							s_123 = "五月";
						}else if(n_11 ==6) {
							s_123 = "六月";
						}else if(n_11 ==7) {
							s_123 = "七月";
						}else if(n_11 ==8) {
							s_123 = "八月";
						}else if(n_11 ==9) {
							s_123 = "九月";
						}else if(n_11 ==10) {
							s_123 = "十月";
						}else if(n_11 ==11) {
							s_123 = "十一月";
						}else if(n_11 ==12) {
							s_123 = "十二月";
						}
						s1[11] =  s_123;//获取月份
						
						
						try {
							state.executeUpdate("insert into zhangkuan "+"(id,type,sum_0,fuzerenid,bookid,danhao,mingxi,time,kucun,fenqu,year,month) values ('"+s1[0]+"',"+"'"+s1[1]+"',"+"'"+s1[2]+"',"+"'"+s1[3]+"',"+"'"+s1[4]+"',"+"'"+s1[5]+"',"+"'"+s1[6]+"',"+"'"+s1[7]+"'"+",'"+s1[8]+"'"+",'"+s1[9]+"'"+",'"+s1[10]+"'"+",'"+s1[11]+"'"+")");
							
							state.close();
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}else {
						JOptionPane.showMessageDialog(null, "查无此书！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
					}
					
					
					rs_1.close();
					
					
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
					
			
		}
		
		
		
		
		//销售
				if(n==1) {
					String[] s = new String[10];
					String[] s1 = new String[12];
					try {
						//读取caigou_hn
						state = con.createStatement();
						ResultSet rs = null;
						if(m==0) {
							rs = state.executeQuery("select * from xiaoshou_hn where bookid='"+s_1+"'");
						}else if(m==1) {
							rs = state.executeQuery("select * from xiaoshou_bj where bookid='"+s_1+"'");
						}else if(m==2) {
							rs = state.executeQuery("select * from xiaoshou_sh where bookid='"+s_1+"'");
						}else if(m==3) {
							rs = state.executeQuery("select * from xiaoshou_xn where bookid='"+s_1+"'");
						}
						rs.last();
						rs.beforeFirst();
						while(rs.next()) {
							s[0] = rs.getString(1);
							s[1] = rs.getString(2);
							s[2] = rs.getString(3);
							s[3] = rs.getString(4);
							s[4] = rs.getString(5);
							s[5] = rs.getString(6);
							s[6] = rs.getString(7);
							s[7] = rs.getString(8);
							s[8] = rs.getString(9);
							s[9] = rs.getString(10);
						}
						rs.close();
						
						ResultSet rs_1 = null;
						if(m==0) {
							rs_1 = state.executeQuery("select kucun_0 from kucun_hn where bookid='"+s_1+"'");
						}else if(m==1) {
							rs_1 = state.executeQuery("select kucun_0 from kucun_bj where bookid='"+s_1+"'");
						}else if(m==2) {
							rs_1 = state.executeQuery("select kucun_0 from kucun_sh where bookid='"+s_1+"'");
						}else if(m==3) {
							rs_1 = state.executeQuery("select kucun_0 from kucun_xn where bookid='"+s_1+"'");
						}
						
						rs_1.last();
						rs_1.beforeFirst();
						if(rs_1.next()) {
							String s_2 = rs_1.getString(1);
							
							int i = (int)(Math.random()*10000000);
							DecimalFormat df_1=new DecimalFormat("00000000"); // 字符串长度<=6时带前导零，>6时照常显示
							s1[0] = df_1.format(i);
							s1[1] = "收入";
							int b_1 = Integer.valueOf(s[8]);
							s1[2]=b_1+"";
							s1[3] = s[5];
							s1[4] = s_1;
							s1[5] = s[4];
							s1[6] = s[7]+"本";
							SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
							s1[7] = df.format(new Date());
							s1[8] = s_2+"本";
							if(m==0) {
								s1[9] = "河南分区";
							}else if(m==1) {
								s1[9] = "北京分区";
							}else if(m==2) {
								s1[9] = "上海分区";
							}else if(m==3) {
								s1[9] = "西南分区";
							}
							Calendar ca = Calendar.getInstance(); 
							s1[10] =ca.get(Calendar.YEAR)+"";//获取年份
							s1[11] =ca.get((Calendar.MONTH)+1)+"";//获取月份
							
							try {
								state.executeUpdate("insert into zhangkuan "+"(id,type,sum_0,fuzerenid,bookid,danhao,mingxi,time,kucun,fenqu,year,month) values ('"+s1[0]+"',"+"'"+s1[1]+"',"+"'"+s1[2]+"',"+"'"+s1[3]+"',"+"'"+s1[4]+"',"+"'"+s1[5]+"',"+"'"+s1[6]+"',"+"'"+s1[7]+"'"+",'"+s1[8]+"'"+",'"+s1[9]+"'"+",'"+s1[10]+"'"+",'"+s1[11]+"'"+")");
								
								state.close();
								con.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}else {
							JOptionPane.showMessageDialog(null, "查无此书！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
						}
						rs_1.close();
						
					} catch (SQLException e) {
						e.printStackTrace();
					}
						
					
				}
	}
	
}
