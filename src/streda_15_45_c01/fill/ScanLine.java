package streda_15_45_c01.fill;

import streda_15_45_c01.model.Edge;
import streda_15_45_c01.model.Point;
import streda_15_45_c01.renderer.Renderer2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScanLine implements Filler {
    private List<Point> points;
    private int fillColor;
    private int polygonColor;
    private Renderer2D renderer;

    @Override
    public void fill() {
        scanLine();
    }

    @Override
    public void setRenderer(Renderer2D renderer) {
        this.renderer = renderer;
    }

    public void init(List<Point> points, int fillColor, int polygonColor) {
        this.points = points;
        this.fillColor = fillColor;
        this.polygonColor = polygonColor;
    }

    private void scanLine() {
        List<Edge> edges = new ArrayList<>();
        // projet všechny body a vytvořit z nich hrany (jako polygon)
        // 0. a 1. bod budou první úsečkou; 1. a 2. bod budou druhou úsečkou
        // ...; poslední a 0. bod
        // ignorovat vodorovné úsečky
        // zbývající hrany zorientovat a přidat do seznamu

        // najít minimum a maximum pro Y
        int minY = points.get(0).getY();
        int maxY = minY;
        // projet všechny body a najít miminální a maximální Y

        // pro všechna Y od min do max včetně
        for (int y = minY; y <= maxY; y++) {
            List<Integer> intersections = new ArrayList<>();
            // vnořený cyklus
            // projít všechny hrany
            // pokud hrana má průsečík po dané Y...
            // ... tak vypočítat průsečík a uložit hodnotu průsečíku do seznamu

            // nyní je naplněný seznam průsečíků
            Collections.sort(intersections);
            // nebo volitelně implementovat vlastní algoritmus řazení (pouze v rámci PGRF)
            // v praxi používat pouze hotová řešení

            // vybarvení mezi průsečíky
            // spojení vždy sudého s lichým (myšleno sudý a lichý index)
            // 0. a 1.; 2. a 3.; ...
        }

        // obtáhnutí hranice
        // renderer.drawPolygon(points, polygonColor);
    }
}
