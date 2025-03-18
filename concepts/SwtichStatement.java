package core.concepts;

import java.util.Scanner;

public class SwtichStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the character(a to z):");
		char c = in.next().charAt(0);
		//if statement
		/*if(c == 'a' ||c == 'e' ||c == 'i' ||c == 'o' |c == 'u' ||) {
			System.out.println(c+"is a vowel");
		}else {
			System.out.println(c+"is not a vowel");
		}*/
		
		
		//Switch Statement
		switch(c) {
		case 'a':{
			System.out.println(c+" is a vowel");
			break;
		}
		case 'e':{
			System.out.println(c+"eis a vowel");
			break;
		}
		case 'i':{
			System.out.println(c+" is a vowel");
			break;
		}
		case 'o':{
			System.out.println(c+"is a vowel");
			break;
		}
		case 'u':{
			System.out.println(c+"is a vowel");
			break;
		}
		default:
			System.out.println(c+"is a constant");
		
		
		}
	}

}
