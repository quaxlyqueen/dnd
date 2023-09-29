package dnd.species;

public class HalfElf implements Species {
    private final int speed = 30;
    private final int maxAge = 180;
    private String[] traits;
    private String[] skills;
    private String[] languages;
    private String[] proficiencies;
    private int chosenASI;

    //TODO HalfElf get's to increase 1 ASI of their choice to increase. 
    public HalfElf(String chosenLanguage, int chosenASI) {
        this.languages = new String[]{"Common", "Elvish", chosenLanguage};
        this.skills = new String[]{};
        this.chosenASI = chosenASI;
    }

    @Override
    public String getSpecies() { return this.getClass().getSimpleName(); }

    @Override
    public int maxAge() { return maxAge; }

    @Override
    public int getSpeed() { return speed; }

    @Override
    public String[] getTraits() { return traits; }

    @Override
    public String[] getSkills() { return skills; }

    @Override
    public String[] getLanguages() { return languages; }

    @Override
    public String[] getProficiencies() { return proficiencies; }

    @Override
    public int[] getASI() { return new int[]{5, 5, chosenASI}; }

    @Override
    public String toString() { return this.getClass().getSimpleName(); }
}
