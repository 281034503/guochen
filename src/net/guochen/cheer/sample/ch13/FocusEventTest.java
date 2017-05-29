package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class FocusEventTest extends JFrame{
	public FocusEventTest(){
		setSize(250,100);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		Container cp=getContentPane();
		getContentPane().setLayout(new FlowLayout());
		
		final JLabel label=new JLabel();
		getContentPane().add(label);
		JTextField jt=new JTextField("�뵥�������ı���",10);
		//�����Ը��ı���
		JTextField jt2=new JTextField("�뵥����",10);
		//��������һ���ı���
		cp.add(jt);
		cp.add(jt2);
		jt.addFocusListener(new FocusListener(){
			
			public void focusLost(FocusEvent arg0){
				//���ʧȥ����ʱ���õķ���
				JOptionPane.showMessageDialog(null, "�ı���ʧȥ����");
			}
			public void focusGained(FocusEvent arg0){
				//�����ȡ����ʱ���õķ���
				
			
		}
		
	});
	setVisible(true);
}
public static void main(String[] args){
	new FocusEventTest();
   }
}
