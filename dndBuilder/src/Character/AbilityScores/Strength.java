package Character.AbilityScores;

public class Strength extends Stats {

    private int abilityScore;
    private int abilityScoreModifier;

    public Strength(int abilityScore) {

        this.abilityScore = abilityScore;
        this.abilityScoreModifier = calcSavingThrow(abilityScore);

    }

    public Strength(Strength str) {

        this.abilityScore = str.getScore();
        this.abilityScoreModifier = str.getModifier();

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

    public String getDescription() {

        return "Natural athleticism and bodily power.";

    }

    public int getMaxCarryWeight() {

        return abilityScore * 15;

    }

    @Override
    public String toString() {

        return "Ability Score: " + abilityScore + " | Modifier: " + abilityScoreModifier + " | Description: "
                + getDescription();

    }

    @Override
    void increaseScore() {

        abilityScore++;
        
    }

}
