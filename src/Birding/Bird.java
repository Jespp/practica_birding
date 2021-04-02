package Birding;

public class Bird {
	String name;
	String latinName;
	int timesObserved;
	
	
	public Bird(String name, String latinName) {
		this.name = name;
		this.latinName = latinName;
		this.timesObserved=0;
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
	
	
	@Override
	public String toString() {
		return name + " (" + latinName + "): " + timesObserved + " observations";
	}
	
}
