package GUI.Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

public class step2 extends JPanel {

	/**
	 * Create the panel.
	 */
	public step2() {
		setBackground(new Color(222, 184, 135));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(160, 82, 45), new Color(165, 42, 42), new Color(0, 0, 0), null));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = createLbl();
		add(lblNewLabel, BorderLayout.NORTH);
		//Creates back and continue panel
		JPanel backContPanel = createBackContinuePanel();
		add(backContPanel, BorderLayout.SOUTH);
		
		JPanel innerPanel = new JPanel();
		innerPanel.setOpaque(false);
		innerPanel.setLayout(null);
		
		JPanel infoPanel = createInfoPanel();
		innerPanel.add(infoPanel);
		
		JPanel btnPanel = createBtnPanel();
		innerPanel.add(btnPanel);
		
		add(innerPanel, BorderLayout.CENTER);
	}
	
	private JPanel createBtnPanel() {
		JPanel btnPanel = new JPanel();
		btnPanel.setBackground(new Color(165, 42, 42));
		btnPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnPanel.setBounds(311, 6, 409, 394);
		
		JButton artificerBtn = new JButton("Artificer");
		artificerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(artificerBtn);

		JButton barbarianBtn = new JButton("Barbarian");
		barbarianBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(barbarianBtn);
		
		JButton bardBtn = new JButton("Bard");
		bardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(bardBtn);
		
		JButton clericBtn = new JButton("Cleric");
		clericBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(clericBtn);
		
		JButton druidBtn = new JButton("Druid");
		druidBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(druidBtn);
		
		JButton fighterBtn = new JButton("Figther");
		fighterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(fighterBtn);
		
		JButton monkBtn = new JButton("Monk");
		monkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(monkBtn);
		
		JButton paladinBtn = new JButton("Paladin");
		paladinBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(paladinBtn);
		
		JButton rangerBtn = new JButton("Ranger");
		rangerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(rangerBtn);
		
		JButton rogueBtn = new JButton("Rogue");
		rogueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(rogueBtn);
		
		JButton sorcererBtn = new JButton("Sorcerer");
		sorcererBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(sorcererBtn);
		
		JButton warlockBtn = new JButton("Warlock");
		warlockBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(warlockBtn);
		
		JButton wizardBtn = new JButton("Wizard");
		wizardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPanel.add(wizardBtn);
		
		
		
		return btnPanel;
	}
	
	private JPanel createInfoPanel() {
		JPanel infoPanel = new JPanel();
		infoPanel.setOpaque(false);
		infoPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		infoPanel.setBounds(6, 6, 293, 394);
		infoPanel.setLayout(null);
		
		JLabel infoLbl = new JLabel("Information");
		infoLbl.setFont(new Font("Bodoni 72", Font.PLAIN, 20));
		infoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		infoLbl.setBounds(92, 6, 105, 16);
		infoPanel.add(infoLbl);
		
		JTextPane infoTextPane = new JTextPane();
		infoTextPane.setOpaque(false);
		infoTextPane.setBounds(6, 21, 281, 367);
		infoPanel.add(infoTextPane);
		return infoPanel;
	}
	
	/**
	 * @return
	 */
	private JPanel createBackContinuePanel() {
		JPanel backContPanel = new JPanel();
		backContPanel.setBackground(new Color(205, 133, 63));
		
		
		JButton backBtn = new JButton("<--- Back      ");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backContPanel.add(backBtn);
		
		JButton continueBtn = new JButton("Continue --->");
		continueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backContPanel.add(continueBtn);
		return backContPanel;
	}
	
	/**
	 * @return
	 */
	private JLabel createLbl() {
		JLabel lblNewLabel = new JLabel("Step 2: Choose Class");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 33));
		return lblNewLabel;
	}

}
