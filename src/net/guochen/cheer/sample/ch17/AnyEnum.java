package net.guochen.cheer.sample.ch17;
import static java.lang.System.*;

	interface d {
		public String getDescription();

		public int getl();
	}

	public enum AnyEnum  implements d {
		
		Constants_A{   //������ö�����ͳ�Ա�ڲ����÷���
			public String geyDescription(){
				return("����ö�ٳ�ԱA");
				
			}
			public int getl(){
				return i;
				
			}
			@Override
			public String getDescription() {
				// TODO Auto-generated method stub
				return null;
			}
			
		},
	   Constants_B{
			public String getDescription(){
				return("����ö�ٳ�ԱB");
				
			}
			public int getl(){
				return i;
			}
		},
	   Constants_C{
			public String getDescription(){
				return("����ö�ٳ�ԱC");
				
			}
			public int getl(){
				return i;
			
		}
	},
	   
	   Constants_D{
		public String getDescription(){
			return("����ö�ٳ�ԱD");
			
		}
		public int getl(){
			return i;
		}  

};
		private static int i=5;
		public static void main(String[]args){
			for(int i=0;i<AnyEnum.values().length;i++){
			System.out.println(AnyEnum.values()[i]+"����getDescription()����Ϊ:"
					+AnyEnum.values()[i].getDescription());
			System.out.println(AnyEnum.values()[i]+"����getl()����Ϊ:"
					+AnyEnum.values()[i].getl());
			}
		}
}
