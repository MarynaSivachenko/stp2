package stp2.l3;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements  Shape {
    List<ShapeAdapter> sides = new ArrayList<ShapeAdapter>();

    Rectangle(Line line1, Line line2){
        ShapeAdapter side1 =  new LineAdapter(line1);
        ShapeAdapter side2 = new LineAdapter(line2);
        sides.add(new LineAdapter(line1));
        sides.add(new LineAdapter(line2));
    }

    @Override
    public List getCoords() {
        return sides;
    }

    @Override
    public String draw() {
        return "Rectangle drown, system coords center screen center";
    }

    @Override
    public void printCoords() {
        for(ShapeAdapter side : sides){
            side.printRCoords();
        }
    }
}
