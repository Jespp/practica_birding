package Birding;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//new input item and new database
		Scanner scanner = new Scanner(System.in);
		BirdDatabase db = new BirdDatabase();
		
		//Program control
		while (true) {
			//ask an option and stores the response in command
			String command = ask(scanner, "?");
		 
			//for each command, select the thing to do
			if (command.equals("Quit")) {
				break;
			} else if (command.equals("Add")) {
				add(scanner,db);
			} else if (command.equals("Observation")) {
				observation(scanner,db);
			} else if (command.equals("Show")) {
				show(scanner,db);
			} else if (command.equals("Statistics")) {
				statistics(db);
			} else if (command.equals("Help")) {
				printOptions();
			} else {
				System.out.println("Unknown command!");
			}
		}
	}
	
	
		public static String ask(Scanner input, String option) {
			System.out.println(option);
			return input.nextLine();
		}
		
		public static void add(Scanner input, BirdDatabase db) {
			System.out.println("Name: ");
			String name= input.nextLine();
			if(db.have(name)) {
				System.out.println("This bird already exist in the DB");
			}else {
			System.out.println("Latin name:? ");
			String latinName= input.nextLine();
			db.birds.add(new Bird(name,latinName));
			}
		}
		
		public static void observation(Scanner input, BirdDatabase db) {
			System.out.println("What was observed:? ");
			String name= input.nextLine();
			if(!db.have(name)) {
				System.out.println("Is not a bird!");
			}else {
				System.out.println("Who:? ");
				String who= input.nextLine();
			db.addObservation(name, who);
			}
		}
		
		public static void show(Scanner input, BirdDatabase db) { 
			System.out.println("What? ");
			String name= input.nextLine();
			if(!db.have(name)) {
				System.out.println("There are no information about this bird");
			}else {
			db.getABird(name);
			}
		}
		
		public static void statistics(BirdDatabase db) { 
			db.showInfo();
		}
		
		public static void printOptions() { 
			System.out.println("*********  List of options  ***********\n");
			System.out.println("Add        to add a new bird");
			System.out.println("Show       to see the info about a bird");
			System.out.println("Statistics to see the info of all birds");
			System.out.println("Quit       to exit");
			System.out.println("Help       to see this help\n");
			System.out.println("****************************************");
		}

}

