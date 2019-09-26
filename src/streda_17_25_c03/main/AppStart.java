package streda_17_25_c03.main;

import streda_17_25_c03.view.PGRFWindow;

import javax.swing.*;
import java.awt.*;

public class AppStart {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PGRFWindow window = new PGRFWindow();
            window.setVisible(true);

            window.getRaster().drawPixel(10, 10, Color.YELLOW.getRGB());
        });
        // https://www.google.com/search?q=SwingUtilities.invokeLater
        // https://www.javamex.com/tutorials/threads/invokelater.shtml
    }
}
