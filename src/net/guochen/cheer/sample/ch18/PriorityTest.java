package net.guochen.cheer.sample.ch18;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class PriorityTest extends JFrame{
	private static final long seriaVersionUID=1L;
	private Thread threadA;
	private Thread threadB;
	private Thread threadC;
	private Thread threadD;
	
	public PriorityTest(){
		getContentPane().setLayout(new GridLayout(4,1));
		
		final JProgressBar ProgressBar=new JProgressBar();
		final JProgressBar ProgressBar2=new JProgressBar();
		final JProgressBar ProgressBar3=new JProgressBar();
		final JProgressBar ProgressBar4=new JProgressBar();
		//ʵ����4���߳�
		getContentPane().add(ProgressBar);
		getContentPane().add(ProgressBar2);
		getContentPane().add(ProgressBar3);
		getContentPane().add(ProgressBar4);
		
		ProgressBar.setStringPainted(true);
		ProgressBar2.setStringPainted(true);
		ProgressBar3.setStringPainted(true);
		ProgressBar4.setStringPainted(true);
		
		threadA=new Thread(new MyThread(ProgressBar));
		threadB=new Thread(new MyThread(ProgressBar2));
		threadC=new Thread(new MyThread(ProgressBar3));
		threadD=new Thread(new MyThread(ProgressBar4));
		
		setPriority("threadA",5,threadA);
		setPriority("threadA",5,threadB);
		setPriority("threadA",4,threadC);
		setPriority("threadA",3,threadD);
	}
	
	public static void setPriority(String threadName,int priority,Thread t){
		//���������̵߳����ƣ����ȼ��ķ���
		t.setPriority(priority);  //�����̵߳����ȼ�
		t.setName(threadName);//�����̵߳�����
		t.start();//�����߳�
	}
	
	public static void main (String[] args){
		init(new PriorityTest(),100,100);
	}
	public static void init(JFrame frame,int width,int height){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
		
	}
	
	private final class MyThread implements Runnable{
		//����һ��ʵ��Runnable�ӿڵ���
		private final JProgressBar bar;
		int count=0;
		
		private MyThread(JProgressBar bar){
			this.bar=bar;
			
		}
		
		public void run(){   //��дrun()����
			while (true){
				bar.setValue(count+=17);  //���ù�������ֵÿ������10
				try{
					Thread.sleep(1000);
				}catch (InterruptedException e){
					System.out.println("��ǰ�߳����ж�");
					
				}
			}
		}
	}
}
