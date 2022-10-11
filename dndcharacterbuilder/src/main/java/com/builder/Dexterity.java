package com.builder;

public class Dexterity extends Stats {

    private int abilityScore;
    private int abilityScoreModifier;

    public Dexterity(int abilityScore) {

        this.abilityScore = abilityScore;
        this.abilityScoreModifier = calcSavingThrow(abilityScore);

    }

    public int getScore() {

        return abilityScore;

    }

    public int getModifier() {

        return abilityScoreModifier;

    }

    public int getSavingThrow() {

        return getModifier();

    }

// FIXME: Need to implement.
    public String getDescription() {

        return "";

    }

    @Override
    public String toString() {

        return "Ability Score: " + abilityScore + " | Modifier: " + abilityScoreModifier + " | Description: "
                + getDescription();

    }

}
