package Character;

import Character.AbilityScores.CharacterStats;
import Character.Races.Race;

import java.io.Serializable;

public class CharacterSheet implements Serializable {
    private String name;
    private int age;
    private int heightFeet;
    private int heightInch;
    private int weight;
    private String eye;
    private String hair;
    private Race race;

    private CharacterStats stats;

    /**
     * @param name
     * @param age
     * @param heightFeet
     * @param heightInch
     * @param weight
     * @param eye
     * @param hair
     */
    public CharacterSheet(String name, int age,
                          int heightFeet, int heightInch,
                          int weight, String eye, String hair,
                          Race race, CharacterStats stats) {
        this.name = name;
        this.age = age;
        this.heightFeet = heightFeet;
        this.heightInch = heightInch;
        this.weight = weight;
        this.eye = eye;
        this.hair = hair;
        this.race = race;
        this.stats = stats;
    }

    /**
     * Default constructor
     */
    public CharacterSheet() {
        this.name = "null";
        this.age = 0;
        this.heightFeet = 0;
        this.heightInch = 0;
        this.weight = 0;
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
    public int getWeight() {
        return weight;
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

    public CharacterStats getStats() {

        return stats;

    }

    @Override
    public String toString() {
        return "name: " + name + " | age: " + age + " | height: "
                + heightFeet + "\'" + heightInch + "\" | weight: "
                + weight + " | eye: " + eye + " | hair: " + hair
                + " | race: " + race.toString() + " | stats: " + stats.toString();
    }

}
