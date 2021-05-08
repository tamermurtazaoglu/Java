package extraWork;

public class User {
	
	private int id;
	private String fullname;
	private String avatar;
	private String email;
	private String password;
	
	public User(int id, String fullname, String avatar, String email, String password) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.avatar = avatar;
		this.email = email;
		this.password = password;
	}
	
	public User() {
		
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}
	
}
