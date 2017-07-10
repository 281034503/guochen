package net.guochen.cheer.sample.ch17;
import static java.lang.System.*;

	interface d {
		public String getDescription();

		public int getl();
	}

	public enum AnyEnum  implements d {
		
		Constants_A{   //可以在枚举类型成员内部设置方法
			public String geyDescription(){
				return("我是枚举成员A");
				
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
				return("我是枚举成员B");
				
			}
			public int getl(){
				return i;
			}
		},
	   Constants_C{
			public String getDescription(){
				return("我是枚举成员C");
				
			}
			public int getl(){
				return i;
			
		}
	},
	   
	   Constants_D{
		public String getDescription(){
			return("我是枚举成员D");
			
		}
		public int getl(){
			return i;
		}  

};
		private static int i=5;
		public static void main(String[]args){
			for(int i=0;i<AnyEnum.values().length;i++){
			System.out.println(AnyEnum.values()[i]+"调用getDescription()方法为:"
					+AnyEnum.values()[i].getDescription());
			System.out.println(AnyEnum.values()[i]+"调用getl()方法为:"
					+AnyEnum.values()[i].getl());
			}
		}
}
