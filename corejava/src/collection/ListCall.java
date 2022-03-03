 package collection;

import java.util.*;
public class ListCall {
	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList();
		list.add(22);
		list.add(11);
		list.add(34);
		list.add(17);
		list.add(9);
		int size=list.size();
		int i=0;
		int a[]=new int[size];
		for(Integer x:list)
		{
			a[i]=x;
			i++;
		}
		int saquib=0;
		for(int j=0;j<size;j++)
		{
			for(int k=0;k<size-1;k++)
			{
				if(a[k]>a[k+1])
				{
					saquib=a[k];
					a[k]=a[k+1];
					a[k+1]=saquib;
					
				}
			}
			System.out.println(a[j]);
		}
		
		
//		List list=new ArrayList();
//		list.add(1);3
//		list.add("Java");
//		list.add("JSP");
//		list.add("Spring");
//		
//		System.out.println(list);
		

	}

}
