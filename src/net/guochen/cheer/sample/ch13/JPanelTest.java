package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JPanelTest extends JFrame{
	public JPanelTest(){     //构造方法
		
		Container c=getContentPane();   //定义一个容器
		
		c.setLayout(new GridLayout(2,1,10,10));    
		//将整个容器设置为2行1列的网格布局
		
		JPanel p1=new JPanel(new GridLayout(1,3,10,10));
		//初始化一个面板，设置1行3列的网格布局
		
		JPanel p2=new JPanel(new GridLayout(1,2,10,10));
		JPanel p3=new JPanel(new GridLayout(1,2,10,10));
		JPanel p4=new JPanel(new GridLayout(2,1,10,10));
		
           //在面板中添加按钮
		p1.add(new JButton("1"));
		p1.add(new JButton("2"));
		p1.add(new JButton("3"));
		p2.add(new JButton("4"));
		p2.add(new JButton("5"));
		p3.add(new JButton("6"));
		p3.add(new JButton("7"));
		p4.add(new JButton("8"));
		p4.add(new JButton("9"));
		
		c.add(p1);     //在容器中添加面板
		c.add(p2);
		c.add(p3);
		c.add(p4); 
		setSize(500,300);
		setTitle("在这个窗体中使用了面板");
		setVisible(true);   //窗体可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] agrs){
		new JPanelTest();
	}

}
