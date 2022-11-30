package src;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import static src.AppConstants.*;

public class DefaultButton extends JButton {

    private boolean selected;

    public DefaultButton(String buttonLabel) {

        super(buttonLabel);
        applyDefaultButtonStyle();
        applyCommon();

    }

    public void deSelect() {

        selected = false;
        applyDefaultButtonStyle();

    }

    public void select() {

        selected = true;
        applyFocusedButtonStyle();

    }

    private void applyDefaultButtonStyle() {

        setBackground(medBrown);
        setForeground(darkestBrown);

    }

    private void applyFocusedButtonStyle() {

        setBackground(darkestBrown);
        setForeground(lightAccent);

    }

    private void applyCommon() {

        addMouseListener(
                new MouseListener() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        applyFocusedButtonStyle();
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                        if (!selected) {

                            applyDefaultButtonStyle();

                        }

                    }
                }

        );

        setFocusPainted(false);
        setFont(buttonFont);
        setBorder(new EmptyBorder(3, 3, 3, 3));

        repaint();
        revalidate();

    }


}
