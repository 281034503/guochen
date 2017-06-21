package net.guochen.cheer.demo.ch19;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketTest {
	public static void main(String[]args)throws Exception{
			
		Socket socket=new Socket("192.168.0.103",8081);
		boolean run=true;
		
       BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		PrintWriter out=new PrintWriter(socket.getOutputStream(),true);
		Scanner scanner=new Scanner(System.in);
		
		while(run){
			
			System.out.println("Enter you msg");
			String outgo=scanner.nextLine();
			out.println(outgo);
			String income=in.readLine();
			if("bye".equals(income)){
				System.out.println("End session");
				run=false;
			}else{
				System.out.println("Server sent msg:"+income);
				
			}
		}
	scanner.close();
	socket.close();
	}

}
