import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Objects;
import java.util.Random;

public class ImageInfoPanel extends InfoPanel implements AppTheme {

    private JLabel[][] portraits;
    private int lastIndex;

    public ImageInfoPanel(String[] categoryHolder, String[] holderDescriptions, Rectangle[] bounds, int panelIndex) {

        super(categoryHolder, holderDescriptions, bounds, panelIndex);
        createPortraits();

    }

    @Override
    public void updateInfo(int holderIndex) {

        super.updateInfo(holderIndex, portraits[holderIndex][getNextPortrait(holderIndex)]);

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

    private void createPortraits() {

        String category = "";

        if (panelIndex == 1) {

            category = "Races";

        } else if (panelIndex == 2) {

            category = "Classes";

        }

        portraits = new JLabel[categoryHolder.length][];

        for (int i = 0; i < categoryHolder.length; i++) {

            File imagesDir;

            if (OS.startsWith("Windows")) {

                imagesDir = new File("dndBuilder\\src\\Resources\\Img\\" + category + "\\" + categoryHolder[i].toLowerCase() + "\\");

            } else if (OS.startsWith("Mac")) {

                imagesDir = new File("dndBuilder/src/Resources/Img/" + category + "/" + categoryHolder[i].toLowerCase() + "/");

            } else if (OS.startsWith("Linux")) {
                imagesDir = new File("Img/" + category + "/" + categoryHolder[i].toLowerCase());

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
                portraits[i][index].setBounds(bounds[3]);

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

        if (Objects.isNull(finalImg)) {

            picture = new JLabel("ERROR: Image not found.");

        } else {

            picture = new JLabel(new ImageIcon(finalImg));

        }

        return picture;

    }

}
