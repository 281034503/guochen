package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelTest extends JFrame{
	public JPanelTest(){     //���췽��
		
		Container c=getContentPane();   //����һ������
		
		c.setLayout(new GridLayout(2,1,10,10));    
		//��������������Ϊ2��1�е����񲼾�
		
		JPanel p1=new JPanel(new GridLayout(1,3,10,10));
		//��ʼ��һ����壬����1��3�е����񲼾�
		
		JPanel p2=new JPanel(new GridLayout(1,2,10,10));
		JPanel p3=new JPanel(new GridLayout(1,2,10,10));
		JPanel p4=new JPanel(new GridLayout(2,1,10,10));
		
           //���������Ӱ�ť
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("7"));
		p4.add(new JButton("8"));
		p4.add(new JButton("9"));
		
		c.add(p1);     //��������������
		c.add(p2);
		c.add(p3);
		c.add(p4); 
		setSize(500,300);
		setTitle("�����������ʹ�������");
		setVisible(true);   //����ɼ�
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] agrs){
		new JPanelTest();
	}

}
