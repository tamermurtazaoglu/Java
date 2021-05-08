package extraWork;

public class Instructor extends User {

	private String about;

	public Instructor(int id, String fullname, String avatar, String email, String password, String about) {
		super(id, fullname, avatar, email, password);
		this.about = about;
	}
	
	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

}
