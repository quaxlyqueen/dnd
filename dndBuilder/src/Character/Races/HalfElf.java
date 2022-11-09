package Character.Races;

public class HalfElf implements Race{
    private String[] traits;
    private final int speed = 30;
    private final int maxAge = 180;
    private String[] skills;
    private String[] languages;
    private String[] proficiencies;
	private int chosenASI;

    //TODO HalfElf get's to increase 1 ASI of their choice to increase. 
    public HalfElf(String chosenLanguage, int chosenASI) {

        this.languages = new String[] {"Common", "Elvish", chosenLanguage };
        this.skills = new String[] {};
		this.chosenASI = chosenASI;
		
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
        return new int[]{5,5, chosenASI};
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getClass().getSimpleName();
	}
    
}

