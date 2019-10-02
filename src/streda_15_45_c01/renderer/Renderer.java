package streda_15_45_c01.renderer;

import streda_15_45_c01.view.Raster;

public class Renderer {

    private final Raster raster;

    public Renderer(Raster raster) {
        this.raster = raster;
    }

    public void drawLine(int x1, int x2, int y1, int y2, int color) {
        final float k = (y2 - y1) / (float) (x2 - x1);
        final float q = (y1 - k * x1);

        if (k < 1) { // absolutní hodnota ?
            if (x2 < x1) {
                int temp = x1;
                x1 = x2;
                x2 = temp;

                temp = y1;
                y1 = y2;
                y2 = temp;
            }

            for (int x = x1; x <= x2; x++) {
                int y = Math.round(k * x + q);
                raster.drawPixel(x, y, color);
            }
        } else {
            // dodělat podle osy Y
        }

    }

    public void clear() {
        raster.clear();
    }
}
