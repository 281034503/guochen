package net.guochen.cheer.sample.ch13;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class AbsolutePosition extends JFrame {
	public  AbsolutePosition(){    //���췽��
		setTitle("������ʹ�þ��Բ���");
		//���øô���ı���
		setLayout(null);
		//ʹ�ô���ȡ�����ֹ���������
		setBounds(0,0,200,250);
		//���Զ�λ�����λ�����С
		Container c=getContentPane();    //������������
		JButton b1=new JButton("��ť1");  //������ť
		JButton b2=new JButton("��ť3");   //������ť
		b1.setBounds(10, 30, 80, 30);    //���ð�ť��λ�����С
		b2.setBounds(60, 70, 100, 20);
		c.add(b1);      //����ť��ӵ�������
		c.add(b2);
		setVisible(true);   //ʹ����ɼ�
		
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//���ô���رշ�ʽ
	}

	public static void main(String[] agrs){
		new AbsolutePosition();
	}

}
