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
//        PriorityQueue<Toy> priorityQueue = new PriorityQueue<>();
        CollectionOfToys<Toy> myCollection = new CollectionOfToys<>();
        myCollection.add(myToy1);
        myCollection.add(myToy2);
        myCollection.add(myToy3);
        myCollection.add(myToy4);
        myCollection.add(myToy5);

//        System.out.println(myToy1);
//        System.out.println(myCollection);
//        System.out.println(myCollection.DrawingOfPrizes());

//        priorityQueue.add(myToy1);
//        priorityQueue.add(myToy2);
//        priorityQueue.add(myToy3);
//        priorityQueue.add(myToy4);
//        priorityQueue.add(myToy5);
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.poll());
//        System.out.println(priorityQueue.poll());
    }
}