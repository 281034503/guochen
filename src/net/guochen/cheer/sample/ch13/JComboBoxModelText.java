package net.guochen.cheer.sample.ch13;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class JComboBoxModelText extends JFrame {
	JComboBox<String>jc=new JComboBox<>(new MyComboBox());
	JLabel jl=new JLabel("��ѡ��֤��");
	
			public JComboBoxModelText(){
				setSize(new Dimension(160,180));
				setVisible(true);
				setTitle("�ڴ��������������б��");
				setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
				Container cp=getContentPane();
				cp.setLayout(new FlowLayout());
				cp.add(jc);
				cp.add(jl);
		
	}
			public static void main(String[] agrs){
				new JComboBoxModelText();
			}
			class MyComboBox extends AbstractListModel<String> implements ComboBoxModel<String>{
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;
				String selecteditem=null;
				String[] test={"���֤","����֤","ѧ��֤","����֤"};
				
				public String getElementAt(int index){  //������������ֵ
					return test[index];
				}
				public int getSize(){       //���������б�����Ǹ���Ŀ����Ŀ
					return test.length;
				}
				public void setSelectedltem(Object item){     //���������б��Ŀ¼
					selecteditem=(String)item;
				}
				public Object getSelectedltem(){	     //��ȡ�����б���е���Ŀ				
					return selecteditem;
				}
				public int getIndex(){
					for(int i=0;i<test.length;i++){
						if(test[i].equals(getSelectedltem()));
						return i;
					}
					return 0;
				}
				@Override
				public void setSelectedItem(Object anItem) {
					// TODO Auto-generated method stub
					
				}
				@Override
				public Object getSelectedItem() {
					// TODO Auto-generated method stub
					return null;
				}
				
			}

}
