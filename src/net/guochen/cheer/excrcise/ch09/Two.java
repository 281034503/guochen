package net.guochen.cheer.excrcise.ch09;
import java.text.*;

public class Two{
	
	static public void SimpleFormat(String pattern,double value){
		//ʵ��������ʱ���ø�ʽ��ģʽ
		DecimalFormat myFormat=new DecimalFormat(pattern);
		//ʵ����DecimalFormat����
		String output=myFormat.format(pattern);
		//�����ֽ��и�ʽ��
		System.out.println(value+""+pattern+""+output);
	}
	public static double GetRoundArea(double r){
		return Math.PI*Math.pow(r, 2);
	}
	public static void main(String[] args){
		System.out.println("Բ�����Ϊ��");
		SimpleFormat("#.#####",GetRoundArea(2));
	}
	
}



