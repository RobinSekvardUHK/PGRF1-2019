package streda_15_45_c01.model;

public class Edge {

    private int x1, y1, x2, y2;

    public Edge(Point p1, Point p2) {
        x1 = p1.getX();
        y1 = p1.getY();
        x2 = p2.getX();
        y2 = p2.getY();
    }

    public boolean isHorizontal() {
        // TODO porovnat y1, y2
        return false;
    }

    public void orientate() {
        // TODO prohození, když y1 je větší než y2
    }

    public boolean hasIntersection(int y) {
        // TODO y je v rozsahu y1, y2
        return false;
    }

    public int getIntersection(int y) {
        // TODO vypočítat průsečík pomocí y, k, q (osa Y)
        return 0;
    }
}
