package GUI.img;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.*;

public class ImagePanel extends JPanel {

    private JLabel[][] portraits;
    private String[] holder;
    private int lastIndex;

    public ImagePanel(String[] holder) {

        super();
            this.holder = holder;
            createPortraitsArray();

            updateImage(0); // Default selection of the 0th element.

    }

    public void updateImage(int holderIndex) {

        removeAll();

        Random ran = new Random();
            int bound = portraits[holderIndex].length;
            int newIndex = ran.nextInt(bound);

            while(newIndex == lastIndex) {

                newIndex = ran.nextInt(bound);

            }

        lastIndex = newIndex;

        add(portraits[holderIndex][newIndex]);

        repaint();
        revalidate();


    }

    private void createPortraitsArray() {

        portraits = new JLabel[holder.length][];

        for (int i = 0; i < holder.length; i++) {

            File imagesDir = new File("dndBuilder/src/GUI/img/" + holder[i] + "/");

            File[] dir = imagesDir.listFiles();
                portraits[i] = new JLabel[dir.length];
            int index = 0;

            for (File file : dir) {

                portraits[i][index] = image(file);
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
            finalImg = img.getScaledInstance(250, 250, Image.SCALE_SMOOTH);

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
