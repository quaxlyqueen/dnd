package dnd;

public class Character {
	private String name;
	private int age;
	private int heightFeet;
	private int heightInch;
	private int weigth;
	private String eye;
	private String hair;
	private Race race;
	
	/**
	 * @param name
	 * @param age
	 * @param heightFeet
	 * @param heightInch
	 * @param weigth
	 * @param eye
	 * @param hair
	 */
	public Character(String name, int age, 
			int heightFeet, int heightInch,
			int weigth, String eye, String hair,
			Race race) {
		this.name = name;
		this.age = age;
		this.heightFeet = heightFeet;
		this.heightInch = heightInch;
		this.weigth = weigth;
		this.eye = eye;
		this.hair = hair;
		this.race = race;
	}
	/**
	 * Default constructor
	 */
	public Character() {
		this.name = "null";
		this.age = 0;
		this.heightFeet = 0;
		this.heightInch = 0;
		this.weigth = 0;
		this.eye = "null";
		this.hair = "null";
		
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @return the heightFeet
	 */
	public int getHeightFeet() {
		return heightFeet;
	}
	/**
	 * @return the heightInch
	 */
	public int getHeightInch() {
		return heightInch;
	}
	/**
	 * @return the weigth
	 */
	public int getWeigth() {
		return weigth;
	}
	/**
	 * @return the eye
	 */
	public String getEye() {
		return eye;
	}
	/**
	 * @return the hair
	 */
	public String getHair() {
		return hair;
	}
	
	@Override
	public String toString() {
		return name;
	}

}
