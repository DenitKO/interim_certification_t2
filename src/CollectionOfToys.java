import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class CollectionOfToys<E> {
    private static int countOfToys;
    private ArrayList<Toy> listOfToys = new ArrayList<>();
    private static int size;


    public void add (Toy toy){
        this.listOfToys.add(toy);
        this.countOfToys += toy.getValue();
        this.size +=1;
    }

    public void DrawingOfPrizes(int count){
//        count can't be above this.countOfToys
//        TODO checking for quantity
        for (int i = 0; i < count; i++) {
            int id = DrawingOfPrize();
//          TODO add Get by id method to Toy
//          TODO add Gifted toy to GifstsQueue
        }
    }

    private Integer DrawingOfPrize()
    {
        ArrayList<Integer> values = new ArrayList(size);
        ArrayList<Integer> weights = new ArrayList(size);
        for (Toy toy : this.listOfToys) {
            values.add(toy.getId());
            weights.add(toy.getRandomRatio());
        }

        int total=0;
        for (int weight : weights) {
            total += weight;
        }
        System.out.println("Total weight: " + total);

        int n = 0;

        int num = new Random().nextInt(total- 1)+1;
        System.out.println("Rand num: " + num);

        for (int i = 0; i < values.size(); i++) {
            n += weights.get(i);
            System.out.println(n);
            if ( n >= num )
            {
                return values.get(i);
            }
        }
        return -1;
    }

    public int getLenth() {
        return size;
    }

    public void clear(){
        this.listOfToys.clear();
        this.size = 0;
    }

    public void remove (Toy toy){
        // understand how to override equals and hashcode in toys for correct work remove metod
        this.listOfToys.remove(toy);
        this.size -= 1;
    }

    public static int getCountOfToys() {
        return countOfToys;
    }

    @Override
    public String toString() {
        return "CollectionOfToys = " + listOfToys;
    }
}