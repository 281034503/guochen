package net.guochen.cheer.sample.ch18;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;


public class SleepMethodTest extends JFrame {
	
	private static final long serialVersionUID=1L;
	private Thread t;
	
	private static Color[]color={Color.black,Color.blue,Color.cyan,Color.green,Color.orange,
			Color.YELLOW,Color.red,Color.pink,Color.LIGHT_GRAY};
	        //定义颜色数组
	
	
	private static final Random rand=new Random();
	//创建随机对象
	
	private static Color getC () {
		//获取随机颜色值的方法
		return color[rand.nextInt(color.length)];
	}
	
	public SleepMethodTest(){
		t=new Thread(new Runnable(){
			//创建匿名线程对象
			int x=30;
			int y=50;
			//定义初始坐标
			public void run(){   //覆盖线程接口方法
				while (true){   //无线循环
					try{
						Thread.sleep(100);//线程休眠0.1秒
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					Graphics graphics=(Graphics) getGraphics();//获取组件绘图上下文对象
					
					graphics.setColor(getC ());//设置绘图颜色
					
					graphics.drawLine(x, y, 100, y++);  //绘制直线并递增垂直坐标
					if(y>=80){
						y=50;
						
					}
				}
				
			}
	});
	t.start();   //启动线程
}
	
	public static void main(String[] args){
		init(new SleepMethodTest(),100,100);
		
	}
	
	public static void init(JFrame frame,int width,int height){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
}
