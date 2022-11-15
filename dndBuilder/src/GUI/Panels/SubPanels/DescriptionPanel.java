package GUI.Panels.SubPanels;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class DescriptionPanel extends JTextArea {

    private JTextArea[] descriptions;
    private String[] holderDescriptions;


    public DescriptionPanel(String[] holderDescriptions) {

        super();
            panelSetup();

        this.holderDescriptions = holderDescriptions;
        createDescriptionPanels();

        updateDescription(0);


    }

    private void panelSetup() {

        setOpaque(true);
        setBackground(new Color(238, 232, 170));
        setBounds(6, 229, 281, 159);

    }

    public void updateDescription(int holderIndex) {

        removeAll();

        add(descriptions[holderIndex]);

        repaint();
        revalidate();

    }

    private void createDescriptionPanels() {

        descriptions = new JTextArea[holderDescriptions.length];

        for (int i = 0; i < holderDescriptions.length; i++) {

            JTextArea tmpDesc = new JTextArea();
                tmpDesc.setText(holderDescriptions[i]);
                tmpDesc.setWrapStyleWord(true);
                tmpDesc.setLineWrap(true);
                tmpDesc.setOpaque(false);
                tmpDesc.setEditable(false);
                tmpDesc.setFocusable(false);
                tmpDesc.setFont(new Font("Bodoni 72", Font.PLAIN, 10));

/*                setFont(new Font("Bodoni 72", Font.PLAIN, 10));
                setHorizontalAlignment(SwingConstants.LEFT);
                setBounds(6, 21, 281, 196);*/

            descriptions[i] = tmpDesc;

        }

    }

}
