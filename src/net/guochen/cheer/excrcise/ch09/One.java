package net.guochen.cheer.excrcise.ch09;

public class One {
	/**
	 *  ��ȡ2��32֮���6��ż������������6��ż���ĺ�
	 *  @param num1 ��ʼ��Χ����
	 *  @param num2 ��ֹ��Χ����������������
	 *  @return ���ط�Χ�ڵ��������ż���ĺ�
	 */
	public static  double EvenNum(double num1,double num2){
		double sum=0;  //�ܺ�
		int count =0;   //������
		while (true){
			int tmp=(int)num1+(int)(Math.random()*(num2-num1));
				int coun = 0;
				if(tmp !=0 && tmp % 2==0){
					System.out.println("��ӡ2��32֮���ż��(������32����)"+tmp);
					sum+=tmp;
					coun++;	
				}
				if(coun == 6){   //��ȡ����ż��������ѭ��
					break;
				}
			}
			return sum;
		}
		public static void main(String[] args){
			System.out.println("��Ϊ��"+EvenNum(2,32));
		}
	}


