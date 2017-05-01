package net.guochen.cheer.excrcise.ch06;

import java.util.Arrays;

public class One {
	public static void main(String[] args){
		
		int arr1[]=new int[]{8,16,32,64,128};
		
		int arr2[]=Arrays.copyOfRange(arr1,0,3);
		
		for(int i=0;i<arr1.length;i++){
			
			System.out.print("arr1输出的结果"+arr1[i]);
			
			System.out.print(",");
			
			System.out.println();
		}
		
		for(int j=0;j<arr2.length;j++){
			
			System.out.print("arr2输出的结果"+arr2[j]);
			
			System.out.println(",");
		}
		
	}
	
}    
	

