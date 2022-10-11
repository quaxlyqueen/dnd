package com.builder;

public interface ClassTemplate {

    String getDescription();

    String[] getProgression();

    String[] getClassFeatures();

    String getHitDie();

    int getHPatLv1();

    int getHPpastLv1();

    String[] getArmorProf();

    String[] getWeaponProf();

    String[] getToolProf();

// TODO: Need to refresh on how saving throws work and how the character's class may impact a saving throw.

    String[] availableSkills();

    String[] startingEquipChoices();

    boolean advantageCheck(Stats abilityScore);

    boolean disadvantageCheck(Stats abilityScore);

// TODO: Spells and shit.

}
