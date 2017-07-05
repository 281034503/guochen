package net.guochen.cheer.sample.ch18;

import java.awt.Container;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class SwingAndThread extends JFrame{
	private JLabel jI=new JLabel();   //声明JFabel对象
	private static Thread t;    //声明线程对象
	private int count=0;   //声明计数变量
	private Container container=getContentPane();   //声明容器
	
	public SwingAndThread(){
		setBounds(300,200,250,100);  //绝对定位窗体大小与位置
		container.setLayout(null);   //使窗体不适用任何布局管理器
		URL url=SwingAndThread.class.getResource("1.jpg");//获取图片的URL
		Icon icon=new ImageIcon("C:/Users/Administrator/Pictures/1.jpg");   //实例化一个Icon
		jI.setIcon(icon);     //将图标放置在标签中
		
		jI.setHorizontalAlignment(SwingConstants.LEFT);
		jI.setBounds(10,10,200,50);   //设置标签的位置与大小
		jI.setOpaque(true);
		t=new Thread(new Runnable(){  
			//定义内部匿名类，该类实现Runnable接口
			public void run(){   //重新run方法
				while(count<=200){   //设置循环条件
					jI.setBounds(count, 10, 200, 50);   //将标签的横坐标用变量表示
					try{
						Thread.sleep(1000);    //使线程睡眠1000毫秒
					}catch(Exception e){
						e.printStackTrace();
						
					}
					count +=4;     //使横坐标每次增加4
					if(count==200){   //当图标到达标签的最右边时，回到标签最左边
						count=10;
					}
				}
			}
		});
		t.start();   //启动线程
		container.add(jI);   //将标签添加到容器中
		setVisible(true);  //使窗体可见
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//设置窗体的关闭方式
	}
	
	public static void main(String[] args){
		new SwingAndThread();   //实例化一个SwingAndThread对象
	}
}