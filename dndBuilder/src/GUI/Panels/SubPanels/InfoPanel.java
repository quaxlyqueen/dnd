package GUI.Panels.SubPanels;

import GUI.PanelTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Objects;
import java.util.Random;

public class InfoPanel extends JPanel implements PanelTheme {

    private JTextArea[] descriptions;
    private String[] holderDescriptions;
    private JLabel[][] portraits;
    private String[] categoryHolder;

    private static String OS = null;
    private int lastIndex;

    public InfoPanel(String[] categoryHolder, String[] holderDescriptions) {

        super();
            this.categoryHolder = categoryHolder;
            this.holderDescriptions = holderDescriptions;

            if (OS == null) {

                OS = System.getProperty("os.name");

            }

            panelSetup();

            createDescriptions();
            createPortraits();

        updateInfo(0); // Default selection of the 0th elements.

    }

    public void updateInfo(int holderIndex) {

        removeAll();

            panelSetup();

        add(descriptions[holderIndex]);
        add(portraits[holderIndex][getNextPortrait(holderIndex)]);

        repaint();
        revalidate();

    }

    private int getNextPortrait(int holderIndex) {

        Random ran = new Random();
        int bound = portraits[holderIndex].length;
        int newIndex = ran.nextInt(bound);

        while(newIndex == lastIndex) {

            newIndex = ran.nextInt(bound);

        }

        lastIndex = newIndex;

        return newIndex;

    }

    private void panelSetup() {

        setOpaque(false);
        setBounds(6, 6, 293, 394);
        setLayout(null);

        JLabel infoLbl = new JLabel("Information");
            infoLbl.setFont(new Font("Bodoni 72", Font.PLAIN, 20));
            infoLbl.setHorizontalAlignment(SwingConstants.CENTER);
            infoLbl.setBounds(92, 6, 105, 16);
        add(infoLbl);
        
    }

    private void createDescriptions() {

        descriptions = new JTextArea[holderDescriptions.length];

        for (int i = 0; i < holderDescriptions.length; i++) {

            JTextArea tmpDesc = new JTextArea();
                tmpDesc.setText(holderDescriptions[i]);
                tmpDesc.setWrapStyleWord(true);
                tmpDesc.setLineWrap(true);
                tmpDesc.setOpaque(false);
                tmpDesc.setEditable(false);
                tmpDesc.setFocusable(false);
                tmpDesc.setFont(new Font("Bodoni 72", Font.PLAIN, 10));
                tmpDesc.setBounds(6, 21, 281, 196);

            descriptions[i] = tmpDesc;

        }

    }

    private void createPortraits() {

        portraits = new JLabel[categoryHolder.length][];

        for (int i = 0; i < categoryHolder.length; i++) {

            File imagesDir;

            /*

            WINDOWS:
                attempted
                        dndBuilder/src/GUI/img/category/
                        dndBuilder/src/GUI/img/category
                        /dndBuilder/src/GUI/img/category
                        /dndBuilder/src/GUI/img/category/
                        GUI/img/category/
                        /GUI/img/category/
                        src/GUI/img/category/
                        /src/GUI/img/category/

             */

            if(OS.startsWith("Windows")) {

                imagesDir = new File("dndBuilder\\src\\GUI\\img\\" + categoryHolder[i] + "\\");

            } else if (OS.startsWith("Mac")) {

                imagesDir = new File("dndBuilder/src/GUI/img/" + categoryHolder[i] + "/");

            } else if (OS.startsWith("Linux")) {

                imagesDir = new File("dndBuilder/src/GUI/img/" + categoryHolder[i] + "/");

            } else {

                System.out.println("Unable to detect operating system.");
                return;

            }

            File[] dir = imagesDir.listFiles();
            portraits[i] = new JLabel[dir.length];
            int index = 0;

            for (File file : dir) {

                portraits[i][index] = image(file);
                    portraits[i][index].setOpaque(true);
                    portraits[i][index].setBackground(lightBrown);
                    portraits[i][index].setBounds(6, 229, 281, 159);

                index++;

            }

        }

    }

    private JLabel image(File file) {

        BufferedImage img;
        Image finalImg;
        JLabel picture;

        try {

            img = ImageIO.read(file);
            finalImg = img.getScaledInstance(281, 196, Image.SCALE_SMOOTH);

        } catch (Exception e) {

            System.out.println("Error reading file.");
            img = null;
            finalImg = null;

        }

        if(Objects.isNull(finalImg)) {

            picture = new JLabel("ERROR: Image not found.");

        } else {

            picture = new JLabel(new ImageIcon(finalImg));

        }

        return picture;

    }

}
