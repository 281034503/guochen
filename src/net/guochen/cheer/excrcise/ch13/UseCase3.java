package net.guochen.cheer.excrcise.ch13;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UseCase3 extends JFrame{
	
	public UseCase3(){
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setTitle("登录窗体");
		setBounds(300,200,300,150);
		Container cp=getContentpane();
		cp.setLayout(null);
		JLabel jl=new JLabel("用户名：");
		jl.setBounds(10,10,200,18);
		final JTexField name=new JTextField();
		name.setBounds(80,10,150,18);
		JLabel jl2=new JLabel("密码:");
		
	}

}
