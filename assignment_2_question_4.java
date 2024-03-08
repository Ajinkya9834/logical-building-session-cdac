class Vehicle{

	float price;
	String color;
	String model;

	Vehicle(float p, String c, String m ){
		
		price = p;
		color = c;
		model = m;
	}

	void display(){
		System.out.println("Price = "+price+ " color = "+color+ " model = "+model);

	}
	

	public static void main(String kk[]){

		Vehicle detail = new Vehicle(255000.00f, "white", "vs19");
	
		detail.display();

	

	}

}