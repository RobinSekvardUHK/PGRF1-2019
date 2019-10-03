package streda_17_25_c03.main;

import streda_17_25_c03.controller.Controller;
import streda_17_25_c03.view.PGRFWindow;

import javax.swing.*;

public class AppStart {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PGRFWindow window = new PGRFWindow();
            new Controller(window.getRaster());
            window.setVisible(true);

//            window.getRaster().drawPixel(10, 10, Color.YELLOW.getRGB());
//
//            window.getRaster().drawPixel(50, 50, 0x00ffff);
//
//            window.getRaster().addMouseListener(new MouseAdapter() {
//                @Override
//                public void mouseClicked(MouseEvent e) {
//                    window.getRaster().drawPixel(e.getX(), e.getY(), 0xff0000);
//                }
//            });
//
//            window.getRaster().addMouseMotionListener(new MouseAdapter() {
//                @Override
//                public void mouseMoved(MouseEvent e) {
//                    window.getRaster().drawPixel(e.getX(), e.getY(), 0xfff000);
//                }
//            });
//
//            for (int i = 100; i < 300; i++) {
//                window.getRaster().drawPixel(i, 150, Color.MAGENTA.getRGB());
//            }
        });
        // https://www.google.com/search?q=SwingUtilities.invokeLater
        // https://www.javamex.com/tutorials/threads/invokelater.shtml
    }
}
