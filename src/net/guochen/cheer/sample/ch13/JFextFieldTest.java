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
		final JButton jb=new JButton("清除");
		cp.add(jt);
		cp.add(jb);
		jt.addActionListener(new ActionListener(){
			//为文本框添加事件
			public void actionPerformed(ActionEvent arg0){
				jt.setText("触发事件");    //设置文本框的值
			}
		});
		jb.addActionListener(new ActionListener(){    //为按钮添加事件
			public void actionPerformed(ActionEvent agr0){
				jt.setText("");    //将文本框置空
				jt.requestFocus();   //焦点回到文本框
			}
		});
		setVisible(true);
	}
	public static void main(String[] args){
		new JFextFieldTest();
	}
	

}
