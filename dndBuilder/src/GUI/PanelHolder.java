package GUI;

import GUI.Panels.ChooseRacePanel;

import javax.swing.*;
import java.awt.*;

/*

NOTES:

    - Implement getters for lastPanel, currentPanel, and nextPanel.
    - Implement panel creators.
    - Implement button logic, which should set the lastPanel, currentPanel, and nextPanel indices.
    - Extract individual classes for each JPanel field to inherit JPanel and contain additional values, such as race or class.

 */

public class PanelHolder {

/*
    private JPanel mainMenuPanel;
*/
    private JPanel racePanel;
/*    private JPanel classPanel;
    private JPanel abilityScorePanel;
    private JPanel descriptionPanel;
    private JPanel equipmentPanel;
    private JPanel finalizePanel;
    private JPanel loadMenuPanel;*/

//    private int lastPanel;
    private int currentPanel;
//    private int nextPanel;

    public PanelHolder() {

/*
        this.mainMenuPanel = createMainMenuPanel();
*/
        this.racePanel = createRaceSelectPanel();
/*        this.classPanel = createClassSelectPanel();
        this.abilityScorePanel = createAbilityScoreSelectPanel();
        this.descriptionPanel = createDescriptionPanel();
        this.equipmentPanel = createEquipmentSelectPanel();
        this.finalizePanel = createFinalizePanel();
        this.loadMenuPanel = createLoadMenu();*/
//            lastPanel = 0;
            currentPanel = 0;
//            nextPanel = 0;

    }

/*    public JPanel getMainMenuPanel() {

        return mainMenuPanel;

    }*/

    public JPanel getRacePanel() {

        return racePanel;

    }

  /*  public JPanel getClassPanel() {

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

    *//* TODO: Need to implement.

            LEFT-SIDE: Two large buttons, split with a horizontal line. One is to create a new DnD character, the other is to create a
            random character.

            RIGHT-SIDE: One extra-large button to load an existing character.

     *//*
    private JPanel createMainMenuPanel() {

        return new JPanel();

    }*/

    /* TODO: Need to implement.

            LEFT-SIDE: Should appear with a random portrait of the default race, human. Below this
            portrait, a button for the user to upload their own portrait.

            RIGHT-SIDE: Should appear with a scrollable list of the user's available races. A tooltip is on each race, and expands to
            describe the race, their proficiencies, languages, and ability score improvements.

     */
    private JPanel createRaceSelectPanel() {

        System.out.println("Race Panel generated.");

        JPanel display = new JPanel();
            display.setLayout(new BorderLayout(0, 0));


            JLabel title = new JLabel("Step 1: Choose Race");
                title.setHorizontalAlignment(SwingConstants.CENTER);
        display.add(title, BorderLayout.NORTH);

            JPanel textPanel = new JPanel();
                textPanel.setLayout(null);

                JLabel characterName = new JLabel("Character Name: ");
                    characterName.setBounds(113, 31, 108, 16);
            textPanel.add(characterName);

                JTextField nameTextBox = new JTextField();
                    nameTextBox.setBounds(233, 26, 211, 26);
            textPanel.add(nameTextBox);
                     nameTextBox.setColumns(10);

                JLabel raceLbl = new JLabel("Choose Race: ");
                    raceLbl.setBounds(113, 70, 98, 16);
            textPanel.add(raceLbl);

                JComboBox raceComboBox = new JComboBox();
                    raceComboBox.setBounds(196, 54, 221, 50);
            textPanel.add(raceComboBox);

                JLabel genderLbl = new JLabel("Gender: ");
                    genderLbl.setBounds(113, 108, 61, 16);
            textPanel.add(genderLbl);

                JComboBox genderComboBox = new JComboBox();
                    genderComboBox.setBounds(162, 92, 211, 50);
            textPanel.add(genderComboBox);

                JLabel classLbl = new JLabel("Class: ");
                    classLbl.setBounds(113, 154, 61, 16);
            textPanel.add(classLbl);

                JComboBox classComboBox = new JComboBox();
                    classComboBox.setBounds(162, 138, 200, 50);
            textPanel.add(classComboBox);

                JLabel AlignmentLbl = new JLabel("Alignment: ");
                    AlignmentLbl.setBounds(113, 200, 80, 16);
            textPanel.add(AlignmentLbl);

                JComboBox comboBox = new JComboBox();
                    comboBox.setBounds(190, 184, 200, 50);
            textPanel.add(comboBox);

        display.add(textPanel, BorderLayout.CENTER);

        return new JPanel();

    }

    // TODO: Need to implement.
   /* private JPanel createClassSelectPanel() {

        currentPanel++;

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createAbilityScoreSelectPanel() {

        currentPanel++;

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createDescriptionPanel() {

        currentPanel++;

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createEquipmentSelectPanel() {

        currentPanel++;

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createFinalizePanel() {

        currentPanel++;

        return new JPanel();

    }

    // TODO: Need to implement.
    private JPanel createLoadMenu() {

        currentPanel = 7;

        return new JPanel();

    }
*/
}