package lab3;

public class Student extends Person {
	
	private int numOfCourse;
	private int CourseGrade [];
	private String CourseCode []; 
	private final static int MaxCourse = 20;
	
	public Student(String name, String address, int idNum) {
		super(name, address, idNum);
		
		numOfCourse = 0;
		CourseGrade = new int [MaxCourse];
		CourseCode = new String [MaxCourse];	

	}
	
	public String toString() {
        return "Student: "+super.toString()+"\n";
    }
	
	public void addGrade(String CrsCode, int Grade) {
        CourseCode[numOfCourse] = CrsCode;
        CourseGrade [numOfCourse++] = Grade;
    }
	
	public void printGrades() {
        for(int i=0; i<numOfCourse;i++) {
            System.out.println("Course Code:"+CourseCode[i]+"\nGrade:"+CourseGrade[i]+"\n");
        }
    }
	
	public static void main(String[] args) {
        Person p1 = new Person("Julia","181 University Ave.", 121456 );
        System.out.println(p1.toString());
        Student s1 = new Student("John", "189 University Ave", 246718 );
        s1.addGrade("ELEC 279", 97);
        s1.addGrade("ElEC 221", 68);
        System.out.println(s1.toString());
        s1.printGrades();
    }
	
	
}
