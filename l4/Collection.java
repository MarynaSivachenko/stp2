package stp2.l4;

public interface Collection {
    public void addItem(Type type, Colour colour, Size size);
    public Wear[] getItems();
    public void findItem(Wear item, Iterator<Wear> wearIterator);
}
