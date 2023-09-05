import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

public class CollectionOfToys<E> {
    private static int countOfToys;
    private ArrayList<Toy> listOfToys = new ArrayList<>();
    private static int size;

    {
        size +=1;
    }

    public void CollectionOfToys()
    {

    }

    public void add (Toy toy){
        this.listOfToys.add(toy);
        this.countOfToys += toy.getCount();
        size +=1;
    }
    public String DrawingOfPrizes()
    {
        ArrayList<String> values = new ArrayList(size);
        ArrayList<Integer> weights = new ArrayList(size);
        for (Toy toy : this.listOfToys) {
            values.add(toy.getName());
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
        return "";
    }

    public static int getLenth() {
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

}
