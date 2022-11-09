package GUI;

import javax.swing.*;
public class PanelHolder {

    private JPanel mainMenuPanel;
    private JPanel racePanel;
    private JPanel classPanel;
    private JPanel abilityScorePanel;
    private JPanel descriptionPanel;
    private JPanel equipmentPanel;
    private JPanel finalizePanel;
    private JPanel loadMenuPanel;

    public PanelHolder() {

        this.mainMenuPanel = createMainMenuPanel();
        this.racePanel = createRaceSelectPanel();
        this.classPanel = createClassSelectPanel();
        this.abilityScorePanel = createAbilityScoreSelectPanel();
        this.descriptionPanel = createDescriptionPanel();
        this.equipmentPanel = createEquipmentSelectPanel();
        this.finalizePanel = createFinalizePanel();
        this.loadMenuPanel = createLoadMenu();

    }

    public JPanel getMainMenuPanel() {

        return mainMenuPanel;

    }

    public JPanel getRacePanel() {

        return racePanel;

    }

    public JPanel getClassPanel() {

        return classPanel;

    }

    public JPanel getAbilityScorePanel() {

        return abilityScorePanel;

    }

    public JPanel getDescriptionPanel() {

        return descriptionPanel;

    }

    public JPanel getEquipmentPanel() {

        return equipmentPanel;

    }

    public JPanel getFinalizePanel() {

        return finalizePanel;

    }

    public JPanel getLoadMenuPanel() {

        return loadMenuPanel;

    }

    /* TODO: Need to implement.

            LEFT-SIDE: Two large buttons, split with a horizontal line. One is to create a new DnD character, the other is to create a
            random character.

            RIGHT-SIDE: One extra-large button to load an existing character.

     */
    private JPanel createMainMenuPanel() {

        return new JPanel();

    }

    /* TODO: Need to implement.

            LEFT-SIDE: Should appear with a random portrait of the default race, human. Below this
            portrait, a button for the user to upload their own portrait.

            RIGHT-SIDE: Should appear with a scrollable list of the user's available races. A tooltip is on each race, and expands to
            describe the race, their proficiencies, languages, and ability score improvements.

     */
    private JPanel createRaceSelectPanel() {

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createClassSelectPanel() {

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createAbilityScoreSelectPanel() {

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createDescriptionPanel() {

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createEquipmentSelectPanel() {

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createFinalizePanel() {

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createLoadMenu() {

        return new JPanel();

    }

}