package streda_15_45_c01.fill;

import streda_15_45_c01.renderer.Renderer2D;

public class SeedFill implements Filler {

    private Renderer2D renderer;
    private int x, y, fillColor, backgroundColor;

    @Override
    public void setRenderer(Renderer2D renderer) {
        this.renderer = renderer;
    }

    @Override
    public void fill() {
        seed(x, y);
    }

    public void setSeed(int x, int y, int fillColor) {
        this.x = x;
        this.y = y;
        this.fillColor = fillColor;
        backgroundColor = renderer.getPixel(x, y);
    }

    private void seed(int x, int y) {
        if (x >= 0 && y >= 0 && x < 800 && y < 600) {
            if (renderer.getPixel(x, y) == backgroundColor) {
                renderer.drawPixel(x, y, fillColor);
                seed(x + 1, y);
                seed(x - 1, y);
                seed(x, y + 1);
                seed(x, y - 1);
            }
        }
    }

    // TODO dodělat seed fill podle barvy hranice
}
