package net.guochen.cheer.sample.ch09;
import java.util.Random;
public class RandomDemo {
	public static void main(String[] agrs){
		Random r=new Random();    // ʵ����һ��Random��
		
		System.out.println("�������һ��������"+r.nextInt());
		//�������һ������
		System.out.println("�������һ������0С��10��������"+r.nextInt(10));
		//�������һ������0С��10������
		System.out.println("�������һ�������͵�ֵ��"+r.nextBoolean());
		//�������һ�������͵�ֵ
		System.out.println("�������һ��˫���ȵ�ֵ��"+r.nextDouble());
		//�������һ��˫���ȵ�ֵ
		System.out.println("�������һ�������͵�ֵ��"+r.nextFloat());
		//�������һ�������͵�ֵ
		System.out.println("�������һ�������ܶ�Ϊ��˹�ֲ��ĸ߾���ֵ��"+r.nextGaussian());
		//�������һ�������ܶ�Ϊ��˹�ֲ��ĸ߾���ֵ
	}

}
