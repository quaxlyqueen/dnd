package dnd;

import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class LoadCharacter extends JPanel {

	public LoadCharacter() {

		setBackground(new Color(205, 133, 63));
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Load a Character");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 31));
		add(lblNewLabel, BorderLayout.NORTH);
		
		JPanel loadCharacterMainPanel = new JPanel();
		loadCharacterMainPanel.setOpaque(false);
		add(loadCharacterMainPanel, BorderLayout.CENTER);
		loadCharacterMainPanel.setLayout(null);
		
		JPanel characterLoadPanel = new JPanel();
		characterLoadPanel.setBackground(new Color(210, 180, 140));
		characterLoadPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		characterLoadPanel.setBounds(54, 47, 340, 346);
		loadCharacterMainPanel.add(characterLoadPanel);
		characterLoadPanel.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton characterSave1 = new JButton("Load Character 1");
		characterLoadPanel.add(characterSave1);
		
		JButton characterSave2 = new JButton("Load Character 2");
		characterLoadPanel.add(characterSave2);
		
		JButton characterSave3 = new JButton("Load Character 3");
		characterLoadPanel.add(characterSave3);
		
		JButton characterSave4 = new JButton("Load Character 4");
		characterLoadPanel.add(characterSave4);
		
		JButton characterSave5 = new JButton("Load Character 5");
		characterLoadPanel.add(characterSave5);
		
		JButton goBtn = new JButton("Go");
		goBtn.setOpaque(true);
		goBtn.setBackground(new Color(210, 105, 30));
		goBtn.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		goBtn.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		goBtn.setBounds(481, 261, 124, 50);
		loadCharacterMainPanel.add(goBtn);
		
		JButton goBack = new JButton("Go Back");
		goBack.setOpaque(true);
		goBack.setBackground(new Color(210, 105, 30));
		goBack.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		goBack.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		goBack.setBounds(481, 343, 124, 50);
		loadCharacterMainPanel.add(goBack);

	}



}
