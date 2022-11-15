package GUI.Panels;

import GUI.Panels.SubPanels.DescriptionPanel;
import GUI.Panels.SubPanels.ImagePanel;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class ChooseRacePanel extends JPanel {

	private String[] raceOptions;

	private String[] raceDescriptions;
	private ImagePanel imgPanel;
	private DescriptionPanel descPanel;

	// DEBUG: raceChoice to be deprecated after testing.
	private String raceChoice;
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
			raceOptions = new String[]{"Dragonborn", "Dwarf", "Elf", "Gnome", "HalfElf", "Halfling", "Halforc", "Human", "Tiefling"};
			createRaceDescriptions();
			imgPanel = new ImagePanel(raceOptions);
			descPanel = new DescriptionPanel(raceDescriptions);

			panelSetup();
		
		add(createMasterPanel());

	}

	private void createRaceDescriptions() {

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



			infoPanel.add(imgPanel);
			infoPanel.add(descPanel);

		racePanel.add(infoPanel);

			racePanel.add(createRaceButtonPanel());

			add(createNavPanel(), BorderLayout.SOUTH);

		return racePanel;

	}

	private JPanel createRaceButtonPanel() {

		JPanel raceBtnPanel = new JPanel();
			raceBtnPanel.setBackground(new Color(165, 42, 42));
			raceBtnPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			raceBtnPanel.setBounds(311, 6, 409, 394);

		for (int i = 0; i < raceOptions.length; i++) {

			raceBtnPanel.add(createButton(raceOptions[i], i));

		}

		return raceBtnPanel;

	}

	private void panelSetup() {

		setBackground(new Color(222, 184, 135));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(160, 82, 45), new Color(165, 42, 42), new Color(0, 0, 0), null));
		setLayout(new BorderLayout(0, 0));

	}

	private JPanel createNavPanel() {

		JPanel panel = new JPanel();
			panel.setBackground(new Color(205, 133, 63));

			panel.add(backButton);
			panel.add(continueButton);

		return panel;

	}

	private JButton createButton(String raceName, int index) {

		JButton button = new JButton(raceName);
			button.addActionListener(

					e -> {

						raceChoice = raceName;
						raceIndex = index;
						imgPanel.updateImage(raceIndex);
						descPanel.updateDescription(raceIndex);

					}

			);

		return button;

	}

	public int getRaceChoice() {

		return raceIndex;

	}



}
