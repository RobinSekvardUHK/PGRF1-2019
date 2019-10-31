package streda_14_05_c02.model;

public class Edge {

    private int x1, y1, x2, y2;

    /**
     * @param p1 první hraniční bod úsečky
     * @param p2 druhý hraniční bod úsečky
     */
    public Edge(Point p1, Point p2) {
        x1 = p1.getX();
        y1 = p1.getY();
        x2 = p2.getX();
        y2 = p2.getY();
    }

    /**
     * Zjistí, zda je úsečka vodorovná
     *
     * @return true pokud je vodorovná, jinak false
     */
    public boolean isHorizontal() {
        // TODO test na rovnost y1 a y2
        return false;
    }

    /**
     * Zorientuje úsečku odshora dolů
     */
    public void orientate() {
        // TODO prohození hodnot, když y1 je větší než y2
    }

    /**
     * Zjistí, zda existuje průsečík s scan-line s touto úsečkou
     *
     * @param y y-ová souřadnice vodorovné přímky (scan-line)
     * @return true, pokud existuje průsečík
     */
    public boolean hasIntersection(int y) {
        // TODO y, y1, y2 - porovnat, zda je y v rozsahu
        return false;
    }

    /**
     * Vrátí x-ovou souřadnici průsečíku s scan-line a této úsečky
     *
     * @param y y-ová souřadnice vodorovné přímky (scan-line)
     * @return vrátí x-ovou souřadnici průsečíku
     */
    public int getIntersection(int y) {
        // TODO vypočítat průsečík pomocí y, k, q (osa Y)
        return 0;
    }

}
