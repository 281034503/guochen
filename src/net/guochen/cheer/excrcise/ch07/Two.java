package net.guochen.cheer.excrcise.ch07;

public class Two {
	private float height;   //����Ȩ�޷�
	private float width;
	public Two(float height,float width){    //���췽��
		this.height=height;     //���ó�Ա����
		this.width=width;
	}
	public float square(){
		return height*width;
	}
	public static void main(String args[]){
		Two a=new Two(3.5f,4.5f);
		System.out.println(a.square());
	}
	

}
