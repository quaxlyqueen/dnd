package GUI.Panels.SubPanels;

import GUI.AppTheme;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Objects;
import java.util.Random;

public class InfoPanel extends JPanel implements AppTheme {

    private JTextArea[] descriptions;
    private String[] holderDescriptions;
    private JLabel[][] portraits;
    private String[] categoryHolder;
    private static int numInfoPanelObjects = 0;
    private int lastIndex;

    public InfoPanel(String[] categoryHolder, String[] holderDescriptions) {

        super();
            numInfoPanelObjects++;
            this.categoryHolder = categoryHolder;
            this.holderDescriptions = holderDescriptions;

            panelSetup();

            createDescriptions();
            createPortraits();

        updateInfo(0); // Default selection of the 0th elements.

    }

    public void updateInfo(int holderIndex) {

        removeAll();


            panelSetup();
        add(descriptions[holderIndex]);

        System.out.println();

        add(portraits[holderIndex][getNextPortrait(holderIndex)]);

        repaint();
        revalidate();

    }


    private int getNextPortrait(int holderIndex) {

        Random ran = new Random();
        int bound = portraits[holderIndex].length;
        int newIndex = ran.nextInt(bound);

/*        while(newIndex == lastIndex) {

            newIndex = ran.nextInt(bound);

        }*/

        lastIndex = newIndex;

        return newIndex;

    }

    private void panelSetup() {

        setOpaque(false);
        setBounds(5, 5, 600, 400);
        setLayout(null);

        JLabel subHeader = new JLabel("Description");
            subHeader.setFont(subHeaderFont);
            subHeader.setHorizontalAlignment(SwingConstants.LEFT);
            subHeader.setBounds(275, 10, 300, 35);
            subHeader.setForeground(darkestBrown);

        add(subHeader);
        
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
                tmpDesc.setFont(paragraphFont);
                tmpDesc.setBounds(275, 45, 300, 355);
                tmpDesc.setBorder(new EmptyBorder(5, 5, 5, 5));
                tmpDesc.setForeground(darkestBrown);

            descriptions[i] = tmpDesc;

        }

    }

    private void createPortraits() {

        String category = "";

        if(numInfoPanelObjects == 1) {

            category = "Races";

        } else if (numInfoPanelObjects == 2) {

            category = "Classes";

        }

        portraits = new JLabel[categoryHolder.length][];

        for (int i = 0; i < categoryHolder.length; i++) {

            File imagesDir;

            if(OS.startsWith("Windows")) {

                imagesDir = new File("dndBuilder\\src\\Resources\\Img\\" + category + "\\" + categoryHolder[i].toLowerCase() + "\\");

            } else if (OS.startsWith("Mac")) {

                imagesDir = new File("dndBuilder/src/Resources/Img/" + category + "/" + categoryHolder[i].toLowerCase() + "/");

            } else if (OS.startsWith("Linux")) {

                imagesDir = new File("dndBuilder/src/Resources/Img/" + category + "/"  + categoryHolder[i].toLowerCase() + "/");

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
                    portraits[i][index].setBounds(10, 45, 250, 355);

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
            finalImg = img.getScaledInstance(250, 375, Image.SCALE_SMOOTH);

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
