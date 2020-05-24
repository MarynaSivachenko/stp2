package stp2.l4;

public class Testl4 {
    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addItem(Type.JEANS, Colour.BLUE, Size.LARGE);
        shop.addItem(Type.SKIRT, Colour.BLACK, Size.SMALL);
        shop.addItem(Type.SHIRT, Colour.GREEN, Size.MEDIUM);

        shop.findItem(new Wear(Type.JEANS, Colour.BLUE, Size.LARGE), new WearDirectIterator(shop.getItems()));
    }
}
