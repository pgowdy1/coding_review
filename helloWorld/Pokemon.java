package helloWorld;
import java.util.*;

public class Pokemon {
	private int hitPoints;
	private int energy;
	String name = "";
	
	public Pokemon() {
		
	}
	
	public Pokemon(String pokemonName, int hp, int eg) {
		this.name = pokemonName;
		this.hitPoints = hp; 
		this.energy = eg; 
	}
	
	public void setHitPoints(int hp) {
		hitPoints = hp; 
	}
	
	public int getHitPoints(){
		return hitPoints; 
	}
	
	public void setEnergy(int eg) {
		energy = eg; 
	}
	
	public int getEnergy(){
		return energy; 
	}
	
	public void setName(String nameChange) {
		name = nameChange; 
	}
	
	public String getName(){
		return name; 
	}
}
