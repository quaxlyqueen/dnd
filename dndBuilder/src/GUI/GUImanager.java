package GUI;

import GUI.Panels.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*    private void getNextPanel() {


        return switch (currentPanel) {
            case 1 -> guiPanels.getRacePanel();
            case 2 -> guiPanels.getClassPanel();
            case 3 -> guiPanels.getAbilityScorePanel();
            case 4 -> guiPanels.getDescriptionPanel();
            case 5 -> guiPanels.getEquipmentPanel();
            case 6 -> guiPanels.getFinalizePanel();
            case 7 -> guiPanels.getLoadMenuPanel();
            default -> guiPanels.getMainMenuPanel();
        };

    }*/

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

        add(createMasterPanel());

    }

    private void frameSetup() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(735,550));
        setSize(getPreferredSize());

        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            System.out.println("Error with cross platform look/feel in frameSetup().");
        }

    }

    private JPanel createMasterPanel() {

        JPanel masterPanel = new JPanel();
            masterPanel.add(panels[currentPanel]);

            JPanel navigationContainer = new JPanel(new GridLayout(1, 2, 10, 10));
                navigationContainer.add(createBackButton());
                navigationContainer.add(createContinueButton());

            //masterPanel.add(navigationContainer);

//        return masterPanel;

        return panels[currentPanel];

    }

    private JButton createBackButton() {

        JButton button = new JButton("Back");
            button.addActionListener(

                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println("Back button registered.");

                            lastPanel--;
                            currentPanel--;
                            nextPanel--;
                            clearAndReset();

                        }
                    }

            );

        return button;

    }

    private JButton createContinueButton() {

        JButton button = new JButton("Continue");
            button.addActionListener(

                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            System.out.println("Continue button registered.");
                            lastPanel++;
                            currentPanel++;
                            nextPanel++;
                            clearAndReset();

                        }
                    }

            );

        return button;

    }

    private void clearAndReset() {

        getContentPane().removeAll();

        add(createMasterPanel());

        repaint();
        revalidate();

    }

}