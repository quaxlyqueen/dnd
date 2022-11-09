package GUI.Panels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Insets;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;

import java.awt.GridLayout;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;

public class dndCharacterSheet extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPanel panel;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
/*	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dndCharacterSheet frame = new dndCharacterSheet();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the frame.
	 */
	public dndCharacterSheet() {
		
		JLabel imageLabel = new JLabel(new ImageIcon(getClass().getResource("/dnd/img/sheet.jpg")));
		JPanel newPanel = new JPanel();
		newPanel.add(imageLabel);
		JScrollPane scrollPane = new JScrollPane(newPanel);
		
		
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 850, 1200);
		setVisible(true);
		pack();
		
//		contentPane = new JPanel();
//		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
//		setContentPane(contentPane);
//		contentPane.setLayout(new BorderLayout(0, 0));
		
		/*ImagePanel imagePanel = new ImagePanel();
		JScrollPane scrollPane = new JScrollPane();
		
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BorderLayout(0, 0));
		panel1.add(imagePanel, BorderLayout.CENTER);
		scrollPane.add(panel1);
		imagePanel.setLayout(null);
		
		
		contentPane.add(scrollPane, BorderLayout.CENTER);*/
		
//		ImagePanel imagePanel = new ImagePanel();
//		contentPane.add(imagePanel, BorderLayout.CENTER);
//		imagePanel.setLayout(null);
		
	
		
		
		
		
		
	}
}
