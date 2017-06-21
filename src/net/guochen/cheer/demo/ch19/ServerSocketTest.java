package net.guochen.cheer.demo.ch19;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSocketTest {

	public static void main(String[] args)throws Exception {
		

       ServerSocket serverSocket= new ServerSocket(8081);
		System.out.println("Server startup");
		Socket socket=serverSocket.accept();
		//在DOS下释放8081端口才会打印下面内容     DOS：wget 127.0.0.1:8081
		System.out.println("Client Connected");
		System.out.println("Client Connected1111");
		boolean run=true;
		Scanner scanner=new Scanner(System.in);
		
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);

		while (run){
			String income=in.readLine();
			System.out.println("Cleint sent me:"+income);
			System.out.println("Enter reply:");
			String outgo=scanner.nextLine();
			if("byte".equals(outgo)){
				run=false;
				out.println(outgo);
			}else{
				out.println(outgo);
				
			}
			
			scanner.close();

	}
		socket.close();
		serverSocket.close();
		 
	}
}
