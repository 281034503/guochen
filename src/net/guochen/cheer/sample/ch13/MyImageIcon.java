package net.guochen.cheer.sample.ch13;

import java.awt.*;
import java.net.*;

import javax.swing.*;

public class MyImageIcon extends JFrame {

	private static final long serialVersionUID = 1L;
	private static final String F = null;

	public MyImageIcon() {
		Container container = getContentPane();
		// ����һ����ǩ
		JLabel jl = new JLabel("����һ��JFrame����", JLabel.CENTER);
		// ��ȡͼƬ���ڵ�URL
		URL url = MyImageIcon.class.getResource("imageButton.jpg");  
		//getResource��ȡ�ļ���·��
		Icon icon = new ImageIcon();   // ʵ����Icon����
		jl.setIcon(icon);     // Ϊ��ǩ����ͼƬ	
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		// �������ַ����ڱ�ǩ�м�
		jl.setOpaque(true);    // ���ñ�ǩΪ��͸��״̬
		container.add(jl);    // ����ǩ��ӵ�������
		setSize(250, 100);  // ���ô����С
		setVisible(true);  // ʹ����ɼ�
		// ���ô���ر�ģʽ
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]) {
		new MyImageIcon();     // ʵ����MyImageIcon����
	}
}

