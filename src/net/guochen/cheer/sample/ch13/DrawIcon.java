package net.guochen.cheer.sample.ch13;

import java.awt.Component;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public  class DrawIcon implements Icon {    // ʵ��Icon�ӿ�
	private int width;   // ����ͼ��Ŀ�
	private int height;   // ����ͼ��ĳ�
	public int geticonheight(){   // ʵ��getIconHeight()����
		return this.height;
	}
	public int geticonWidth(){   // ʵ��getIconWidth()����
		return this.width;
	}
	public DrawIcon(int width,int height){    //���幹�췽��
		this.width=width;
		this.height=height;
	}
	
	public void paintIcon(Component arg0,Graphics arg1,int x,int y){
		// ʵ��paintIcon()����
		arg1.fillOval(x, y, width, height);
		//����һ��Բ��
		
	}
	public static void main(String[] agrs){
		DrawIcon icon=new DrawIcon(10,10);
		
		JLabel j=new JLabel("����",icon,SwingConstants.CENTER);
		  // ����һ����ǩ�������ñ�ǩ�ϵ������ڱ�ǩ���м�
		JFrame jf=new JFrame();     //����һ��JFrame����
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
