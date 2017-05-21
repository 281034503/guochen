package net.guochen.cheer.demo.ch15;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ReaderWrterTest {

	public static void main(String[] args) {
		JFrame f=new TextEditorFrame();
		f.setVisible(true);

	}

}

class TextEditorFrame extends JFrame{

	
	public  TextEditorFrame(){
		setTitle("Text Editor");
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		final JTextArea content=new JTextArea();
		add(content,BorderLayout.CENTER);
		
		JButton readerButton=new JButton("Rrader");
		JButton writerButton=new JButton("Writer");
		
		JPanel southPanel=new JPanel();
	
		southPanel.setLayout(new GridLayout(1,2));
		southPanel.add(readerButton);
		southPanel.add(writerButton);
		add(southPanel,BorderLayout.SOUTH);
		
	}
}
