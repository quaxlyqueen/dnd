package GUI.Panels;

import GUI.AppTheme;
import GUI.Panels.SubPanels.*;
import Resources.CustomAssets.*;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class BasicPanel extends JPanel implements AppTheme {

	private DefaultButton[] optionButtons;
	private String[] options;
	private String[] descriptions;
	private InfoPanel infoPanel;
	private DefaultButton backButton;
	private DefaultButton continueButton;
	private int choiceIndex;
	private String panelTitle;



	public BasicPanel(DefaultButton backButton, DefaultButton continueButton, String[] options, String[] descriptions, String panelTitle) {

		super();
			this.backButton = backButton;
			this.continueButton = continueButton;
			this.options = options;
			this.descriptions = descriptions;
			this.panelTitle = panelTitle;

			this.infoPanel = new InfoPanel(options, descriptions);
			choiceIndex = 0;

		panelSetup();
		createMasterPanel();

	}

	private void createMasterPanel() {

		JLabel title = new JLabel(panelTitle);
			title.setHorizontalAlignment(SwingConstants.CENTER);
			title.setFont(headerFont);
			title.setForeground(darkestBrown);
		add(title, BorderLayout.NORTH);

			JPanel racePanel = new JPanel();
				racePanel.setOpaque(false);
				racePanel.setLayout(null);
			racePanel.add(infoPanel);
			racePanel.add(createButtonPanel());

		add(racePanel);
		add(createNavPanel(), BorderLayout.SOUTH);

	}

	private JPanel createButtonPanel() {

			JPanel buttonPanel = new JPanel(new GridLayout(options.length, 1, 0, 0));
				buttonPanel.setBackground(lightBrown);

			buttonPanel.setBounds(585, 45, 135, 355);

			optionButtons = new DefaultButton[options.length];


		for (int i = 0; i < optionButtons.length; i++) {

			optionButtons[i] = createButton(options[i], i);

			if (i == 0) {

				optionButtons[i].select();

			}

		}


		for (int i = 0; i < options.length; i++) {

			buttonPanel.add(optionButtons[i]);

		}

		return buttonPanel;

	}

	private void panelSetup() {

		setBackground(lightBrown);
		setLayout(new BorderLayout(0, 0));

	}

	private JPanel createNavPanel() {

		JPanel panel = new JPanel(new GridLayout(1, 2, 30, 0));
			panel.setBackground(darkestBrown);
			panel.setBorder(new EmptyBorder(15, 150, 15, 150));
			panel.add(backButton);
			panel.add(continueButton);

		return panel;

	}

	private DefaultButton createButton(String raceName, int index) {

		DefaultButton button = new DefaultButton(raceName);
			button.addActionListener(e -> updateButtons(choiceIndex, index));

		return button;

	}

	private void updateButtons(int lastIndex, int newIndex) {

		optionButtons[lastIndex].deSelect();
		optionButtons[newIndex].select();

		choiceIndex = newIndex;
		infoPanel.updateInfo(choiceIndex);

	}

	public int getChoice() {

		return choiceIndex;

	}

}