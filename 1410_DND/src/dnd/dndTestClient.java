package dnd;

import com.builder.CharacterStats;

public class dndTestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CharacterStats stats = new CharacterStats(10, 10, 10, 10, 10, 10);

		Race chosenRace = new Human("Goblin");

			for(int i = 0; i < chosenRace.getASI().length; i++) {

				stats.increaseStat(chosenRace.getASI()[i]);

			}

		Character characterInfo = new Character("Generic", 50, 4, 6, 150, "brown", "black", chosenRace);

			System.out.println();

	}

}
