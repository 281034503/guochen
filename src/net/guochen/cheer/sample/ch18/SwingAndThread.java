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
	private JLabel jI=new JLabel();   //����JFabel����
	private static Thread t;    //�����̶߳���
	private int count=0;   //������������
	private Container container=getContentPane();   //��������
	
	public SwingAndThread(){
		setBounds(300,200,250,100);  //���Զ�λ�����С��λ��
		container.setLayout(null);   //ʹ���岻�����κβ��ֹ�����
		URL url=SwingAndThread.class.getResource("1.jpg");//��ȡͼƬ��URL
		Icon icon=new ImageIcon("C:/Users/Administrator/Pictures/1.jpg");   //ʵ����һ��Icon
		jI.setIcon(icon);     //��ͼ������ڱ�ǩ��
		
		jI.setHorizontalAlignment(SwingConstants.LEFT);
		jI.setBounds(10,10,200,50);   //���ñ�ǩ��λ�����С
		jI.setOpaque(true);
		t=new Thread(new Runnable(){  
			//�����ڲ������࣬����ʵ��Runnable�ӿ�
			public void run(){   //����run����
				while(count<=200){   //����ѭ������
					jI.setBounds(count, 10, 200, 50);   //����ǩ�ĺ������ñ�����ʾ
					try{
						Thread.sleep(1000);    //ʹ�߳�˯��1000����
					}catch(Exception e){
						e.printStackTrace();
						
					}
					count +=4;     //ʹ������ÿ������4
					if(count==200){   //��ͼ�굽���ǩ�����ұ�ʱ���ص���ǩ�����
						count=10;
					}
				}
			}
		});
		t.start();   //�����߳�
		container.add(jI);   //����ǩ��ӵ�������
		setVisible(true);  //ʹ����ɼ�
		
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		//���ô���Ĺرշ�ʽ
	}
	
	public static void main(String[] args){
		new SwingAndThread();   //ʵ����һ��SwingAndThread����
	}
}