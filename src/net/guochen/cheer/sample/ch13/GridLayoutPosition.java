package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition(){    //���췽��
		Container c=getContentPane();  //����һ������
		setLayout(new GridLayout(7,3,5,5));
		//ʹ�����񲼾ֹ�����������7��3�е�����
		for(int i=0;i<21;i++){
			c.add(new JButton("button"+i));    //ѭ������Ӱ�ť
		}
		setSize(300,300);  
		setTitle("����һ��ʹ�����񲼾ֹ���Ĵ���");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] agrs){
		new GridLayoutPosition();
	}
	

}
