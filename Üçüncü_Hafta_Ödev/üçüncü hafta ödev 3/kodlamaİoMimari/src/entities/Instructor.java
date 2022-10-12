package entities;

public class Instructor {
	private int ıd;
	private String name;
	private String lastname;
	
	public Instructor(int id, String name, String lastname) {
		super();
		this.ıd = id;
		this.name = name;
		this.lastname = lastname;
	}

	public int getId() {
		return ıd;
	}

	public void setId(int id) {
		ıd = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
