package GUI.Panels;

import GUI.AppTheme;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class step4 extends JPanel implements AppTheme {
    private JTextField nameTxtField;
    private JTextField ageTextField;
    private JTextField heightTxtField;
    private JTextField weightTxtField;
    private JTextField skinTxtField;
    private JTextField eyesTxtField;
    private JTextField hairTxtField;

    /**
     * Create the panel.
     */
    public step4() {
        createEntirePanel();


    }

    private void createEntirePanel() {
        setBackground(new Color(222, 184, 135));
        setBorder(new BevelBorder(BevelBorder.RAISED, new Color(160, 82, 45), new Color(165, 42, 42), new Color(0, 0, 0), null));
        setLayout(new BorderLayout(0, 0));

        JLabel lblNewLabel = createLbl();
        add(lblNewLabel, BorderLayout.NORTH);
        //Creates back and continue panel
        JPanel backContPanel = createBackContinuePanel();
        add(backContPanel, BorderLayout.SOUTH);

        JPanel innerPanel = new JPanel();
        innerPanel.setToolTipText("");
        innerPanel.setOpaque(false);
        add(innerPanel, BorderLayout.CENTER);
        innerPanel.setLayout(null);

        JPanel nameAndAlignment = new JPanel();
        nameAndAlignment.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        nameAndAlignment.setBackground(new Color(210, 105, 30));
        nameAndAlignment.setBounds(6, 6, 306, 114);
        innerPanel.add(nameAndAlignment);
        nameAndAlignment.setLayout(null);

        JLabel nameLbl = new JLabel("Character Name: ");
        nameLbl.setBounds(6, 6, 108, 16);
        nameAndAlignment.add(nameLbl);

        nameTxtField = new JTextField();
        nameTxtField.setBounds(121, 1, 173, 26);
        nameAndAlignment.add(nameTxtField);
        nameTxtField.setColumns(10);

        JLabel ageLbl = new JLabel("Age: ");
        ageLbl.setBounds(6, 34, 32, 16);
        nameAndAlignment.add(ageLbl);

        ageTextField = new JTextField();
        ageTextField.setBounds(61, 34, 64, 21);
        nameAndAlignment.add(ageTextField);
        ageTextField.setColumns(10);

        JLabel heightLbl = new JLabel("Height: ");
        heightLbl.setBounds(6, 62, 55, 16);
        nameAndAlignment.add(heightLbl);

        heightTxtField = new JTextField();
        heightTxtField.setBounds(61, 57, 64, 26);
        nameAndAlignment.add(heightTxtField);
        heightTxtField.setColumns(10);

        JLabel weightLbl = new JLabel("Weight:");
        weightLbl.setBounds(6, 90, 61, 16);
        nameAndAlignment.add(weightLbl);

        weightTxtField = new JTextField();
        weightTxtField.setBounds(61, 85, 64, 26);
        nameAndAlignment.add(weightTxtField);
        weightTxtField.setColumns(10);

        JLabel skinLbl = new JLabel("Skin: ");
        skinLbl.setBounds(131, 34, 35, 16);
        nameAndAlignment.add(skinLbl);

        skinTxtField = new JTextField();
        skinTxtField.setBounds(165, 29, 130, 26);
        nameAndAlignment.add(skinTxtField);
        skinTxtField.setColumns(10);

        JLabel eyesLbl = new JLabel("Eyes: ");
        eyesLbl.setBounds(130, 62, 42, 16);
        nameAndAlignment.add(eyesLbl);

        eyesTxtField = new JTextField();
        eyesTxtField.setBounds(164, 57, 130, 26);
        nameAndAlignment.add(eyesTxtField);
        eyesTxtField.setColumns(10);

        JLabel hairLbl = new JLabel("Hair: ");
        hairLbl.setBounds(127, 90, 39, 16);
        nameAndAlignment.add(hairLbl);

        hairTxtField = new JTextField();
        hairTxtField.setBounds(164, 85, 130, 26);
        nameAndAlignment.add(hairTxtField);
        hairTxtField.setColumns(10);

        JPanel alignmentPanel = new JPanel();
        alignmentPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        alignmentPanel.setBackground(new Color(205, 133, 63));
        alignmentPanel.setBounds(324, 6, 396, 114);
        innerPanel.add(alignmentPanel);
        alignmentPanel.setLayout(new BorderLayout(0, 0));

        JLabel alignmentLbl = new JLabel("Alignment");
        alignmentLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
        alignmentLbl.setHorizontalAlignment(SwingConstants.CENTER);
        alignmentPanel.add(alignmentLbl, BorderLayout.NORTH);

        JPanel alignmentInnerPanel = new JPanel();
        alignmentInnerPanel.setOpaque(false);
        alignmentPanel.add(alignmentInnerPanel, BorderLayout.CENTER);
        alignmentInnerPanel.setLayout(new GridLayout(3, 3, 0, 0));

        JButton btnLawfulGood = new JButton("Lawful Good");
        alignmentInnerPanel.add(btnLawfulGood);

        JButton btnNuetralGood = new JButton("Neutral Good");
        alignmentInnerPanel.add(btnNuetralGood);

        JButton btnChaoticGood = new JButton("Chaotic Good");
        alignmentInnerPanel.add(btnChaoticGood);

        JButton btnLawfulNeutral = new JButton("Lawful Neutral");
        alignmentInnerPanel.add(btnLawfulNeutral);

        JButton btnTrueNeutral = new JButton("True Neutral");
        alignmentInnerPanel.add(btnTrueNeutral);

        JButton btnChaoticNeutral = new JButton("Chaotic Neutral");
        alignmentInnerPanel.add(btnChaoticNeutral);

        JButton btnLawfulEvil = new JButton("Lawful Evil");
        alignmentInnerPanel.add(btnLawfulEvil);

        JButton btnNeutralEvil = new JButton("Neutral Evil");
        alignmentInnerPanel.add(btnNeutralEvil);

        JButton btnChaoticEvil = new JButton("Chaotic Evil");
        alignmentInnerPanel.add(btnChaoticEvil);

        JPanel backgroundPanel = new JPanel();
        backgroundPanel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        backgroundPanel.setBackground(new Color(210, 105, 30));
        backgroundPanel.setBounds(6, 132, 306, 264);
        innerPanel.add(backgroundPanel);
        backgroundPanel.setLayout(new BorderLayout(0, 0));

        JLabel backgroundLbl = new JLabel("Background");
        backgroundLbl.setFont(new Font("Dialog", Font.PLAIN, 20));
        backgroundLbl.setHorizontalAlignment(SwingConstants.CENTER);
        backgroundPanel.add(backgroundLbl, BorderLayout.NORTH);

        JPanel backgroundInnerPanel = new JPanel();
        backgroundInnerPanel.setOpaque(false);
        backgroundPanel.add(backgroundInnerPanel, BorderLayout.CENTER);
        backgroundInnerPanel.setLayout(new GridLayout(9, 2, 0, 0));

        JButton btnAcolyte = new JButton("Acolyte");
        backgroundInnerPanel.add(btnAcolyte);

        JButton btnCharlatan = new JButton("Charlatan");
        backgroundInnerPanel.add(btnCharlatan);

        JButton btnCriminal = new JButton("Criminal");
        backgroundInnerPanel.add(btnCriminal);

        JButton btnEntertainer = new JButton("Entertainer");
        backgroundInnerPanel.add(btnEntertainer);

        JButton btnFolkHero = new JButton("Folk Hero");
        backgroundInnerPanel.add(btnFolkHero);

        JButton btnGladiator = new JButton("Gladiator");
        backgroundInnerPanel.add(btnGladiator);

        JButton btnGuildArtisan = new JButton("Guild Artisan");
        backgroundInnerPanel.add(btnGuildArtisan);

        JButton btnGuildMerchant = new JButton("Guild Merchant");
        backgroundInnerPanel.add(btnGuildMerchant);

        JButton btnHermit = new JButton("Hermit");
        backgroundInnerPanel.add(btnHermit);

        JButton btnKnight = new JButton("Knight");
        backgroundInnerPanel.add(btnKnight);

        JButton btnNoble = new JButton("Noble");
        backgroundInnerPanel.add(btnNoble);

        JButton btnOutlander = new JButton("Outlander");
        backgroundInnerPanel.add(btnOutlander);

        JButton btnPirate = new JButton("Pirate");
        backgroundInnerPanel.add(btnPirate);

        JButton btnSage = new JButton("Sage");
        backgroundInnerPanel.add(btnSage);

        JButton btnSailor = new JButton("Sailor");
        backgroundInnerPanel.add(btnSailor);

        JButton btnSoldier = new JButton("Soldier");
        backgroundInnerPanel.add(btnSoldier);

        JButton btnSpy = new JButton("Spy");
        backgroundInnerPanel.add(btnSpy);

        JButton btnUrchin = new JButton("Urchin");
        backgroundInnerPanel.add(btnUrchin);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(205, 133, 63));
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(324, 132, 396, 264);
        panel.setLayout(new BorderLayout(0, 0));

        JLabel lblDescription = new JLabel("Description");
        lblDescription.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
        lblDescription.setHorizontalAlignment(SwingConstants.CENTER);

        JTextArea textArea = new JTextArea();
        textArea.setBackground(new Color(238, 232, 170));

        panel.add(lblDescription, BorderLayout.NORTH);
        panel.add(textArea, BorderLayout.CENTER);

        innerPanel.add(panel);

    }

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
        JLabel titleLbl = new JLabel("Step 4: Description");
        titleLbl.setHorizontalAlignment(SwingConstants.CENTER);
        titleLbl.setFont(new Font("Bodoni 72 Oldstyle", Font.PLAIN, 33));
        return titleLbl;
    }
}
