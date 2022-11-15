package GUI.Panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.JTextPane;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;

public class ChooseAbilityScoresPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChooseAbilityScoresPanel(JButton backButton, JButton continueButton) {
		createEntirePanel(backButton, continueButton);

	}

	/**
	 * 
	 */
	private void createEntirePanel(JButton backButton, JButton continueButton) {
		setBackground(new Color(222, 184, 135));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(160, 82, 45), new Color(165, 42, 42), new Color(0, 0, 0), null));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = createLbl();
		add(lblNewLabel, BorderLayout.NORTH);
		//Creates back and continue panel
		JPanel backContPanel = createBackContinuePanel(backButton, continueButton);
		add(backContPanel, BorderLayout.SOUTH);
		
		JPanel innerPanel = createInnerPanel();
		add(innerPanel, BorderLayout.CENTER);
	}

	/**
	 * @return
	 */
	private JPanel createInnerPanel() {
		JPanel innerPanel = new JPanel();
		innerPanel.setOpaque(false);
		innerPanel.setLayout(null);
		
		createInfoPanel(innerPanel);
		
		JPanel mainAbilityPanel = new JPanel();
		mainAbilityPanel.setOpaque(false);
		mainAbilityPanel.setBounds(6, 6, 505, 405);
		innerPanel.add(mainAbilityPanel);
		mainAbilityPanel.setLayout(new GridLayout(2, 3, 10, 10));
		
		JPanel strengthPanel = createAbilityPanel("Strength");
		mainAbilityPanel.add(strengthPanel);
		
		JPanel dexterityPanel = createAbilityPanel("Dexterity");
		mainAbilityPanel.add(dexterityPanel);
		
		JPanel constitutionPanel = createAbilityPanel("Constitution");
		mainAbilityPanel.add(constitutionPanel);
		
		JPanel intelligencePanel = createAbilityPanel("Intelligence");
		mainAbilityPanel.add(intelligencePanel);
		
		JPanel wisdomPanel = createAbilityPanel("Wisdom");
		mainAbilityPanel.add(wisdomPanel);
		
		JPanel charismaPanel = createAbilityPanel("Charisma");
		mainAbilityPanel.add(charismaPanel);
		
		return innerPanel;
	}

	/**
	 * @return
	 */
	private JPanel createAbilityPanel(String str) {
		JPanel abilityPanel = new JPanel();
		abilityPanel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		abilityPanel.setBackground(new Color(205, 133, 63));
		abilityPanel.setBorder(new LineBorder(new Color(165, 42, 42), 6, true));
		abilityPanel.setLayout(new BorderLayout(0, 0));
		
		JLabel abilityLbl = new JLabel(str);
		abilityLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		abilityLbl.setHorizontalAlignment(SwingConstants.CENTER);
		abilityPanel.add(abilityLbl, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("Information");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setName("infoBtn");
		abilityPanel.add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		panel.setOpaque(false);
		abilityPanel.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel scoreLbl = new JLabel("1");
		scoreLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		scoreLbl.setHorizontalAlignment(SwingConstants.CENTER);
		scoreLbl.setBounds(56, 50, 30, 30);
		panel.add(scoreLbl);
		
		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnNewButton_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		btnNewButton_1.setBounds(90, 50, 30, 30);
		panel.add(btnNewButton_1);
		
		JButton decreaseBtn = new JButton("-");
		decreaseBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		decreaseBtn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		decreaseBtn.setBounds(21, 50, 30, 30);
		panel.add(decreaseBtn);
		return abilityPanel;
	}

	/**
	 * @param innerPanel
	 */
	private void createInfoPanel(JPanel innerPanel) {
		JPanel infoPanel = new JPanel();
		infoPanel.setOpaque(false);
		infoPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		infoPanel.setBounds(508, 6, 212, 405);
		innerPanel.add(infoPanel);
		infoPanel.setLayout(null);
		
		JLabel infoLbl = new JLabel("Information");
		infoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		infoLbl.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 24));
		infoLbl.setBounds(6, 6, 200, 23);
		infoPanel.add(infoLbl);
		
		JTextPane textPane = new JTextPane();
		textPane.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		textPane.setBackground(new Color(205, 133, 63));
		textPane.setBounds(6, 28, 200, 240);
		infoPanel.add(textPane);
		
		JPanel diceRollerPanel = new JPanel();
		diceRollerPanel.setBackground(new Color(160, 82, 45));
		diceRollerPanel.setBounds(6, 269, 200, 130);
		infoPanel.add(diceRollerPanel);
		diceRollerPanel.setLayout(null);
		
		JLabel diceRollLbl = new JLabel("4 X D6 Dice Roll");
		diceRollLbl.setHorizontalAlignment(SwingConstants.CENTER);
		diceRollLbl.setFont(new Font("Bodoni 72", Font.PLAIN, 16));
		diceRollLbl.setBounds(6, 0, 194, 22);
		diceRollerPanel.add(diceRollLbl);
		
		JButton diceRollBtn = new JButton("Roll");
		diceRollBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		diceRollBtn.setBounds(45, 95, 117, 29);
		diceRollerPanel.add(diceRollBtn);
		
		JLabel d6Lbl1 = new JLabel("1");
		d6Lbl1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		d6Lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		d6Lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		d6Lbl1.setOpaque(true);
		d6Lbl1.setBackground(new Color(255, 215, 0));
		d6Lbl1.setBounds(26, 50, 30, 30);
		diceRollerPanel.add(d6Lbl1);
		
		JLabel d6Lbl2 = new JLabel("1");
		d6Lbl2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		d6Lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		d6Lbl2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		d6Lbl2.setOpaque(true);
		d6Lbl2.setBackground(new Color(255, 215, 0));
		d6Lbl2.setBounds(68, 50, 30, 30);
		diceRollerPanel.add(d6Lbl2);
		
		JLabel d6Lbl3 = new JLabel("1");
		d6Lbl3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		d6Lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		d6Lbl3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		d6Lbl3.setOpaque(true);
		d6Lbl3.setBackground(new Color(255, 215, 0));
		d6Lbl3.setBounds(110, 50, 30, 30);
		diceRollerPanel.add(d6Lbl3);
		
		JLabel d6lbl4 = new JLabel("1");
		d6lbl4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		d6lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		d6lbl4.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		d6lbl4.setOpaque(true);
		d6lbl4.setBackground(new Color(255, 215, 0));
		d6lbl4.setBounds(152, 50, 30, 30);
		diceRollerPanel.add(d6lbl4);
	}
	
	private JPanel createBackContinuePanel(JButton backButton, JButton continueButton) {
		JPanel backContPanel = new JPanel();
		backContPanel.setBackground(new Color(205, 133, 63));
		
		
/*		JButton backBtn = new JButton("<--- Back      ");
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backContPanel.add(backBtn);*/
		backContPanel.add(backButton);
		
/*		JButton continueBtn = new JButton("Continue --->");
		continueBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		backContPanel.add(continueBtn);*/
		backContPanel.add(continueButton);
		return backContPanel;
	}
	
	/**
	 * @return
	 */
	private JLabel createLbl() {
		JLabel titleLbl = new JLabel("Step 3: Ability Scores");
		titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		titleLbl.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 33));
		return titleLbl;
	}
}
