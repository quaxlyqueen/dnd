package GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChooseClassPanel extends JPanel{

    private String classChoice;
    private boolean ableToContinue;

    public ChooseClassPanel() {

        super();
            createMasterPanel();

    }

    private void createMasterPanel() {

        setLayout(new BorderLayout(0, 0));

        JPanel masterPanel = new JPanel();

            JLabel title = new JLabel("Step 2: Choose Class");
                title.setHorizontalAlignment(SwingConstants.CENTER);
        masterPanel.add(title, BorderLayout.NORTH);

            JPanel classContainer = new JPanel();

            String[] availableClasses = {"Cleric", "Fighter", "Wizard"};

            for (int i = 0; i < availableClasses.length; i++) {

                classContainer.add(createButton(availableClasses[i]));

            }

            masterPanel.add(classContainer);

        add(masterPanel);

    }

    private JButton createButton(String userChoice) {

        JButton button = new JButton(userChoice);

        button.addActionListener(

                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        System.out.println(userChoice);
                            classChoice = userChoice;
                            ableToContinue = true;

                    }
                }

        );

        return button;

    }

    public String getClassChoice() {

        return classChoice;

    }

    public boolean isAbleToContinue() {

        return ableToContinue;

    }
}
