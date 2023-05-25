package lab9;

import java.util.ArrayList;
import java.util.Scanner;

public class VowelThread implements Runnable {
	
	public void run() {
		Scanner s = new Scanner(System.in); 
		System.out.println("Enter a sentence "); 
		String word = s.nextLine().toLowerCase(); 
		int a=0, e=0,i=0,o=0,u=0;
		for(char c:word.toCharArray())
		{ switch(c) {
		case 'a': a++; break;
		case 'e':e++; break;
		case 'i':i++; break;
		case 'o':o++; break;
		case 'u':u++; break;
		default: break;
		}
		}
		if(a>0)System.out.println("a/A :"+a);
		if(e>0)System.out.println("e/E :"+e);
		if(i>0)System.out.println("i/I :"+i);
		if(o>0)System.out.println("o/O :"+o);
		if(u>0)System.out.println("u/U :"+u);
					}
				
	}
