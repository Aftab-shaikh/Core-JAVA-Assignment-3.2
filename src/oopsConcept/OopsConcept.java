package oopsConcept;

public class OopsConcept {

public static void main(String[] args) {
	
	@SuppressWarnings("unused")
	Student3 st=new Student3("aftab", 453,45); // obj of child class
		
}

}

class Student2 {

	String studentName; // instance Variable
	int studentID;      // instance Variable
	
	public Student2(String studentName, int studentID) {
		this.studentName =studentName; // this keyword use to refer instance variable
		this.studentID=studentID;
	}
	
	public void printStudentDetails() {
		System.out.println(studentName);
		System.out.println(studentID);
	}
}


class Student3 extends Student2{
	
	int studentRollNumber; // instance variable of child class
	
	public Student3(String StudentName, int StudentID, int studentRollNumber) {
       super(StudentName, StudentID); // Super keyword use to call parent call constructor
       super.printStudentDetails(); // super keyword to call parent call method
       this.studentRollNumber=studentRollNumber; // child class instance variable referred
	   this.printRollNumber();  // this keyword called child class method
	}
	
	public void printRollNumber() {
		System.out.println(studentRollNumber);
	}	
		
}
