package com.lzw;
import java.util.Random;
import static java.lang.System.out;

public class FinalStaticData {
	private static Random rand=new Random();  //ʵ����һ��Random�����
	
	private final int a1=rand.nextInt(10);
	//�������0~10֮����������ֵ�趨��Ϊfianl��a1
	
	private static final int a2=rand.nextInt(10);
	//�������0~10֮�����������趨��Ϊstatic final��a2
	
	public static void main(String[] agrs){
		FinalStaticData fdata=new FinalStaticData();
		//ʵ����һ������
		
		out.println("����ʵ������������a1��ֵ��"+fdata.a1);
		//���ö���Ϊfinal��a1
		
		out.println("����ʵ������������a1��ֵ��"+fdata.a2);
		//���ö���Ϊstatic final��a2
		
		FinalStaticData fdata2=new FinalStaticData();
		//ʵ��������һ������
		
		out.println("����ʵ�����������a1��ֵ��"+fdata2.a1);
		out.println("����ʵ�����������a2��ֵ��"+fdata2.a2);
	}
	

}
