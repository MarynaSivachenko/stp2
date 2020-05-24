package stp2.l4;

public class Wear {
    private Type type;
    private Enum colour;
    private Size size;

    public Wear(Type type, Colour colour, Size size){
        this.type = type;
        this.colour = colour;
        this.size = size;
    }

    public Type getType() {
        return type;
    }

    public Enum getColour() {
        return colour;
    }

    public Size getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o){
        if (o == this) {
            return true;
        }

        if (!(o instanceof Wear)) {
            return false;
        }

        Wear c = (Wear) o;

        return this.type == c.type && this.colour == c.colour && this.size == c.size;
    }
}
