package GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainMenuPanel extends JPanel {

    private int nextPanelSelected;

    public MainMenuPanel() {

        super();
        createMasterPanel();

    }

    // TODO: Need to refactor/re-write, as current implementation utilizes ContinueButton.
    private void createMasterPanel() {

        /*setLayout(new BorderLayout(0, 0));

        JPanel masterPanel = new JPanel();

        JLabel title = new JLabel("D&D Character Builder");
        title.setHorizontalAlignment(SwingConstants.CENTER);
        masterPanel.add(title, BorderLayout.NORTH);

        JPanel buttonsContainer = new JPanel(new GridLayout(1, 2, 10, 10));

            JPanel newCharacterContainer = new JPanel(new GridLayout(2, 1, 10, 10));
                newCharacterContainer.add(new Button("Create a New Character", 1));
                newCharacterContainer.add(new Button("Generate a Random Character", -1));
            buttonsContainer.add(newCharacterContainer);

            JPanel loadCharacterContainer = new JPanel();
                loadCharacterContainer.add(new Button("Load a Character", 7));
            buttonsContainer.add(loadCharacterContainer);

        masterPanel.add(buttonsContainer);

        add(masterPanel);*/

    }



}