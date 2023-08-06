package dnd;

import javax.swing.*;
import java.awt.*;
import java.util.*;

import static dnd.AppConstants.*;

public class LoadCharacterPanel extends JPanel {
    private ArrayList<DefaultButton> savedCharacters;

    public LoadCharacterPanel(JPanel nav, ArrayList<DefaultButton> savedCharacters) {
        super();
            panelSetup();
        this.savedCharacters = savedCharacters;
        createMasterPanel();
        add(nav, BorderLayout.SOUTH);
    }

    private void panelSetup() {
        setBackground(lightBrown);
        setLayout(new BorderLayout(0, 0));
    }

    private void createMasterPanel() {
        JLabel title = new JLabel("Load a Character");
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setFont(headerFont);
            title.setForeground(darkestBrown);

        JPanel panel = new JPanel();
            panel.setOpaque(false);
            panel.setLayout(null);
            //panel.add(buttonPanel());
            // TODO: Need to implement. 
            //panel.add(portraitPanel());
        add(buttonPanel(), BorderLayout.NORTH);
    }

    private JPanel buttonPanel() {
        JPanel panel = new JPanel(new GridLayout(savedCharacters.size(), 1, 0, 0));
            panel.setOpaque(false);
            panel.setBackground(lightBrown);
            for(int i = 0; i < savedCharacters.size(); i++) panel.add(savedCharacters.get(i));

        return panel;
    }
}
