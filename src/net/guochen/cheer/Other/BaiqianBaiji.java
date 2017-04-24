package net.guochen.cheer.Other;

public class BaiqianBaiji {
	public static void main(String[] args){
		int Gong, Mu, Xiao;
		for(Gong=1;Gong<=20;Gong++){
			for(Mu=1;Mu<=33;Mu++){
				for(Xiao=3;Xiao<=99;Xiao+=3){
					if (Gong*5+Mu*3+Xiao/3==100){    //乘以各自单价等于一百块钱
						if(Gong+Mu+Xiao==100){   //一百只鸡
							System.out.println("公鸡：" +Gong+"母鸡：" +"小鸡:"+Xiao);
							
						}
					}
				}
			}
		}
		
	}

}
