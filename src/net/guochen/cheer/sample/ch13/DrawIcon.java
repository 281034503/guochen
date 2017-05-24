package net.guochen.cheer.sample.ch13;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public  class DrawIcon implements Icon {    // 实现Icon接口
	private int width;   // 声明图标的宽
	private int height;   // 声明图标的长
	public int geticonheight(){   // 实现getIconHeight()方法
		return this.height;
	}
	public int geticonWidth(){   // 实现getIconWidth()方法
		return this.width;
	}
	public DrawIcon(int width,int height){    //定义构造方法
		this.width=width;
		this.height=height;
	}
	
	public void paintIcon(Component arg0,Graphics arg1,int x,int y){
		// 实现paintIcon()方法
		arg1.fillOval(x, y, width, height);
		//绘制一个圆形
		
	}
	public static void main(String[] agrs){
		DrawIcon icon=new DrawIcon(10,10);
		
		JLabel j=new JLabel("测试",icon,SwingConstants.CENTER);
		  // 创建一个标签，并设置标签上的文字在标签正中间
		JFrame jf=new JFrame();     //创建一个JFrame窗口
		Container c=jf.getContentPane();
		c.add(j);
		jf.setSize(100,100);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	@Override
	public int getIconWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getIconHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
