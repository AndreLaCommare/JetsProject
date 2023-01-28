package com.skilldistillery.app;

import java.util.Scanner;
import com.skilldistillery.entities.Airfield;

public class JetsApp {

	private Airfield airF;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JetsApp jApp = new JetsApp();
		jApp.run();

	}

	private void run() {
		Scanner kb = new Scanner(System.in);
		String userInput = kb.nextLine();

		while (!(userInput.equals("9"))) {
			printMenu();
			userInput = kb.nextLine();
			switch (userInput) {
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				System.out.println("======= Goodbye =======");
				return;
			default:
				System.out.println("Invalid Input");
				break;
			}
		}
	}

	private void printMenu() {
		System.out.println("What would you like to do?");
		System.out.println("1.) List fleet ");
		System.out.println("2.) Fly all jets");
		System.out.println("3.) View fastest jet");
		System.out.println("4.) View jet with longest range");
		System.out.println("5.) Load all cargo jets");
		System.out.println("6.) Dogfight!");
		System.out.println("7.) Add a jet to the fleet");
		System.out.println("8.) Remove a jet from the fleet");
		System.out.println("9.) Quit");

	}

}
