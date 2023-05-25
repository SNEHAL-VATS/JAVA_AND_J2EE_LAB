package lab9;

import java.util.HashMap;
import java.util.Scanner;

public class NumberThread implements Runnable {
	
	private HashMap<Integer,String> numberMap = new HashMap<>(); 
	
	public NumberThread() { 
	numberMap.put(1, "One"); 
	numberMap.put(2, "Two"); 
	numberMap.put(3, "Three"); 
	numberMap.put(4, "Four"); 
	numberMap.put(5, "Five"); 
	numberMap.put(6, "Six"); 
	numberMap.put(7, "Seven"); 
	numberMap.put(8, "Eight"); 
	numberMap.put(9, "Nine"); 
	numberMap.put(0, "Zero"); 
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter number with more than 4 digits: "); 
		String number = s.next(); 
		s.nextLine();
		if(number.length()<4) 
		{System.out.println("Error , 4 digit number not entered");
				}
		else {int i=0;
		for(char c : number.toCharArray()) { 
		if(c<48||c>57) { 
		System.out.println("Invalid inputs"); 
		break; 
		} 
		int digit = Integer.parseInt("" + number.charAt(i));
		String num_in = numberMap.get(digit);
		System.out.println(digit+" : "+num_in); 
		i++;
		} }
		System.out.print("\n"); 
		
	}
	

}
