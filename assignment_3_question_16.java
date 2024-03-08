import java.util.Scanner;

class Prime{

public static void main(String prim[]){
		Scanner prime = new Scanner(System.in);
		System.out.println("enter +ve number to check prime or not: ");
		int no = prime.nextInt();
		int flag= 0;
		for(int i=2; i<=no/2;i++){
			if(no % i == 0){
				System.out.println("not prime");
				flag=1;
				break;
			}
		}
		if (flag==0){ System.out.println("prime");}
		
		
	}
}