package GUI.Panels;

import GUI.AppTheme;
import GUI.Panels.SubPanels.*;
import Resources.CustomAssets.*;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.*;

public class ChooseRacePanel extends JPanel implements AppTheme {

	private String[] raceOptions;
	private String[] raceDescriptions;
	private InfoPanel infoPanel;
	private int raceIndex;
	private JButton backButton;
	private JButton continueButton;

	private DefaultButton[] raceOptionButtons;

	public ChooseRacePanel(JButton backButton, DefaultButton continueButton) {
		super();
			this.backButton = backButton;
			this.continueButton = continueButton;
			raceIndex = 0;
		createRaces();
			this.infoPanel = new InfoPanel(raceOptions, raceDescriptions);

		panelSetup();
		
		createMasterPanel();

	}

	private void createRaces() {

		raceOptions = new String[]{"Dragonborn", "Dwarf", "Elf", "Gnome", "HalfElf", "Halfling", "Halforc", "Human", "Tiefling"};

		raceDescriptions = new String[]{

				"Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life."

		};

	}

	private void createMasterPanel() {

		JLabel title = new JLabel("Step 1: Choose Race");
			title.setHorizontalAlignment(SwingConstants.CENTER);
			title.setFont(headerFont);
			title.setForeground(darkestBrown);
		add(title, BorderLayout.NORTH);

			JPanel racePanel = new JPanel();
				racePanel.setOpaque(false);
				racePanel.setLayout(null);
			racePanel.add(infoPanel);
			racePanel.add(createRaceButtonPanel());

		add(racePanel);
		add(createNavPanel(), BorderLayout.SOUTH);

	}

	private JPanel createRaceButtonPanel() {

			JPanel buttonPanel = new JPanel(new GridLayout(raceOptions.length, 1, 0, 0));
				buttonPanel.setBackground(lightBrown);

			buttonPanel.setBounds(585, 45, 135, 355);

			raceOptionButtons = new DefaultButton[raceOptions.length];


		for (int i = 0; i < raceOptionButtons.length; i++) {

			raceOptionButtons[i] = createButton(raceOptions[i], i);

		}


		for (int i = 0; i < raceOptions.length; i++) {

			buttonPanel.add(raceOptionButtons[i]);

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
			button.addActionListener(e -> updateButtons(raceIndex, index));

		return button;

	}

	private void updateButtons(int lastIndex, int newIndex) {

		raceOptionButtons[lastIndex].deSelect();
		raceOptionButtons[newIndex].select();

		raceIndex = newIndex;
		infoPanel.updateInfo(raceIndex);

	}

	public int getRaceChoice() {

		return raceIndex;

	}

}
