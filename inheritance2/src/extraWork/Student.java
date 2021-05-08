package extraWork;

public class Student extends User{

	private String university;

	public Student(int id, String fullname, String avatar, String email, String password, String university) {
		super(id, fullname, avatar, email, password);
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}
	

	
}
