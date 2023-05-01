package dnd;

import dnd.species.*;
public class Tester {

    public static void main(String[] args) {

        FileManager filer = new FileManager();

        filer.saveCharacter(createSheet());

        CharacterSheet chFromFile = filer.readSavedCharacter(0);

        System.out.println("chFromFile: \n" + chFromFile.toString());

    }

    public static CharacterSheet createSheet() {

        String name = "Josh";
        int age = 21;
        int heightFeet = 5;
        int heightInch = 8;
        int weight = 180;
        String eyeColor = "Brown";
        String hairColor = "Dark Brown";

        Race race = new Elf();
        ClassTemplate chClass = new Fighter();
        CharacterStats stats = new CharacterStats(9, 15, 12, 10, 13, 10);

        String alignment = "Neutral";
        String background = "Nomad";

        CharacterSheet chTest = new CharacterSheet(name, age, heightFeet, heightInch, weight, eyeColor, hairColor, race, chClass, alignment, background, stats);

        return chTest;

    }

}
