public class Toy implements Comparable<Toy>{
    private static int id_counter = 0;
    private int id;
    private String name;
    private int randomRatio;

    {
        this.id = id_counter;
        id_counter +=1;
    }

    public Toy(int randomRatio, String name){
        this.randomRatio = randomRatio;
        this.name = name;
    }

    public Toy(String name){
        this.randomRatio = 1;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getRandomRatio() {
        return this.randomRatio;
    }

    public void setRandomRatio(int randomRatio){
        this.randomRatio = randomRatio;
    }

    @Override
    public int compareTo(Toy other) {
        return this.randomRatio-other.randomRatio;
    }
    @Override
    public String toString(){
        return "Toy{" +
                "id=" + this.id +
                ", name='" + name + '\'' +
                ", randomRatio=" + randomRatio +
                '}';
    }
}