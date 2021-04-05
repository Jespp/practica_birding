package Birding;

import java.util.ArrayList;

public class Bird {
	String name;
	String latinName;
	int timesObserved;
	ArrayList<Person>observers;
	
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.timesObserved=0;
		this.observers=new ArrayList<Person>();
	}
	
	public Bird(String name) {
		this.name = name;
		this.timesObserved=0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public int getTimesObserved() {
		return timesObserved;
	}

	public void setTimesObserved(int timesObserved) {
		this.timesObserved = timesObserved;
	}
	
	public void increaseTimesObserved() {
		this.timesObserved++;
	}
	
	public void addObserver(String name) {
		if (!isObserver(name)) {
			this.observers.add(new Person(name));
		}
	}
	
	public String toStringObservers() {
		String birdsObservers="";
		for(Person obs : this.observers) {
			birdsObservers=birdsObservers+" "+obs.getName();
		}
		return birdsObservers;
	}
	
	public boolean isObserver(String name) {
		for (Person p:this.observers) {
			if(p.getName().equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return name + " (" + latinName + "): " + timesObserved + " observations for:"+toStringObservers();
	}
	
}
