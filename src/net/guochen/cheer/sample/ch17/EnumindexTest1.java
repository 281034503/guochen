package net.guochen.cheer.sample.ch17;

public class EnumindexTest1 {
	enum Constants2{   //������������ö��������
		Constants_A("����ö�ٳ�ԱA"),    //�����������ö�����ͳ�Ա
		Constants_B("����ö�ٳ�ԱB"),
		Constants_C("����ö�ٳ�ԱC"),
		Constants_D("3");
		private String description;
		private int i=4;
		private Constants2(){
			
		}
		//�������ΪString�͵Ĺ��췽��
		private Constants2(String description){
			this.description=description;
			
		}
		private Constants2(int i){   //�������Ϊint�͵Ĺ��췽��
			this.i=this.i+i;
			
		}
		public String getDescription(){    //��ȡdescription��ֵ
			return description;
			
		}
		public int getl(){    //��ȡi��ֵ
			return i;
			
		}
	}
	public static void main(String []args){
		for(int i=0;i<Constants2.values().length;i++){
			System.out.println(Constants2.values()[i]+"����getDescription()����Ϊ:"
					+Constants2.values()[i].getDescription());
		}
		System.out.println(Constants2.valueOf("Constants_D")+"����getl()����Ϊ:"
					+Constants2.valueOf("Constants_D").getl());
	}

}
