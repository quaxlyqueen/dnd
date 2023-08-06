package dnd;

import java.awt.*;

public final class AppConstants {
    private AppConstants() {}

    // CONSTANTS FOR FILE MANAGEMENT.
    public static final String OS = System.getProperty("os.name");
    public static final String mainFilepath = System.getProperty("user.dir");
    public static final String imgFilepath = System.getProperty("user.dir") + "/src/main/resources/img/";
    public static final String fontFilepath = System.getProperty("user.dir") + "/src/main/resources/SanSalvi.ttf";
    public static final String savesFilepath = System.getProperty("user.home") + "/Documents/saves"; 

    // CONSTANTS FOR THEME. 
    public static final Color lightAccent = Color.decode("#EAF0CE");
    public static final Color lightBrown = Color.decode("#EBBE9B");
    public static final Color medBrown = Color.decode("#E4A677");
    public static final Color darkBrown = Color.decode("#502419");
    public static final Color darkestBrown = Color.decode("#1F0E0A");
    public static final Color black = Color.BLACK;
    public static final Font headerFont = new Font("SanSalvi", Font.BOLD, 45);
    public static final Font subHeaderFont = new Font("SanSalvi", Font.PLAIN, 35);
    public static final Font paragraphText = new Font("SanSalvi", Font.PLAIN, 20);
    public static final Font userText = new Font("SanSalvi", Font.PLAIN, 15);
    public static final Font buttonFont = new Font("SanSalvi", Font.PLAIN, 15);
}
