import java.util.Scanner;

class Table{

	public static void main(String args[]){
		Scanner tb = new Scanner(System.in); // System.in is std input stream
		System.out.println("enter upto what table want to print: ");
		int table = tb.nextInt();		//getting int value from user 
		
		for (int i=1; i<=10; i++){
			for(int j=2; j<=table; j++){
				int v = j*i;
				System.out.print(v+" ");
			}
			System.out.println();
		}
	}


}