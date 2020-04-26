package zhujiemian;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class baojing {
	
	public int baojing_1(int m,int n,String s_1,String s_2,String s_3) {
		
		ku k = new ku();
		Connection con = k.SQLku();
		Statement state = null;
		int n_1 = 0;
		String[] bj = new String [7];
		int n_2 = 0;
		
		//采购
		if(n==1) {
				String[] s = new String[8];
				String[] s1 = new String[7];
				try {
					//读取kucun
					state = con.createStatement();
					ResultSet rs = null;
					if(m==0) {
						rs = state.executeQuery("select * from kucun_hn where bookid='"+s_1+"'");
					}else if(m==1) {
						rs = state.executeQuery("select * from kucun_bj where bookid='"+s_1+"'");
					}else if(m==2) {
						rs = state.executeQuery("select * from kucun_sh where bookid='"+s_1+"'");
					}else if(m==3) {
						rs = state.executeQuery("select * from kucun_xn where bookid='"+s_1+"'");
					}
					rs.last();
					rs.beforeFirst();
					if(rs.next()) {
						s[0] = rs.getString(1);
						s[1] = rs.getString(2);
						s[2] = rs.getString(3);
						s[3] = rs.getString(4);
						s[4] = rs.getString(5);
						s[5] = rs.getString(6);
						s[6] = rs.getString(7);
						s[7] = rs.getString(8);
						
						long a = Integer.valueOf(s[4]);
						long a_1 = Integer.valueOf(s_2);
						 if((a+a_1)>=60000000) {
								n_1 = this.fanhui(1);
								JOptionPane.showMessageDialog(null, "超出上限！", "系统提示",JOptionPane.WARNING_MESSAGE);
								bj[4] = "超出上限";
						}else if((a+a_1)>55000000&&(a+a_1)<60000000) {
							n_1 = this.fanhui(0);
							JOptionPane.showMessageDialog(null, "即将超出上限！", "系统提示",JOptionPane.WARNING_MESSAGE);
							bj[4] = "即将超出上限";
						}else if(s[7].equals("差")&&a>=100) {
							n_1 = this.fanhui(1);
							bj[4] = "此书畅销度为：差！不建议继续采购";
							JOptionPane.showMessageDialog(null, "此书畅销度为：差！\n不建议继续采购", "系统提示",JOptionPane.WARNING_MESSAGE);
						}else {
							n_1 = this.fanhui(0);
						}
						
						
					}
					rs.close();
					
					if(n_1 == 1) {
						try {
							int i = (int)(Math.random()*100000);
							DecimalFormat df_1=new DecimalFormat("000000"); // 字符串长度<=6时带前导零，>6时照常显示
							String s000 = df_1.format(i);
							bj[0] = s000;
							bj[1] = s_1;
							bj[2] = s_3;
							bj[3] = "采购";
							SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
							bj[5] = df.format(new Date());
													
							if(m == 0) {
								bj[6] = "河南分区";
							}else if(m == 1) {
								bj[6] = "北京分区";
							}else if(m == 2) {
								bj[6] = "上海分区";
							}else if(m == 3) {
								bj[6] = "西南分区";
							}
							state.execute("INSERT INTO baojing"+"(id,bookid,bookname,type_0,type_1,time,fenqu)"+"VALUES("+"'"+bj[0]+"'"+","+"'"+bj[1]+"'"+","+"'"+bj[2]+"'"+","+"'"+bj[3]+"'"+","+"'"+bj[4]+"'"+","+"'"+bj[5]+"'"+","+"'"+bj[6]+"'"+")");
							
							state.close();
							con.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}
					}
					
					
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
					
			
		}
		
		
		
		//销售
				if(n==0) {
						String[] s = new String[8];
						String[] s1 = new String[7];
						try {
							//读取kucun
							state = con.createStatement();
							ResultSet rs = null;
							if(m==0) {
								rs = state.executeQuery("select * from kucun_hn where bookid='"+s_1+"'");
							}else if(m==1) {
								rs = state.executeQuery("select * from kucun_bj where bookid='"+s_1+"'");
							}else if(m==2) {
								rs = state.executeQuery("select * from kucun_sh where bookid='"+s_1+"'");
							}else if(m==3) {
								rs = state.executeQuery("select * from kucun_xn where bookid='"+s_1+"'");
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
							}
							rs.close();
							
							long a = Integer.valueOf(s[4]);
							long a_1 = Integer.valueOf(s_2);
							
							 if((a-a_1)<0){
									n_1 = this.fanhui(1);
									JOptionPane.showMessageDialog(null, "图书存量不足！", "系统提示",JOptionPane.WARNING_MESSAGE);
									bj[4] = "图书存量不足";
							}else if((a-a_1)<500&&(a-a_1)>0) {
								n_1 = this.fanhui(0);
								JOptionPane.showMessageDialog(null, "图书存量即将不足！", "系统提示",JOptionPane.WARNING_MESSAGE);
								bj[4] = "图书存量即将不足";
							}else if(s[7]!=null) {
								if(s[7].equals("火爆")&&(a-a_1)<5000) {
									n_1 = this.fanhui(0);
									JOptionPane.showMessageDialog(null, "此书畅销度为：火爆！\n建议继续采购", "系统提示",JOptionPane.WARNING_MESSAGE);
									bj[4] = "此书畅销度为：火爆！建议继续采购";
								}
								
							}else {
								n_1 = this.fanhui(0);
							}
							
							
							if(n_1==1) {
								try {
									
									int i = (int)(Math.random()*100000);
									DecimalFormat df_1=new DecimalFormat("000000"); // 字符串长度<=6时带前导零，>6时照常显示
									String s000 = df_1.format(i);
									bj[0] = s000;
									bj[1] = s_1;
									bj[2] = s_3;
									bj[3] = "销售";
									SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
									bj[5] = df.format(new Date());
															
									if(m == 0) {
										bj[6] = "河南分区";
									}else if(m == 1) {
										bj[6] = "北京分区";
									}else if(m == 2) {
										bj[6] = "上海分区";
									}else if(m == 3) {
										bj[6] = "西南分区";
									}
									state.execute("INSERT INTO baojing"+"(id,bookid,bookname,type_0,type_1,time,fenqu)"+"VALUES("+"'"+bj[0]+"'"+","+"'"+bj[1]+"'"+","+"'"+bj[2]+"'"+","+"'"+bj[3]+"'"+","+"'"+bj[4]+"'"+","+"'"+bj[5]+"'"+","+"'"+bj[6]+"'"+")");
									
									state.close();
									con.close();
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							}
							
							
							
						} catch (SQLException e) {
							e.printStackTrace();
						}
						
							
					
				}
		return n_1;
	}
	
	public int fanhui(int n) {
		return n;
	}
	
	
}
