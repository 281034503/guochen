package net.guochen.cheer.sample.ch13;

import java.awt.Color;     //����awt��
import java.awt.Container;   

import javax.swing.JFrame;    //����swing��
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Example1 extends JFrame {   //����һ����̳�JFrame��
	public  void CreateJFrame(String title){    //����һ��CreateJFrame()����
		JFrame jf=new JFrame(title);    //ʵ����һ��JFrame����
		Container container=jf.getContentPane();    //��ȡһ������
		JLabel jl=new JLabel("����aaaaaһ��JFrame����");    //��ȡһ��JLabel��ǩ
				
		jl.setHorizontalAlignment(SwingConstants.CENTER);   //��ʾ������λ��
		container.add(jl);     //����ǩ��ӵ�������
		container.setBackground(Color.GREEN);    //���������ı���Ϊ����ɫ
		jf.setVisible(true);     //ʹ�������
		jf.setSize(200, 150);   //���ô����С
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String arge[]){
		//���������е���CreateJFrame()����
		new Example1().CreateJFrame("����һ��JFrame����");
	}

}
