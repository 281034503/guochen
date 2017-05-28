package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class JButtonTest extends JFrame{
	public JButtonTest(){
		java.net.URL url=MyImageIcon.class.getResource("F:/javalianxi/imageButton.jpg");
		Icon icon=new ImageIcon(url);
		setLayout(new GridLayout(3,2,5,5));   //�������񲼾ֹ�����
		Container c=getContentPane();     //��������
		for(int i=0;i<5;i++){
			JButton J=new JButton("button"+i,icon);
			//������ť��ͬʱ���ð�ť������ͼ��
			
			c.add(J);    //����������Ӱ�ť
			if(i%2==0){
				J.setEnabled(false);   //��������һЩ��ť������
			}
		}
		JButton jb=new JButton();   //ʵ����һ��û��������ͼƬ�İ�ť
		jb.setMaximumSize(new Dimension(90,30));    //���ð�ť��ͼƬ��С��ͬ
		jb.setIcon(icon);           //Ϊ��ť����ͼ��
		jb.setHideActionText(true);
		jb.setToolTipText("ͼƬ��ť");   //���ð�ť��ʾ����
		jb.setBorderPainted(false);      //���ð�ť�߽粻��ʾ
		jb.addActionListener(new ActionListener(){    //Ϊ��ť��Ӽ����¼�
			public void actionPerformed(ActionEvent e){
				
				JOptionPane.showMessageDialog(null, "�����Ի���");
				//����ȷ�϶Ի���
			}
		});
		c.add(jb);   //����ť��ӵ�������
		setTitle("������������ͼƬ�İ�ť");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] agrs){
		new JButtonTest();
	}

}
