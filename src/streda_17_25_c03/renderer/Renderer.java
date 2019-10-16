package streda_17_25_c03.renderer;

import streda_17_25_c03.view.Raster;

public abstract class Renderer {

    final Raster raster;

    Renderer(Raster raster) {
        this.raster = raster;
    }

    public void clear() {
        raster.clear();
    }
}
