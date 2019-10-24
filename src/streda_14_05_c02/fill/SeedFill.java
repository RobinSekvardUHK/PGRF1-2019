package streda_14_05_c02.fill;

import streda_14_05_c02.renderer.Renderer2D;
import streda_14_05_c02.view.Raster;

public class SeedFill implements Filler {

    private Renderer2D renderer;
    private int x, y, fillColor, backgroundColor;

    @Override
    public void setRenderer(Renderer2D renderer) {
        this.renderer = renderer;
    }

    @Override
    public void fill() {
        seedFill(x, y);
    }

    public void setSeed(int x, int y, int fillColor) {
        this.x = x;
        this.y = y;
        this.fillColor = fillColor;
        this.backgroundColor = renderer.getPixel(x, y);
    }

    // pozor na rekurzivní volání
    // nutné upravit parametr pro VM "-Xss100m"
    // https://stackoverflow.com/questions/4967885/jvm-option-xss-what-does-it-do-exactly
    private void seedFill(int x, int y) {
        if (x >= 0 && y >= 0 && x < Raster.WIDTH && y < Raster.HEIGHT) {
            if (backgroundColor == renderer.getPixel(x, y)) {
                renderer.drawPixel(x, y, fillColor);
                seedFill(x + 1, y);
                seedFill(x - 1, y);
                seedFill(x, y + 1);
                seedFill(x, y - 1);
            }
        }
    }

    // TODO dodělat seed fill podle barvy hranice
}
