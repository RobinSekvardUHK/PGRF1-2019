package streda_14_05_c02.controller;

import streda_14_05_c02.renderer.Renderer;
import streda_14_05_c02.view.Raster;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Controller {

    private final Renderer renderer;
//    private List<???> points = new ArrayList<>();

    public Controller(Raster raster) {
        renderer = new Renderer(raster);
        initListeners(raster);
//        renderer.drawLine(0, 1, 8, 4, Color.WHITE.getRGB());
//        renderer.drawLine(100, 100, 500, 300, Color.YELLOW.getRGB());
    }

    private void initListeners(Raster raster) {
        raster.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                points.add(new Point(e.getX(), e.getY()));
            }
        });
        raster.addMouseMotionListener(new MouseAdapter() { // addMouseMOTIONListener
            @Override
            public void mouseDragged(MouseEvent e) {
                renderer.clear();
                renderer.drawDDA(400, 300, e.getX(), e.getY(), 0x00ff00);
            }
        });
    }
}
