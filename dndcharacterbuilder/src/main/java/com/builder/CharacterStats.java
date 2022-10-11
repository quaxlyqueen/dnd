package com.builder;

public class CharacterStats {

    private Stats[] stats;

    public CharacterStats() {



    }

// FIXME: Need to implement constructor, validates all proposed ability scores and creates new objects containing corresponding values.
    public CharacterStats(Strength str, Dexterity dex, Constitution con, Intelligence intel, Wisdom wis, Charisma cha) {

        this.stats = new Stats[]{str, dex, con, intel, wis, cha};

    }

// FIXME: Need to implement ability score validation.
    public boolean validateAbilityScore(int abilityScore) {

        return false;

    }

}
