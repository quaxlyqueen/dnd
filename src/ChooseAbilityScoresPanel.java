package src;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

import static src.AppConstants.*;

public class ChooseAbilityScoresPanel extends JPanel {

    private DefaultButton[] statInfoButtons;
    private JLabel[] statLabels;
    private String[] statOptions;
    private InfoPanel infoPanel;
    private BasicNavPanel basicNavPanel;
    private int[] selectedStats;
    private int selectedStatIndex;

    public ChooseAbilityScoresPanel(BasicNavPanel basicNavPanel, String[] statOptions, String[] statDescriptions, int[] selectedStats, String panelTitle) {

        super();
        panelSetup();
        this.statOptions = statOptions;
        this.selectedStats = selectedStats;
        this.statInfoButtons = new DefaultButton[statOptions.length];
        statLabels = new JLabel[statOptions.length];
        this.basicNavPanel = basicNavPanel;

        Rectangle[] abilityScoreBounds = {

                new Rectangle(520, 5, 200, 400), // ImageInfo panel
                new Rectangle(5, 10, 200, 35), // ImageInfo subheader
                new Rectangle(5, 45, 200, 355) // ImageInfo text

        };

        infoPanel = new InfoPanel(statOptions, statDescriptions, abilityScoreBounds);
        infoPanel.updateInfo(0); // Default start with 0th element.

        createMasterPanel(panelTitle);
        add(basicNavPanel, BorderLayout.SOUTH);

    }

    private void panelSetup() {

        setBackground(lightBrown);
        setLayout(new BorderLayout(0, 0));

    }

    private void createMasterPanel(String panelTitle) {

        JLabel title = new JLabel(panelTitle);
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setFont(headerFont);
        title.setForeground(darkestBrown);
        add(title, BorderLayout.NORTH);

        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(null);
        panel.add(createAbilityScorePanels());
        panel.add(infoPanel);

        add(panel);

    }

    private JPanel createAbilityScorePanels() {

        JPanel mainAbilityPanel = new JPanel();
        mainAbilityPanel.setBounds(5, 5, 505, 405);
        mainAbilityPanel.setLayout(new GridLayout(2, 3, 10, 10));
        mainAbilityPanel.setBackground(lightBrown);

        for (int i = 0; i < statOptions.length; i++) {

            mainAbilityPanel.add(createAbilityPanel(statOptions[i], i));

        }

        return mainAbilityPanel;

    }

    private JPanel createAbilityPanel(String ability, int statIndex) {
        JPanel panel = new JPanel();
        panel.setFont(paragraphText);
        panel.setBackground(medBrown);
        panel.setBorder(new LineBorder(darkestBrown, 4, true));
        panel.setLayout(new BorderLayout(0, 0));

        DefaultButton tmpButton = new DefaultButton(ability);
        tmpButton.setFont(paragraphText);
        tmpButton.setHorizontalAlignment(SwingConstants.CENTER);
        tmpButton.addActionListener(e -> updateButtons(statIndex));

        statInfoButtons[statIndex] = tmpButton;

        panel.add(statInfoButtons[statIndex], BorderLayout.NORTH);

        panel.add(createScorePanel(statIndex));

        return panel;

    }

    private JPanel createScorePanel(int statIndex) {

        JPanel subPanel = new JPanel();

        JLabel scoreLabel = new JLabel("" + selectedStats[statIndex]);
        scoreLabel.setFont(paragraphText);
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);

        statLabels[statIndex] = scoreLabel;


        DefaultButton increaseButton = new DefaultButton("+");
        increaseButton.addActionListener(e -> increase(statIndex));

        DefaultButton decreaseButton = new DefaultButton("-");
        decreaseButton.addActionListener(e -> decrease(statIndex));

        subPanel.add(decreaseButton);
        subPanel.add(scoreLabel);
        subPanel.add(increaseButton);

        subPanel.setBackground(lightBrown);

        return subPanel;

    }

    private int statCostCalculator(int statIndex, boolean isDecreasing) {

        int cost = 0;

        int currentStatValue = selectedStats[statIndex];

        if (isDecreasing) {

            if (currentStatValue <= 8) {
                System.out.println("registered invalid decrease");

                return -1;

            }

            if (currentStatValue < 14) {

                cost = 1;

            } else if (currentStatValue == 14 || currentStatValue == 15) {

                cost = 2;

            }

        } else {

            if (currentStatValue < 13) {

                cost = 1;

            } else if (currentStatValue == 13 || currentStatValue == 14) {

                cost = 2;

            } else {
                System.out.println("registered invalid increase");
                return -1;

            }

        }

        return cost;

    }

    private void increase(int statIndex) {

        int value = statCostCalculator(statIndex, false);

        if (value == -1) {

            return;

        }

        if (basicNavPanel.getContinueRequirement() - value >= 0) {

            selectedStats[statIndex]++;
            statLabels[statIndex].setText("" + selectedStats[statIndex]);

            basicNavPanel.decreaseContinueRequirement(value);

        }

    }

    private void decrease(int statIndex) {

        int value = statCostCalculator(statIndex, true);

        if (value == -1) {

            return;

        }

        if (basicNavPanel.getContinueRequirement() + value <= 27) {

            selectedStats[statIndex]--;
            statLabels[statIndex].setText("" + selectedStats[statIndex]);

            basicNavPanel.increaseContinueRequirement(value);

        }

    }

    private void updateButtons(int newIndex) {

        statInfoButtons[selectedStatIndex].deSelect();
        statInfoButtons[newIndex].select();

        selectedStatIndex = newIndex;
        infoPanel.updateInfo(selectedStatIndex);

    }

}
