package studentdriver;

import java.util.List;
import java.util.Scanner;

import entity.Student;
import servicestudentdemo.Studentservice;
import java.util.Scanner;

public class StudentDriver {
public static void main(String[] args) {
	Studentservice service=new Studentservice();
	boolean flag=true;
	while(flag) {
	System.out.println("Welcome to Student Menu");
	System.out.println("1-Add student data");
	System.out.println("2-Update student data");
	System.out.println("3-Fetch student data");
	System.out.println("4-Delete student data");
	System.out.println("5-Close student data");
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch (choice) {
	case 1:
		int res=service.save();
		if(res!=0)
		{
			System.out.println("Data Saved");
		}
		break;
	case 2:
		  int updateRes = service.update();
		    if (updateRes != 0) {
		        System.out.println("Student data updated successfully");
		    } else {
		        System.out.println("Update failed or ID not found");
		    }
		    break;
		
	case 3:
		List<Student> list=service.fetcall();
		if(list!=null)
		{
			for(Student students : list)
			{
				System.out.println(students);
			}
		}
		break;

	case 4:
		 int deleteRes = service.delete();
		    if (deleteRes != 0) {
		        System.out.println("Student deleted successfully");
		    } else {
		        System.out.println("Delete failed or ID not found");
		    }
		    break;
	case 5:
		service.exit();
		sc.close();
		flag=false;
		
		break;

	default:
		System.out.println("Invalid Input try again");
		break;
	}
}
}}
