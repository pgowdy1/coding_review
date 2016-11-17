package helloWorld;
import java.util.*;

public class Phonebook {
	
	ArrayList<Person> phoneBookArrayList = new ArrayList<Person>();  
	
	public Phonebook() {
		
	}
	
	public void add(String name, String number) {
		Person temp = new Person(name, number);
		phoneBookArrayList.add(temp); 
	}
	
	public void printAll() {
		int sizeOfArray = 0; 
		while(sizeOfArray < this.phoneBookArrayList.size()) {
			System.out.println(this.phoneBookArrayList.get(sizeOfArray));
			sizeOfArray++; 
		}
	}
	
	public String searchNumber(String name) {
		for(Person currentPerson : this.phoneBookArrayList) {
			if(currentPerson.getName().equals(name)) {
				return currentPerson.getNumber(); 
			}
		}
		
		return "Number not known"; 
	}
	
}
