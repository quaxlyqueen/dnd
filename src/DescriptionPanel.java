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

        characteristicsHolder = new String[]{

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
        panel.add(createSubPanel("Alignment"));
        panel.add(createSubPanel("Background"));
        panel.add(createTextBoxPanel());

        return panel;

    }

    private JPanel createSubPanel(String labelName) {

        JPanel panel = new JPanel(new BorderLayout(0, 0));
            panel.setBorder(new EmptyBorder(5, 5, 5, 5));
            panel.setOpaque(false);

            JLabel label = new JLabel(labelName);
                label.setForeground(darkestBrown);
                label.setFont(subHeaderFont);
                label.setHorizontalAlignment(SwingConstants.CENTER);

            JPanel innerPanel;

            if(labelName.equals("Alignment")) {

                innerPanel = new JPanel(new GridLayout(9, 1));
                    innerPanel.setOpaque(false);

                    createButtons(alignmentOptions, alignmentButtons, labelName);

                for (int i = 0; i < alignmentButtons.length; i++) {

                    innerPanel.add(alignmentButtons[i]);

                }

            } else {

                innerPanel = new JPanel(new GridLayout(9, 2));
                innerPanel.setOpaque(false);

                createButtons(backgroundOptions, backgroundButtons, labelName);

                for (int i = 0; i < backgroundButtons.length; i++) {

                    innerPanel.add(backgroundButtons[i]);

                }

            }

        panel.add(label);
        panel.add(innerPanel);

        return panel;

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

    private void createButtons(String[] options, DefaultButton[] buttons, String type) {

        boolean tmp = type.equals("Alignment");

        for (int i = 0; i < options.length; i++) {

            buttons[i] = createButton(options[i], tmp, i);

            if(i == 0) {

                buttons[i].select();

            }

        }

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
