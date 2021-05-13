package Entities;

public class Gamer {
	int id;
	String nickname;
	String firstName;
	String lastName;
	String email;
	String yearOfBirth;
	String nationalityNumber;
	
	public Gamer(int id, String nickname, String firstName, String lastName, String email, String yearOfBirth,
			String nationalityNumber) {
		super();
		this.id = id;
		this.nickname = nickname;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.yearOfBirth = yearOfBirth;
		this.nationalityNumber = nationalityNumber;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	public String getNationalityNumber() {
		return nationalityNumber;
	}
	public void setNationalityNumber(String nationalityNumber) {
		this.nationalityNumber = nationalityNumber;
	}

	
	
	
}
