package lab9;
import java.util.*;
/*public class InputThread {
public static void main(String args[]) {
	int ch;
	Scanner sc=new Scanner(System.in);
	while(true) {
		System.out.println("Number changer is 1\nVowel counter is 2\nExit is 3");
		ch=sc.nextInt();
		if (ch==1) {
			NumberThread nT = new NumberThread();
			Thread t1 = new Thread(nT);
			t1.start();
		}
		else if (ch==2) {
			VowelThread vT = new VowelThread();
			Thread t2 = new Thread(vT);
			t2.start();
		}
		else if( ch==3){
			System.exit(0);
		}
		else
			
			System.out.println("Wrong input");
		}
}
}*/
public class InputThread {
public static void main(String args[]) {
	NumberThread nT = new NumberThread();
	Thread t1 = new Thread(nT);
	t1.start();
	//VowelThread vT = new VowelThread();
	//Thread t2 = new Thread(vT);
	//t2.start();
}
}


