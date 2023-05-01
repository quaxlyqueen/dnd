package dnd.species;

public class HalfOrc implements Race {
    private final int speed = 30;
    private final int maxAge = 75;
    private String[] traits;
    private String[] skills;
    private String[] languages;
    private String[] proficiencies;

    public HalfOrc() {

        this.languages = new String[]{"Common", "Orc"};
        this.skills = new String[]{};
    }

    @Override
    public String getRace() {
        // TODO Auto-generated method stub
        return this.getClass().getSimpleName();
    }

    @Override
    public int maxAge() {
        // TODO Auto-generated method stub
        return maxAge;
    }

    @Override
    public int getSpeed() {
        // TODO Auto-generated method stub
        return speed;
    }

    @Override
    public String[] getTraits() {
        // TODO Auto-generated method stub
        return traits;

    }

    @Override
    public String[] getSkills() {
        // TODO Auto-generated method stub
        return skills;
    }

    @Override
    public String[] getLanguages() {
        // TODO Auto-generated method stub
        return languages;
    }

    @Override
    public String[] getProficiencies() {
        // TODO Auto-generated method stub
        return proficiencies;
    }

    @Override
    public int[] getASI() {
        // TODO Auto-generated method stub
        return new int[]{0, 0, 2};
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getClass().getSimpleName();
    }

}
