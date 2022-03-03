
public class LoopVariable {

	public static void main(String[] args) {

		int i=0;
		int num=5;
		while(num>=1) //  8>1   4>1  2>1  1>=1   0.5>=1
		{
			i++;   // i=1   i=2  i=3
			num=num/1; //  8/2=4  4/2=2    2/2=1   1/2=0.5
			System.out.println(i);
		}
		

	}

}
