public class UImanager {

    private JFrame gui;
    private PanelHolder guiPanels;
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
        
        switch (currentPanel) {

            case: 1
                    return guiPanels.getRacePanel();
            case: 2
                    return guiPanels.getClassPanel();
            case: 3
                    return guiPanels.getAbilityScorePanel();
            case: 4
                    return guiPanels.getDescriptionPanel();
            case: 5
                    return guiPanels.getEquipmentPanel();
            case: 6
                    return guiPanels.getLoadMenuPanel();
            case: 7
                    return guiPanels.getFinalizePanel();
            default:
                    return guiPanels.getMainMenuPanel();

        }

    }

    private void clearAndReset(JPanel nextPanel) {

        gui.removeAll();
        gui.addComponent(nextPanel);

        gui.repaint();
        gui.revalidate();

    }

}