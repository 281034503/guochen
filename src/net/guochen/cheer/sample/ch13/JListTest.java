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
		setTitle("�����������ʹ�����б��");
		setSize(200,150);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] agrs){
		new JListTest();
	}
	
	class MyListModel extends AbstractListModel<String>{
		//�̳г�����AbstractListModel
		
		private String[] contents={"�б�1","�б�2","�б�3","�б�4","�б�5","�б�6"};
		//�����б������
		public String getElementAt(int x){   //��дgetElementAt()����
			if(x<contents.length)
				return contents[x++];
			else
				return null;
		}
		public int getSize(){        //��дgetSize()����
			return contents.length;
		}
	}
	

}
