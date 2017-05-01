package net.guochen.cheer.sample.ch07;

public class TransferProperty {
	int i =47;
	public void call(){          //定义成员变量
		System.out.println(" 调用call（）构造方法");    //定义成员发放
		for(i=0;i<3;i++){
			System.out.println(i+"");
			if(i==2){
				System.out.println("\n");
			}
		}
	}
	public TransferProperty(){     //定义构造方法
	}
	public static void main(String[] agrs){
		TransferProperty t1=new TransferProperty();    //创建一个对象
		TransferProperty t2=new TransferProperty();    //创建另一个对象
		t2.i=60;         //将成员变量赋值为60
		System.out.println("第一个实例对象调用变量i的结果：" +t1.i++);
		//使用第一个对象调用类成员变量
		t1.call();    //使用第一个对象调用类成员方法
		System.out.println("第二个实例对象调用变量i的结果：" +t2.i++);
		//使用第二个对象调用类成员变量
		t2.call();     //使用第一个对象调用类成员方法
	}

}
