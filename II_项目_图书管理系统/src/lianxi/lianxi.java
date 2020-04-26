package lianxi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

import zhujiemian.zhujiemian_1;

import javax.swing.ImageIcon;
import java.awt.Color;

public class lianxi {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	
	
	public lianxi() {
		initialize();
	}

	
	
	
	private void initialize() {
		
		JFrame frame;
		JTextField textField;
		JTextField textField_1;
		JTextField textField_2;
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("img/�鼮ͼƬ7.png"));
		label_1.setBounds(62, 461, 299, 164);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("img/�鼮ͼƬ8.png"));
		label_2.setBounds(401, 44, 299, 164);
		frame.getContentPane().add(label_2);
		
		
	}
}



































