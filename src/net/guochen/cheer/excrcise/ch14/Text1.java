package net.guochen.cheer.excrcise.ch14;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Text1 {
	public static void main(String [] args) {
		Set<String>set=new HashSet<>();
		set.add("a");
		set.add("c");
		set.add("A");
		set.add("a");
		set.add("C");
		List<String>list=new ArrayList<>();
		list.add("a");
		list.add("c");
		list.add("A");
		list.add("a");
		list.add("C");
		System.out.println(set);
		System.out.println(list);
		
	}

}
