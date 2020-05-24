package stp2.l4;

public class WearDirectIterator implements Iterator<Wear> {
    private Wear[] items;
    private int pos;

    public WearDirectIterator(Wear[] items){
        this.items = items;
        this.pos = 0;


    }
    @Override
    public boolean hasNext() {
        if (pos >= items.length || items[pos] == null) {
            return false;
        }
        return true;
    }

    @Override
    public Wear next() {
        return items[pos++];
    }


}


