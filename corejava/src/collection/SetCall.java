package collection;

import java.util.HashSet;

import java.util.Set;
import java.util.TreeSet;

public class SetCall {

	public static void main(String[] args) {
		Set<Integer> set=new TreeSet<Integer>();
		set.add(22);
		set.add(11);
		set.add(34);
		set.add(17);
		set.add(9);
		set.add(22);
		for(Integer i:set)
		{
			System.out.println(i);
		}
		
		

	}

}
