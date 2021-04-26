package hmw1;

public class Course {
	int cId;
	String courseName;
	String detail;
	User lecturer;
	
	Course(int cId, String courseName, String detail, User lecturer){
		this.cId = cId;
		this.courseName = courseName;
		this.detail = detail;
		this.lecturer = lecturer;
	}
}
