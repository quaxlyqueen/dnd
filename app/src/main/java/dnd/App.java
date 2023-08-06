package dnd;

import javax.swing.*;
import java.awt.*;
public class App {
    public static void main(String[] args) {
        //GUImanager gui = new GUImanager();
            //gui.setVisible(true);
        JFrame frame = new JFrame("test");
            frame.setVisible(true);
        ImageManager im = new ImageManager();
        frame.add(im.getRacePortrait(0));
        frame.repaint();
        frame.revalidate();
    }
}
