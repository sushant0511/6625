package collection;

import java.util.LinkedList;
import java.util.List;

public class SortTestUsingCollection {

	public static void main(String[] args) {
		List< Integer> list=new LinkedList<Integer>();
		
		
		list.add(22);
		list.add(33);
		list.add(11);
		list.add(44);
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
			
		}
		
		for(int j=0;j<size;j++)
		{
			System.out.println(a[j]);
		}

	}

}
