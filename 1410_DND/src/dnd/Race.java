package dnd;

import java.util.ArrayList;

public class Race {
	private String raceName;
	private String ageRange;
	private int speed;
	private ArrayList<String> traits; 
	private ArrayList<String> skills;
	private ArrayList<String> laugnuage;
	//private Subrace subrase;
	private ArrayList<String> proficiencies;
	/**
	 * @param raceName
	 * @param ageRange
	 * @param speed
	 * @param traits
	 * @param skills
	 * @param laugnuage
	 * @param proficiencies
	 */
	public Race(String raceName, String ageRange, int speed, ArrayList<String> traits, ArrayList<String> skills,
			ArrayList<String> laugnuage, ArrayList<String> proficiencies) {
		this.raceName = raceName;
		this.ageRange = ageRange;
		this.speed = speed;
		this.traits = traits;
		this.skills = skills;
		this.laugnuage = laugnuage;
		this.proficiencies = proficiencies;
	}
	
	

}
