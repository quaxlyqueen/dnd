package com.builder;

public class Skills extends Character {

    private String[] allSkillsText = {"Animal Handling", "Acrobatics", "Arcana", "Athletics", "Deception", "History", "Insight", "Intimidation", "Investigation", "Medicine", "Nature", "Perception", "Performance", "Persuasion", "Religion", "Sleight of Hand", "Stealth", "Survival"};

    private int[] skills;

    public Skills(int[] skills) {

        this.skills = skills;

    }

    public int[] getAllSkills() {

        return skills;

    }

}
