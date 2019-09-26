package streda_15_45_c01.main;

import streda_15_45_c01.view.PGRFWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppStart {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PGRFWindow window = new PGRFWindow();
            window.setVisible(true);

            window.getRaster().drawPixel(1, 1, Color.YELLOW.getRGB());

            window.getRaster().drawPixel(400, 300, 0x00ffff);

            window.getRaster().drawPixel(400, 305, 0x888888);

            window.getRaster().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    window.getRaster().drawPixel(e.getX(), e.getY(), Color.PINK.getRGB());
                }
            });
            window.getRaster().addMouseMotionListener(new MouseAdapter() { // pozor addMouseMOTIONListener
                @Override
                public void mouseDragged(MouseEvent e) {
                    window.getRaster().drawPixel(e.getX(), e.getY(), Color.WHITE.getRGB());
                }
            });

            for (int x = 200; x < 555; x+=2) {
                window.getRaster().drawPixel(x, 250, Color.ORANGE.getRGB());
            }
        });
        // https://www.google.com/search?q=SwingUtilities.invokeLater
        // https://www.javamex.com/tutorials/threads/invokelater.shtml
    }
}
