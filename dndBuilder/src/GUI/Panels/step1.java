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
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class step1 extends JPanel {

	/**
	 * Create the panel.
	 */
	public step1() {
		setBackground(new Color(222, 184, 135));
		setBorder(new BevelBorder(BevelBorder.RAISED, new Color(160, 82, 45), new Color(165, 42, 42), new Color(0, 0, 0), null));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Step 1: Choose Race");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 33));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel racePanel = new JPanel();
		racePanel.setOpaque(false);
		add(racePanel, BorderLayout.CENTER);
		racePanel.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(47, 67, 223, 301);
		racePanel.add(textPane);
		
		JPanel raceBtnPanel = new JPanel();
		raceBtnPanel.setBackground(new Color(165, 42, 42));
		raceBtnPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		raceBtnPanel.setBounds(311, 6, 409, 394);
		racePanel.add(raceBtnPanel);
		
		JButton dragonbornBtn = new JButton("Dragonborn");
		dragonbornBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		raceBtnPanel.add(dragonbornBtn);
		
		JPanel backContPanel = new JPanel();
		backContPanel.setBackground(new Color(205, 133, 63));
		add(backContPanel, BorderLayout.SOUTH);
		
		JButton backBtn = new JButton("<--- Back      ");
		backContPanel.add(backBtn);
		
		JButton continueBtn = new JButton("Continue --->");
		backContPanel.add(continueBtn);
		
		

	}
}
