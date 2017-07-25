package net.guochen.cheer.sample.ch19;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

import javax.swing.*;
import javax.swing.border.*;

public class MyClien extends JFrame { // 继承JFrame类
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private PrintWriter writer; // 声明 PrintWrite类对象
	Socket socket; // 声明Socket对象
	private JTextArea ta = new JTextArea();// 创建JTextArea对象
	private JTextField tf = new JTextField();// 创建JTextField对象
	Container cc; // 声明Container对象

	public MyClien(String title) { // 构造方法
		super(title); // 调用父类的构造方法
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cc = this.getContentPane(); // 实例化对象
		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new BevelBorder(BevelBorder.RAISED));
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(ta);
		cc.add(tf, "South"); // 将文本框放在窗体下部
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				writer.println(tf.getText());// 将文本框中的信息写入流
				ta.append(tf.getText() + '\n');// 将文本框中的信息显示在文本域中
				ta.setSelectionEnd(ta.getText().length());
				tf.setText("");// 将文本框清空
			}
		});

	}

	private void connect() { // 连接套接字方法
		ta.append("尝试连接\n");// 文本域中提示信息
		try { // 捕捉异常
			socket = new Socket("127.0.0.1", 8998);// 实例化Socket对象
			writer = new PrintWriter(socket.getOutputStream(), true);
			ta.append("完成连接\n");// 文本域中提示信息
		} catch (Exception e) {
			e.printStackTrace(); // 输出异常信息
		}
	}

	public static void main(String[] args) {
		MyClien clien = new MyClien("向服务器送数据");// 创建本例对象
		clien.setSize(200, 200);// 设置窗体大小
		clien.setVisible(true);// 将窗体显示
		clien.connect();// 调用连接方法
	}

}
