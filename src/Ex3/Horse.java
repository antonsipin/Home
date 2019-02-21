package Ex3;

/**
 * Created by Anton on 23.02.2018.
 */
public class Horse {
    String name;
    int speed;
    String color;
    boolean isMale;
    int age;

    void eat() {
        about();
        System.out.println("I am eating...");
    }

    void about() {
        System.out.print("My name is:" + name + "." + "\t I am " + age + " years old" + "\t Am I a male? It's" + isMale + "." + "\t\t");
        String sex = (isMale) ? "Male" : "Female";
//        System.out.printf("name: %s,\t\t age: %d,\t\t sex: %s,\t\t", name ,age, sex);
    }

    void ride() {
        about();
        System.out.println("I am riding at speed: " + speed);
    }
}
