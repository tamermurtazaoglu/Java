package extraWork;

public class Main {

	public static void main(String[] args) {
		
		// I created "course, course manager, category and instructor classes" and some methods as in kodlama.io
		Course course1 = new Course(1, "C#/Angular Camp", "Software development camp", "Engin Demiroð", 0);
		Course course2 = new Course(2, "Java/React Camp", "Software development camp", "Engin Demiroð", 0);
		
		Instructor instructor = new Instructor(1,"Engin Demiroð");
		
		Category category = new Category(1, "Software Development Course");
		
		Course[] courses = { course1, course2 };
		
		CourseManager courseManager = new CourseManager();
		
		
		System.out.println("--- All Courses (Detailed) ---\n");
		for (Course course : courses) {
			courseManager.listCourseDetails(course);
			System.out.println();
		}
		
		System.out.println("\n--- All Courses (Name and Prices) ---\n");

		
		for (Course course : courses) {
			courseManager.getPriceWithName(course);
			System.out.println();
		}
		
		System.out.println("\n--- Course Registration ---\n");
		
		courseManager.registerCourse(course2);
		
	}
	
}

