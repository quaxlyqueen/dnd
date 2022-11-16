package GUI.Panels;

import GUI.PanelTheme;
import GUI.Panels.SubPanels.*;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class ChooseRacePanel extends JPanel implements PanelTheme {

	private String[] raceOptions;

	private String[] raceDescriptions;

	private InfoPanel infoPanel;

	private int raceIndex;
	private JButton backButton;
	private JButton continueButton;

	/**
	 * Create the panel.
	 */
	public ChooseRacePanel(JButton backButton, JButton continueButton) {
		super();
			this.backButton = backButton;
			this.continueButton = continueButton;
		createRaces();
			this.infoPanel = new InfoPanel(raceOptions, raceDescriptions);

		panelSetup();
		
		add(createMasterPanel());

	}

	private void createRaces() {

		raceOptions = new String[]{"Dragonborn", "Dwarf", "Elf", "Gnome", "HalfElf", "Halfling", "Halforc", "Human", "Tiefling"};

		raceDescriptions = new String[]{

				"Born of dragons, as their name proclaims, the dragonborn walk proudly through a world that greets them with fearful incomprehension. Shaped by draconic gods or the dragons themselves, dragonborn originally hatched from dragon eggs as a unique race, combining the best attributes of dragons and humanoids. Some dragonborn are faithful servants to true dragons, others form the ranks of soldiers in great wars, and still others find themselves adrift, with no clear calling in life."

		};

	}

	private JPanel createMasterPanel() {

		JLabel lblNewLabel = new JLabel("Step 1: Choose Race");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 33));
		add(lblNewLabel, BorderLayout.NORTH);

		JPanel racePanel = new JPanel();
			racePanel.setOpaque(false);
			racePanel.setLayout(null);

		racePanel.add(infoPanel);

			racePanel.add(createRaceButtonPanel());

			add(createNavPanel(), BorderLayout.SOUTH);

		return racePanel;

	}

	private JPanel createRaceButtonPanel() {

		JPanel raceBtnPanel = new JPanel(new GridLayout(raceOptions.length, 1, 15, 5));
			raceBtnPanel.setBackground(darkBrown);
			raceBtnPanel.setBounds(311, 6, 109, 394);


		for (int i = 0; i < raceOptions.length; i++) {

			raceBtnPanel.add(createButton(raceOptions[i], i));

		}

		return raceBtnPanel;

	}

	private void panelSetup() {

		setBackground(lightBrown);
		setLayout(new BorderLayout(0, 0));

	}

	private JPanel createNavPanel() {

		JPanel panel = new JPanel();
			panel.setBackground(darkBrown);

			panel.add(backButton);
			panel.add(continueButton);

		return panel;

	}

	private JButton createButton(String raceName, int index) {

		JButton button = new JButton(raceName);
			button.addActionListener(

					e -> {

						raceIndex = index;
						infoPanel.updateInfo(raceIndex);

					}

			);

		return button;

	}

	public int getRaceChoice() {

		return raceIndex;

	}



}
