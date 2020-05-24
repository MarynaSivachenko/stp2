package stp2.l3;

import java.nio.file.AccessDeniedException;

public class Testl3 {
    public static void main(String[] args) {
        Line l1 = new Line(2, 2, 2, 3);
        Line l2 = new Line(3, 2, 3, 3);
        LineAdapter a1 = new LineAdapter(l1);
        Rectangle r = new Rectangle(l1, l2);
       // a1.printCoords();
        r.printCoords();
    }
}
