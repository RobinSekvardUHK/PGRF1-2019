package streda_17_25_c03.model;

public class Edge {

    private int x1, y1, x2, y2;

    public Edge(Point p1, Point p2) {
        this.x1 = p1.getX();
        this.y1 = p1.getY();
        this.x2 = p2.getX();
        this.y2 = p2.getY();
    }

    public boolean isHorizontal() {
        // TODO test na rovnost y1 a y2
        return false;
    }

    public void orientate() {
        // TODO prohození, když y1 je větší než y2
    }

    public boolean hasIntersection(int y) {
        // TODO y, y1, y2 - porovnat, zda je y v rozsahu
        return false;
    }

    public int getIntersection(int y) {
        // TODO vypočítat průsečík pomocí y, k, q, (osa Y)
        return 0;
    }

}
