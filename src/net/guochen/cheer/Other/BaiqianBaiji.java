package net.guochen.cheer.Other;

public class BaiqianBaiji {
	public static void main(String[] args){
		int Gong, Mu, Xiao;
		for(Gong=1;Gong<=20;Gong++){
			for(Mu=1;Mu<=33;Mu++){
				for(Xiao=3;Xiao<=99;Xiao+=3){
					if (Gong*5+Mu*3+Xiao/3==100){    //���Ը��Ե��۵���һ�ٿ�Ǯ
						if(Gong+Mu+Xiao==100){   //һ��ֻ��
							System.out.println("������" +Gong+"ĸ����" +"С��:"+Xiao);
							
						}
					}
				}
			}
		}
		
	}

}
