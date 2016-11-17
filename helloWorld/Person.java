package helloWorld;

public class Person {
	
	private String name;
	private String number; 
	
	public Person() {
		this.name = ""; 
		this.number = ""; 
	}
	
	public Person(String cName, String cNumber) {
		this.name = cName; 
		this.number = cNumber; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getNumber() {
		return this.number; 
	}

	public void changeNumber(String newNumber) {
		this.number = newNumber; 
	}
	
	public String toString() {
		return this.name + "  number: " + this.number; 
	}
	
	
}
