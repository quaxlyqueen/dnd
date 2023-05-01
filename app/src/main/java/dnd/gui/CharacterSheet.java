package dnd;

import java.io.Serializable;
import dnd.species.*;

public class CharacterSheet implements Serializable {
    private String name;
    private int age;
    private int heightFeet;
    private int heightInch;
    private int weight;
    private String eyeColor;
    private String hairColor;
    private Race race;
    private ClassTemplate chClass;
    private String[] spells;
    private String[] equipment;
    private String alignment;
    private String background;
    private CharacterStats stats;

    /*
     * TODO: Need to add the following variables:
     *
     *      - CharacterClass        x1 var
     *      - ChosenSpells          xN vars
     *      - Equipment             xN vars
     *      - Description           x3 vars
     *
     *          TOTAL: Minimum 12, + N spells and N equipment
     * 
     */



    public CharacterSheet(

            String name,
            int age,
            int heightFeet,
            int heightInch,
            int weight,
            String eyeColor,
            String hairColor,
            Race race,
            ClassTemplate chClass,
            String alignment,
            String background,
            CharacterStats stats 

    ) {

        this.name = name;
        this.age = age;
        this.heightFeet = heightFeet;
        this.heightInch = heightInch;
        this.weight = weight;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;

        this.race = race;
        this.chClass = chClass;
        this.alignment = alignment;
        this.background = background;
        this.stats = stats;

    }

    public String getName() {

        return name;

    }

    public int getAge() {

        return age;

    }

    public int getHeightFeet() {

        return heightFeet;

    }

    public int getHeightInch() {

        return heightInch;

    }

    public int getWeight() {

        return weight;

    }

    public String getEyeColor() {

        return eyeColor;

    }

    public String getHairColor() {

        return hairColor;

    }

    public Race getRace() {

        return race;

    }

    public ClassTemplate getCharacterClass() {

        return chClass;

    }

    public CharacterStats getStats() {

        return stats;

    }

    @Override
    public String toString() {

        String output = "Character name: " + name + "\nAge: " + age + "\nHeight: " + heightFeet + "\'" + heightInch + "\"" + "\nWeight: " + weight + "\nEye Color: " + eyeColor + "\nHair Color: " + hairColor + "\nRace: " + race.toString() + "\nClass: " + chClass.toString() + "\nStats: " + stats.toString();

        return output;

    }

}
