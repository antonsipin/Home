package ex_static;

/**
 * Created by Anton on 25.02.2018.
 */
public class Cat {
    int age = 10;

    String name;
    static int catsAmount;

    public Cat(String name) {
        this.name = name;
        catsAmount++;
    }

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void about() {
        System.out.println(name);
    }

    void showCatsAmount() {
        System.out.println(catsAmount);
    }
}
