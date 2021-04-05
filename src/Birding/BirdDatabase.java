package Birding;

import java.util.ArrayList;

public class BirdDatabase {
	ArrayList<Bird>birds;

	public BirdDatabase() {
		this.birds=new ArrayList<Bird>();
	}

	public ArrayList<Bird> getBirds() {
		return birds;
	}

	public void setBirds(ArrayList<Bird> birds) {
		this.birds = birds;
	}
	
	public boolean have(String name) {
		for (Bird b:this.birds) {
			if(b.name.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	public void addObservation(String name, String who) {
		for (Bird b:this.birds) {
			if(b.name.equals(name)) {
				b.increaseTimesObserved();
				b.addObserver(who);
			}
		}
	}
	
	public void getABird(String name) {
		for (Bird b:this.birds) {
			if(b.name.equals(name)) {
				System.out.println(b.toString());
			}
		}
	}
	
	public void showInfo() {
		for (Bird b:this.birds) {
			System.out.println(b.toString());
		}
	}

}
