package net.guochen.cheer.excrcise.ch09;

public class One {
	/**
	 *  获取2到32之间的6个偶数，并且求这6个偶数的和
	 *  @param num1 起始范围参数
	 *  @param num2 终止范围参数（不包括本身）
	 *  @return 返回范围内的随机六个偶数的和
	 */
	public static  double EvenNum(double num1,double num2){
		double sum=0;  //总和
		int count =0;   //计算器
		while (true){
			int tmp=(int)num1+(int)(Math.random()*(num2-num1));
				int coun = 0;
				if(tmp !=0 && tmp % 2==0){
					System.out.println("打印2到32之间的偶数(不包括32本身)"+tmp);
					sum+=tmp;
					coun++;	
				}
				if(coun == 6){   //获取六次偶数后跳出循环
					break;
				}
			}
			return sum;
		}
		public static void main(String[] args){
			System.out.println("和为："+EvenNum(2,32));
		}
	}


