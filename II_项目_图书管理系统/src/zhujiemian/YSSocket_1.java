package zhujiemian;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class YSSocket_1 {
	
	private Scanner scan;
	private PrintStream out;
	private Socket client;
	
	public YSSocket_1() throws Exception{
		
		ServerSocket server = new ServerSocket(9999);
		System.out.println("�ȴ��ͻ�������........");
		Socket client = server.accept();
		System.out.println("������");
		scan = new Scanner(client.getInputStream());
		out = new PrintStream(client.getOutputStream());
		
		
	}
	
	public void jieshou() {
		if(scan.hasNext()) {
			String s_1 = scan.next().trim();
		}
	}
	
	public void fasong(String str) {
		out.println(str);
	}
	
	
}
