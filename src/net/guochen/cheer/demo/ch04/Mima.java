package net.guochen.cheer.demo.ch04;

import java.util.Scanner;

public class Mima {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String pwd1 = "0";
		String pwd2 = "-1";
		do{
			System.out.println("����������");
			pwd1=sc.nextLine();
			System.out.println("���ٴ���������");
			pwd2=sc.nextLine();
			if(!pwd1.equals(pwd2)){
				System.out.println("���������Ĥ��һ�£����������룡");
				
			}			
			}while (!pwd1.equals(pwd2));
		System.out.println("�������óɹ�");
	}
		}
	


