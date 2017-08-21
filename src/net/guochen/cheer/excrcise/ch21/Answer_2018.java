package net.guochen.cheer.excrcise.ch21;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Answer_2018 extends JFrame{
	private static final long serialVersionUID = 1L;
	
	public static void main(String [] args) {
		try {
			Answer_2018 frame=new Answer_2018();
			frame.setVisible(true);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Answer_2018() {
		super();
		setBounds(100,100,500,375);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JPanel topPanel=new JPanel();
		getContentPane().add(topPanel, BorderLayout.NORTH);
		
		final JLabel topLabel=new JLabel();
		topLabel.setText("日期：");
		topPanel.add(topLabel);
		
		
		final MDateField topTreeComboBox=new MDateField();
		topPanel.add(topTreeComboBox);
		
		
		final JPanel bottomPanel=new JPanel();
		getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		
		final JLabel bottomLabel=new JLabel();
		bottomLabel.setText("日期: ");
		bottomPanel.add(bottomPanel);
		
		final MDateField bottomTreeComboBox=new MDateField();
		bottomPanel.add(bottomTreeComboBox);
		
		final JLabel label=new JLabel();
		label.setText("");
		getContentPane().add(label, BorderLayout.CENTER);
		
		
		
		
	}
	

}
