package zhujiemian;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

public class jinxiaoku {
	public jinxiaoku(int m,int n,String s_1) {
		ku k = new ku();
		Connection con = k.SQLku();
		Statement state = null;
		
		
		//采购
		if(n==0) {
				String[] s = new String[9];
				String[] s1 = new String[8];
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
					}
					rs.close();
					
					//读取kucun
					ResultSet rs_1 = null;
					if(m==0) {
						rs_1 = state.executeQuery("select * from kucun_hn where bookid = '"+s_1+"'");
					}else if(m==1) {
						rs_1 = state.executeQuery("select * from kucun_bj where bookid = '"+s_1+"'");
					}else if(m==2) {
						rs_1 = state.executeQuery("select * from kucun_sh where bookid = '"+s_1+"'");
					}else if(m==3) {
						rs_1 = state.executeQuery("select * from kucun_xn where bookid = '"+s_1+"'");
					}
					rs_1.last();
					rs_1.beforeFirst();
					if(rs_1.next()) {
						s1[0] = rs_1.getString(1);
						s1[1] = rs_1.getString(2);
						s1[2] = rs_1.getString(3);
						s1[3] = rs_1.getString(4);
						s1[4] = rs_1.getString(5);
						s1[5] = rs_1.getString(6);
						s1[6] = rs_1.getString(7);
						s1[7] = rs_1.getString(8);
						
						
						long a = Integer.valueOf(s1[4]);
						long a_1 = Integer.valueOf(s[7]);
						s1[4]=a + a_1+"";
						long b = Integer.valueOf(s1[5]);
						long b_1 = Integer.valueOf(s[8]);
						s1[5]=b + b_1+"";
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						s1[6] = df.format(new Date());
							
						
						try {
							if(m==0) {
								state.executeUpdate("update kucun_hn set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
							}else if(m==1) {
								state.executeUpdate("update kucun_bj set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
							}else if(m==2) {
								state.executeUpdate("update kucun_sh set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
							}else if(m==3) {
								state.executeUpdate("update kucun_xn set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
							}
							state.close();
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}else {
						if(s1[7]==null) {
							s1[7] = "";
							s1[2] = "";
							s1[3] = "";
							s1[4] = "0";
							s1[5] = "0";
						}
						
						s1[0] = s[0];
						s1[1] = s[1];
						long a = Integer.valueOf(s1[4]);
						long a_1 = Integer.valueOf(s[7]);
						s1[4]=a+a_1+"";
						long b = Integer.valueOf(s1[5]);
						long b_1 = Integer.valueOf(s[8]);
						s1[5]=b+b_1+"";
						SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
						s1[6] = df.format(new Date());
							
						
						try {
							if(m==0) {
								state.executeUpdate("insert into kucun_hn "+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu) values ('"+s1[0]+"',"+"'"+s1[1]+"',"+"'"+s1[2]+"',"+"'"+s1[3]+"',"+"'"+s1[4]+"',"+"'"+s1[5]+"',"+"'"+s1[6]+"',"+"'"+s1[7]+"'"+")");
							}else if(m==1) {
								state.executeUpdate("insert into kucun_bj "+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu) values ('"+s1[0]+"',"+"'"+s1[1]+"',"+"'"+s1[2]+"',"+"'"+s1[3]+"',"+"'"+s1[4]+"',"+"'"+s1[5]+"',"+"'"+s1[6]+"',"+"'"+s1[7]+"'"+")");
							}else if(m==2) {
								state.executeUpdate("insert into kucun_sh "+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu) values ('"+s1[0]+"',"+"'"+s1[1]+"',"+"'"+s1[2]+"',"+"'"+s1[3]+"',"+"'"+s1[4]+"',"+"'"+s1[5]+"',"+"'"+s1[6]+"',"+"'"+s1[7]+"'"+")");
							}else if(m==3) {
								state.executeUpdate("insert into kucun_xn "+"(bookid,bookname,xiaoshou_0,xiaoshou_1,kucun_0,kucun_1,caigouriqi,changxiaodu) values ('"+s1[0]+"',"+"'"+s1[1]+"',"+"'"+s1[2]+"',"+"'"+s1[3]+"',"+"'"+s1[4]+"',"+"'"+s1[5]+"',"+"'"+s1[6]+"',"+"'"+s1[7]+"'"+")");
							}
							state.close();
							con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
					
					rs_1.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				
					
			
		}
		
		
		
		
		//销售
				if(n==1) {
					String[] s = new String[9];
					String[] s1 = new String[8];
					try {
						state = con.createStatement();
						ResultSet rs_3 = null;
						if(m==0) {
							rs_3 = state.executeQuery("select price from caigou_hn where bookid='"+s_1+"'");
						}else if(m==1) {
							rs_3 = state.executeQuery("select price from caigou_bj where bookid='"+s_1+"'");
						}else if(m==2) {
							rs_3 = state.executeQuery("select price from caigou_sh where bookid='"+s_1+"'");
						}else if(m==3) {
							rs_3 = state.executeQuery("select price from caigou_xn where bookid='"+s_1+"'");
						}
						
						String[] s00 = new String[1];
						rs_3.last();
						rs_3.beforeFirst();
						while(rs_3.next()) {
							s00[0] = rs_3.getString(1);
						}
						
						rs_3.close();
						
						//读取caigou_hn
						
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
						}
						rs.close();
						
						//读取kucun
						ResultSet rs_1 = null;
						if(m==0) {
							rs_1 = state.executeQuery("select * from kucun_hn where bookid = '"+s_1+"'");
						}else if(m==1) {
							rs_1 = state.executeQuery("select * from kucun_bj where bookid = '"+s_1+"'");
						}else if(m==2) {
							rs_1 = state.executeQuery("select * from kucun_sh where bookid = '"+s_1+"'");
						}else if(m==3) {
							rs_1 = state.executeQuery("select * from kucun_xn where bookid = '"+s_1+"'");
						}
						rs_1.last();
						rs_1.beforeFirst();
						if(rs_1.next()) {
							s1[0] = rs_1.getString(1);
							s1[1] = rs_1.getString(2);
							s1[2] = rs_1.getString(3);
							s1[3] = rs_1.getString(4);
							s1[4] = rs_1.getString(5);
							s1[5] = rs_1.getString(6);
							s1[6] = rs_1.getString(7);
							s1[7] = rs_1.getString(8);
							
							if(s1[1]==null)
								s1[1] = "非本库书籍";
							
							if(s1[2]==null||s1[2].equals("")) {
								s1[2]="0";
								long a = Integer.valueOf(s1[2]);
								long a_1 = Integer.valueOf(s[7]);
								s1[2]=a + a_1+"";
								s1[3]="0";
								long b = Integer.valueOf(s1[3]);
								long b_1 = Integer.valueOf(s[8]);
								s1[3]=b + b_1+"";
							}else {
								long a = Integer.valueOf(s1[2]);
								long a_1 = Integer.valueOf(s[7]);
								s1[2]=a + a_1+"";
								long b = Integer.valueOf(s1[3]);
								long b_1 = Integer.valueOf(s[8]);
								s1[3]=b + b_1+"";
							}
							long a_3 = Integer.valueOf(s1[4]);
							long a_4 = Integer.valueOf(s[7]);
							long a_5 = Integer.valueOf(s00[0]);
							s1[4] = a_3 - a_4+"";
							s1[5] = (a_3 - a_4)*a_5+"";
							
							long a_2 = Integer.valueOf(Integer.valueOf(s1[2]));
							if(a_2<10000) {
								s1[7] = "差";
							}else if(a_2<50000&&a_2>=10000) {
								s1[7] = "一般";
							}else if(a_2<80000&&a_2>=50000) {
								s1[7] = "良好";
							}else if(a_2>=80000) {
								s1[7] = "火爆";
							}
								
							
							try {
								if(m==0) {
									state.executeUpdate("update kucun_hn set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
								}else if(m==1) {
									state.executeUpdate("update kucun_bj set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
								}else if(m==2) {
									state.executeUpdate("update kucun_sh set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
								}else if(m==3) {
									state.executeUpdate("update kucun_xn set bookname = '"+s1[1]+"', xiaoshou_0 = '"+s1[2]+"', xiaoshou_1 = '"+s1[3]+"', kucun_0 = '"+s1[4]+"', kucun_1 = '"+s1[5]+"', caigouriqi = '"+s1[6]+"', changxiaodu =  '"+s1[7]+"' where bookid = '"+s_1+"'");
								}
								state.close();
								con.close();
							} catch (SQLException e) {
								e.printStackTrace();
							}
						}
						
						rs_1.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
						
					
				}
		
		
		
	}
}






























