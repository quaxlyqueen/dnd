package dnd;

import javax.imageio.*;
import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

import static dnd.AppConstants.*;

public class ImageManager extends FileManager {
    private static JLabel[][] racePortraits;
    private static JLabel[][] classPortraits; 
    private static ArrayList<JLabel> savesPortraits;

    public ImageManager() {
        super();
            racePortraits = new JLabel[9][];
            classPortraits = new JLabel[12][];
            savesPortraits = new ArrayList<>();
        createPortraitArray(racePortraits, "race");
        createPortraitArray(classPortraits, "class"); 
        createSavesPortraits();
    }

    public JLabel getRacePortrait(int raceIndex) {
      if(raceIndex < 1) return new JLabel();
      return racePortraits[raceIndex][0];
      //return racePortraits[raceIndex][new Random().nextInt(racePortraits[raceIndex].length)];
    }

    public JLabel getClassPortrait(int classIndex) {
      if(classIndex < 1) return new JLabel();
      return classPortraits[classIndex][new Random().nextInt(classPortraits[classIndex].length)];
    }

    private void createSavesPortraits() {
        File[] dir = new File(imgFilepath + "/saves/").listFiles();
        for(File file : dir) {
            JLabel holder = image(file);
                holder.setOpaque(true);
                holder.setBackground(lightBrown);
            savesPortraits.add(holder);
        }
    }

    private void createPortraitArray(JLabel[][] portraits, String category) {
        File imgDir = new File(imgFilepath + category + "/");
        File[] masterDir = imgDir.listFiles();

        for(int i = 0; i < portraits.length; i++) {
            File[] tmpDir = masterDir[i].listFiles();
            portraits[i] = new JLabel[tmpDir.length];
            int index = 0;
            for(File file : tmpDir) {
                portraits[i][index] = image(file);
                    portraits[i][index].setOpaque(true);
                    portraits[i][index].setBackground(lightBrown);
                    //portraits[i][index].setBounds(bounds[3]);
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
        } catch (IOException e) {
            System.out.println("File " + file.getPath() + " does not exist.");
            img = null;
            finalImg = null;
            picture = null;
            return null;
        }

        picture = new JLabel(new ImageIcon(finalImg));
        return picture;
    }
}
