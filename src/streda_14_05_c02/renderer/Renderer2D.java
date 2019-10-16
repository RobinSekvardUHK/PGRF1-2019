package streda_14_05_c02.renderer;

import streda_14_05_c02.view.Raster;

public class Renderer2D extends Renderer {

    public Renderer2D(Raster raster) {
        super(raster);
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

    public void drawDDA(int startX, int startY, int endX, int endY, int color) {
        int dx = endX - startX;
        int dy = endY - startY;

        float k = dy / (float) dx;
        float x = startX;
        float y = startY;

        for (int i = 0; i <= Math.max(dx, dy); i++) {
            raster.drawPixel(Math.round(x), Math.round(y), color);
            x += 1;
            y += k;
        }
    }

}
