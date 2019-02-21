package Ex1;

/**
 * Created by Anton on 22.02.2018.
 */
public class Main2 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age = 3;
        cat.name = "Murka";
        cat.about();
        Cat cat1 = new Cat(3, "Tom", true);
        cat1.about();
    }
}
