package Character.Classes;

import Character.AbilityScores.Stats;

public interface ClassTemplate {

    abstract String getDescription();

    abstract String[] getProgression();

    abstract String[] getClassFeatures();

    abstract String getHitDie();

    abstract int getHPatLv1();

    abstract int getHPpastLv1();

    abstract String[] getArmorProf();

    abstract String[] getWeaponProf();

    abstract String[] getToolProf();

    abstract String[] getSavingThrows();

// TODO: Need to refresh on how saving throws work and how the character's class may impact a saving throw.

    abstract String[] availableSkills();

    abstract String[] startingEquipChoices();

    abstract boolean advantageCheck(Stats abilityScore);

    abstract boolean disadvantageCheck(Stats abilityScore);

// TODO: Spells and shit.

}
