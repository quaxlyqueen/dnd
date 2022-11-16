package GUI;

import java.awt.*;

public interface AppTheme {

    public Color lightAccent = Color.decode("#EAF0CE");
    public Color lightBrown = Color.decode("#EBBE9B");
    public Color medBrown = Color.decode("#E4A677");

    public Color darkBrown = Color.decode("#502419");

    public Color darkestBrown = Color.decode("#1F0E0A");

    public Color black = Color.BLACK;

    public Color confirmationBlue = Color.decode("#296EB4");

    public Color rejectionRed = Color.decode("#A23E48");

    public Font headerFont = new Font("SanSalvi", Font.BOLD, 45);
    public Font subHeaderFont = new Font("SanSalvi", Font.PLAIN, 35);

    public Font paragraphFont = new Font("SanSalvi", Font.PLAIN, 20);
    public Font buttonFont = new Font("SanSalvi", Font.PLAIN, 15);

    public String OS = System.getProperty("os.name");

}
