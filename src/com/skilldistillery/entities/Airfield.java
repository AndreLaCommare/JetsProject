package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.HashSet;
import java.util.List;
//import java.util.Set;

public class Airfield {

	
	private List<Jet> jets = new ArrayList<>();

	public Airfield() {
		this.jets = addJetsToList();
	}


	public List<Jet> addJetsToList() {
		
		List<Jet> localJets = new ArrayList<>();
		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {

			String line;
			while ((line = bufIn.readLine()) != null) {
				System.out.println(line);
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
					Jet cp = new CargoPlane(jetName,jetSpeedDub,jetRangeInt,jetPriceLong);
					localJets.add(cp);
				}else if (className.equals("FighterJet")) {
					Jet fj = new FighterJet(jetName,jetSpeedDub,jetRangeInt,jetPriceLong);
					localJets.add(fj);
				}else if (className.equals("PassengerPlane")) {
					Jet pp = new PassengerPlane(jetName,jetSpeedDub,jetRangeInt,jetPriceLong);
					localJets.add(pp);
				}else if (className.equals("Cesna")) {
					Jet cs = new Cesna(jetName,jetSpeedDub,jetRangeInt,jetPriceLong);
					localJets.add(cs);
				}else if (className.equals("SpaceXJet")) {
					Jet spx = new SpaceXJet(jetName,jetSpeedDub,jetRangeInt,jetPriceLong);
					localJets.add(spx);
				}
				
				

			}
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println(localJets);
		return localJets;
	}

	public void listFleet() {
		// This code will list all jets in fleet by model, spe1ed, range, and price

	}

	public void flyAllJets() {
		// this code will execute the fly method of each individual jet
		
	}

	public void viewFastestJet() {
		// this code will iterate through the jets list, isolate the individual speeds
		// of each jet and print
		// the jet object with the highest individual speed.
	}

	public void viewLongestRangeJet() {
		// this code will iterate through the jets list, isolate individual ranges of
		// each jet and print
		// the jet object with the highest individual range.

	}

	public void loadAllCargoPlanes() {
		// this method will isolate all planes of Cargo type in jets list and execute
		// each and all of their specific load() methods.

	}

	public void dogFight() {
		// this method makes all fighter jets call each and all of their Combat Ready
		// methods?

	}

	public void addJetToFleet() {
		// This method will allow user to write to the jets.txt file in order to add
		// Jets to the list.

	}

	public void removeJetFromFleet() {
		// This code will remove a jet from the fleet based off of user inputs, very
		// unsure how to proceed here.

	}
}
