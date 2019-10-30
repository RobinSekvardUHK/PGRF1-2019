package streda_14_05_c02.fill;

import streda_14_05_c02.model.Edge;
import streda_14_05_c02.model.Point;
import streda_14_05_c02.renderer.Renderer2D;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ScanLine implements Filler {

    private Renderer2D renderer;
    private List<Point> points;
    private int fillColor;
    private int polygonColor;

    @Override
    public void setRenderer(Renderer2D renderer) {
        this.renderer = renderer;
    }

    @Override
    public void fill() {
        scanLine();
    }

    public void init(List<Point> points, int fillColor, int polygonColor) {
        this.points = points;
        this.fillColor = fillColor;
        this.polygonColor = polygonColor;
    }

    private void scanLine() {
        List<Edge> edges = new ArrayList<>();
        // projet všechny body (list points) a vytvořit z nich hrany (stejně nepravidelný n-úhelník)
        // 0. a 1. vrchol budou první hrana; 1. a 2. vrchol budou druhá hrana; ...; poslední a 0. vrchol
        // ignorovat vodorovné úsečky
        // pokud není vodorovná, tak zorientovat a přidat do seznamu

        // výsledkem je seznam zorientovaných hran bez vodorovných úseků

        // najít minimum a maximum pro Y
        int minY = points.get(0).getY();
        int maxY = minY;
        // projet všechny body (list points) a najít minimální a maximální Y

        // pro všechna Y od min do max včetně
        for (int y = minY; y <= maxY; y++) {
            List<Integer> intersections = new ArrayList<>();
            // projít všechny hrany (list edges)
            // pokud hrana má průsečík na daném Y..
            // .. tak vypočítat X hodnotu průsečíku a uložit ji do seznamu

            Collections.sort(intersections);
            // nebo volitelně implementovat vlastní algoritmus na seřazení
            // v praxi používat hotová řešení, tj. Collections.sort

            // vybarvení mezi průsečíky
            // spojení vždy sudého s lichým
            // tj. 0. a 1.; 2. a 3.; ...
        }

        // obtáhnutí hranice
        // renderer.drawPolygon(points, polygonColor);
    }
}
