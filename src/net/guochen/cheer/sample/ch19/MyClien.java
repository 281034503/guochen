package net.guochen.cheer.sample.ch19;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.*;

public class MyClien extends JFrame { // �̳�JFrame��
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PrintWriter writer; // ���� PrintWrite�����
	Socket socket; // ����Socket����
	private JTextArea ta = new JTextArea();// ����JTextArea����
	private JTextField tf = new JTextField();// ����JTextField����
	Container cc; // ����Container����

	public MyClien(String title) { // ���췽��
		super(title); // ���ø���Ĺ��췽��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc = this.getContentPane(); // ʵ��������
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf, "South"); // ���ı�����ڴ����²�
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());// ���ı����е���Ϣд����
				ta.append(tf.getText() + '\n');// ���ı����е���Ϣ��ʾ���ı�����
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");// ���ı������
			}
		});

	}

	private void connect() { // �����׽��ַ���
		ta.append("��������\n");// �ı�������ʾ��Ϣ
		try { // ��׽�쳣
			socket = new Socket("127.0.0.1", 8998);// ʵ����Socket����
			writer = new PrintWriter(socket.getOutputStream(), true);
			ta.append("�������\n");// �ı�������ʾ��Ϣ
		} catch (Exception e) {
			e.printStackTrace(); // ����쳣��Ϣ
		}
	}

	public static void main(String[] args) {
		MyClien clien = new MyClien("�������������");// ������������
		clien.setSize(200, 200);// ���ô����С
		clien.setVisible(true);// ��������ʾ
		clien.connect();// �������ӷ���
	}

}
