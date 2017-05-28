package net.guochen.cheer.sample.ch13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JScrollPaneTest extends JFrame{
	public JScrollPaneTest(){     //构造方法
	Container c=getContentPane();    //创建容器
	JTextArea ta=new JTextArea(20,50);   //创建文本区域组建
	JScrollPane sp=new JScrollPane(ta);    //创建JScrollPane面板对象
	c.add(sp);    //将该面板添加到该容器中
	setTitle("带滚动条的文字编译器");
	setSize(200,200);
	setVisible(true);
	setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

     }
	public static void main(String[] agrs){
		new JScrollPaneTest();
	}
}
