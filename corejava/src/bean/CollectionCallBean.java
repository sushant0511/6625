package bean;

import java.util.LinkedList;
import java.util.List;

public class CollectionCallBean {

	public static void main(String[] args) {
		List<Learner> list=new LinkedList<Learner>();
		
		
		Learner learner=new Learner();
		learner.setId(1);
		learner.setName("Shreyas");
		learner.setAddress("Mumbai");
		
		
		list.add(learner);
		
		for(Learner xyz:list)
		{
			System.out.println(xyz.getName());
		}

	}

}
