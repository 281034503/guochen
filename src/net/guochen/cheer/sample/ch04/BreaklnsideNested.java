package net.guochen.cheer.sample.ch04;

public class BreaklnsideNested {
	public static void main(String[] args){
		for (int i=0;i<3;i++){
			for(int j=0;j<6;j++){
				if(j==4){    //如果j等于4就结束内部循环
					break;
				}
				System.out.println("i="+i +"j="+j);
				
			}
		}
	}
}
