package net.guochen.cheer.excrcise.ch12;

public class MyException01 extends Exception{
	String message;
	public MyException01(String ErrorMessagr){
		message=ErrorMessagr;
	}
	public String getMessage(){
		return message;
	}

}
