package net.guochen.cheer.sample.ch04;

public class Compound {
	public static void main(String[] arg){
		int x=20;
		{
			int y=40;
			System.out.println(y);
			int z=245;
			boolean b;
			{
				b=y>z;
				System.out.println(b);
				
			}
		}
		String word="hello java";
		System.out.println(word);
	}

}
