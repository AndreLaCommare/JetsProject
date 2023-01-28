package com.skilldistillery.entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Airfield {

	private List<Jet> jets = new ArrayList<>();

	public void showFastestJet() {

	}

	public void addJetsToList() {

		try (BufferedReader bufIn = new BufferedReader(new FileReader("jets.txt"))) {
			
			String line;
			while ((line = bufIn.readLine()) != null) {
				String[] pieces = line.split(",");
				
				
			}
		} catch (IOException e) {
			System.err.println(e);
		}
		System.out.println(jets);
	}
}
