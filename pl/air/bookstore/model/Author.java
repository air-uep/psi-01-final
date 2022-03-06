package pl.air.bookstore.model;

public class Author {
	
	private String firstName;
	private String middleName;
	private String lastName;
	private int birth;
	private int death;

	
	// ********** Constructors **********
	public Author() {
	}
	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public Author(String firstName, String lastName, int birth, int death) {
		this(firstName, lastName);
		this.birth = birth;
		this.death = death;
	}


	// ********** Business methods **********
	public String getFullName() {
		String fullName = firstName;
		if (middleName !=  null) {
			fullName += " " + middleName;
		}
		fullName += " " + lastName;
		return fullName;

		// wersja skrócona
		//return firstName + (middleName != null ? " " + middleName : "") + " " + lastName;
	}

	
	// ********** Getters & Setters **********
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}

	public int getDeath() {
		return death;
	}
	public void setDeath(int death) {
		this.death = death;
	}

}
