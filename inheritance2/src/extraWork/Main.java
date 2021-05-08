package extraWork;

public class Main {

	public static void main(String[] args) {
		
		Student tamer = new Student(1,"Tamer Murtazaoglu","avatar.png","contact@tamerm.com","1234","Sakarya University");
		Instructor engin = new Instructor(1, "Engin Demirog", "avatar_engin.png", "demo@demo.com", "4321", "Instructor of instructor");

		UserManager userManager = new UserManager();
		userManager.register(tamer);
		userManager.register(engin);
		
		System.out.println("-----------------");
		
		User[] users = {tamer,engin};
		userManager.registerMultiply(users);
		
		userManager.login(tamer);
		userManager.logout(tamer);
		
		
		System.out.println("-----------------");

		Course java = new Course(1,"Java/React Camp");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(engin, java);
		
		StudentManager studentManager = new StudentManager();
		studentManager.buyCourse(tamer, java);
		
		System.out.println("-----------------");

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.giveHomework(engin);

		
		
		
	}

}
