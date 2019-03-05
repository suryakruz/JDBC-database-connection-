package mysqldemo;

public class Student {

   private int studentId;
   private String studentName;
   private int marks;
   private String grade;
   
  public Student(int studentId, String studentName, int marks, String grade) {
	super();
	this.studentId = studentId;
	this.studentName = studentName;
	this.marks = marks;
	this.grade = grade;
}

public int getStudentId() {
	return studentId;
}

public String getStudentName() {
	return studentName;
}

public int getMarks() {
	return marks;
}

public String getGrade() {
	return grade;
}
   
   
	
}
