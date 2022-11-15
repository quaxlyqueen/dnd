package GUI.Panels.SubPanels;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;

public class InfoPanel extends JPanel {

    private JTextArea[] descriptions;
    private String[] holderDescriptions;
    private JLabel[][] portraits;
    private String[] categoryHolder;
    private int lastIndex;

    public InfoPanel(String[] categoryHolder, String[] holderDescriptions) {

        super();
            panelSetup();

    }

    private void panelSetup() {

        setOpaque(false);
        setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        setBounds(6, 6, 293, 394);
        setLayout(null);

        JLabel infoLbl = new JLabel("Information");
            infoLbl.setFont(new Font("Bodoni 72", Font.PLAIN, 20));
            infoLbl.setHorizontalAlignment(SwingConstants.CENTER);
            infoLbl.setBounds(92, 6, 105, 16);
        add(infoLbl);
        
    }

}
