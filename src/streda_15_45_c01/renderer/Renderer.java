package streda_15_45_c01.renderer;

import streda_15_45_c01.view.Raster;

public class Renderer {

    private final Raster raster;

    public Renderer(Raster raster) {
        this.raster = raster;
    }

    public void drawLine(int x1, int x2, int y1, int y2, int color) {
        final float k = (y2 - y1) / (float) (x2 - x1);
        // https://www.google.com/search?q=java+dividing+two+integers
        final float q = (y1 - k * x1);

        // řídící osa X
        if (k < 1) { // absolutní hodnota Math.abs(k)
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

    public void drawDDA(int x1, int x2, int y1, int y2, int color) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        float k = dy / (float) dx;

        float x = x1;
        float y = y1;
        for (int i = 0; i < Math.max(dx, dy); i++) {
            raster.drawPixel(Math.round(x), Math.round(y), color);
            x += 1;
            y += k;
        }
    }

    public void clear() {
        raster.clear();
    }
}
