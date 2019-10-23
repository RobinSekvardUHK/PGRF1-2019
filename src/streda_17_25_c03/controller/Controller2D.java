package streda_17_25_c03.controller;

import streda_17_25_c03.fill.SeedFill;
import streda_17_25_c03.renderer.Renderer2D;
import streda_17_25_c03.view.Raster;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller2D implements Controller {

    private Renderer2D renderer2D;
    private SeedFill seedFill;

    public Controller2D(Raster raster) {
        initObjects(raster);
        initListeners(raster);
    }

    @Override
    public void initObjects(Raster raster) {
        renderer2D = new Renderer2D(raster);
        seedFill = new SeedFill();
        seedFill.setRenderer(renderer2D);
    }

    @Override
    public void initListeners(Raster raster) {
        raster.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                seedFill.setSeed(e.getX(), e.getY(), 0xff00ff);
                seedFill.fill();
            }
        });
        raster.addMouseMotionListener(new MouseAdapter() { // addMouseMOTIONListener
            @Override
            public void mouseDragged(MouseEvent e) {
                renderer2D.clear();
                renderer2D.drawDDA(400, 300, e.getX(), e.getY(), Color.YELLOW.getRGB());
            }
        });
    }
}
