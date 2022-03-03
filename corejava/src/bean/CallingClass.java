package bean;

public class CallingClass {

	public static void main(String[] args) {
		Learner learner=new Learner();//multiple
		learner.setId(1);
		learner.setName("Rahul"); // break 
		learner.setAddress("Delhi");
		
		System.out.println(learner.getId()+"  "+learner.getName()+"  "+learner.getAddress());
	
		learner.setId(2);
		learner.setName("Shreyas");
		learner.setAddress("Mumbai");
		
		System.out.println(learner.getId()+"  "+learner.getName()+"  "+learner.getAddress());
	
	}

}
