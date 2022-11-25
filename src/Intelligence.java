public class Intelligence extends Stats {

    private int abilityScore;
    private int abilityScoreModifier;

    public Intelligence(int abilityScore) {

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

    // TODO: Need description.
    public String getDescription() {

        return "";

    }

    @Override
    public String toString() {

        return "Ability Score: " + abilityScore + " | Modifier: " + abilityScoreModifier + " | Description: "
                + getDescription();

    }

    @Override
    public void increaseScore() {

        abilityScore++;

    }

}
