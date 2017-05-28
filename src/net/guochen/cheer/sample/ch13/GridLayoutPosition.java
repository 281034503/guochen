package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class GridLayoutPosition extends JFrame{
	public GridLayoutPosition(){    //构造方法
		Container c=getContentPane();  //定义一个容器
		setLayout(new GridLayout(7,3,5,5));
		//使用网格布局管理器，设置7行3列的网格
		for(int i=0;i<21;i++){
			c.add(new JButton("button"+i));    //循环中添加按钮
		}
		setSize(300,300);  
		setTitle("这是一个使用网格布局管理的窗体");
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	
	}
	public static void main(String[] agrs){
		new GridLayoutPosition();
	}
	

}
