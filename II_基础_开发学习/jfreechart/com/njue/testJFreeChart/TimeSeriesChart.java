package com.njue.testJFreeChart;

import java.awt.Font;
import java.text.SimpleDateFormat;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.DateAxis;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Month;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;

public class TimeSeriesChart {
	ChartPanel frame1;
	public TimeSeriesChart(){
		XYDataset xydataset = createDataset(3);
		JFreeChart jfreechart = ChartFactory.createTimeSeriesChart("Legal & General��λ���л���۸�", "����", "�۸�",xydataset, true, true, true);
		XYPlot xyplot = (XYPlot) jfreechart.getPlot();
		DateAxis dateaxis = (DateAxis) xyplot.getDomainAxis();
        dateaxis.setDateFormatOverride(new SimpleDateFormat("MMM-yyyy"));
        frame1=new ChartPanel(jfreechart,true);
        dateaxis.setLabelFont(new Font("����",Font.BOLD,14));         //ˮƽ�ײ�����
        dateaxis.setTickLabelFont(new Font("����",Font.BOLD,12));  //��ֱ����
        ValueAxis rangeAxis=xyplot.getRangeAxis();//��ȡ��״
        rangeAxis.setLabelFont(new Font("����",Font.BOLD,15));
        jfreechart.getLegend().setItemFont(new Font("����", Font.BOLD, 15));
        jfreechart.getTitle().setFont(new Font("����",Font.BOLD,20));//���ñ�������

	} 
	 private static XYDataset createDataset(int n) {  //������ݼ��е�࣬�����������
	        TimeSeries timeseries = new TimeSeries("legal & generalŷ��ָ������",
	                org.jfree.data.time.Month.class);
	        timeseries.add(new Month(7, n), 100);
	        timeseries.add(new Month(8, n), 100);
	        timeseries.add(new Month(9, n), 100);
	        TimeSeriesCollection timeseriescollection = new TimeSeriesCollection();
	        timeseriescollection.addSeries(timeseries);
	        return timeseriescollection;
	    }
	  public ChartPanel getChartPanel(){
	    	return frame1;
	    	
	    }
}
