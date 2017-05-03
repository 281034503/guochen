package net.guochen.cheer.excrcise.ch07;

public class Two {
	private float height;   //定义权限符
	private float width;
	public Two(float height,float width){    //构造方法
		this.height=height;     //引用成员变量
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
