package net.guochen.cheer.sample.ch13;

import java.awt.Container;

import javax.swing.AbstractListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;

public class JListTest extends JFrame{
	public JListTest(){
		Container cp=getContentPane();
		cp.setLayout(null);
		JList<String>jl=new JList<>(new MyListModel());   
		JScrollPane js=new JScrollPane(jl);
		js.setBounds(10,10,100,100);
		cp.add(js);
		setTitle("在这个窗体中使用了列表框");
		setSize(200,150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] agrs){
		new JListTest();
	}
	
	class MyListModel extends AbstractListModel<String>{
		//继承抽象类AbstractListModel
		
		private String[] contents={"列表1","列表2","列表3","列表4","列表5","列表6"};
		//设置列表框内容
		public String getElementAt(int x){   //重写getElementAt()方法
			if(x<contents.length)
				return contents[x++];
			else
				return null;
		}
		public int getSize(){        //重写getSize()方法
			return contents.length;
		}
	}
	

}
