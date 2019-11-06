package streda_14_05_c02.renderer;

import streda_14_05_c02.model.Point;
import streda_14_05_c02.view.Raster;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Funkce pro ořezání polygonu jiným polygonem
     *
     * @param polygon     seznam vrcholů ořezávaného polygonu, nemusí být konvexní
     *                    je to ten polygon, který je ořezaný
     * @param clipPolygon seznam vrcholů ořezávacího polygonu, MUSÍ být konvexní
     *                    je to ten polygon, který řeže (provádí to ořezání)
     * @return seznam vrcholů polygonu, který je výsledkem ořezání
     */
    public List<Point> clip(List<Point> polygon, List<Point> clipPolygon) {
        // "polygon" je na tabuli černý
        // "clipPolygon" je na tabuli zelený

        List<Point> in = new ArrayList<>(polygon);

        Point p1 = null; // vložit poslední clip point
        for (Point p2 : clipPolygon) {
            List<Point> out = new ArrayList<>();
            // vytvořit hranu z bodů p1 a p2
            // Point v1 = in.last
            for (Point v2 : in) {
                // TODO algoritmus
            }
            p1 = p2;
            in = out;
        }
        return in;
    }

    public int getPixel(int x, int y) {
        return raster.getPixel(x, y);
    }

    public void drawPixel(int x, int y, int color) {
        raster.drawPixel(x, y, color);
    }
}
