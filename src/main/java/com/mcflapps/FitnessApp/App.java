package com.mcflapps.FitnessApp;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App {
	
	public static Scanner input;
	public static Build build;

	public static Workouts workout = new Workouts();
	public static Tracker tracker = new Tracker();

	public static void main(String[] args) {
		
		System.out.println("Hello World");
		
		Alien a = new Alien();
		a.setAid(1);
		a.setAname("mike");
		a.setAcolor("green");
		
		Employee mike = new Employee();
		mike.setId(2);
		mike.setAge(31);
		mike.setName("Cameron");
		
		//Hibernate setup
				Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Alien.class); 	
				
				ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
						SessionFactory sf = con.buildSessionFactory(reg);
				
				Session session = sf.openSession();
				
				Transaction tx = session.beginTransaction();
				session.save(mike);
				session.save(a);
				
				tx.commit();
	}
}
//		input = new Scanner(System.in);
//
//		Boolean menu = true;
//		Database db = new Database();
//		Database.connection();
//
//			System.out.println("============ Body Beast Tracking App ===============");
//			System.out.println("Choose Your Tier!");
//			System.out.println("1. Build ");
//			System.out.println("2. Bulk ");
//			System.out.println("3. Beast ");
//			System.out.println("4. View Your Progess");
//
//			String choice = input.nextLine();
//
//			switch (choice) {
//			case "1":
//				System.out.println("================ Build Workouts ====================");
//				getBuildWorkouts();
//				// Display Build work outs
//				break;
//
//			case "2":
//				System.out.println("Get Data");
//		
//				// Display Bulk work outs
//				break;
//
//			case "3":
//				System.out.println("Beast Workouts");
//				// Display Bulk work outs
//				break;
//			case "4":
//				System.out.println("Your Progress");
//				getAllData();
//
//			}
//		}
//	
//
//	public static void getBuildWorkouts() {
//
//		System.out.println("Make a choice:");
//
//		// Create menu of Build work outs
//		boolean run = true;
//		String userInput = null;
//		while (run) {
//			System.out.println("Pick today's workout!");
//			System.out.println("1. Build Chest/Tris");
//			System.out.println("2. Build Legs");
//			System.out.println("3. Build Back & Bis");
//			System.out.println("4. Build Shoulders");
//			userInput = input.nextLine();
//
//			switch (userInput) {
//			case "1":
//				startChestTris();
//				break;
//			}
//			run = false;
//		}
//
//	}
//
//	public static void startChestTris() {
//
//		for (int i = 0; i < workout.buildChestTris.size(); i++) {
////		
//			System.out.println(workout.buildChestTris.get(i));
//			System.out.println("Light: ");
//			String setOne = input.nextLine();
//			int repsOne = Integer.parseInt(setOne);
//			System.out.println("Medium: ");
//			String setTwo = input.nextLine();
//			int repsTwo = Integer.parseInt(setTwo);
//			System.out.println("Heavy: ");
//			String setThree = input.nextLine();
//			int repsThree = Integer.parseInt(setThree);
//			build = new Build(workout.buildChestTris.get(i).getWorkout(), workout.buildChestTris.get(i).getTitle(),
//					repsOne, repsTwo, repsThree);
//			tracker.workoutTracker.add(build);
//		}
//
//	}
//
//	public static void getAllData() {
//
//		for (int i = 0; i < tracker.workoutTracker.size(); i++) {
//			System.out.println(tracker.workoutTracker.get(i));
//		}
//
//	}
//}
