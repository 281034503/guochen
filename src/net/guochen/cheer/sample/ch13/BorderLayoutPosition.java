package net.guochen.cheer.sample.ch13;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class BorderLayoutPosition extends JFrame {
	String[] border={BorderLayout.CENTER,BorderLayout.WEST,BorderLayout.EAST,
			BorderLayout.SOUTH,BorderLayout.NORTH
	};   //定义组件摆放位置的数组
	
	String[] buttonName={"center button","north button","south button","west button",
			 "east button"};   //创建按钮
	public BorderLayoutPosition(){   //构造方法
		
		setTitle("这个窗体使用边界布局管理器");  //设置标题
		
		Container c=getContentPane();   //定义一个容器
		
		BorderLayout setLayout = (new BorderLayout()); 
		//使用边界布局管理器
		
		for (int i=0;i<border.length;i++){
			c.add(border[i],new JButton(buttonName[i]));
			//在容器中添加按钮，并设置按钮布局
		}
		
		setSize(350,200);     //设置窗体大小
		setVisible(true);       //设置窗体可见
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	      //设置窗体关闭方式
	}

	public static void main(String[] agrs){
		new BorderLayoutPosition();
	}
}
	
	

