package streda_15_45_c01.controller;

import streda_15_45_c01.renderer.Renderer;
import streda_15_45_c01.view.Raster;

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
                renderer.drawLine(400, e.getX(), 300, e.getY(), Color.WHITE.getRGB());
            }
        });
    }
}
