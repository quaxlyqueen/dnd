package dnd;

import java.io.Serializable;

public class CharacterStats implements Serializable {

    private Stats[] stats;

    public CharacterStats() {

        stats = new Stats[]{};

    }

    // TODO: Need to implement constructor, validates all proposed ability scores and creates new objects containing corresponding values.
    public CharacterStats(int str, int dex, int con, int intel, int wis, int cha) {

        this.stats = new Stats[]{

                new Strength(str),
                new Dexterity(dex),
                new Constitution(con),
                new Intelligence(intel),
                new Wisdom(wis),
                new Charisma(cha)

        };

    }

    public CharacterStats(Strength str, Dexterity dex, Constitution con, Intelligence intel, Wisdom wis, Charisma cha) {

        this.stats = new Stats[]{str, dex, con, intel, wis, cha};

    }

    // TODO: Need to implement ability score validation.
    public boolean validateAbilityScore(int abilityScore) {

        return false;

    }

    public Stats[] getStats() {

        return stats;

    }

    /**
     * Allows for access to a particular stat.
     *
     * @param index
     * @return a specific stat
     */
    public Stats getStats(int index) {

        return stats[index];

    }

    public void increaseStat(int targetStat) {

        stats[targetStat].increaseScore();

    }

    @Override
    public String toString() {

        String statsString = "";

        for (int i = 0; i < stats.length; i++) {

            statsString = statsString.concat(stats[i].getClass().getSimpleName() + ": " + stats[i].getScore() + " | ");

        }

        return statsString;

    }

}
