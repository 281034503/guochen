package net.guochen.cheer.sample.ch04;

public class GetSwitch {     //创建类
	public static void main(String[] arg){     //主方法
		int week=2;    //定义int型变量week
		switch(week){     //指定switch语句的表达式为变量week
		case 1:      //定义case语句中的常量为1
			System.out.println("Monday");   //输出信息
		break;
		case 2:   //定义case语句中的常量为2
			System.out.println("Tuesday");   //输出信息
			break;
		case 3:    //定义case语句中的常量为3
			System.out.println("Wednseday");   //输出信息
			break;
		default:
			System.out.println("Sorry,I don't Know");   //default语句
				
		}
	}

}
