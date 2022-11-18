package GUI.Panels;

import GUI.AppTheme;
import Resources.CustomAssets.BasicNavPanel;
import Resources.CustomAssets.DefaultButton;
import Resources.CustomAssets.InfoPanel;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class DescriptionPanel extends JPanel implements AppTheme {

    private BasicNavPanel nav;
    private String[] characteristics;
    private String[] characteristicsHolder;
    private String[] alignmentOptions;
    private String[] alignmentDescriptions;
    private String[] backgroundOptions;
    private String[] backgroundDescriptions;
    private String userBackground;
    private DefaultButton[] alignmentButtons;
    private DefaultButton[] backgroundButtons;
    private int alignmentChoice;
    private int backgroundChoice;


    public DescriptionPanel(BasicNavPanel nav, String[] characteristics, String[] alignmentOptions, String[] alignmentDescriptions, String[] backgroundOptions, String[] backgroundDescriptions, String panelTitle) {

        super();
            this.nav = nav;
            this.characteristics = characteristics;
            this.alignmentOptions = alignmentOptions;
            this.alignmentDescriptions = alignmentDescriptions;
            this.backgroundOptions = backgroundOptions;
            this.backgroundDescriptions = backgroundDescriptions;

        panelSetup();

        createPanel(panelTitle, nav);

    }

    public String[] getCharacteristics() {

        return characteristics;

    }

    public int getAlignmentChoice() {

        return alignmentChoice;

    }

    public int getBackgroundChoice() {

        return backgroundChoice;

    }

    private void panelSetup() {

        setBackground(lightBrown);
        setLayout(new BorderLayout(0, 0));

        alignmentChoice = 0;
        backgroundChoice = 0;

        alignmentButtons = new DefaultButton[alignmentOptions.length];
        backgroundButtons = new DefaultButton[backgroundOptions.length];

        characteristicsHolder = new String[] {

                "Name: ",
                "Age: ",
                "Height: ",
                "Weight: ",
                "Eyes: ",
                "Hair: "

        };

        userBackground = "";

    }



    private void createPanel(String panelTitle, BasicNavPanel nav) {

        add(createPanelTitle(panelTitle), BorderLayout.NORTH);

        add(createBodyPanel(), BorderLayout.CENTER);

        add(nav, BorderLayout.SOUTH);

    }

    private JLabel createPanelTitle(String panelTitle) {

        JLabel title = new JLabel(panelTitle);
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setFont(headerFont);
            title.setForeground(darkestBrown);
            title.setBorder(new EmptyBorder(25, 25, 25, 25));

        return title;

    }

    private JPanel createBodyPanel() {

        GridBagConstraints c = new GridBagConstraints();

        JPanel bodyPanel = new JPanel(new GridBagLayout());
            bodyPanel.setOpaque(false);

            bodyPanel.add(createNamePanel());
            bodyPanel.add(createFooterPanel());

        return bodyPanel;

    }

    private JPanel createNamePanel() {

        JPanel panel = new JPanel();
            panel.setBackground(medBrown);

            for (int i = 0; i < characteristicsHolder.length; i++) {

                panel.add(createField(i));

            }

        return panel;

    }

    private JPanel createField(int index) {

        JPanel panel = new JPanel();
            panel.setOpaque(false);

            JLabel label = new JLabel(characteristicsHolder[index]);
            label.setFont(paragraphFont);
                label.setOpaque(false);
            label.setForeground(darkestBrown);

            JTextField field = new JTextField(10);
                field.setFont(paragraphFont);
                field.setBackground(lightBrown);
                field.setBorder(null);

        panel.add(label);
        panel.add(field);

        return panel;

    }

    private JPanel createFooterPanel() {

        JPanel panel = new JPanel(new GridLayout(1, 3));
            panel.setOpaque(false);
            panel.add(createAlignmentPanel());
            panel.add(createBackgroundPanel());
            panel.add(createTextBoxPanel());

        return panel;

    }

    private JPanel createAlignmentPanel() {

        JPanel alignmentPanel = new JPanel(new BorderLayout(0, 0));
            alignmentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            alignmentPanel.setOpaque(false);

            JLabel backgroundLabel = new JLabel("Alignment");
                backgroundLabel.setForeground(darkestBrown);
                backgroundLabel.setFont(subHeaderFont);
                backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel innerPanel = new JPanel(new GridLayout(9, 1));
                innerPanel.setOpaque(false);

                for (int i = 0; i < alignmentOptions.length; i++) {

                    alignmentButtons[i] = createButton(alignmentOptions[i], false, i);
                        innerPanel.add(alignmentButtons[i]);

                        if(i == 0) {

                            alignmentButtons[i].select();

                        }

                }

        alignmentPanel.add(backgroundLabel, BorderLayout.NORTH);
        alignmentPanel.add(innerPanel);

        return alignmentPanel;

    }

    private JPanel createBackgroundPanel() {

        JPanel backgroundPanel = new JPanel(new BorderLayout(0, 0));
            backgroundPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
            backgroundPanel.setOpaque(false);

            JLabel backgroundLabel = new JLabel("Background");
                backgroundLabel.setForeground(darkestBrown);
                backgroundLabel.setFont(subHeaderFont);
                backgroundLabel.setHorizontalAlignment(SwingConstants.CENTER);

        backgroundPanel.add(backgroundLabel, BorderLayout.NORTH);

            JPanel innerPanel = new JPanel(new GridLayout(9, 2));
                innerPanel.setOpaque(false);

            for (int i = 0; i < backgroundOptions.length; i++) {

                backgroundButtons[i] = createButton(backgroundOptions[i], false, i);
                    innerPanel.add(backgroundButtons[i]);

                    if(i == 0) {

                        backgroundButtons[i].select();

                    }

            }

        backgroundPanel.add(innerPanel);

        return backgroundPanel;

    }

    private JPanel createTextBoxPanel() {

        JPanel panel = new JPanel(new BorderLayout(0, 0));
            panel.setOpaque(false);

            JLabel label = new JLabel("Enter a Description");
                label.setFont(paragraphFont);
                label.setOpaque(false);
                label.setForeground(darkestBrown);

            JTextArea textArea = new JTextArea();
                textArea.setForeground(darkestBrown);
                textArea.setFont(userTextFont);
                textArea.setOpaque(false);
                textArea.setBorder(new LineBorder(darkestBrown, 3));

            panel.add(label);
            panel.add(textArea);

        return panel;

    }

    private void updateAlignmentButtons(int newIndex) {

        alignmentButtons[alignmentChoice].deSelect();
        alignmentButtons[newIndex].select();

        alignmentChoice = newIndex;

        System.out.println("Updating alignment to index " + newIndex + ", " + alignmentOptions[newIndex]);

    }

    private void updateBackgroundButtons(int newIndex) {

        backgroundButtons[backgroundChoice].deSelect();
        backgroundButtons[newIndex].select();

        backgroundChoice = newIndex;

        System.out.println("Updating background to index " + newIndex + ", " + backgroundOptions[newIndex]);


    }

    private DefaultButton createButton(String name, boolean isAlignmentElseBackground, int index) {

        DefaultButton button = new DefaultButton(name);

        if (isAlignmentElseBackground) {

                button.addActionListener(e -> updateAlignmentButtons(index));

        } else {

                button.addActionListener(e -> updateBackgroundButtons(index));

        }

        return button;

    }

}
