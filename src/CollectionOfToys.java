import java.awt.*;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.IntStream;

public class CollectionOfToys {
    private static int countOfToys;
    private ArrayList listOfToys;
    private static int length;

    {
        length +=1;
    }

    public void CollectionOfToys()
    {

    }

    public void add (Toy toy){
        this.listOfToys.add(toy);
        this.countOfToys += toy.getCount();
    }
    public char DrawingOfPrizes(char[] values, int[] weights)
    {
        int total = IntStream.of(weights).sum();
        int n = 0;
        char myFinish = '0';

        int num = new Random().nextInt(total- 1)+1;
        System.out.println(num);

        for (int i = 0; i < values.length; i++) {
            n += weights[i];
            if ( n >= num )
            {
                return values[i];
            }
        }
        return myFinish;
    }

    public static int getLenth() {
        return length;
    }

    public void clear(){
        this.listOfToys.clear();
        this.length = 0;
    }

    public void remove (Toy toy){
        this.listOfToys.remove(toy);
        this.length -= 1;
    }
}
