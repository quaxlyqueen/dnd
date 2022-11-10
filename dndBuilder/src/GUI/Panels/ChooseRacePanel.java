package GUI.Panels;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChooseRacePanel extends JPanel {

	private String raceChoice;

	/**
	 * Create the panel.
	 */
	public ChooseRacePanel() {

		super();
			createMasterPanel();

	}

	private void createMasterPanel() {

		setLayout(new BorderLayout(0, 0));

		JPanel masterPanel = new JPanel();

		JLabel title = new JLabel("Step 1: Choose Race");
		title.setHorizontalAlignment(SwingConstants.CENTER);
		masterPanel.add(title, BorderLayout.NORTH);

		JPanel racesContainer = new JPanel();

			String[] availableRaces = {"Dragonborn", "Dwarf", "Elf", "Gnome", "Half-Elf", "Halfling", "Half-Orc", "Human", "Tiefling"};

			for (int i = 0; i < availableRaces.length; i++) {

				racesContainer.add(createButton(availableRaces[i]));


			}

			masterPanel.add(racesContainer);

		add(masterPanel);

	}

	private JButton createButton(String raceName) {

		JButton button = new JButton(raceName);
			button.addActionListener(

					new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {

							raceChoice = raceName;

						}
					}

			);

		return button;

	}

}
