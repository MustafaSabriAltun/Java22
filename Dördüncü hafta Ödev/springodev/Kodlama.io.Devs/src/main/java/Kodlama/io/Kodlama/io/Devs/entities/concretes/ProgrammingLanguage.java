package Kodlama.io.Kodlama.io.Devs.entities.concretes;

public class ProgrammingLanguage {
	
	private int id;
	private String programmingLanguage;
	private static int counter;
	
	public ProgrammingLanguage() {
		super();
	}

	public ProgrammingLanguage(int id, String programmingLanguage) {
		super();
		this.id = id;
		this.programmingLanguage = programmingLanguage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProgrammingLanguage() {
		return programmingLanguage;
	}

	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		ProgrammingLanguage.counter = counter;
	}
	
		
	
	
}
