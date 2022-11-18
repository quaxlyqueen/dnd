package Character.Races;

public class Halfling implements Race {
    private final int speed = 30;
    private final int maxAge = 750;
    private String[] traits;
    private String[] skills;
    private String[] languages;
    private String[] proficiencies;

    public Halfling() {

        this.languages = new String[]{"Common", "Elvish"};
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
        return new int[]{1, 1};
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.getClass().getSimpleName();
    }

}
