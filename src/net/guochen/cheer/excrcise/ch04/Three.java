package net.guochen.cheer.excrcise.ch04;

public class Three {

	public static void main(String[] args) {
		double sum =0,a=1;   //����double�������ݣ�sum����0��a����1
		int i=1;   //�������� i����1
		while(i <=20){   //�ж�i��ֵ�Ƿ�С�ڵ���20
			sum=sum+a;    //���жϱ��ʽ������������ʱִ��ѭ�����
			i=i+1;
			a=a*(1.0/i);
			
		}
		System.out.println(sum);
	}

	}


