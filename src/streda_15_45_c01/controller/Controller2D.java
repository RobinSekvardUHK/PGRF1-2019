package streda_15_45_c01.controller;

import streda_15_45_c01.fill.SeedFill;
import streda_15_45_c01.renderer.Renderer2D;
import streda_15_45_c01.view.Raster;

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
                seedFill.setSeed(e.getX(), e.getY(), 0x00ffff);
                seedFill.fill();
            }
        });
        raster.addMouseMotionListener(new MouseAdapter() { // addMouseMOTIONListener
            @Override
            public void mouseDragged(MouseEvent e) {
                renderer2D.clear();
                renderer2D.drawDDA(400, e.getX(), 300, e.getY(), Color.WHITE.getRGB());
            }
        });
    }
}
