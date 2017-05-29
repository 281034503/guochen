package net.guochen.cheer.sample.ch13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class JTextAreaTest extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1772029281612693781L;
	public JTextAreaTest(){
		setSize(200,100);
		setTitle("定义自动换行的文本域");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		JTextArea jt=new JTextArea("文本域",50,60);
		jt.setLineWrap(true);
		//可以自动换行
		cp.add(jt);
		setVisible(true);
	}
	public static void main(String[] agrs){
		new JTextAreaTest();
	}

}
