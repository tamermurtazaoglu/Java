package extraWork;

public class CourseManager {
	
	public void addCourse(Instructor instructor, Course course) {
		System.out.println(instructor.getFullname() + " added new course: " + course.getName());
	}
	
}
