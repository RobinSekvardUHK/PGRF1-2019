package streda_14_05_c02.renderer;

import streda_14_05_c02.view.Raster;

public abstract class Renderer {

    final Raster raster;

    Renderer(Raster raster) {
        this.raster = raster;
    }

    public void clear() {
        raster.clear();
    }
}
