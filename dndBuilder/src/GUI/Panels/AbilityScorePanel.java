package GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbilityScorePanel extends JPanel {

    private JPanel[] statsPanels;
    private int[] stats;
    private String[] statNames;
    private int currentIndex;

    public AbilityScorePanel() {

        super();
            stats = new int[] {8,8,8,8,8,8};
            statNames = new String[]{"Strength", "Dexterity", "Constitution", "Intelligence", "Wisdom", "Charisma"};
            statsPanels = new JPanel[6];

                for (int i = 0; i < statNames.length; i++) {

                    statsPanels[i] = createStatPanel(statNames[i], i);

                }
                createMasterPanel();


    }

    private void createMasterPanel() {

        setLayout(new BorderLayout(0, 0));

        JPanel masterPanel = new JPanel();

        JLabel title = new JLabel("Step 3: Choose Ability Scores");

            JPanel scoreHolder = new JPanel(new GridLayout(3, 2, 15, 15));
                for (int i = 0; i < statNames.length; i++) {

                    scoreHolder.add(statsPanels[i]);

                }

        masterPanel.add(title);
        masterPanel.add(scoreHolder);

        add(masterPanel);

    }

    private JPanel createStatPanel(String statName, int currentIndex) {

        JPanel container = new JPanel();
            container.add(createMinusButton(currentIndex));

            JPanel textHolder = new JPanel(new GridLayout(2, 1, 15, 15));
                textHolder.add(new JLabel(statName));
                textHolder.add(new JLabel(Integer.toString(stats[currentIndex])));
            container.add(textHolder);
            container.add(createPlusButton(currentIndex));

        return container;

    }

    private void refreshStatPanel(int currentIndex) {

        statsPanels[currentIndex].removeAll();
        statsPanels[currentIndex] = createStatPanel(statNames[currentIndex], currentIndex);

        revalidate();
        repaint();

    }

    private JButton createMinusButton(int currentIndex) {

        JButton button = new JButton("-");
            button.addActionListener(

                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {

                            stats[currentIndex]--;
                            refreshStatPanel(currentIndex);

                        }
                    }

            );

        return button;

    }

    // TODO: Need to refactor into increment and decrement score methods, as the number of points required to purchase an increase rises.
    private JButton createPlusButton(int currentIndex) {

        JButton button = new JButton("+");
        button.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        stats[currentIndex]++;
                        refreshStatPanel(currentIndex);

                    }
                }

        );

        return button;

    }

}
