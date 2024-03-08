class Student{

	String student_name;
	int  SM1;
	int SM2;
	int SM3;

	// constructor to assign marks 
	Student(){
		student_name = "Ajinkya";
		SM1 = 89;
		SM2 = 99;
		SM3 = 90;
	}

	//compute average marks of students
	float average(){
		float SM = (SM1 + SM2 + SM3)/3;
		return SM;
	}

	//display student's name and marks
	void display(float avg){
		System.out.println("student name = "+student_name);
		System.out.println("Student's total average = "+avg);
	}

	public static void main(String args[]){
		
		Student mark = new Student();
		
		float avg = mark.average();
		
		mark.display(avg);
	}
}