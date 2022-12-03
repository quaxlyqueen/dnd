package src;

import java.awt.*;
import javax.swing.*;

import static src.AppConstants.*;

public class ViewCharacterPanel extends JPanel {

    private CharacterSheet sheet;

    public ViewCharacterPanel(JPanel nav, CharacterSheet sheet) {

        super();
            this.sheet = sheet;
            panelSetup();
            createMasterPanel();

        add(nav, BorderLayout.SOUTH);

    }

    public void changeCharacter(CharacterSheet sheet) {

        this.sheet = sheet;

        repaint();
        revalidate();

    }

    private void panelSetup() {

        setBackground(lightBrown);
        setLayout(new BorderLayout(0, 0));

    }

    private void createMasterPanel() {

        JLabel title = new JLabel(sheet.getName());
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setFont(headerFont);
            title.setForeground(darkestBrown);
        
        add(title, BorderLayout.NORTH);

        add(createCharacteristicsPanel(), BorderLayout.CENTER);

    }

    private JPanel createCharacteristicsPanel() {

        JPanel panel = new JPanel(new GridLayout(2, 4, 15, 15));
            panel.setOpaque(false);

            panel.add(new JLabel("Age: " + sheet.getAge()));

            panel.add(new JLabel("Height: " + sheet.getHeightFeet() + "\'" + sheet.getHeightInch() + "\""));

            panel.add(new JLabel("Weight: " + sheet.getWeight() + "lbs."));

            panel.add(new JLabel("Eye Color: " + sheet.getEyeColor()));

            panel.add(new JLabel("Hair Color: " + sheet.getHairColor()));

            panel.add(new JLabel("Race: " + sheet.getRace().toString()));

            panel.add(new JLabel("Class: " + sheet.getCharacterClass().toString()));

            panel.add(new JLabel("Ability Scores: " + sheet.getStats().toString()));

        return panel;

    }

}
