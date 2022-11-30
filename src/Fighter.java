import java.io.Serializable;

public class Fighter implements ClassTemplate, Serializable {

    private int HP;

    private int level;

    // TODO: This should be the type of die.
    private int hitDie;

    public Fighter() {


    }

// TODO: Need to figure out how to contain class progression information. Potentially a double String array, each row equals a level, each column a different thing. Should class features be a separate class, ie. BarbFeatures, BardFeatures, etc?

    public String getDescription() {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getProgression() {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getClassFeatures() {
        // TODO Auto-generated method stub
        return null;
    }

    public String getHitDie() {
        // TODO Auto-generated method stub
        return null;
    }

    public int getHPatLv1() {
        // TODO Auto-generated method stub
        return 0;
    }

    public int getHPpastLv1() {
        // TODO Auto-generated method stub
        return 0;
    }

    public String[] getArmorProf() {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getWeaponProf() {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] getToolProf() {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] availableSkills() {
        // TODO Auto-generated method stub
        return null;
    }

    public String[] startingEquipChoices() {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean advantageCheck(Stats abilityScore) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean disadvantageCheck(Stats abilityScore) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String[] getSavingThrows() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {

        return this.getClass().getSimpleName();

    }

}
