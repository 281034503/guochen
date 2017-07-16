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
	        //������ɫ����
	
	
	private static final Random rand=new Random();
	//�����������
	
	private static Color getC () {
		//��ȡ�����ɫֵ�ķ���
		return color[rand.nextInt(color.length)];
	}
	
	public SleepMethodTest(){
		t=new Thread(new Runnable(){
			//���������̶߳���
			int x=30;
			int y=50;
			//�����ʼ����
			public void run(){   //�����߳̽ӿڷ���
				while (true){   //����ѭ��
					try{
						Thread.sleep(100);//�߳�����0.1��
					}catch (InterruptedException e){
						e.printStackTrace();
					}
					Graphics graphics=(Graphics) getGraphics();//��ȡ�����ͼ�����Ķ���
					
					graphics.setColor(getC ());//���û�ͼ��ɫ
					
					graphics.drawLine(x, y, 100, y++);  //����ֱ�߲�������ֱ����
					if(y>=80){
						y=50;
						
					}
				}
				
			}
	});
	t.start();   //�����߳�
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
