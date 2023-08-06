package dnd;

import javax.swing.*;
import java.awt.*;

import static dnd.AppConstants.*;
import static dnd.ImageManager.*;

public class BasicPanel extends JPanel {
    private DefaultButton[] optionButtons;
    private String[] options;
    private InfoPanel infoPanel;
    private int choiceIndex;
    private String panelTitle;
    private ImageManager images;
    private int currentPanel;

    public BasicPanel(JPanel navPanel, String[] options, String[] descriptions, String panelTitle, ImageManager images) {
        super();
        this.options = options;
        this.panelTitle = panelTitle;
        Rectangle[] basicBounds = new Rectangle[]{

                new Rectangle(5, 5, 600, 400), // ImageInfo panel
                new Rectangle(275, 10, 300, 35), // ImageInfo subheader
                new Rectangle(275, 45, 300, 355), // ImageInfo text
                new Rectangle(10, 45, 250, 355)

        };

        this.images = images;
        infoPanel = new InfoPanel(options, descriptions, basicBounds, images); 
        currentPanel = Integer.parseInt(Character.toString(panelTitle.charAt(5)));
        choiceIndex = 0;
        panelSetup();
        createMasterPanel();
        infoPanel.updateInfo(choiceIndex, getNextPortrait(choiceIndex));
        add(navPanel, BorderLayout.SOUTH);
    }

    private JLabel getNextPortrait(int index) {
        System.out.println("getNextPortrait in BasicPanel");
        JLabel nextPortrait;

        if(currentPanel == 1) nextPortrait = images.getRacePortrait(index);
        else if(currentPanel == 2) nextPortrait = images.getClassPortrait(index);
        else nextPortrait = null;
        return nextPortrait;
    }

    private void panelSetup() {
        setBackground(lightBrown);
        setLayout(new BorderLayout(0, 0));
    }

    private void createMasterPanel() {
        JLabel title = new JLabel(panelTitle);
            title.setHorizontalAlignment(SwingConstants.CENTER);
            title.setFont(headerFont);
            title.setForeground(darkestBrown);
        add(title, BorderLayout.NORTH);

        JPanel panel = new JPanel();
            panel.setOpaque(false);
            panel.setLayout(null);
            panel.add(infoPanel);
            panel.add(createButtonPanel());

        add(panel);
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new GridLayout(options.length, 1, 0, 0));
        buttonPanel.setBackground(lightBrown);
        buttonPanel.setBounds(585, 45, 135, 355);

        optionButtons = new DefaultButton[options.length];


        for (int i = 0; i < optionButtons.length; i++) {
            optionButtons[i] = createButton(options[i], i);
            if (i == 0) optionButtons[i].select();
        }

        for (int i = 0; i < options.length; i++) buttonPanel.add(optionButtons[i]);

        return buttonPanel;
    }

    private DefaultButton createButton(String holderName, int index) {
        DefaultButton button = new DefaultButton(holderName);
        button.addActionListener(e -> {
            updateButtons(index);
        });

        return button;
    }

    private void updateButtons(int newIndex) {
        optionButtons[choiceIndex].deSelect();
        optionButtons[newIndex].select();
        choiceIndex = newIndex;

        if(currentPanel == 1 || currentPanel == 2) infoPanel.updateInfo(choiceIndex, getNextPortrait(choiceIndex));
        else infoPanel.updateInfo(choiceIndex);
    }

    public int getChoice() { return choiceIndex; }
}
