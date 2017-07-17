package net.guochen.cheer.sample.ch18;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class InterruptedSwing extends JFrame{

	private static final long serialVersionUID=1l;
	Thread thread;
	
	public static void main(String[] args){
		init(new InterruptedSwing(),100,100);
	}
	public InterruptedSwing(){
		super();
		final JProgressBar progressBar=new JProgressBar();
		//����������
		getContentPane().add(progressBar, BorderLayout.NORTH);
		//�������������ڴ�����ʵ�λ��
		progressBar.setStringPainted(true);
		//���ý���������ʾ����
		thread=new Thread(new Runnable(){
			int count=0;
			public void run(){
				while (true){
					progressBar.setValue(++count);//���ý�������ǰֵ
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						
						System.out.print("��ǰ�߳����ж�");
						break;
						
					}
				}
			}
		});
		
		
		thread.start();  //�����߳�
	//	thread.interrupt();  //�ж��߳�
	}
	
	public static void init(JFrame frame,int width,int height){
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
	}
		
	
	
	

}
