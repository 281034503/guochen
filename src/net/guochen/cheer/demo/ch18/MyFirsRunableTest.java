package net.guochen.cheer.demo.ch18;

public class MyFirsRunableTest {
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			new Thread(new MyFirstRunableTest()).start();
			
		}
	}

}

class MyFirstRunableTest implements Runnable{
	public void run(){
		try{
			Thread.sleep(1000);
			System.out.println("This is"+getClass().getName());
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}
