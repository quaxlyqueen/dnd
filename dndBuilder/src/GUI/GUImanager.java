package GUI;

import javax.swing.*;
import java.awt.*;

public class GUImanager extends JFrame {

    private final PanelHolder guiPanels;
    private int currentPanel;

    public GUImanager (PanelHolder guiPanels, boolean returningUser) {
        super("D&D Character Builder");
            frameSetup();
            this.guiPanels = guiPanels;

            if (returningUser) {

                this.currentPanel = 0;

            } else {

                this.currentPanel = 1;

            }

            add(getNextPanel());

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

    private JPanel getNextPanel() {

        return guiPanels.getRacePanel();

/*        return switch (currentPanel) {
            case 1 -> guiPanels.getRacePanel();
            case 2 -> guiPanels.getClassPanel();
            case 3 -> guiPanels.getAbilityScorePanel();
            case 4 -> guiPanels.getDescriptionPanel();
            case 5 -> guiPanels.getEquipmentPanel();
            case 6 -> guiPanels.getLoadMenuPanel();
            case 7 -> guiPanels.getFinalizePanel();
            default -> guiPanels.getMainMenuPanel();
        };*/

    }

    private void clearAndReset(JPanel nextPanel) {

        removeAll();
        add(nextPanel);

        repaint();
        revalidate();

    }

}