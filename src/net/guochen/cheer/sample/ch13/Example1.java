package net.guochen.cheer.sample.ch13;

import java.awt.Color;     //导入awt包
import java.awt.Container;   

import javax.swing.JFrame;    //导入swing包
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class Example1 extends JFrame {   //定义一个类继承JFrame类
	public  void CreateJFrame(String title){    //定义一个CreateJFrame()方法
		JFrame jf=new JFrame(title);    //实例化一个JFrame对象
		Container container=jf.getContentPane();    //获取一个容器
		JLabel jl=new JLabel("这是aaaaa一个JFrame窗口");    //获取一个JLabel标签
				
		jl.setHorizontalAlignment(SwingConstants.CENTER);   //显示在中心位置
		container.add(jl);     //将标签添加到容器中
		container.setBackground(Color.GREEN);    //设置容器的背景为绿颜色
		jf.setVisible(true);     //使窗体可视
		jf.setSize(200, 150);   //设置窗体大小
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String arge[]){
		//在主方法中调用CreateJFrame()方法
		new Example1().CreateJFrame("创建一个JFrame窗体");
	}

}
