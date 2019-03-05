package mysqldemo;
import java.sql.*;
public class StudentDatabase {
	
	private Connection con=null;
	
	public StudentDatabase() {
		System.out.println("operations on student database");
	}
	public void toConnect() {
		String url="jdbc:mysql://localhost:3306/studentinformation";
		String user="root";
		String password="Surya@1997";
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	    con=DriverManager.getConnection(url,user,password);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public Student queryData(int id) {
	
		String query="SELECT * from student where Id="+id;
		Student student=null;
		try {
		

		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		student=new Student(rs.getInt("Id"),rs.getString("Name"),rs.getInt("Marks"),rs.getString(4) );
	
		st.close();
		con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return student;
	
		
	}
	
	public void addData(Student student) {
		String query="INSERT INTO student VALUES(?,?,?,?)";
		try {
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1,student.getStudentId());
		pst.setString(2,student.getStudentName());
		pst.setInt(3,student.getMarks());
		pst.setString(4, student.getGrade());
		pst.execute();
		pst.close();
		con.close();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void removeData(int id) {
		String query="DELETE FROM student where Id="+id;
       try
       {
    	   PreparedStatement pst=con.prepareStatement(query);
    	   pst.execute();
    	   pst.close();
    	   con.close();
       }catch(Exception e) {
    	   System.out.print(e.getMessage());
       }
	}
	
	
	}



