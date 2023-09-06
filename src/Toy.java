import java.util.Objects;

public class Toy{
    private static int id_counter = 0;
    private final int id;
    private int randomRatio;
    private int value;
    private final String name;

    {
        this.id = id_counter;
        this.id_counter +=1;
    }

    public Toy(int randomRatio, int value, String name){
        setRandomRatio(randomRatio);
        setValue(value);
        this.name = name;
    }

    public Toy(int value, String name){
        this.randomRatio = 1;
        setValue(value);
        this.name = name;
    }

    public Toy(String name){
        this.randomRatio = 1;
        this.value = 1;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public String getName() {
        return this.name;
    }


    public int getRandomRatio() { return this.randomRatio; }

    public void setRandomRatio(int randomRatio){
        if (randomRatio > 0 || randomRatio <= 100)
            this.randomRatio = randomRatio;
        else System.out.println("Ошибка. Введите число от 1 до 100");
    }

    @Override
    public String toString(){
        return "{" +
                "id=" + this.id +
                ", name='" + name + '\'' +
                ", randomRatio=" + randomRatio +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, name, randomRatio);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}