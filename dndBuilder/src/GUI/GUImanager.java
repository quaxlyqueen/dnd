package GUI;

import GUI.Panels.*;
import Resources.CustomAssets.DefaultButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUImanager extends JFrame {

    private static JPanel[] panels;

    private int lastPanel;
    private int currentPanel;
    private int nextPanel;

    public GUImanager (boolean returningUser) {
        super("D&D Character Builder");
            frameSetup();
                this.panels = new JPanel[]{
                        new MainMenuPanel(),
                        new ChooseRacePanel(createBackButton(), createContinueButton()),
                        new ChooseClassPanel(createBackButton(),createContinueButton()),
                        new ChooseAbilityScoresPanel(createBackButton(), createContinueButton())
                };

                this.lastPanel = 0;
                this.currentPanel = 1;
                this.nextPanel = 2;
/*            if (returningUser) {

                this.currentPanel = 0;

            } else {

                this.currentPanel = 1;

            }*/

        add(panels[currentPanel]);

    }

    private void frameSetup() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(750,550));
        setSize(getPreferredSize());
        setResizable(false);
        setLocationRelativeTo(null);

        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            System.out.println("Error with cross platform look/feel in frameSetup().");
        }

    }

    private DefaultButton createBackButton() {

        DefaultButton button = new DefaultButton("Back");
            button.addActionListener(

                e -> {

                    lastPanel--;
                    currentPanel--;
                    nextPanel--;
                    clearAndReset();

                }

            );

        return button;

    }

    private DefaultButton createContinueButton() {

        DefaultButton button = new DefaultButton("Continue");
            button.addActionListener(

                    e -> {

                        lastPanel++;
                        currentPanel++;
                        nextPanel++;
                        clearAndReset();

                    }

            );

        return button;

    }

    private DefaultButton createRandomCharacterButton() {

        DefaultButton button = new DefaultButton("Create Random Character");
        button.addActionListener(

                e -> {

                    createRandomCharacter();

                    lastPanel = currentPanel;
                    currentPanel = 6;
                    nextPanel = currentPanel + 1;
                    clearAndReset();

                }

        );

        return button;

    }

    private DefaultButton createSaveButton() {

        DefaultButton button = new DefaultButton("Save");
        button.addActionListener(

            e -> {

                lastPanel = currentPanel;
                currentPanel = 6;
                nextPanel = currentPanel + 1;
                clearAndReset();

            }

        );

        return button;

    }

    // TODO: Need to implement.
    private void createRandomCharacter() {



    }

    private void clearAndReset() {

        getContentPane().removeAll();

        add(panels[currentPanel]);

        repaint();
        revalidate();
        pack();

    }

}