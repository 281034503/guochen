package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class JFextFieldTest extends JFrame{
	public JFextFieldTest(){
		setSize(250,100);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());
		final JTextField jt=new JTextField("aaabbb",20);
		final JButton jb=new JButton("���");
		cp.add(jt);
		cp.add(jb);
		jt.addActionListener(new ActionListener(){
			//Ϊ�ı�������¼�
			public void actionPerformed(ActionEvent arg0){
				jt.setText("�����¼�");    //�����ı����ֵ
			}
		});
		jb.addActionListener(new ActionListener(){    //Ϊ��ť����¼�
			public void actionPerformed(ActionEvent agr0){
				jt.setText("");    //���ı����ÿ�
				jt.requestFocus();   //����ص��ı���
			}
		});
		setVisible(true);
	}
	public static void main(String[] args){
		new JFextFieldTest();
	}
	

}
