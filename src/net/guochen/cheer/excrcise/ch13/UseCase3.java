package net.guochen.cheer.excrcise.ch13;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class UseCase3 extends JFrame{
	
	public UseCase3(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("��¼����");
		setBounds(300,200,300,150);
		Container cp=getContentPane();
		cp.setLayout(null);
		JLabel jl=new JLabel("�û�����");
		jl.setBounds(10,10,200,18);
		final JTextField name=new JTextField();
		name.setBounds(80,10,150,18);
		JLabel jl2=new JLabel("����:");
		jl2.setBounds(10,50,200,18);
		final JPasswordField passwork=new JPasswordField();
		passwork.setBounds(80,50,150,18);
		cp.add(jl);
		cp.add(name);
		cp.add(jl2);
		cp.add(passwork);
		JButton jb=new JButton("ȷ��");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(name.getText().trim().length()==0||new String(passwork.getPassword()).trim().length()==0) {
					JOptionPane.showMessageDialog(null, "�û������벻����Ϊ��");
					return;
				}
				if(name.getText().trim().equals("mr")&&new String(passwork.getPassword()).trim().equals("mrsoft")) {
                  JOptionPane.showMessageDialog(null, "��½�ɹ�");
				}
				else {
					JOptionPane.showMessageDialog(null, "�û������������");
					
				}
			}
		});
		jb.setBounds(80,80,60,18);
		cp.add(jb);
		
		final JButton button=new JButton();
		button.setText("����");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO�Զ����ɷ������
				name.setText("");
				passwork.setText("");
			}
		});
		button.setBounds(150,80,60,18);
		getContentPane().add(button);
	
	}
	public static void main(String [] args) {
		new UseCase3();
	}

}
