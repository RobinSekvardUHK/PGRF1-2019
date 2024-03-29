package misc;

import streda_15_45_c01.model.Point;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(30, 7));
        points.add(new Point(1, 2));
        points.add(new Point(10, -1));
        points.add(new Point(5, -1));

        points.sort(Comparator.comparingInt(Point::getX));
        // -> ekvivalentní k následujícímu zápisu
//        Collections.sort(points, new Comparator<Point>() {
//            @Override
//            public int compare(Point o1, Point o2) {
//                return Integer.compare(o1.getX(), o2.getX());
//            }
//        });

        for (Point point : points) {
            System.out.println(point.getX());
        }
    }

}
