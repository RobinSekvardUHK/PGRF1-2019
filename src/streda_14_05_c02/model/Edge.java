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

    public boolean isHorizontal() {
        // TODO rovnost y1,y2
        return false;
    }

    public void orientate() {
        // TODO prohození hodnot když y1 je větší než y2
    }

    public boolean hasIntersection(int y) {
        // TODO zda y je v rozsahu y1 a y2
        return false;
    }

    public int getIntersection(int y) {
        // TODO spočítat průsečík pomocí y, k, q (podle osy Y)
        return 0;
    }

}
