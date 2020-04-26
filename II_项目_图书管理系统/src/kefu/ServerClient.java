package kefu;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ServerClient{

	private JFrame frame;
	private DataInputStream scan = null;
	private Scanner scan_1 = null;
	private PrintStream out = null;
	private JTextArea textArea;
	private ServerSocket server;
	private boolean flag;
	private int s_12 = 0;
	private Socket[] client = new Socket[100];
	private String s_2;

	
	public static void main(String[] args) {
		new ServerClient();
	}
	
 
	
	
	class ServerSocket_1 implements Runnable{
		
		String s_01;
		int n;
		
		 public ServerSocket_1(String s,int n) {
			 this.s_01 = s;
			 this.n = n;
		 }
		 
		 class ServerSocket_2 implements Runnable{
				
				public void run() {
					
					try {
						for(int i = 0;i<n+1;i++) {
							out = new PrintStream(client[i].getOutputStream());
							out.println(s_2);
						}
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
				
				
			}
			
		 
		
		
		
		public void run() {
			
			try {
				
				
				scan_1 = new Scanner(client[n].getInputStream());
				while(true) {
					
					if(scan_1.hasNext()) {
						String text = scan_1.next().trim();
						
						Calendar cal=Calendar.getInstance();   
						int h=cal.get(Calendar.HOUR_OF_DAY);      
						int mi=cal.get(Calendar.MINUTE);      
						int s1=cal.get(Calendar.SECOND); 
						String s_22 = null;
						if(s1<10) {
							s_22 = h+":"+mi+":0"+s1;
						}else {
							s_22 = h+":"+mi+":"+s1;
						}
						
						s_2 = s_01+s_22+"\n"+text;
						new Thread(new ServerSocket_2()).start();
					}
						
						
					
				}
				
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			
			
			
			
		}
		
		
	}
	
	public ServerClient() {
		
		
		try {
			server = new ServerSocket(9999);
			JOptionPane jp = new JOptionPane();
			JOptionPane.showMessageDialog(null, "正在连接！", "系统提示",JOptionPane.INFORMATION_MESSAGE);
			String[] s = new String[] {"独家记忆   ","红玫瑰   ","流浪   ","你知道   ","我在等你吗   ","我是不是你最疼爱的人    ","不是    "};
			while(true) {
				client[s_12] = server.accept();
				new Thread(new ServerSocket_1(s[s_12],s_12)).start();
				s_12++;
			}
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	}


}



