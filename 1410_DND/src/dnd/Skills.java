package dnd;

/**
 *
 * Object stores information about a character's skills arrays. Firstly, the name of each skill, and secondly the value of each skill. When constructed, a private method is called
 *      which adds any proficiency bonus to each skill and then adds the ability score modifier to each skill.
 *
 */
public class Skills {

// TODO: Need to verify skills are in correct order.
    private String[] allSkillsText = {"Acrobatics", "Animal Handling", "Arcana", "Athletics", "Deception", "History", "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance", "Persuasion", "Religion", "Sleight of Hand", "Stealth", "Survival"};

// TODO: Prof bonus comes from the class, changes upon certain level thresholds.
    private final int profBonus = 5;

    private Stats[] stats;

    private int[] skills;


    /**
     *
     * Default constructor for the Skills class. Should be constructed AFTER the user has generated their stats and chosen the skills they are proficient in.
     *
     * @param   int[] skills
     * @param   Stats[] stats
     *
     */
    public Skills(int[] skills, Stats[] stats) {

        this.skills = skills;

        this.stats = stats;

        setSkills();

    }

    /**
     *
     * Adds proficiency bonus to each element of the skills array, and then adds the corresponding AS modifier to each skill.
     *
     */
    private void setSkills() {

// TODO: Need to verify these are the correct ability scores for each skill.
        int[] skillsAbilities = { 1, 4, 3, 0, 5, 3, 4, 5, 3, 4, 3, 4, 5, 5, 3, 1, 4 };

        for(int i = 0; i < allSkillsText.length; i++) {

            if(skills[i] == 1) {

                skills[i] = profBonus;

            }

            skills[i] += stats[skillsAbilities[i]].getModifier();

        }

    }

    /**
     *
     * Returns the value of each skill's score.
     *
     * @return  int[] skills
     *
     */
    public int[] getSkills() {

        return skills;

    }

// TODO: Need to implement overloaded method to return one specific skill.
    public int getSkill(String skill) {

        return 0;

    }

}