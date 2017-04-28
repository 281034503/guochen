package net.guochen.cheer.Other;

public class GuShi {
	private static final int i = 0;

	public static void main(String[] args) {

	char a[][]=new char[4][];
	a[0]=new char[]{'春','眠','不','觉','晓'};
	a[1]=new char[]{'处','处','闻','啼','鸟'};
	a[2]=new char[]{'夜','来','风','雨','声'};
	a[3]=new char[]{'花','落','知','多','少'};
	
	System.out.println("----横版----");
	
	for(int i=0;i<a.length;i++) {   //获得行的个数，a循环数组的长度，length代表行的个数
		
		for (int j=0;j<a[i].length;j++) {   //获得列的个数，j小于当前i
			
			System.out.print(a[i][j]);  //输出i和j的内容
		    
		}if(i%2==0){    //第1行和第3行输出逗号
				System.out.println("，");
				
			}else {					
				System.out.println("。");
			}
		}
	
	
	
	System.out.println("----竖版----");
	for(int j=0;j<a[0].length;j++){    //外层for循环输出列
		for(int i=3;i>=0;i-- ){    //从后往前循环
	
		System.out.print(a[i][j]);
	}
	System.out.println();
}
System.out.println("。，。，");
}
}
