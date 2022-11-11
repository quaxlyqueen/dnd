package GUI.Panels;

import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.BevelBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainMenu() {
		setBackground(new Color(222, 184, 135));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(160, 82, 45), new Color(165, 42, 42), new Color(0, 0, 0), null));
		setLayout(new BorderLayout(0, 0));
		
		JLabel mainMenuLbl = mainMenuLbl();
		add(mainMenuLbl, BorderLayout.NORTH);
		
		JPanel controlPanel = createControlPanel();
		add(controlPanel, BorderLayout.CENTER);
	}

	/**
	 * @return
	 */
	private JPanel createControlPanel() {
		JPanel controlPanel = new JPanel();
		controlPanel.setOpaque(false);
		controlPanel.setLayout(null);
		
		JButton newCharBtn = new JButton("New \nCharacter");
		newCharBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newCharBtn.setOpaque(true);
		newCharBtn.setBackground(new Color(160, 82, 45));
		newCharBtn.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 23));
		newCharBtn.setBounds(118, 90, 200, 50);
		controlPanel.add(newCharBtn);
		
		JButton randCharacterBtn = new JButton("Random Character");
		randCharacterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		randCharacterBtn.setOpaque(true);
		randCharacterBtn.setBackground(new Color(160, 82, 45));
		randCharacterBtn.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 23));
		randCharacterBtn.setBounds(118, 156, 200, 50);
		controlPanel.add(randCharacterBtn);
		
		JButton loadCharacter = new JButton("Load Character");
		loadCharacter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		loadCharacter.setOpaque(true);
		loadCharacter.setBackground(new Color(160, 82, 45));
		loadCharacter.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 23));
		loadCharacter.setBounds(376, 98, 233, 97);
		controlPanel.add(loadCharacter);
		return controlPanel;
	}

	/**
	 * @return
	 */
	private JLabel mainMenuLbl() {
		JLabel mainMenuLbl = new JLabel("Main Menu");
		mainMenuLbl.setFont(new Font("Bodoni 72 Smallcaps", Font.PLAIN, 33));
		mainMenuLbl.setHorizontalAlignment(SwingConstants.CENTER);
		return mainMenuLbl;
	}
}
