package net.guochen.cheer.excrcise.ch06;
 
public class Four {
	public static void main(String[] args) {
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};   //创建二维数组
		System.out.println("数组原内容："+"" );
		for(int i=0;i<arr.length;i++){    //代表行
			for(int j=0;j<arr.length;j++){    // 代表列
				System.out.print(arr[i][j]);    //
			
			}
			System.out.println("  " );   //换行
	}
		System.out.println("换行后的数组:"+ "");
		for (int i=0;i<arr.length;i++){
			for (int j=0;j<arr.length;j++){
				System.out.print(arr[j][i]);   //先输出列在输出行
				
			}
			System.out.println();
		}		
  }
}