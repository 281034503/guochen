package net.guochen.cheer.sample.ch13;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class MyJDialog extends JDialog{    // ��������̳�JDialog��
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MyJDialog(MyFrame frame){
		
		super(frame,"��һ��JDialog����",true);
		// ʵ����һ��JDialog�����ָ���Ի���ĸ����塢������������
		Container container=getContentPane();   // ����һ������
		container.add(new JLabel("����һ���Ի���"));   // ����������ӱ�ǩ
		setBounds(120,120,100,100);  // ���öԻ������С
	}

public class MyFrame extends JFrame{   //��������
	
	public void main(String[] agrs){
		new MyFrame();   // ʵ����MyJDialog�����
	}
	public MyFrame(){
		Container container=getContentPane();    //����һ������
		container.setLayout(null);
		JLabel jl=new JLabel("����һ��JLrame����");     // �ڴ��������ñ�ǩ
				jl.setHorizontalAlignment(SwingConstants.CENTER);
				
				// ����ǩ���������ڱ�ǩ�м�λ��
		container.add(jl);
		JButton bl=new JButton("�����Ի���");   // ����һ����ť
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener(){    // Ϊ��ť�����굥���¼�
			public void actionPerformed(ActionEvent e){				
				// ʹMyJDialog����ɼ�
				new MyFrame().setVisible(true);
			}
		});
		container.add(bl);   // ����ť��ӵ�������
		container.add(bl);
		container.setBackground(Color.white);
		setSize(200,300);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setVisible(true);
	}
}
}	

		
