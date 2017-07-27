package net.guochen.cheer.excrcise.ch13;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class UseCase2 extends JFrame{
	
	private String[]contents={"列表1","列表2","列表3","列表4","列表5"};
	private JComboBox<String>jc=new JComboBox<>();
	private JButton jb=new JButton("提交");
	int count=0;
	public UseCase2(){
		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		Container cp=getContentPane();
		cp.setLayout(new FlowLayout());
		cp.add(jc);
		cp.add(jb);
		jb.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0){
				if(count<contents.length){
					jc.addItem(contents[count++]);
				}
			}
		
		});
		
	}
	
	public static void main(String [] args){
		new UseCase2();
	}

}
