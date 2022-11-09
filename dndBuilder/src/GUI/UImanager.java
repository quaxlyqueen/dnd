package GUI;

import javax.swing.*;

public class UImanager {

    private final JFrame gui;
    private final PanelHolder guiPanels;
    private int currentPanel;

    public UImanager (PanelHolder guiPanels) {

        this.gui = new JFrame("D&D Character Builder");
            this.guiPanels = guiPanels;

            if (returningUser()) {

                this.currentPanel = 0;

            } else {

                this.currentPanel = 1;

            }

        frameSetup();

    }

    // TODO: Need to implement.
    private void frameSetup() {



    }

    // TODO: Need to implement.
    private boolean returningUser() {

        return false;

    }

    private JPanel getNextPanel() {

        return switch (currentPanel) {
            case 1 -> guiPanels.getRacePanel();
            case 2 -> guiPanels.getClassPanel();
            case 3 -> guiPanels.getAbilityScorePanel();
            case 4 -> guiPanels.getDescriptionPanel();
            case 5 -> guiPanels.getEquipmentPanel();
            case 6 -> guiPanels.getLoadMenuPanel();
            case 7 -> guiPanels.getFinalizePanel();
            default -> guiPanels.getMainMenuPanel();
        };

    }

    private void clearAndReset(JPanel nextPanel) {

        gui.removeAll();
        gui.add(nextPanel);

        gui.repaint();
        gui.revalidate();

    }

}