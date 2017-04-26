package net.guochen.cheer.excrcise.ch04;

public class Three {

	public static void main(String[] args) {
		double sum =0,a=1;   //定义double类型数据，sum等于0，a等于1
		int i=1;   //定义整型 i等于1
		while(i <=20){   //判断i的值是否小于等于20
			sum=sum+a;    //先判断表达式，当满足条件时执行循环语句
			i=i+1;
			a=a*(1.0/i);
			
		}
		System.out.println(sum);
	}

	}


