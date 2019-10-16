package streda_15_45_c01.renderer;

import streda_15_45_c01.view.Raster;

public abstract class Renderer {

    final Raster raster;

    Renderer(Raster raster) {
        this.raster = raster;
    }

    public void clear() {
        raster.clear();
    }

}
