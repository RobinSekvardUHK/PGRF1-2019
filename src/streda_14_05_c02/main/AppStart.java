package streda_14_05_c02.main;

import streda_14_05_c02.view.PGRFWindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AppStart {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PGRFWindow window = new PGRFWindow();
            window.setVisible(true);

            window.getRaster().drawPixel(0, 0, Color.YELLOW.getRGB());
            window.getRaster().drawPixel(400, 300, 0x00ffff);

            window.getRaster().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    window.getRaster().drawPixel(e.getX(), e.getY(), Color.PINK.getRGB());
                }
            });
            window.getRaster().addMouseMotionListener(new MouseAdapter() { // pozor na addMouseMOTIONListener
                @Override
                public void mouseDragged(MouseEvent e) {
                    window.getRaster().drawPixel(e.getX(), e.getY(), 0xffffff); // bílá barva
                }
            });

            for (int x = 200; x < 500; x++) {
                window.getRaster().drawPixel(x, 150, Color.ORANGE.getRGB());
            }
        });
        // https://www.google.com/search?q=SwingUtilities.invokeLater
        // https://www.javamex.com/tutorials/threads/invokelater.shtml
    }
}
