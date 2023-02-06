package com.neotech.review01;

public class SwitchWithMissingBreaks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int  number = 4;
		
		switch (number) {
		
		case 2:
			System.out.println("2");
			
		case 3 :
			System.out.println("3");
			break;
		case 4:
			System.out.println("4");
		case 5 :
			System.out.println("5");
		case 6 :
			System.out.println("6");
			
			
			
			
			
			//Limitations of switch
			//1.You cannot duplicate cases
			//2.You should be careful breaks
			
			//3.You cannot use logical operators like in if-else
			//You canNOT use double
			
		}
		
		
		
		
		
	}

}
