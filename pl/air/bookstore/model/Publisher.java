package pl.air.bookstore.model;

public class Publisher {
	
	private String name;
	private String location;

	
	// ********** Constructors **********
	public Publisher() {
	}
	public Publisher(String name) {
		this.name = name;
	}


	// ********** Business methods **********
	public String getFullName() {
		String fullName = name;
		if (location != null) {
			fullName += ", " + location;
		}
		return fullName;

		// wersja skrócoa
		//return name + (location != null ? " , " + location : "");
	}

	
	// ********** Getters & Setters **********
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
