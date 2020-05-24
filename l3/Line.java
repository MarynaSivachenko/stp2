package stp2.l3;

import java.util.ArrayList;
import java.util.List;

public class Line implements Shape {
    List<Double> coords = new ArrayList<Double>();

    Line(double x, double y, double x1, double y1) {
        coords.add(x);
        coords.add(y);
        coords.add(x1);
        coords.add(y1);
    }


    @Override
    public String draw() {
        return "Line drown, system coords center in left top screen corner";
    }

    @Override
    public void printCoords() {
        for(Double element : coords){
            System.out.println(element);
        }
    }

    @Override
    public List<Double> getCoords() {
        return coords;
    }
}
