public class Toy implements Comparable<Toy>{
    private static int id_counter = 0;
    private final int id;
    private int count;
    private final String name;
    private int randomRatio;

    {
        this.id = id_counter;
        this.id_counter +=1;
    }

    public Toy(int randomRatio, int count, String name){
        setRandomRatio(randomRatio);
        setCount(count);
        this.name = name;
    }

    public Toy(int randomRatio, String name){
        setRandomRatio(randomRatio);
        this.count = 1;
        this.name = name;
    }

    public Toy(String name){
        this.randomRatio = 1;
        this.count = 1;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getCount() { return count; }

    public void setCount(int count) {
        if (count > 0){
            this.count = count;
        }
        else System.out.println("Введите количество игрушек");
    }

    public int getRandomRatio() { return this.randomRatio; }

    public void setRandomRatio(int randomRatio){
        if (randomRatio > 0 || randomRatio <= 100)
            this.randomRatio = randomRatio;
        else System.out.println("Ошибка. Введите число от 1 до 100");
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