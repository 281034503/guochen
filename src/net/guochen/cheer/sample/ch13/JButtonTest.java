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
		setLayout(new GridLayout(3,2,5,5));   //设置网格布局管理器
		Container c=getContentPane();     //创建容器
		for(int i=0;i<5;i++){
			JButton J=new JButton("button"+i,icon);
			//创建按钮，同时设置按钮文字与图表
			
			c.add(J);    //在容器中添加按钮
			if(i%2==0){
				J.setEnabled(false);   //设置其中一些按钮不可用
			}
		}
		JButton jb=new JButton();   //实例化一个没有文字与图片的按钮
		jb.setMaximumSize(new Dimension(90,30));    //设置按钮与图片大小相同
		jb.setIcon(icon);           //为按钮设置图表
		jb.setHideActionText(true);
		jb.setToolTipText("图片按钮");   //设置按钮提示文字
		jb.setBorderPainted(false);      //设置按钮边界不显示
		jb.addActionListener(new ActionListener(){    //为按钮添加监听事件
			public void actionPerformed(ActionEvent e){
				
				JOptionPane.showMessageDialog(null, "弹出对话框");
				//弹出确认对话框
			}
		});
		c.add(jb);   //将按钮添加到容器中
		setTitle("创建带文字与图片的按钮");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
	}
	public static void main(String[] agrs){
		new JButtonTest();
	}

}
