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
		setTitle("�����Զ����е��ı���");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		JTextArea jt=new JTextArea("�ı���",50,60);
		jt.setLineWrap(true);
		//�����Զ�����
		cp.add(jt);
		setVisible(true);
	}
	public static void main(String[] agrs){
		new JTextAreaTest();
	}

}
