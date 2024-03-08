class Person{

	int age;
 	float height, weight;
	
	//constructor to initialize age
	Person(int Age){
		age = Age;
	}

	//constructor to initialize weight and height
	Person(float Height, float Weight){
		height = Height;
		weight = Weight;
	}
	
	void display(){
		System.out.println(age+" " +height+" "+weight);
	}
	public static void main (String args[]){

		Person attr1 = new Person(22);
		Person attr2 = new Person(5.6f, 55.0f);
	
		attr1.display();
		attr2.display();

	}

}