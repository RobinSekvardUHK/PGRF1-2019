package streda_17_25_c03.controller;

import streda_17_25_c03.renderer.Renderer;
import streda_17_25_c03.view.Raster;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller {
    private final Renderer renderer;

    public Controller(Raster raster) {
        this.renderer = new Renderer(raster);

        initListeners(raster);
    }

    private void initListeners(Raster raster) {
        raster.addMouseMotionListener(new MouseAdapter() { // addMouseMOTIONListener
            @Override
            public void mouseDragged(MouseEvent e) {
                renderer.clear();
                renderer.drawDDA(400, 300, e.getX(), e.getY(), Color.YELLOW.getRGB());
            }
        });
    }
}
