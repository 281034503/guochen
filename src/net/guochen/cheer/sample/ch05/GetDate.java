package net.guochen.cheer.sample.ch05;
import java.util.Date;    //����java.util.Date��
public class GetDate {    //�½���
	public static void main(String[] agrs){    //������
		Date date=new Date();     //����Date����date
		String hour=String.format("%tH", date);   //��date��ʽ��
		String mintu=String.format("%tM",date );
		String second=String.format("%tS",date);
		System.out.println("������:"+hour+"ʱ"+mintu+"��"+second+"��");
		
	}

}
