package dnd;

public class Wizard implements ClassTemplate {
    private int HP;
    private int level;
    private int hitDie; // TODO: This should be the type of die.

    public Wizard(Stats[] stats, int level) {}

// TODO: Need to figure out how to contain class progression information. Potentially a double String array, each row equals a level, each column a different thing. Should class features be a separate class, ie. BarbFeatures, BardFeatures, etc?

    public String getDescription() { return null; }

    public String[] getProgression() { return null; }

    public String[] getClassFeatures() { return null; }

    public String getHitDie() { return null; }

    public int getHPatLv1() { return 0; }

    public int getHPpastLv1() { return 0; }

    public String[] getArmorProf() { return null; }

    public String[] getWeaponProf() { return null; }

    public String[] getToolProf() { return null; }

    public String[] availableSkills() { return null; }

    public String[] startingEquipChoices() { return null; }

    public boolean advantageCheck(Stats abilityScore) { return false; }

    public boolean disadvantageCheck(Stats abilityScore) { return false; }

    @Override
    public String[] getSavingThrows() { return null; }
}
