package net.guochen.cheer.Other;

public class GuShi {
	private static final int i = 0;

	public static void main(String[] args) {

	char a[][]=new char[4][];
	a[0]=new char[]{'��','��','��','��','��'};
	a[1]=new char[]{'��','��','��','��','��'};
	a[2]=new char[]{'ҹ','��','��','��','��'};
	a[3]=new char[]{'��','��','֪','��','��'};
	
	System.out.println("----���----");
	
	for(int i=0;i<a.length;i++) {   //����еĸ�����aѭ������ĳ��ȣ�length�����еĸ���
		
		for (int j=0;j<a[i].length;j++) {   //����еĸ�����jС�ڵ�ǰi
			
			System.out.print(a[i][j]);  //���i��j������
		    
		}if(i%2==0){    //��1�к͵�3���������
				System.out.println("��");
				
			}else {					
				System.out.println("��");
			}
		}
	
	
	
	System.out.println("----����----");
	for(int j=0;j<a[0].length;j++){    //���forѭ�������
		for(int i=3;i>=0;i-- ){    //�Ӻ���ǰѭ��
	
		System.out.print(a[i][j]);
	}
	System.out.println();
}
System.out.println("��������");
}
}
