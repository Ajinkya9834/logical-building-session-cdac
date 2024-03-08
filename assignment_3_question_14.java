import java.util.Scanner;

class Facto{

	
	public static void main(String fact[]){
		Scanner facto = new Scanner(System.in);
		System.out.println("enter factorial number: ");
		//asking for factorial number
		int no = facto.nextInt();
					int N = no-1;

		while(no != 0){
			
			no = no * N;
			N--;
			if(N==0){break;}
		}
		System.out.println(no);
	}

}