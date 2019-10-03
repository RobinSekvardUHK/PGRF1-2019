package streda_14_05_c02.renderer;

import streda_14_05_c02.view.Raster;

public class Renderer {

    private final Raster raster;

    public Renderer(Raster raster) {
        this.raster = raster;
    }

    public void drawLine(int startX, int startY, int endX, int endY, int color) {
        float k = (float) (endY - startY) / (endX - startX);
        // https://www.google.com/search?q=java+dividing+two+integers
        float q = startY - (k * startX);

        // řídící osa X
        if (k < 1) { // absolutní hodnota Math.abs(k)
            if (startX > endX) {
                int temp = startX;
                startX = endX;
                endX = temp;

                temp = startY;
                startY = endY;
                endY = temp;
            }

            for (int x = startX; x <= endX; x++) {
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
