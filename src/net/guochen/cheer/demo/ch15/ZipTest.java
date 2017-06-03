package net.guochen.cheer.demo.ch15;


	import java.awt.BorderLayout;
	import java.awt.EventQueue;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.io.File;
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.util.List;
	import java.util.Scanner;
	import java.util.zip.ZipEntry;
	import java.util.zip.ZipInputStream;

	import javax.swing.JComboBox;
	import javax.swing.JFileChooser;
	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;
	import javax.swing.JScrollPane;
	import javax.swing.JTextArea;
	import javax.swing.SwingWorker;

	public class ZipTest {

		public static void main(String[] args) {
			EventQueue.invokeLater(new Runnable(){

				@Override
				public void run() {
					ZipTestFrame frame = new ZipTestFrame();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.setVisible(true);
					
				}
				
			});

		}
		
	}

	class ZipTestFrame extends JFrame{
		/**
		 * 
		 */
		private static final long serialVersionUID = -5407223920994639886L;
		private static final int DEFAULT_WIDTH = 400;
		private static final int DEFAULT_HEIHGT = 300;
		private JComboBox<String> fileCombo;
		private JTextArea fileText;
		private String zipname;
		
		public ZipTestFrame(){
			setTitle("ZipTest");
			setSize(DEFAULT_WIDTH,DEFAULT_HEIHGT);
			JMenuBar menuBar = new JMenuBar();
			JMenu menu = new JMenu("File");
			JMenuItem openItem = new JMenuItem("Open");
			menu.add(openItem);
			openItem.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					JFileChooser chooser = new JFileChooser();
					chooser.setCurrentDirectory(new File("."));
					int r = chooser.showOpenDialog(ZipTestFrame.this);
					if(r == JFileChooser.APPROVE_OPTION){
						zipname = chooser.getSelectedFile().getPath();
						fileCombo.removeAllItems();
						scanZipFile();
					}
				}
			});
			
			JMenuItem exitItem = new JMenuItem("Exit");
			menu.add(exitItem);
			exitItem.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			menuBar.add(menu);
			setJMenuBar(menuBar);
			
			fileText = new JTextArea();
			fileCombo = new JComboBox<String>();
			fileCombo.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					loadZipFile(fileCombo.getItemAt(
							fileCombo.getSelectedIndex()));
				}
			});
			add(fileCombo,BorderLayout.SOUTH);
			add(new JScrollPane(fileText),BorderLayout.CENTER);
			
		}
		
		public void scanZipFile(){
			new SwingWorker<Void,String>(){
				@Override
				protected Void doInBackground() throws Exception {
					ZipInputStream zin = new ZipInputStream(new FileInputStream(zipname));
					ZipEntry entry;
					while((entry = zin.getNextEntry())!=null){
						publish(entry.getName());
						zin.closeEntry();
					}
					zin.close();
					return null;
				}
				
				protected void process(List<String> names){
					for(String name:names){
						fileCombo.addItem(name);
					}
				}
			}.execute();
		}
		
		public void loadZipFile(final String name){
			fileCombo.setEnabled(false);
			fileText.setText("");
			new SwingWorker<Void,Void>(){
				@Override
				protected Void doInBackground() throws Exception {
					try{
						ZipInputStream zin = new ZipInputStream(
								new FileInputStream(zipname));
						ZipEntry entry;
						while((entry=zin.getNextEntry())!=null){
							if(entry.getName().equals(name)){
								Scanner in = new Scanner(zin);
								while(in.hasNext()){
									fileText.append(in.nextLine());
									fileText.append("\n");
								}
								in.close();
								zin.closeEntry();
								break;
							}
							zin.closeEntry();
						}
						zin.close();
					}catch(IOException e){
						e.printStackTrace();
					}
					return null;
				}
				
				protected void done() {
					fileCombo.setEnabled(true);
				}
			}.execute();
		}
	}

	/***
	 * Class java.util.zip.ZipInputStream
	 * ZipInputStrem(InputStream in)
	 * ����һ��ZipInputStream, ʹ�����ǿ��Ը�����InputStream�������������
	 * 
	 * ZipEntry getNextEntry()
	 * Ϊ��һ���ZipEntry����û�и������ʱ����null
	 * 
	 * void closeEntry()
	 * �ر����Zip�ļ��е�ǰ�򿪵���
	 * 
	 * 
	 * Class java.util.zip.ZipOutputStream
	 * ZipOutputStrem(OutputStream out)
	 * ����һ����ѹ������д����ָ����OutputStream��ZipOutputStream
	 * 
	 * void putNextEntry(ZipEntry ze)
	 * ��ָ����ZipEntry�е���Ϣд�������У�����Ϊ����д�����ݵ�����������write����ʱ�����ݿ���д�뵽ָ��������
	 * 
	 * void closeEntry()
	 * �ر����zip�ļ��е�ǰ�򿪵��
	 * 
	 * void setLevel(int level)
	 * ���ú����ĸ���DEFAULT���Ĭ��ѹ������Ĭ����DEFAULT_COMPRESSION (-1) ��������0-9
	 * 
	 * void setMethod(int method)
	 * ���ú���ѹ������ DEFLATED(0)��STORED(8),Ĭ����DEFLATED(0)
	 * 
	 * 
	 * Class java.util.zip.ZipEntry
	 * ZipEntry(String name)
	 * ����
	 * 
	 * long getCrc()
	 * ����CRC32У��͵�ֵ
	 * 
	 * String getName()
	 * ������һ�������
	 * 
	 * long getSize()
	 * ������һ�ѹ���Ĵ�С�����ڲ���֪������·���-1
	 * 
	 * boolean isDirectory()
	 * �Ƿ���Ŀ¼
	 * 
	 * void setMethod(int method)
	 * �μ�ZipOutputStream.setMethod(int method)
	 * 
	 * void setSize(long size)
	 * ���������ѹ���Ĵ�С��ֻ����ѹ������ΪSTOREDʱ���Ǳ����
	 * 
	 * void setCrc(long crc)
	 * ����CRC32У��͡�ֻ����ѹ������ΪSTOREDʱ���Ǳ����
	 * 
	 * Class java.util.zip.ZipFile
	 * ZipFile(String file)
	 * ZipFile(File file)
	 * ���캯��
	 * 
	 * Enumeratio entries()
	 * ��ȡ���е�ZipEntry
	 * 
	 * ZipEntry getEntry(String name)
	 * ���ظ������ֵ�ZipEntry,û�ж�Ӧʱ����null
	 * 
	 * InputStream getInputStream(ZipEntry ze)
	 * ���ظ������inputStream
	 * 
	 * String getName()
	 * �������ZIP�ļ���·��
	 * 
	 */



