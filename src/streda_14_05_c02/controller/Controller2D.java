package streda_14_05_c02.controller;

import streda_14_05_c02.fill.SeedFill;
import streda_14_05_c02.renderer.Renderer2D;
import streda_14_05_c02.view.Raster;

import javax.swing.*;
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
        this.renderer2D = new Renderer2D(raster);
        seedFill = new SeedFill();
        seedFill.setRenderer(renderer2D);
    }

    @Override
    public void initListeners(Raster raster) {
        raster.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isRightMouseButton(e)) {
                    seedFill.setSeed(e.getX(), e.getY(), 0xffff00);
                    seedFill.fill();
                }
            }
        });
        raster.addMouseMotionListener(new MouseAdapter() { // addMouseMOTIONListener

            public void mouseDragged(MouseEvent e) {
                renderer2D.clear();
                renderer2D.drawDDA(400, 300, e.getX(), e.getY(), 0x00ff00);
            }
        });
    }

}
