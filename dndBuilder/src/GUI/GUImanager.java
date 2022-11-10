package GUI;

import GUI.Panels.ChooseClassPanel;
import GUI.Panels.ChooseRacePanel;
import GUI.Panels.MainMenuPanel;

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
                this.panels = new JPanel[]{new ChooseRacePanel(), new ChooseClassPanel()};

/*            if (returningUser) {

                this.currentPanel = 0;

            } else {

                this.currentPanel = 1;

            }*/

        add(panels[currentPanel]);

    }

    // TODO: Need to implement.
    private void frameSetup() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(600,600));
        setSize(getPreferredSize());

        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            System.out.println("Error with cross platform look/feel in frameSetup().");
        }

    }

    /*

    NOTES:
        I'm thinking of using CPU multi-threading to constantly check if a given creation panel's ableToContinue has become true, to update the GUI with a clickable "Continue" button.

        Also. Continue button should be in GUI manager, otherwise the button's returned int of the next screen to display is obfuscated.

     */

    private void clearAndReset(JPanel nextPanel) {

        removeAll();
        add(nextPanel);

        repaint();
        revalidate();

    }

}