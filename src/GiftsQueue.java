import java.util.PriorityQueue;

public class GiftsQueue implements Comparable<GiftsQueue>{
    private static int idCounter;
    private int id;
    private Toy toy;

    {
        this.id = idCounter;
        idCounter += 1;
    }

    public GiftsQueue(Toy toy){
        this.toy = toy;
    }

    @Override
    public int compareTo(GiftsQueue other) {
        return this.id-other.id;
    }
}
