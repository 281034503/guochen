package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class FlowLayoutPosition extends JFrame{
	public FlowLayoutPosition(){      //���췽��
		setTitle("������ʹ�������ֹ�����");   //���ô������
		Container c=getContentPane();
		
		setLayout(new FlowLayout(2,10,10));
		//���ô���ʹ�������ֹ�������ʹ�齨�Ҷ��룬���������齨֮���ˮƽ����봹ֱ���
		for(int i=0;i<11;i++){
			//��������ѭ�����10����ť
			c.add(new JButton("button"+i));
			
		}
		setSize(300,200);    //���ô����С
		setVisible(true);    //ʹ����ɼ�
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//���ô���رշ�ʽ
	}
	public static void main(String[]args){
		new FlowLayoutPosition();
	}

}
