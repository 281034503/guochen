package net.guochen.cheer.sample.ch05;

import java.util.Date;   //����java.util.Date��

public class DateAndTime {   //������
	
    public static void main(String[] args){    //������
    	
    	Date date=new Date();    //��date���и�ʽ��
    	String time=String.format("%tT", date);
    	String form=String.format("%tc", date);
    	System.out.println("ȫ����ʱ����Ϣ�ǣ�"+time);
    	System.out.println("��-��-�ո�ʽ��"+form);
    }

}
