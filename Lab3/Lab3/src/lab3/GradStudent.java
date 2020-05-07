package lab3;

public class GradStudent extends Student {
	
	private int numOfExams;
	private String ExamGrades [];
	private String ExamNames [];
	private int numCommittee;
	private int MaxExam = 6;
	
	public GradStudent(String name, String address, int idNum){
		
		super(name, address, idNum);
		
		numOfExams = 0;
		ExamGrades = new String[MaxExam];
		ExamNames = new String[MaxExam];
				
	}
	
	public int getCommitteeNum() {
        return numCommittee;
    }
	
	public void setCommitteeNum(int i) {
        this.numCommittee = i;
    }
	
	public void addGrade(String CourseCode, String Grade) {
        ExamNames[numOfExams] = CourseCode;
        ExamGrades[numOfExams++] = Grade;
    }
	
	public String toString() {
        return "Grad Student: "+super.toString()+"\n";
    }
	
	public void printExamGrades() {
        for(int i=0; i<numOfExams;i++) {
            System.out.println("Exam Name:"+ExamNames[i]+"\nGrade:"+ExamGrades[i]+"\n");
        }
        
	}
	
	public static void main (String[] args) {
		Person p1 = new Person("Julia","181 University Ave.", 121456 );
        System.out.println(p1.toString());
        Student s1 = new Student("John", "189 University Ave", 246718 );
        s1.addGrade("ELEC 279", 97);
        s1.addGrade("ElEC 221", 68);
        System.out.println(s1.toString());
        s1.printGrades();	
        GradStudent s2 = new GradStudent("Tom","92 Reg st.", 1014);
        s2.addGrade("ELEC_279", 97);
        s2.addGrade("ELEC_271", 88);
        s2.addGrade("CompI", "PASS");
        s2.addGrade("COMPII", "PASS");
        s2.addGrade("Thesis defense first trial", "FAIL");
        s2.addGrade("Thesis defense second trial", "FAIL");
        s2.printExamGrades();
        s2.printExamGrades();
        }
}
