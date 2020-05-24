package stp2.l3;

import java.util.List;

public class LineAdapter implements ShapeAdapter {
    private Line line;

    LineAdapter(Line line){
        this.line = line;

    }

    @Override
    public List<Double> getCoords() {
        return convertCoords(line.coords);
    }

    @Override
    public String draw() {
        return "Line drown, system coords screen center";
    }

    @Override
    public void printCoords() {
        for(Double element : getCoords()){
            System.out.println(element);
        }
    }

    public void printRCoords() {
        for(Double element : line.coords){
            System.out.println(element);
        }
    }

    private List convertCoords(List<Double> coords){
        for(int i = 0; i < 4; i++){
            coords.set(i, coords.get(i) + 500);
        }
        return line.coords;
    }

}
