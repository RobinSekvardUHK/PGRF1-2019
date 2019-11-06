package streda_14_05_c02.controller;

import streda_14_05_c02.fill.SeedFill;
import streda_14_05_c02.renderer.Renderer2D;
import streda_14_05_c02.view.Raster;
import transforms.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

public class Controller2D implements Controller {

    private Renderer2D renderer2D;
    private SeedFill seedFill;
    private List<Point2D> points;

    public Controller2D(Raster raster) {
        initObjects(raster);
        initListeners(raster);
    }

    @Override
    public void initObjects(Raster raster) {
        renderer2D = new Renderer2D(raster);
        seedFill = new SeedFill();
        seedFill.setRenderer(renderer2D);

        List<Point2D> points = new ArrayList<>();
        points.add(new Point2D(400, 300));
        points.add(new Point2D(600, 250));

        renderer2D.drawLine(
                (int) points.get(0).getX(),
                (int) points.get(0).getY(),
                (int) points.get(1).getX(),
                (int) points.get(1).getY(),
                Color.GREEN.getRGB()
        );

        Mat3 mat3 = new Mat3Transl2D(-400, -300)
                .mul(new Mat3Rot2D(Math.toRadians(30)))
                .mul(new Mat3Transl2D(400, 300));
        System.out.println(mat3.toString());

        Point2D newP1 = points.get(0).mul(mat3);
        points.set(0, newP1);
        Point2D newP2 = points.get(1).mul(mat3);
        points.set(1, newP2);
        renderer2D.drawLine(
                (int) points.get(0).getX(),
                (int) points.get(0).getY(),
                (int) points.get(1).getX(),
                (int) points.get(1).getY(),
                Color.YELLOW.getRGB()
        );
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
