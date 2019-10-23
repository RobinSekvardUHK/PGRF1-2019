package streda_17_25_c03.renderer;

import streda_17_25_c03.view.Raster;

public class Renderer2D extends Renderer {

    public Renderer2D(Raster raster) {
        super(raster);
    }

    public void drawLine(int x1, int y1, int x2, int y2, int color) {
        int dx = x2 - x1;
        int dy = y2 - y1;

        float k = (float) dy / dx;
        // https://www.google.com/search?q=java+dividing+two+integers
        float q = y1 - k * x1;

        // řídící osa X
        if (k < 1) { // absolutní hodnota Math.abs(k)
            if (x1 > x2) {
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

    public void drawDDA(int x1, int y1, int x2, int y2, int color) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        float k = dy / (float) dx;
        float x = x1;
        float y = y1;

        for (int i = 0; i <= Math.max(dx, dy); i++) {
            raster.drawPixel(Math.round(x), Math.round(y), color);
            x += 1;
            y += k;
        }
    }

    public int getPixel(int x, int y) {
        return raster.getPixel(x, y);
    }

    public void drawPixel(int x, int y, int color) {
        raster.drawPixel(x, y, color);
    }

}
