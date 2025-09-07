package servicestudentdemo;

import java.sql.*;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;


import entity.Student;

public class Studentservice {
	private static String url = "jdbc:postgresql://localhost:5432/school";
	private static String user = "postgres";
	private static String password = "123";
	private static Connection connection;
	private static Scanner sc = new Scanner(System.in);
	static {
		System.out.println("Executed");
		try {
			Class.forName("org.postgresql.Driver");
			connection =DriverManager.getConnection(url, user, password);
			}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	public int save()
	{
		int res=0;
		System.out.println("Enter id");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter age");
		int age=sc.nextInt();
		String sql="INSERT into students values(?,?,?)";
		try {
			PreparedStatement pstm=connection.prepareStatement(sql);
			pstm.setInt(1, id);
			pstm.setString(2,name);
			pstm.setInt(3,age);
			res=pstm.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return res;
	}
	 // Update Student Data
    public int update() {
        int res = 0;
        System.out.println("Enter the student ID you want to update:");
        int id = sc.nextInt();

        System.out.println("Enter the new name:");
        String name = sc.next();

        System.out.println("Enter the new age:");
        int age = sc.nextInt();

        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setString(1, name);
            pstm.setInt(2, age);
            pstm.setInt(3, id);
            res = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    //Fetch
    public List<Student> fetcall()
    {
    	List<Student> list=new ArrayList<Student>();
    	String sql="SELECT * from students";
    	try {
    		Statement stm=connection.createStatement();
    		ResultSet resultSet=stm.executeQuery(sql);
    		while(resultSet.next())
    		{
    			list.add(new Student(resultSet.getInt(1),resultSet.getString(2),resultSet.getInt(3)));
    		}
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    	return list;
    }
    // Delete Student Data
    public int delete() {
        int res = 0;
        System.out.println("Enter the student ID you want to delete:");
        int id = sc.nextInt();

        String sql = "DELETE FROM students WHERE id = ?";
        try {
            PreparedStatement pstm = connection.prepareStatement(sql);
            pstm.setInt(1, id);
            res = pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return res;
    }
    //Exit
    public void exit()
    {
    	try {
    		connection.close();
    	}
    	catch(SQLException e)
    	{
    		e.printStackTrace();
    	}
    }
}
