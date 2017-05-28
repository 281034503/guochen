package net.guochen.cheer.sample.ch13;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutPosition extends JFrame {
	String[] border={BorderLayout.CENTER,BorderLayout.WEST,BorderLayout.EAST,
			BorderLayout.SOUTH,BorderLayout.NORTH
	};   //��������ڷ�λ�õ�����
	
	String[] buttonName={"center button","north button","south button","west button",
			 "east button"};   //������ť
	public BorderLayoutPosition(){   //���췽��
		
		setTitle("�������ʹ�ñ߽粼�ֹ�����");  //���ñ���
		
		Container c=getContentPane();   //����һ������
		
		BorderLayout setLayout = (new BorderLayout()); 
		//ʹ�ñ߽粼�ֹ�����
		
		for (int i=0;i<border.length;i++){
			c.add(border[i],new JButton(buttonName[i]));
			//����������Ӱ�ť�������ð�ť����
		}
		
		setSize(350,200);     //���ô����С
		setVisible(true);       //���ô���ɼ�
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	      //���ô���رշ�ʽ
	}

	public static void main(String[] agrs){
		new BorderLayoutPosition();
	}
}
	
	

