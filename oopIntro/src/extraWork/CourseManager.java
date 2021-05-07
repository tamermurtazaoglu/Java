package extraWork;

public class CourseManager {
	public CourseManager() {
		
	}
	
	void listCourseDetails(Course course) {
		System.out.println("Course name: " + course.name);
		System.out.println("Course details: " + course.detail);
		System.out.println("Instructor: " + course.instructor);
		System.out.println("Price: " + course.price + " TRY");
	}
	
	void getPriceWithName(Course course) {
		System.out.println("Course name: " + course.name + " | Price: " + course.price + " TRY");
	}
	
	void registerCourse(Course course) {
		System.out.println("Registration succeed: " + course.name);
	}
}
