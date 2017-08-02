package net.guochen.cheer.excrcise.ch14;

import java.util.LinkedList;

public class Text {
	public static void main(String [] args) {
		java.util.List<Integer>List=new LinkedList<>();
		for(int i=1;i<=100;i++) {
			List.add(new Integer(i));
		}
		List.remove(List.get(10));
		System.out.print("ok");
	}

}
