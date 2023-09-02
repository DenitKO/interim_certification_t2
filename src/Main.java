// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.PriorityQueue;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Toy myToy1 = new Toy(5, "TeddyBear");
        Toy myToy2 = new Toy(1, "RoboCop");
        Toy myToy3 = new Toy(3, "Mario");
        Toy myToy4 = new Toy(4, "Naruto");
        Toy myToy5 = new Toy(2, "Ichigo");
        PriorityQueue<Toy> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(myToy1);
        priorityQueue.add(myToy2);
        priorityQueue.add(myToy3);
        priorityQueue.add(myToy4);
        priorityQueue.add(myToy5);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        char[] values = {'A', 'B', 'C'};
        int[] weights = {3, 7, 10};

        System.out.println(weighted_random_simple(values, weights));
    }

    public static char weighted_random_simple(char[] values, int[] weights)
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
}