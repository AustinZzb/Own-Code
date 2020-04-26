package kefu;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;

import zhujiemian.zhujiemian_1;

public class Client implements Runnable{

	private JFrame frame;
	private JPanel contentPane;
    private Scanner scan;
    private PrintStream out;
    private JTextArea textArea;
    private JTextArea textArea_1;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					客服系统1 window = new 客服系统1();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
    
    public static void main(String[] args) {
		new Client();
	}

	/**
	 * Create the application.
	 */
	public Client() {
		
		frame = new JFrame();
		frame.setVisible(true);
		frame.setBounds(100, 100, 467, 638);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		try {
			Socket client = new Socket("localhost",9999);
			scan = new Scanner(client.getInputStream());
			out = new PrintStream(client.getOutputStream());
			
			
			JButton btnNewButton = new JButton("\u53D1\u9001");
			btnNewButton.setBounds(307, 527, 113, 27);
			frame.getContentPane().setLayout(null);
			frame.getContentPane().add(btnNewButton);
			
			JButton button = new JButton("\u9000\u51FA");
			button.setBounds(169, 527, 113, 27);
			frame.getContentPane().add(button);
			
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 446, 324);
			frame.getContentPane().add(panel);
			panel.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			panel.add(scrollPane, BorderLayout.CENTER);
			
			textArea = new JTextArea();
			textArea.setEditable(false);
			scrollPane.setViewportView(textArea);
			
			JPanel panel_1 = new JPanel();
			panel_1.setBounds(0, 355, 446, 150);
			frame.getContentPane().add(panel_1);
			panel_1.setLayout(new BorderLayout(0, 0));
			
			JScrollPane scrollPane_1 = new JScrollPane();
			scrollPane_1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			panel_1.add(scrollPane_1);
			
			textArea_1 = new JTextArea();
			scrollPane_1.setViewportView(textArea_1);
			
			Thread t = new Thread(this);
			t.start();
			
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				
					String s =  textArea_1.getText();
					out.println(s);
					textArea_1.setText("");
					
				}
			});
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public void run() {
		
		while(true) {
			if(scan.hasNext()) {
				String s = scan.next();
				textArea.append(s+"\n");
			}
		}
		
	}

}
