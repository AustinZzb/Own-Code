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
		String s_00 = s+"-"+(n+1)+"���";
		boolean b = false;
		int n_1 = Integer.valueOf(s);
		
		String[] t = new String[3];
		int[] t_1 = new int[3];
		if(s1.equals("��һ����")) {
			t[0] = "һ��";
			t[1] = "����";
			t[2] = "����";
			t_1[0] = 1;
			t_1[1] = 2;
			t_1[2] = 3;
		}else if(s1.equals("�ڶ�����")) {
			t[0] = "����";
			t[1] = "����";
			t[2] = "����";
			t_1[0] = 4;
			t_1[1] = 5;
			t_1[2] = 6;
		}else if(s1.equals("��������")) {
			t[0] = "����";
			t[1] = "����";
			t[2] = "����";
			t_1[0] = 7;
			t_1[1] = 8;
			t_1[2] = 9;
		}else if(s1.equals("���ļ���")) {
			t[0] = "ʮ��";
			t[1] = "ʮһ��";
			t[2] = "ʮ����";
			t_1[0] = 10;
			t_1[1] = 11;
			t_1[2] = 12;
		}
		
		long[] m_1 = new long[12];
		long[] m_2 = new long[12];
		long[] m_3 = new long[12];
		long[] m_4 = new long[12];
		
		//��ȱ���
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
						if(s_0[0].equals("����")) {
							if(s_0[2].equals("���Ϸ���")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_1+=a_0;
								if(s_0[4].equals("һ��")) {
									m_1[0] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[1] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[2] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[3] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[4] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[5] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[6] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[7] += a_0;
								}else if(s_0[4].equals("����")) {
									m_1[8] += a_0;
								}else if(s_0[4].equals("ʮ��")) {
									m_1[9] += a_0;
								}else if(s_0[4].equals("ʮһ��")) {
									m_1[10] += a_0;
								}else if(s_0[4].equals("ʮ����")) {
									m_1[11] += a_0;
								}
								
								
							}else if(s_0[2].equals("��������")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_2+=a_1;
								
								if(s_0[4].equals("һ��")) {
									m_2[0] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[1] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[2] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[3] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[4] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[5] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[6] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[7] += a_1;
								}else if(s_0[4].equals("����")) {
									m_2[8] += a_1;
								}else if(s_0[4].equals("ʮ��")) {
									m_2[9] += a_1;
								}else if(s_0[4].equals("ʮһ��")) {
									m_2[10] += a_1;
								}else if(s_0[4].equals("ʮ����")) {
									m_2[11] += a_1;
								}
								
							}else if(s_0[2].equals("�Ϻ�����")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_3+=a_2;
								
								if(s_0[4].equals("һ��")) {
									m_3[0] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[1] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[2] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[3] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[4] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[5] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[6] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[7] += a_2;
								}else if(s_0[4].equals("����")) {
									m_3[8] += a_2;
								}else if(s_0[4].equals("ʮ��")) {
									m_3[9] += a_2;
								}else if(s_0[4].equals("ʮһ��")) {
									m_3[10] += a_2;
								}else if(s_0[4].equals("ʮ����")) {
									m_3[11] += a_2;
								}
							}else if(s_0[2].equals("���Ϸ���")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_4+=a_3;
								
								if(s_0[4].equals("һ��")) {
									m_4[0] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[1] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[2] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[3] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[4] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[5] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[6] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[7] += a_3;
								}else if(s_0[4].equals("����")) {
									m_4[8] += a_3;
								}else if(s_0[4].equals("ʮ��")) {
									m_4[9] += a_3;
								}else if(s_0[4].equals("ʮһ��")) {
									m_4[10] += a_3;
								}else if(s_0[4].equals("ʮ����")) {
									m_4[11] += a_3;
								}
							}
							
						}else if(s_0[0].equals("֧��")) {
							if(s_0[2].equals("���Ϸ���")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_11+=a_0;
							}else if(s_0[2].equals("��������")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_12+=a_1;
							}else if(s_0[2].equals("�Ϻ�����")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_13+=a_2;
							}else if(s_0[2].equals("���Ϸ���")){
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
			      JFreeChart chart = ChartFactory.createPieChart3D(s_00+"����",data,true,false,false);
			    //���ðٷֱ�
			      PiePlot pieplot = (PiePlot) chart.getPlot();
			      DecimalFormat df = new DecimalFormat("0.00%");//���һ��DecimalFormat������Ҫ������С������
			      NumberFormat nf = NumberFormat.getNumberInstance();//���һ��NumberFormat����
			      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//���StandardPieSectionLabelGenerator����
			      pieplot.setLabelGenerator(sp1);//���ñ�ͼ��ʾ�ٷֱ�
			  
			  //û�����ݵ�ʱ����ʾ������
			      pieplot.setNoDataMessage("��������ʾ");
			      pieplot.setCircular(false);
			      pieplot.setLabelGap(0.02D);
			  
			      pieplot.setIgnoreNullValues(true);//���ò���ʾ��ֵ
			      pieplot.setIgnoreZeroValues(true);//���ò���ʾ��ֵ
			      frame1=new ChartPanel (chart,true);
			      chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
			      PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������
			      piePlot.setLabelFont(new Font("����",Font.BOLD,15));//�������
			      chart.getLegend().setItemFont(new Font("����",Font.BOLD,15));
			      frame.getContentPane().add(frame1);
			      
			      
			      
			      
			      CategoryDataset dataset = getDataSet_1();
			        JFreeChart chart_1 = ChartFactory.createBarChart3D(
			       		                 s_00+"����", // ͼ�����
			                            "���ط���", // Ŀ¼�����ʾ��ǩ
			                            "��������루Ԫ��", // ��ֵ�����ʾ��ǩ
			                            dataset, // ���ݼ�
			                            PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
			                            true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
			                            false,          // �Ƿ����ɹ���
			                            false           // �Ƿ�����URL����
			                            );
			        
			        //�����￪ʼ
			        CategoryPlot plot=chart_1.getCategoryPlot();//��ȡͼ���������
			        CategoryAxis domainAxis=plot.getDomainAxis();         //ˮƽ�ײ��б�
			         domainAxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
			         domainAxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
			         ValueAxis rangeAxis=plot.getRangeAxis();//��ȡ��״
			         rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));
			          chart_1.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
			          chart_1.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
			          
			          //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
			          
			         frame2=new ChartPanel(chart_1,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
			         frame.getContentPane().add(frame2);
			         frame.getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
			         
			        
			         
			         CategoryDataset dataset_1 = getDataSet_2();
			         JFreeChart chart_2 = ChartFactory.createBarChart3D(
			        		                 "����"+s_00+"�˿�", // ͼ�����
			                             "���ط���", // Ŀ¼�����ʾ��ǩ
			                             "��ȣ�Ԫ��", // ��ֵ�����ʾ��ǩ
			                             dataset_1, // ���ݼ�
			                             PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
			                             true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
			                             false,          // �Ƿ����ɹ���
			                             false           // �Ƿ�����URL����
			                             );
			         
			         //�����￪ʼ
			         CategoryPlot plot_1=chart_2.getCategoryPlot();//��ȡͼ���������
			         CategoryAxis domainAxis_1=plot_1.getDomainAxis();         //ˮƽ�ײ��б�
			          domainAxis_1.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
			          domainAxis_1.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
			          ValueAxis rangeAxis_1=plot_1.getRangeAxis();//��ȡ��״
			          rangeAxis_1.setLabelFont(new Font("����",Font.BOLD,15));
			           chart_2.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
			           chart_2.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
			           
			           //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
			           
			          frame3=new ChartPanel(chart_2,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
			          frame.getContentPane().add(frame3);
			          
			          
			          
			          XYDataset xydataset = createDataset(n_1,m_1,m_2,m_3,m_4);
				  		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(s_00+"֧��", "����", "��ȣ�Ԫ��",xydataset, true, true, false);
				  		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
				  		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
				          frame4=new ChartPanel(jfreechart,true);
				          dateaxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
				          dateaxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
				          ValueAxis rangeAxis_2=xyplot.getRangeAxis();//��ȡ��״
				          rangeAxis_2.setLabelFont(new Font("����",Font.BOLD,15));
				          jfreechart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
				          jfreechart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
				          
				          frame.add(frame4);
			}else {
				frame.setVisible(false);
				JOptionPane.showMessageDialog(null, "��������ޱ���", "ϵͳ��ʾ",JOptionPane.INFORMATION_MESSAGE);
			}
			
			
			
		}else if(m==1) {  // ���ȱ���
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
						
						if(s_0[0].equals("����")) {
							if(s_0[2].equals("���Ϸ���")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_1+=a_0;
							}else if(s_0[2].equals("��������")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_2+=a_1;
							}else if(s_0[2].equals("�Ϻ�����")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_3+=a_2;
							}else if(s_0[2].equals("���Ϸ���")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_4+=a_3;
							}
							
						}else if(s_0[0].equals("֧��")) {
							if(s_0[2].equals("���Ϸ���")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_11+=a_0;
								
								if(s_0[4].equals(t[0])) {
									m_1[0] += a_0;
								}else if(s_0[4].equals(t[1])) {
									m_1[1] += a_0;
								}else if(s_0[4].equals(t[2])) {
									m_1[2] += a_0;
								}
								
							}else if(s_0[2].equals("��������")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_12+=a_1;
								
								if(s_0[4].equals(t[0])) {
									m_2[0] += a_1;
								}else if(s_0[4].equals(t[1])) {
									m_2[1] += a_1;
								}else if(s_0[4].equals(t[2])) {
									m_2[2] += a_1;
								}
								
								
							}else if(s_0[2].equals("�Ϻ�����")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_13+=a_2;
								
								if(s_0[4].equals(t[0])) {
									m_3[0] += a_2;
								}else if(s_0[4].equals(t[1])) {
									m_3[1] += a_2;
								}else if(s_0[4].equals(t[2])) {
									m_3[2] += a_2;
								}
								
								
							}else if(s_0[2].equals("���Ϸ���")){
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
				      JFreeChart chart = ChartFactory.createPieChart3D(s_00+s1+"����",data,true,false,false);
				    //���ðٷֱ�
				      PiePlot pieplot = (PiePlot) chart.getPlot();
				      DecimalFormat df = new DecimalFormat("0.00%");//���һ��DecimalFormat������Ҫ������С������
				      NumberFormat nf = NumberFormat.getNumberInstance();//���һ��NumberFormat����
				      StandardPieSectionLabelGenerator sp1 = new StandardPieSectionLabelGenerator("{0}  {2}", nf, df);//���StandardPieSectionLabelGenerator����
				      pieplot.setLabelGenerator(sp1);//���ñ�ͼ��ʾ�ٷֱ�
				  
				  //û�����ݵ�ʱ����ʾ������
				      pieplot.setNoDataMessage("��������ʾ");
				      pieplot.setCircular(false);
				      pieplot.setLabelGap(0.02D);
				  
				      pieplot.setIgnoreNullValues(true);//���ò���ʾ��ֵ
				      pieplot.setIgnoreZeroValues(true);//���ò���ʾ��ֵ
				      frame1=new ChartPanel (chart,true);
				      chart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
				      PiePlot piePlot= (PiePlot) chart.getPlot();//��ȡͼ���������
				      piePlot.setLabelFont(new Font("����",Font.BOLD,15));//�������
				      chart.getLegend().setItemFont(new Font("����",Font.BOLD,15));
				      frame.getContentPane().add(frame1);
				      
				      
				      
				      
				      CategoryDataset dataset = getDataSet_1();
				        JFreeChart chart_1 = ChartFactory.createBarChart3D(
				       		                 s_00+s1+"����", // ͼ�����
				                            "���ط���", // Ŀ¼�����ʾ��ǩ
				                            "��������루Ԫ��", // ��ֵ�����ʾ��ǩ
				                            dataset, // ���ݼ�
				                            PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
				                            true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
				                            false,          // �Ƿ����ɹ���
				                            false           // �Ƿ�����URL����
				                            );
				        
				        //�����￪ʼ
				        CategoryPlot plot=chart_1.getCategoryPlot();//��ȡͼ���������
				        CategoryAxis domainAxis=plot.getDomainAxis();         //ˮƽ�ײ��б�
				         domainAxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
				         domainAxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
				         ValueAxis rangeAxis=plot.getRangeAxis();//��ȡ��״
				         rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));
				          chart_1.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
				          chart_1.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
				          
				          //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
				          
				         frame2=new ChartPanel(chart_1,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
				         frame.getContentPane().add(frame2);
				         frame.getContentPane().setLayout(new GridLayout(2, 2, 10, 10));
				         
				        
				         
				         CategoryDataset dataset_1 = getDataSet_2();
				         JFreeChart chart_2 = ChartFactory.createBarChart3D(
				        		                 "����"+s_00+s1+"�˿�", // ͼ�����
				                             "���ط���", // Ŀ¼�����ʾ��ǩ
				                             "��ȣ�Ԫ��", // ��ֵ�����ʾ��ǩ
				                             dataset_1, // ���ݼ�
				                             PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
				                             true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
				                             false,          // �Ƿ����ɹ���
				                             false           // �Ƿ�����URL����
				                             );
				         
				         //�����￪ʼ
				         CategoryPlot plot_1=chart_2.getCategoryPlot();//��ȡͼ���������
				         CategoryAxis domainAxis_1=plot_1.getDomainAxis();         //ˮƽ�ײ��б�
				          domainAxis_1.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
				          domainAxis_1.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
				          ValueAxis rangeAxis_1=plot_1.getRangeAxis();//��ȡ��״
				          rangeAxis_1.setLabelFont(new Font("����",Font.BOLD,15));
				           chart_2.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
				           chart_2.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
				           
				           //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
				           
				          frame3=new ChartPanel(chart_2,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
				          frame.getContentPane().add(frame3);
				          
				          XYDataset xydataset = createDataset_1(n_1,m_1,m_2,m_3,m_4,t_1);
					  		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart(s_00+s1+"֧��", "����", "��ȣ�Ԫ��",xydataset, true, true, true);
					  		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
					  		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
					          dateaxis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));
					          frame4=new ChartPanel(jfreechart,true);
					          dateaxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
					          dateaxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
					          ValueAxis rangeAxis_2=xyplot.getRangeAxis();//��ȡ��״
					          rangeAxis_2.setLabelFont(new Font("����",Font.BOLD,15));
					          jfreechart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
					          jfreechart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
					          
					          frame.add(frame4);
				          
				          
				}else {
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "�˼������ޱ���", "ϵͳ��ʾ",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
				rs.close();
				con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			
			
			
			
			
			
		}else if(m==2) {  // �·ݱ���
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
						
						if(s_0[0].equals("����")) {
							if(s_0[2].equals("���Ϸ���")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_1+=a_0;
							}else if(s_0[2].equals("��������")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_2+=a_1;
							}else if(s_0[2].equals("�Ϻ�����")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_3+=a_2;
							}else if(s_0[2].equals("���Ϸ���")){
								long a_3 = Integer.valueOf(s_0[1]);
								s_4+=a_3;
							}
							
						}else if(s_0[0].equals("֧��")) {
							if(s_0[2].equals("���Ϸ���")) {
								long a_0 = Integer.valueOf(s_0[1]);
								s_11+=a_0;
							}else if(s_0[2].equals("��������")) {
								long a_1 = Integer.valueOf(s_0[1]);
								s_12+=a_1;
							}else if(s_0[2].equals("�Ϻ�����")) {
								long a_2 = Integer.valueOf(s_0[1]);
								s_13+=a_2;
							}else if(s_0[2].equals("���Ϸ���")){
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
				        		                 "����"+s_00+s2+"�˿�", // ͼ�����
				                             "���ط���", // Ŀ¼�����ʾ��ǩ
				                             "��ȣ�Ԫ��", // ��ֵ�����ʾ��ǩ
				                             dataset_1, // ���ݼ�
				                             PlotOrientation.VERTICAL, // ͼ����ˮƽ����ֱ
				                             true,           // �Ƿ���ʾͼ��(���ڼ򵥵���״ͼ������false)
				                             false,          // �Ƿ����ɹ���
				                             false           // �Ƿ�����URL����
				                             );
				         
				         //�����￪ʼ
				         CategoryPlot plot_1=chart_2.getCategoryPlot();//��ȡͼ���������
				         CategoryAxis domainAxis_1=plot_1.getDomainAxis();         //ˮƽ�ײ��б�
				          domainAxis_1.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
				          domainAxis_1.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
				          ValueAxis rangeAxis_1=plot_1.getRangeAxis();//��ȡ��״
				          rangeAxis_1.setLabelFont(new Font("����",Font.BOLD,15));
				           chart_2.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
				           chart_2.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������
				           
				           //�������������Ȼ�����е�࣬��ֻΪһ��Ŀ�ģ����������������
				           
				          frame3=new ChartPanel(chart_2,true);        //����Ҳ������chartFrame,����ֱ������һ��������Frame
				          frame.getContentPane().add(frame3);
				}else {
					frame.setVisible(false);
					JOptionPane.showMessageDialog(null, "���¶����ޱ���", "ϵͳ��ʾ",JOptionPane.INFORMATION_MESSAGE);
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
		dataset.setValue("���Ϸ���",s_1);
		dataset.setValue("��������",s_2);
		dataset.setValue("�Ϻ�����",s_3);
		dataset.setValue("���Ϸ���",s_4);
		return dataset;
	}
	
	private CategoryDataset getDataSet_1() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(s_1-s_12, "���Ϸ���", "���Ϸ���");
        dataset.addValue(s_2-s_12, "��������", "��������");
        dataset.addValue(s_3-s_13, "�Ϻ�����", "�Ϻ�����");
        dataset.addValue(s_4-s_14, "���Ϸ���", "���Ϸ���");;
        return dataset;
}
	
	 private CategoryDataset getDataSet_2() {
         DefaultCategoryDataset dataset = new DefaultCategoryDataset();
         dataset.addValue(s_1, "����", "���Ϸ���");
         dataset.addValue(s_11, "֧��", "���Ϸ���");
         dataset.addValue(s_1-s_11, "����", "���Ϸ���");
         dataset.addValue(s_2, "����", "��������");
         dataset.addValue(s_12, "֧��", "��������");
         dataset.addValue(s_2-s_12, "����", "��������");
         dataset.addValue(s_3, "����", "�Ϻ�����");
         dataset.addValue(s_13, "֧��", "�Ϻ�����");
         dataset.addValue(s_3-s_13, "����", "�Ϻ�����");
         dataset.addValue(s_4, "����", "���Ϸ���");
         dataset.addValue(s_14, "֧��", "���Ϸ���");
         dataset.addValue(s_4-s_14, "����", "���Ϸ���");
         return dataset;
}
	 
	 
	 
	 private XYDataset createDataset(int n,long[] s,long[] s1,long[] s2,long[] s3) {  //������ݼ��е�࣬�����������
	        TimeSeries timeseries = new TimeSeries("���Ϸ���",
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
	        
	        TimeSeries timeseries1 = new TimeSeries("��������",
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
	        
	        TimeSeries timeseries2 = new TimeSeries("�Ϻ�����",
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
	        
	        TimeSeries timeseries3 = new TimeSeries("���Ϸ���",
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
		
	 
	 private XYDataset createDataset_1(int n,long[] s,long[] s1,long[] s2,long[] s3,int[] t_1) {  //������ݼ��е�࣬�����������
	        TimeSeries timeseries = new TimeSeries("���Ϸ���",
	                org.jfree.data.time.Month.class);
	        timeseries.add(new Month(t_1[0],n), s[0]);
	        timeseries.add(new Month(t_1[1], n), s[1]);
	        timeseries.add(new Month(t_1[2], n), s[2]);
	        
	        TimeSeries timeseries1 = new TimeSeries("��������",
	                org.jfree.data.time.Month.class);
	        timeseries1.add(new Month(t_1[0], n), s1[0]);
	        timeseries1.add(new Month(t_1[1], n), s1[1]);
	        timeseries1.add(new Month(t_1[2], n), s1[2]);
	        
	        TimeSeries timeseries2 = new TimeSeries("�Ϻ�����",
	                org.jfree.data.time.Month.class);
	        timeseries2.add(new Month(t_1[0], n), s2[0]);
	        timeseries2.add(new Month(t_1[1], n), s2[1]);
	        timeseries2.add(new Month(t_1[2], n), s2[2]);
	        
	        TimeSeries timeseries3 = new TimeSeries("���Ϸ���",
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
