package mysqldemo;

import java.util.Scanner;

//import java.sql.*;
//import java.sql.Driver;
public class Main {

	public static void main(String[] args) throws Exception {
	
		
//		String url="jdbc:mysql://localhost:3306/world";
//		String user="root";
//		String password="Surya@1997";
//		String query="SELECT * FROM country";
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con=DriverManager.getConnection(url,user,password);
//		Statement st=con.createStatement();
//	    ResultSet rs=st.executeQuery(query);
//	    while(rs.next()) {
//	    	String continent=rs.getString("Continent")+rs.getInt("IndepYear");
//	    	System.out.println(continent);
//	    }
//st.close();
//con.close();
		
		StudentDatabase studentdatabase=new StudentDatabase();
    	studentdatabase.toConnect();
		//Student student=studentdatabase.queryData(2);
		//System.out.println(student.getStudentId()+" "+student.getStudentName()+" "+student.getMarks()+" "+student.getGrade());
//		Scanner scanner=new Scanner(System.in);
//		int id=scanner.nextInt();
//		String name=scanner.next();
//		int marks=scanner.nextInt();
//		String grade=scanner.next();
//		Student student1=new Student(id,name,marks,grade);
//	 studentdatabase.addData(student1);
    	studentdatabase.removeData(5);
    	
		
		
		
	}

}