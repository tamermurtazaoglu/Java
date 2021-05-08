package extraWork;

public class InstructorManager extends UserManager{
	
	public void giveHomework(Instructor instructor) {
		System.out.println(instructor.getFullname() + " added a homework.");
	}

}
