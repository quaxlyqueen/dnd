package GUI.Panels.SubPanels;

import GUI.AppTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Objects;
import java.util.Random;

public class InfoPanel extends JPanel implements AppTheme {

    protected JTextArea[] descriptions;
    protected Rectangle[] bounds;
    protected String[] holderDescriptions;
    protected String[] categoryHolder;
    protected int panelIndex;

    public InfoPanel(String[] categoryHolder, String[] holderDescriptions, Rectangle[] bounds, int panelIndex) {

        super();
            this.categoryHolder = categoryHolder;
            this.holderDescriptions = holderDescriptions;
            this.bounds = bounds;
            this.panelIndex = panelIndex;

            panelSetup();

            createDescriptions();

    }

    public void updateInfo(int holderIndex) {
        removeAll();
        panelSetup();

        add(descriptions[holderIndex]);

        repaint();
        revalidate();

    }

    protected void updateInfo(int holderIndex, JLabel portrait) {
        removeAll();
        panelSetup();

        add(descriptions[holderIndex]);
        add(portrait);

        repaint();
        revalidate();

    }

    private void panelSetup() {

        setOpaque(false);
        setBounds(bounds[0]);
        setLayout(null);

        JLabel subHeader = new JLabel("Description");
            subHeader.setFont(subHeaderFont);
            subHeader.setHorizontalAlignment(SwingConstants.LEFT);
            subHeader.setBounds(bounds[1]);
            subHeader.setForeground(darkestBrown);

        add(subHeader);
        
    }

    private void createDescriptions() {

        descriptions = new JTextArea[holderDescriptions.length];

        for (int i = 0; i < holderDescriptions.length; i++) {

            JTextArea tmpDesc = new JTextArea();
                tmpDesc.setText(holderDescriptions[i]);
                tmpDesc.setWrapStyleWord(true);
                tmpDesc.setLineWrap(true);
                tmpDesc.setOpaque(true);
                tmpDesc.setEditable(false);
                tmpDesc.setFocusable(false);
                tmpDesc.setFont(paragraphFont);
                tmpDesc.setBounds(bounds[2]);
                tmpDesc.setBorder(new EmptyBorder(5, 5, 5, 5));
                tmpDesc.setBackground(medBrown);
                tmpDesc.setForeground(darkestBrown);

            descriptions[i] = tmpDesc;

        }

    }

}
