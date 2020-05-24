package stp2.l4;

public class Shop implements Collection {
    private Wear[] items;
    private Iterator<Wear> shopIterator;
    private int length = 0;

    public void addItem(Type type, Colour colour, Size size){
       length++;
       Wear[] temp = items;
       items = new Wear[length];

       if(temp != null){
           for(int i = 0 ; i < temp.length; i++){
               items[i] = temp[i];
           }
       }

       items[length - 1] = new Wear(type, colour, size);

    }

    public Wear[] getItems(){
        return items;
    }

    public void findItem(Wear item, Iterator<Wear> wearIterator){
        boolean has = false;
        if(wearIterator instanceof WearDirectIterator){
            shopIterator = new WearDirectIterator(items);
            while(shopIterator.hasNext()){
                    if(shopIterator.next().equals(item)){
                       has = true;
                        break;
                    }else{
               has = false;
            }
            }
        }
        if(wearIterator instanceof WearIndirectIterator){
            shopIterator = new WearIndirectIterator(items);
            while(shopIterator.hasNext()){
                if(shopIterator.next().equals(item)){
                   has = true;
                    break;
                }else{
                    has = false;
                }
            }
        }

        if(has){
            System.out.println("Shop has : " + item.getType() + " " + item.getColour()+ " " + item.getSize());
        }else{
            System.out.println("Shop hasn't : " + item.getType() + " " + item.getColour()+ " " + item.getSize());
        }

    }


}
