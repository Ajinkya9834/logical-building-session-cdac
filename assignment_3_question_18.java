import java.util.Scanner;

class Opt{
public static void main(String args[]){
		System.out.println("simple calculater");
		System.out.println("----------------");
		System.out.println("enter first number: ");
		Scanner opt = new Scanner(System.in);	
		int n1 = opt.nextInt();
		System.out.println("enter second number");
		int n2 = opt.nextInt();
		System.out.println("choose an operation");
		System.out.println("1. addition");
		System.out.println("2. subtraction");
		System.out.println("3. multiplication");
		System.out.println("4. division");
		System.out.print("enter your choice: ");
		int choice = opt.nextInt();
		
		switch(choice){
			
		default: System.out.println("choose correct operation ");break;
		
		case 1: int result = n1+n2; 
			System.out.println("Result"+n1+ " + "+n2+" = "+result);break;
		case 2: int r = n1-n1;
			System.out.println("Result"+n1+ " - "+n2+" = "+r); break;
		case 3: int R = n1*n2;
			System.out.println("Result"+n1+ " * "+n2+" = "+R);break;
		case 4: int res = n1/n2;
			System.out.println("Result"+n1+ " / "+n2+" = "+res);break;


		}

	}

}