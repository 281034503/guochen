package net.guochen.cheer.demo.ch11;

public class FinalTest {
	private  final static String value="abc";
	
	public static void main(String[] agrs){
		
		FinalDemo finalDemo=new FinalDemo();
		finalDemo.setDemoValue("abc");
		System.out.println(finalDemo.getDemoValue());
		System.out.println(finalDemo);
		
	}
	
}

class FinalDemo{
	private String demoValue;
	
	public void setDemoValue(String demoValue){
		this.demoValue=demoValue;
	}
	public String getDemoValue(){
		return demoValue;
	}
}

class FinalDemoChild extends FinalDemo{

}
