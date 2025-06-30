   package day5;

import java.util.Scanner;

public class basicalculator {

public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your choice\t\t");
	int key=sc.nextInt();
	
	switch (key) {
	case 1: {
		System.out.println("first number\t\t");
		int b=sc.nextInt();
	
		System.out.println("Second number\t\t");
		int c=sc.nextInt();
	
		System.out.println("Additon"+(b+c));
	break;	
}
	case 2: {
		System.out.println("first number\t\t");
		int b=sc.nextInt();
	
		System.out.println("Second number\t\t");
		int c=sc.nextInt();
	
		System.out.println("Subracton"+(b-c));
		break;
}
	case 3: {
		System.out.println("first number\t\t");
		int b=sc.nextInt();
	
		System.out.println("Second number\t\t");
		int c=sc.nextInt();
	
		System.out.println("Multiplication"+(b*c));
		break;
}
	case 4: {
		System.out.println("first number\t\t");
		int b=sc.nextInt();
	
		System.out.println("Second number\t\t");
		int c=sc.nextInt();
	
		System.out.println("Division"+(b/c));
		break;
}
	default :{
		
		System.out.println("Enter crt choice\t\t");
		
	
	}

}
	
}
}
