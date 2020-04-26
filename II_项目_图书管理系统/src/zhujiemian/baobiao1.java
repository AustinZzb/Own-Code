package zhujiemian;

import java.awt.Font;
import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.labels.StandardPieSectionLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class baobiao1 {

	long s_1 = 0;
	long s_2 = 0;
	long s_3 = 0;
	long s_4 = 0;
	long s_11 = 0;
	long s_12 = 0;
	long s_13 = 0;
	long s_14 = 0;
	int n = 0;
	private JFrame frame;
	ChartPanel frame1;
	ChartPanel frame2;
	ChartPanel frame3;
	ChartPanel frame4;
	public baobiao1(int m,String s,String s1,String s2) {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 903, 712);
		frame.setLocationRelativeTo(null);
		int n = Integer.valueOf(s);
		String s_00 = s+"-"+(n+1)+"年度";
		boolean b = false;
		int n_1 = Integer.valueOf(s);
		
		String[] t = new String[3];
		int[] t_1 = new int[3];
		if(s1.equals("第一季度")) {
			t[0] = "一月";
			t[1] = "二月";
			t[2] = "三月";
			t_1[0] = 1;
			t_1[1] = 2;
			t_1[2] = 3;
		}else if(s1.equals("第二季度")) {
			t[0] = "五月";
			t[1] = "六月";
			t[2] = "七月";
			t_1[0] = 4;
			t_1[1] = 5;
			t_1[2] = 6;
		}else if(s1.equals("第三季度")) {
			t[0] = "七月";
			t[1] = "八月";
			t[2] = "九月";
			t_1[0] = 7;
			t_1[1] = 8;
			t_1[2] = 9;
		}else if(s1.equals("第四季度")) {
			t[0] = "十月";
			t[1] = "十一月";
			t[2] = "十二月";
			t_1[0] = 10;
			t_1[1] = 11;
			t_1[2] = 12;
		}
		
		long[] m_1 = new long[12];
		long[] m_2 = new long[12];
		long[] m_3 = new long[12];
		long[] m_4 = new long[12];
		
		//年度报表
		if(m==0) {
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				String[] s_0 = new String[5];
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from zhangkuan");
				rs.last();
				rs.beforeFirst();
				while(rs.next()) {
					s_0[0] = rs.getString("type");
					s_0[1] = rs.getString("sum_0");
					s_0[2] = rs.getString("fenqu");
					s_0[3] = rs.getString("year");
					s_0[4] = rs.getString("month");
					
					if(s_0[0]==null||s_0[1]==null||s_0[2]==null||s_0[3]==null||s_0[4]==null)
						continue;
					
					if(s_0[3].equals(s)) {
						b = true;
						if(s_0[0].equals("收入")) {
							if(s_0[2].equals("河南分区")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_1+=a_0;
								if(s_0[4].equals("一月")) {
									m_1[0] += a_0;
								}else if(s_0[4].equals("二月")) {
									m_1[1] += a_0;
								}else if(s_0[4].equals("三月")) {
									m_1[2] += a_0;
								}else if(s_0[4].equals("四月")) {
									m_1[3] += a_0;
								}else if(s_0[4].equals("五月")) {
									m_1[4] += a_0;
								}else if(s_0[4].equals("六月")) {
									m_1[5] += a_0;
								}else if(s_0[4].equals("七月")) {
									m_1[6] += a_0;
								}else if(s_0[4].equals("八月")) {
									m_1[7] += a_0;
								}else if(s_0[4].equals("九月")) {
									m_1[8] += a_0;
								}else if(s_0[4].equals("十月")) {
									m_1[9] += a_0;
								}else if(s_0[4].equals("十一月")) {
									m_1[10] += a_0;
								}else if(s_0[4].equals("十二月")) {
									m_1[11] += a_0;
								}
								
								
							}else if(s_0[2].equals("北京分区")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_2+=a_1;
								
								if(s_0[4].equals("一月")) {
									m_2[0] += a_1;
								}else if(s_0[4].equals("二月")) {
									m_2[1] += a_1;
								}else if(s_0[4].equals("三月")) {
									m_2[2] += a_1;
								}else if(s_0[4].equals("四月")) {
									m_2[3] += a_1;
								}else if(s_0[4].equals("五月")) {
									m_2[4] += a_1;
								}else if(s_0[4].equals("六月")) {
									m_2[5] += a_1;
								}else if(s_0[4].equals("七月")) {
									m_2[6] += a_1;
								}else if(s_0[4].equals("八月")) {
									m_2[7] += a_1;
								}else if(s_0[4].equals("九月")) {
									m_2[8] += a_1;
								}else if(s_0[4].equals("十月")) {
									m_2[9] += a_1;
								}else if(s_0[4].equals("十一月")) {
									m_2[10] += a_1;
								}else if(s_0[4].equals("十二月")) {
									m_2[11] += a_1;
								}
								
							}else if(s_0[2].equals("上海分区")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_3+=a_2;
								
								if(s_0[4].equals("一月")) {
									m_3[0] += a_2;
								}else if(s_0[4].equals("二月")) {
									m_3[1] += a_2;
								}else if(s_0[4].equals("三月")) {
									m_3[2] += a_2;
								}else if(s_0[4].equals("四月")) {
									m_3[3] += a_2;
								}else if(s_0[4].equals("五月")) {
									m_3[4] += a_2;
								}else if(s_0[4].equals("六月")) {
									m_3[5] += a_2;
								}else if(s_0[4].equals("七月")) {
									m_3[6] += a_2;
								}else if(s_0[4].equals("八月")) {
									m_3[7] += a_2;
								}else if(s_0[4].equals("九月")) {
									m_3[8] += a_2;
								}else if(s_0[4].equals("十月")) {
									m_3[9] += a_2;
								}else if(s_0[4].equals("十一月")) {
									m_3[10] += a_2;
								}else if(s_0[4].equals("十二月")) {
									m_3[11] += a_2;
								}
							}else if(s_0[2].equals("西南分区")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_4+=a_3;
								
								if(s_0[4].equals("一月")) {
									m_4[0] += a_3;
								}else if(s_0[4].equals("二月")) {
									m_4[1] += a_3;
								}else if(s_0[4].equals("三月")) {
									m_4[2] += a_3;
								}else if(s_0[4].equals("四月")) {
									m_4[3] += a_3;
								}else if(s_0[4].equals("五月")) {
									m_4[4] += a_3;
								}else if(s_0[4].equals("六月")) {
									m_4[5] += a_3;
								}else if(s_0[4].equals("七月")) {
									m_4[6] += a_3;
								}else if(s_0[4].equals("八月")) {
									m_4[7] += a_3;
								}else if(s_0[4].equals("九月")) {
									m_4[8] += a_3;
								}else if(s_0[4].equals("十月")) {
									m_4[9] += a_3;
								}else if(s_0[4].equals("十一月")) {
									m_4[10] += a_3;
								}else if(s_0[4].equals("十二月")) {
									m_4[11] += a_3;
								}
							}
							
						}else if(s_0[0].equals("支出")) {
							if(s_0[2].equals("河南分区")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_11+=a_0;
							}else if(s_0[2].equals("北京分区")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_12+=a_1;
							}else if(s_0[2].equals("上海分区")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_13+=a_2;
							}else if(s_0[2].equals("西南分区")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_14+=a_3;
							}
						}
					}
					
					
					
				}
				
				rs.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			if(b) {
				frame.setVisible(true);
				
				DefaultPieDataset data = getDataSet();
			      JFreeChart chart = ChartFactory.createPieChart3D(s_00+"收入",data,true,false,false);
			    //设置百分比
			      PiePlot pieplot = (PiePlot) chart.getPlot();
			      DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题
			      NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象
			      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//获得StandardPieSectionLabelGenerator对象
			      pieplot.setLabelGenerator(sp1);//设置饼图显示百分比
			  
			  //没有数据的时候显示的内容
			      pieplot.setNoDataMessage("无数据显示");
			      pieplot.setCircular(false);
			      pieplot.setLabelGap(0.02D);
			  
			      pieplot.setIgnoreNullValues(true);//设置不显示空值
			      pieplot.setIgnoreZeroValues(true);//设置不显示负值
			      frame1=new ChartPanel (chart,true);
			      chart.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
			      PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
			      piePlot.setLabelFont(new Font("楷体",Font.BOLD,15));//解决乱码
			      chart.getLegend().setItemFont(new Font("楷体",Font.BOLD,15));
			      frame.getContentPane().add(frame1);
			      
			      
			      
			      
			      CategoryDataset dataset = getDataSet_1();
			        JFreeChart chart_1 = ChartFactory.createBarChart3D(
			       		                 s_00+"利润", // 图表标题
			                            "各地分区", // 目录轴的显示标签
			                            "年度总收入（元）", // 数值轴的显示标签
			                            dataset, // 数据集
			                            PlotOrientation.VERTICAL, // 图表方向：水平、垂直
			                            true,           // 是否显示图例(对于简单的柱状图必须是false)
			                            false,          // 是否生成工具
			                            false           // 是否生成URL链接
			                            );
			        
			        //从这里开始
			        CategoryPlot plot=chart_1.getCategoryPlot();//获取图表区域对象
			        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
			         domainAxis.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
			         domainAxis.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
			         ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
			         rangeAxis.setLabelFont(new Font("楷体",Font.BOLD,15));
			          chart_1.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
			          chart_1.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
			          
			          //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
			          
			         frame2=new ChartPanel(chart_1,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
			         frame.getContentPane().add(frame2);
			         frame.getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
			         
			        
			         
			         CategoryDataset dataset_1 = getDataSet_2();
			         JFreeChart chart_2 = ChartFactory.createBarChart3D(
			        		                 "易书"+s_00+"账款", // 图表标题
			                             "各地分区", // 目录轴的显示标签
			                             "额度（元）", // 数值轴的显示标签
			                             dataset_1, // 数据集
			                             PlotOrientation.VERTICAL, // 图表方向：水平、垂直
			                             true,           // 是否显示图例(对于简单的柱状图必须是false)
			                             false,          // 是否生成工具
			                             false           // 是否生成URL链接
			                             );
			         
			         //从这里开始
			         CategoryPlot plot_1=chart_2.getCategoryPlot();//获取图表区域对象
			         CategoryAxis domainAxis_1=plot_1.getDomainAxis();         //水平底部列表
			          domainAxis_1.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
			          domainAxis_1.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
			          ValueAxis rangeAxis_1=plot_1.getRangeAxis();//获取柱状
			          rangeAxis_1.setLabelFont(new Font("楷体",Font.BOLD,15));
			           chart_2.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
			           chart_2.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
			           
			           //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
			           
			          frame3=new ChartPanel(chart_2,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
			          frame.getContentPane().add(frame3);
			          
			          
			          
			          XYDataset xydataset = createDataset(n_1,m_1,m_2,m_3,m_4);
				  		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(s_00+"支出", "季度", "额度（元）",xydataset, true, true, false);
				  		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
				  		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
				          frame4=new ChartPanel(jfreechart,true);
				          dateaxis.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
				          dateaxis.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
				          ValueAxis rangeAxis_2=xyplot.getRangeAxis();//获取柱状
				          rangeAxis_2.setLabelFont(new Font("楷体",Font.BOLD,15));
				          jfreechart.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
				          jfreechart.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
				          
				          frame.add(frame4);
			}else {
				frame.setVisible(false);
				JOptionPane.showMessageDialog(null, "此年度暂无报表！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
		}else if(m==1) {  // 季度报表
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				String[] s_0 = new String[5];
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from zhangkuan");
				rs.last();
				rs.beforeFirst();
				while(rs.next()) {
					s_0[0] = rs.getString("type");
					s_0[1] = rs.getString("sum_0");
					s_0[2] = rs.getString("fenqu");
					s_0[3] = rs.getString("year");
					s_0[4] = rs.getString("month");
					
					if(s_0[0]==null||s_0[1]==null||s_0[2]==null||s_0[3]==null||s_0[4]==null)
						continue;
					
					if(s_0[3].equals(s)&&(s_0[4].equals(t[0])||s_0[4].equals(t[1])||s_0[4].equals(t[2]))) {
						
						b = true;
						
						if(s_0[0].equals("收入")) {
							if(s_0[2].equals("河南分区")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_1+=a_0;
							}else if(s_0[2].equals("北京分区")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_2+=a_1;
							}else if(s_0[2].equals("上海分区")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_3+=a_2;
							}else if(s_0[2].equals("西南分区")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_4+=a_3;
							}
							
						}else if(s_0[0].equals("支出")) {
							if(s_0[2].equals("河南分区")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_11+=a_0;
								
								if(s_0[4].equals(t[0])) {
									m_1[0] += a_0;
								}else if(s_0[4].equals(t[1])) {
									m_1[1] += a_0;
								}else if(s_0[4].equals(t[2])) {
									m_1[2] += a_0;
								}
								
							}else if(s_0[2].equals("北京分区")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_12+=a_1;
								
								if(s_0[4].equals(t[0])) {
									m_2[0] += a_1;
								}else if(s_0[4].equals(t[1])) {
									m_2[1] += a_1;
								}else if(s_0[4].equals(t[2])) {
									m_2[2] += a_1;
								}
								
								
							}else if(s_0[2].equals("上海分区")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_13+=a_2;
								
								if(s_0[4].equals(t[0])) {
									m_3[0] += a_2;
								}else if(s_0[4].equals(t[1])) {
									m_3[1] += a_2;
								}else if(s_0[4].equals(t[2])) {
									m_3[2] += a_2;
								}
								
								
							}else if(s_0[2].equals("西南分区")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_14+=a_3;
								
								if(s_0[4].equals(t[0])) {
									m_4[0] += a_3;
								}else if(s_0[4].equals(t[1])) {
									m_4[1] += a_3;
								}else if(s_0[4].equals(t[2])) {
									m_4[2] += a_3;
								}
								
							}
						}
					}
					
									
				}
				
				if(b) {
					frame.setVisible(true);
					
					DefaultPieDataset data = getDataSet();
				      JFreeChart chart = ChartFactory.createPieChart3D(s_00+s1+"收入",data,true,false,false);
				    //设置百分比
				      PiePlot pieplot = (PiePlot) chart.getPlot();
				      DecimalFormat df = new DecimalFormat("0.00%");//获得一个DecimalFormat对象，主要是设置小数问题
				      NumberFormat nf = NumberFormat.getNumberInstance();//获得一个NumberFormat对象
				      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//获得StandardPieSectionLabelGenerator对象
				      pieplot.setLabelGenerator(sp1);//设置饼图显示百分比
				  
				  //没有数据的时候显示的内容
				      pieplot.setNoDataMessage("无数据显示");
				      pieplot.setCircular(false);
				      pieplot.setLabelGap(0.02D);
				  
				      pieplot.setIgnoreNullValues(true);//设置不显示空值
				      pieplot.setIgnoreZeroValues(true);//设置不显示负值
				      frame1=new ChartPanel (chart,true);
				      chart.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
				      PiePlot piePlot= (PiePlot) chart.getPlot();//获取图表区域对象
				      piePlot.setLabelFont(new Font("楷体",Font.BOLD,15));//解决乱码
				      chart.getLegend().setItemFont(new Font("楷体",Font.BOLD,15));
				      frame.getContentPane().add(frame1);
				      
				      
				      
				      
				      CategoryDataset dataset = getDataSet_1();
				        JFreeChart chart_1 = ChartFactory.createBarChart3D(
				       		                 s_00+s1+"利润", // 图表标题
				                            "各地分区", // 目录轴的显示标签
				                            "年度总收入（元）", // 数值轴的显示标签
				                            dataset, // 数据集
				                            PlotOrientation.VERTICAL, // 图表方向：水平、垂直
				                            true,           // 是否显示图例(对于简单的柱状图必须是false)
				                            false,          // 是否生成工具
				                            false           // 是否生成URL链接
				                            );
				        
				        //从这里开始
				        CategoryPlot plot=chart_1.getCategoryPlot();//获取图表区域对象
				        CategoryAxis domainAxis=plot.getDomainAxis();         //水平底部列表
				         domainAxis.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
				         domainAxis.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
				         ValueAxis rangeAxis=plot.getRangeAxis();//获取柱状
				         rangeAxis.setLabelFont(new Font("楷体",Font.BOLD,15));
				          chart_1.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
				          chart_1.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
				          
				          //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
				          
				         frame2=new ChartPanel(chart_1,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
				         frame.getContentPane().add(frame2);
				         frame.getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
				         
				        
				         
				         CategoryDataset dataset_1 = getDataSet_2();
				         JFreeChart chart_2 = ChartFactory.createBarChart3D(
				        		                 "易书"+s_00+s1+"账款", // 图表标题
				                             "各地分区", // 目录轴的显示标签
				                             "额度（元）", // 数值轴的显示标签
				                             dataset_1, // 数据集
				                             PlotOrientation.VERTICAL, // 图表方向：水平、垂直
				                             true,           // 是否显示图例(对于简单的柱状图必须是false)
				                             false,          // 是否生成工具
				                             false           // 是否生成URL链接
				                             );
				         
				         //从这里开始
				         CategoryPlot plot_1=chart_2.getCategoryPlot();//获取图表区域对象
				         CategoryAxis domainAxis_1=plot_1.getDomainAxis();         //水平底部列表
				          domainAxis_1.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
				          domainAxis_1.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
				          ValueAxis rangeAxis_1=plot_1.getRangeAxis();//获取柱状
				          rangeAxis_1.setLabelFont(new Font("楷体",Font.BOLD,15));
				           chart_2.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
				           chart_2.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
				           
				           //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
				           
				          frame3=new ChartPanel(chart_2,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
				          frame.getContentPane().add(frame3);
				          
				          XYDataset xydataset = createDataset_1(n_1,m_1,m_2,m_3,m_4,t_1);
					  		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(s_00+s1+"支出", "季度", "额度（元）",xydataset, true, true, true);
					  		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
					  		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
					          dateaxis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));
					          frame4=new ChartPanel(jfreechart,true);
					          dateaxis.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
					          dateaxis.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
					          ValueAxis rangeAxis_2=xyplot.getRangeAxis();//获取柱状
					          rangeAxis_2.setLabelFont(new Font("楷体",Font.BOLD,15));
					          jfreechart.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
					          jfreechart.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
					          
					          frame.add(frame4);
				          
				          
				}else {
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "此季度暂无报表！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
				rs.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
		}else if(m==2) {  // 月份报表
			ku k = new ku();
			Connection con = k.SQLku();
			try {
				String[] s_0 = new String[5];
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("select * from zhangkuan");
				rs.last();
				rs.beforeFirst();
				while(rs.next()) {
					s_0[0] = rs.getString("type");
					s_0[1] = rs.getString("sum_0");
					s_0[2] = rs.getString("fenqu");
					s_0[3] = rs.getString("year");
					s_0[4] = rs.getString("month");
					
					if(s_0[0]==null||s_0[1]==null||s_0[2]==null||s_0[3]==null||s_0[4]==null)
						continue;
					
					if(s_0[3].equals(s)&&s_0[4].equals(s2)) {
						
						b = true;
						
						if(s_0[0].equals("收入")) {
							if(s_0[2].equals("河南分区")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_1+=a_0;
							}else if(s_0[2].equals("北京分区")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_2+=a_1;
							}else if(s_0[2].equals("上海分区")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_3+=a_2;
							}else if(s_0[2].equals("西南分区")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_4+=a_3;
							}
							
						}else if(s_0[0].equals("支出")) {
							if(s_0[2].equals("河南分区")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_11+=a_0;
							}else if(s_0[2].equals("北京分区")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_12+=a_1;
							}else if(s_0[2].equals("上海分区")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_13+=a_2;
							}else if(s_0[2].equals("西南分区")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_14+=a_3;
							}
						}
					}
					
									
				}
				
				if(b) {
					frame.setVisible(true);
					    
				         CategoryDataset dataset_1 = getDataSet_2();
				         JFreeChart chart_2 = ChartFactory.createBarChart3D(
				        		                 "易书"+s_00+s2+"账款", // 图表标题
				                             "各地分区", // 目录轴的显示标签
				                             "额度（元）", // 数值轴的显示标签
				                             dataset_1, // 数据集
				                             PlotOrientation.VERTICAL, // 图表方向：水平、垂直
				                             true,           // 是否显示图例(对于简单的柱状图必须是false)
				                             false,          // 是否生成工具
				                             false           // 是否生成URL链接
				                             );
				         
				         //从这里开始
				         CategoryPlot plot_1=chart_2.getCategoryPlot();//获取图表区域对象
				         CategoryAxis domainAxis_1=plot_1.getDomainAxis();         //水平底部列表
				          domainAxis_1.setLabelFont(new Font("楷体",Font.BOLD,14));         //水平底部标题
				          domainAxis_1.setTickLabelFont(new Font("楷体",Font.BOLD,12));  //垂直标题
				          ValueAxis rangeAxis_1=plot_1.getRangeAxis();//获取柱状
				          rangeAxis_1.setLabelFont(new Font("楷体",Font.BOLD,15));
				           chart_2.getLegend().setItemFont(new Font("楷体", Font.BOLD, 15));
				           chart_2.getTitle().setFont(new Font("楷体",Font.BOLD,20));//设置标题字体
				           
				           //到这里结束，虽然代码有点多，但只为一个目的，解决汉字乱码问题
				           
				          frame3=new ChartPanel(chart_2,true);        //这里也可以用chartFrame,可以直接生成一个独立的Frame
				          frame.getContentPane().add(frame3);
				}else {
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "此月度暂无报表！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
				rs.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
	         
	}
	
	private DefaultPieDataset getDataSet() {
		DefaultPieDataset dataset = new DefaultPieDataset();
		dataset.setValue("河南分区",s_1);
		dataset.setValue("北京分区",s_2);
		dataset.setValue("上海分区",s_3);
		dataset.setValue("西南分区",s_4);
		return dataset;
	}
	
	private CategoryDataset getDataSet_1() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(s_1-s_12, "河南分区", "河南分区");
        dataset.addValue(s_2-s_12, "北京分区", "北京分区");
        dataset.addValue(s_3-s_13, "上海分区", "上海分区");
        dataset.addValue(s_4-s_14, "西南分区", "西南分区");;
        return dataset;
}
	
	 private CategoryDataset getDataSet_2() {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.addValue(s_1, "收入", "河南分区");
         dataset.addValue(s_11, "支出", "河南分区");
         dataset.addValue(s_1-s_11, "利润", "河南分区");
         dataset.addValue(s_2, "收入", "北京分区");
         dataset.addValue(s_12, "支出", "北京分区");
         dataset.addValue(s_2-s_12, "利润", "北京分区");
         dataset.addValue(s_3, "收入", "上海分区");
         dataset.addValue(s_13, "支出", "上海分区");
         dataset.addValue(s_3-s_13, "利润", "上海分区");
         dataset.addValue(s_4, "收入", "西南分区");
         dataset.addValue(s_14, "支出", "西南分区");
         dataset.addValue(s_4-s_14, "利润", "西南分区");
         return dataset;
}
	 
	 
	 
	 private XYDataset createDataset(int n,long[] s,long[] s1,long[] s2,long[] s3) {  //这个数据集有点多，但都不难理解
	        TimeSeries timeseries = new TimeSeries("河南分区",
	                org.jfree.data.time.Month.class);
	        timeseries.add(new Month(1,n), s[0]);
	        timeseries.add(new Month(2, n), s[1]);
	        timeseries.add(new Month(3, n), s[2]);
	        timeseries.add(new Month(4, n), s[3]);
	        timeseries.add(new Month(5, n), s[4]);
	        timeseries.add(new Month(6, n), s[5]);
	        timeseries.add(new Month(7, n), s[6]);
	        timeseries.add(new Month(8, n), s[7]);
	        timeseries.add(new Month(9, n), s[8]);
	        timeseries.add(new Month(10, n), s[9]);
	        timeseries.add(new Month(11, n), s[10]);
	        timeseries.add(new Month(12, n), s[11]);
	        
	        TimeSeries timeseries1 = new TimeSeries("北京分区",
	                org.jfree.data.time.Month.class);
	        timeseries1.add(new Month(1, n), s1[0]);
	        timeseries1.add(new Month(2, n), s1[1]);
	        timeseries1.add(new Month(3, n), s1[2]);
	        timeseries1.add(new Month(4, n), s1[3]);
	        timeseries1.add(new Month(5, n), s1[4]);
	        timeseries1.add(new Month(6, n), s1[5]);
	        timeseries1.add(new Month(7, n), s1[6]);
	        timeseries1.add(new Month(8, n), s1[7]);
	        timeseries1.add(new Month(9, n), s1[8]);
	        timeseries1.add(new Month(10, n), s1[9]);
	        timeseries1.add(new Month(11, n), s1[10]);
	        timeseries1.add(new Month(12, n), s1[11]);
	        
	        TimeSeries timeseries2 = new TimeSeries("上海分区",
	                org.jfree.data.time.Month.class);
	        timeseries2.add(new Month(1, n), s2[0]);
	        timeseries2.add(new Month(2, n), s2[1]);
	        timeseries2.add(new Month(3, n), s2[2]);
	        timeseries2.add(new Month(4, n), s2[3]);
	        timeseries2.add(new Month(5, n), s2[4]);
	        timeseries2.add(new Month(6, n), s2[5]);
	        timeseries2.add(new Month(7, n), s2[6]);
	        timeseries2.add(new Month(8, n), s2[7]);
	        timeseries2.add(new Month(9, n), s2[8]);
	        timeseries2.add(new Month(10, n), s2[9]);
	        timeseries2.add(new Month(11, n), s2[10]);
	        timeseries2.add(new Month(12, n), s2[11]);
	        
	        TimeSeries timeseries3 = new TimeSeries("西南分区",
	                org.jfree.data.time.Month.class);
	        timeseries3.add(new Month(1, n), s3[0]);
	        timeseries3.add(new Month(2, n), s3[1]);
	        timeseries3.add(new Month(3, n), s3[2]);
	        timeseries3.add(new Month(4, n), s3[3]);
	        timeseries3.add(new Month(5, n), s3[4]);
	        timeseries3.add(new Month(6, n), s3[5]);
	        timeseries3.add(new Month(7, n), s3[6]);
	        timeseries3.add(new Month(8, n), s3[7]);
	        timeseries3.add(new Month(9, n), s3[8]);
	        timeseries3.add(new Month(10, n), s3[9]);
	        timeseries3.add(new Month(11, n), s3[10]);
	        timeseries3.add(new Month(12, n), s3[11]);
	        
	        TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
	        timeseriescollection.addSeries(timeseries);
	        timeseriescollection.addSeries(timeseries1);
	        timeseriescollection.addSeries(timeseries2);
	        timeseriescollection.addSeries(timeseries3);
	        return timeseriescollection;
	    }
		
	 
	 private XYDataset createDataset_1(int n,long[] s,long[] s1,long[] s2,long[] s3,int[] t_1) {  //这个数据集有点多，但都不难理解
	        TimeSeries timeseries = new TimeSeries("河南分区",
	                org.jfree.data.time.Month.class);
	        timeseries.add(new Month(t_1[0],n), s[0]);
	        timeseries.add(new Month(t_1[1], n), s[1]);
	        timeseries.add(new Month(t_1[2], n), s[2]);
	        
	        TimeSeries timeseries1 = new TimeSeries("北京分区",
	                org.jfree.data.time.Month.class);
	        timeseries1.add(new Month(t_1[0], n), s1[0]);
	        timeseries1.add(new Month(t_1[1], n), s1[1]);
	        timeseries1.add(new Month(t_1[2], n), s1[2]);
	        
	        TimeSeries timeseries2 = new TimeSeries("上海分区",
	                org.jfree.data.time.Month.class);
	        timeseries2.add(new Month(t_1[0], n), s2[0]);
	        timeseries2.add(new Month(t_1[1], n), s2[1]);
	        timeseries2.add(new Month(t_1[2], n), s2[2]);
	        
	        TimeSeries timeseries3 = new TimeSeries("西南分区",
	                org.jfree.data.time.Month.class);
	        timeseries3.add(new Month(t_1[0], n), s3[0]);
	        timeseries3.add(new Month(t_1[1], n), s3[1]);
	        timeseries3.add(new Month(t_1[2], n), s3[2]);
	        
	        TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
	        timeseriescollection.addSeries(timeseries);
	        timeseriescollection.addSeries(timeseries1);
	        timeseriescollection.addSeries(timeseries2);
	        timeseriescollection.addSeries(timeseries3);
	        return timeseriescollection;
	    }
	

}
