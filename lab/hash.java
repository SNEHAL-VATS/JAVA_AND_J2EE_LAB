package lab;

import java.util.*;
public class hash {
	public static void main(String args[]){
		ArrayList<collects> mcall = new ArrayList<collects>();
		String name;
		Long number;
		Scanner sc = new Scanner (System.in);
		int choice;
		while(true)
		{ 
			System.out.println("MENU:\n1. Insert missed call\n2. Display the missedcall\n3. Delete the mis sed call\n4. Exit\n ");
			choice = sc.nextInt();
			if(choice == 1)
				{ System.out.println("Enter the name : ");
				name = sc.next();
				System.out.println("Enter the number : ");
				number = sc.nextLong();
				if (name==null) {
					name="Private Caller";
				}
				collects s = new collects(name, number);
				mcall.add(s);
				}
			else if(choice ==2)
				{ System.out.println(mcall);
				}
			else if(choice==3)
				{ System.out.println("Enter the number to be deleted");
				Long num = sc.nextLong();
				Iterator<collects> it = mcall.iterator();
				ArrayList<collects> arrlist2 = (ArrayList) mcall.clone();
				while(it.hasNext())
					{
					collects m = it.next();
					
				
					if((num).equals(m.phone)) {
						//System.out.println(m.phone);
						arrlist2.remove(m);}
				}
				mcall=(ArrayList)arrlist2.clone();
				}
			else
			{ break;
			}
		}
}
}