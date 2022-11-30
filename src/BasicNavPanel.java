import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;

public class BasicNavPanel extends JPanel implements AppTheme {

    private DefaultButton backButton;
    private DefaultButton continueButton;
    private int continueRequirement;

    public BasicNavPanel(DefaultButton backButton, DefaultButton continueButton, int continueRequirement) {

        super(new GridLayout(1, 2, 30, 0));
        this.backButton = backButton;

        if(continueButton == null) {

            this.continueButton = null;

        } else {

            this.continueButton = continueButton;

        } 

        this.continueRequirement = continueRequirement;
        createNavPanel();

    }

    public int getContinueRequirement() {

        return continueRequirement;

    }

    public void decreaseContinueRequirement(int value) {

        continueRequirement -= value;
        updateContinueRequirement();

    }

    public void increaseContinueRequirement(int value) {

        continueRequirement += value;
        updateContinueRequirement();

    }

    private void updateContinueRequirement() {

        removeAll();

        createNavPanel();

    }

    private void createNavPanel() {

        setBackground(darkestBrown);
        setBorder(new EmptyBorder(15, 150, 15, 150));
        add(backButton);

        if (continueRequirement == 0) {

            if(continueButton != null) {

                add(continueButton);

            }

        } else {

            DefaultButton requiredStepsNeeds = new DefaultButton(Integer.toString(continueRequirement) + " Points Left");
            requiredStepsNeeds.select();
            requiredStepsNeeds.setBorder(new LineBorder(lightAccent, 1));
            requiredStepsNeeds.setBorderPainted(true);
            requiredStepsNeeds.setEnabled(false);
            add(requiredStepsNeeds);

        }

    }

}
