package corejava;

import java.util.Scanner;

public class TestVowel {

	public static void main(String[] args) {

		char x;
		Scanner scanner=new Scanner(System.in);
		x=scanner.next().charAt(1);
	
		switch (x) {
		case 'a':
			System.out.println("Vowel");
			break;

		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:   // else block
			System.out.println("Not Vowel");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		if(x=='a')
		{
			System.out.println("Vowel");
		}
		
		else if(x=='e')
		{
			System.out.println("Vowel");
		}
		
		else if(x=='i')
		{
			System.out.println("Vowel");
		}
		
		else if(x=='o')
		{
			System.out.println("Vowel");
		}
		
		else if(x=='u')
		{
			System.out.println("Vowel");
		}
		
		else
		{
			System.out.println("Not Vowel");
		}
		*/

	}

}
