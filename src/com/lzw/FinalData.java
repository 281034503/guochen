package com.lzw;
import static java.lang.System.out;
import java.util.Random;
class Test{
	int i=0;
}

public class FinalData {
	static Random rand=new Random();
	private final int VALUE_1=9;    //����һ��final����
	private static final int VALUE_2=10;     //����һ��final��static����
	private final Test teat=new Test();    //����һ��final����
	private Test test2=new Test();       //����һ������fianl������
	private final static int[]a={1,2,3,4,5,6};    //����һ����fianl������
	private final int i4=rand.nextInt(20);
	private int value2;
	private Test test;
	private static final int i5=rand.nextInt(20);
	public String toString(){
		return i4+""+i5+"";
	}
	
	
	public static void main(String[] agrs){
		FinalData Data=new FinalData();
		Data.test=new Test();
	//���Զ�ָ��Ϊfinal�������еĳ�Ա������ֵ
		//�����ܽ�����Ϊfinal������ָ����������
		
		Data.value2++;
		//���ܸı䶨��Ϊfianl�ĳ���ֵ
		Data.test2=new Test();   //���Խ�û�ж���Ϊfianl������ָ����������
		
		for(int i=0;i<Data.a.length;i++){
			a[i]=9;
			//���ܶԶ���Ϊfianl�����鸳ֵ
		}
		out.println(Data);
		out.println("data2");
		out.print(new FinalData());
		out.print(Data);
	}
		
	

}
