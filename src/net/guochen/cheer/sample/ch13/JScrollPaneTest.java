package net.guochen.cheer.sample.ch13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest(){     //���췽��
	Container c=getContentPane();    //��������
	JTextArea ta=new JTextArea(20,50);   //�����ı������齨
	JScrollPane sp=new JScrollPane(ta);    //����JScrollPane������
	c.add(sp);    //���������ӵ���������
	setTitle("�������������ֱ�����");
	setSize(200,200);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

     }
	public static void main(String[] agrs){
		new JScrollPaneTest();
	}
}
