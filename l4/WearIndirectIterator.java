package stp2.l4;

public class WearIndirectIterator implements Iterator<Wear> {
    private Wear[] items;
    private int pos;

    public WearIndirectIterator(Wear[] items){
        this.items = items;
        this.pos = items.length - 1;


    }
    @Override
    public boolean hasNext() {
        if (pos < 0 || items[pos] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Wear next() {
        return items[pos--];
    }
}
