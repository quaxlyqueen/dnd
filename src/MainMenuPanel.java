import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuPanel extends JPanel implements AppTheme {

    private DefaultButton newCharacter;
    private DefaultButton randomCharacter;
    private DefaultButton loadCharacter;

    public MainMenuPanel(DefaultButton newCharacter, DefaultButton randomCharacter, DefaultButton loadCharacter) {

        super();
        panelSetup();
        this.newCharacter = newCharacter;
        this.randomCharacter = randomCharacter;
        this.loadCharacter = loadCharacter;

        add(createLabel(), BorderLayout.NORTH);

        add(createControlPanel(), BorderLayout.CENTER);
    }

    private void panelSetup() {

        setBackground(lightBrown);
        setLayout(new BorderLayout(0, 0));

    }

    private JLabel createLabel() {

        JLabel label = new JLabel("D&D Character Builder");
            label.setFont(headerFont);
            label.setForeground(darkestBrown);
            label.setOpaque(false);
            label.setHorizontalAlignment(SwingConstants.CENTER);
            label.setBorder(new EmptyBorder(5, 5, 5, 5));

        return label;

    }

    private JPanel createControlPanel() {
        JPanel panel = new JPanel(new GridLayout(1, 2, 50, 0));
            panel.setOpaque(false);
            panel.setBorder(new EmptyBorder(25, 25, 25, 25));

            JPanel subPanel = new JPanel(new GridLayout(2, 1, 0, 50));
                subPanel.setOpaque(false);

                subPanel.add(newCharacter);
                subPanel.add(randomCharacter);

            panel.add(subPanel);
            panel.add(loadCharacter);

        return panel;
    }

}
