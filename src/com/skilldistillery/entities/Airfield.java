package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Airfield {

	Scanner kb = new Scanner(System.in);

	private List<Jet> jets = new ArrayList<>();

	public Airfield() {
		this.jets = addJetsToList();
	}

	public List<Jet> addJetsToList() {

		List<Jet> localJets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {

			String line;
			while ((line = bufIn.readLine()) != null) {

				String[] pieces = line.split(",");
				String className = pieces[0];
				String jetName = pieces[1];
				String jetSpeed = pieces[2];
				String jetRange = pieces[3];
				String jetPrice = pieces[4];
				double jetSpeedDub = Double.parseDouble(jetSpeed);
				int jetRangeInt = Integer.parseInt(jetRange);
				long jetPriceLong = Long.parseLong(jetPrice);
				if (className.equals("CargoPlane")) {
					Jet cp = new CargoPlane(jetName, jetSpeedDub, jetRangeInt, jetPriceLong);
					localJets.add(cp);
				} else if (className.equals("FighterJet")) {
					Jet fj = new FighterJet(jetName, jetSpeedDub, jetRangeInt, jetPriceLong);
					localJets.add(fj);
				} else if (className.equals("PassengerPlane")) {
					Jet pp = new PassengerPlane(jetName, jetSpeedDub, jetRangeInt, jetPriceLong);
					localJets.add(pp);
				} else if (className.equals("Cesna")) {
					Jet cs = new Cesna(jetName, jetSpeedDub, jetRangeInt, jetPriceLong);
					localJets.add(cs);
				} else if (className.equals("SpaceXJet")) {
					Jet spx = new SpaceXJet(jetName, jetSpeedDub, jetRangeInt, jetPriceLong);
					localJets.add(spx);
				} else {
					System.out.println("did not compute plane");
				}

			}
		} catch (IOException e) {
			System.err.println(e);
		}

		return localJets;
	}

	public void listFleet() {

		for (Jet jet : jets) {
			jet.listJetDetails();
		}

	}

	public void flyAllJets() {

		for (Jet jet : jets) {
			jet.fly();
		}

	}

	public void viewFastestJet() {

		Jet fastest = jets.get(0);
		double topSpeed = 0;
		for (Jet jet : jets) {
			if (jet.getSpeed() > topSpeed) {
				topSpeed = jet.getSpeed();
				fastest = jet;
			}
		}
		fastest.listJetDetails();

	}

	public void viewLongestRangeJet() {

		Jet rangiest = jets.get(0);
		int topRange = 0;
		for (Jet jet : jets) {
			if (jet.getRange() > topRange) {
				topRange = jet.getRange();
				rangiest = jet;
			}
		}
		rangiest.listJetDetails();

	}

	public void loadAllCargoPlanes() {

		for (Jet jet : jets) {

			if (jet.getClass().getName().contains("CargoPlane")) {

				((CargoPlane) jet).loadCargo();
			}
		}

	}

	public void dogFight() {

		for (Jet jet : jets) {

			if (jet.getClass().getName().contains("FighterJet")) {

				((FighterJet) jet).fight();
			}
		}

	}

	public void addJetToFleet() {
		// This method will allow user to write to the jets.txt file in order to add
		// Jets to the list.
		System.out.println("Please enter a jet model name:");
		String model = kb.nextLine();
		System.out.println("Please enter your jet's top speed:");
		double topSpeed = kb.nextDouble();
		System.out.println("Please enter the max range of your jet:");
		int maxRange = kb.nextInt();
		kb.nextLine();
		System.out.println("Please enter the price of your jet:");
		long price = kb.nextLong();
		kb.nextLine();
		
		Jet localJet = new JetImpl(model,topSpeed,maxRange,price);
		jets.add(localJet);

	}

	public void removeJetFromFleet() {
		// This code will remove a jet from the fleet based off of user inputs, very
		// unsure how to proceed here.

		for (int i = 0; i < jets.size(); i++) {
			System.out.println((i + 1) + ": " + jets.get(i).getModel());
		}

		System.out.println("Enter the number of the jet you would like to delete. Or enter 0 to exit.");
		int userInput = kb.nextInt();
		if (userInput != 0) {
			jets.remove(userInput - 1);
		}

	

	}
}
