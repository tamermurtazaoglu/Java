package extraWork;

public class StudentManager extends UserManager{

	public void getInfo(Student student) {
		System.out.println("Full name: " + student.getFullname());
		System.out.println("E-mail: " + student.getEmail());
		System.out.println("University: " + student.getUniversity());
	}
	
	public void buyCourse(Student student, Course course) {
		System.out.println(student.getFullname() + " buyed a course: " + course.getName());
	}
	
}
