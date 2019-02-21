package Ex3;

import java.util.Random;

/**
 * Created by Anton on 23.02.2018.
 */
public class Hippodrom {
    public static void main(String[] args) {
        Horse[] horses = new Horse[10];
        Random random = new Random();
        for (int i = 0; i < horses.length; i++) {
            horses[i] = new Horse();
            horses[i].name = "Сивка-бурка" + i;
            horses[i].speed = 100 + i;
            horses[i].age = 1 + random.nextInt(100);

        }
        for (Horse horse : horses) {
            horse.ride();
        }
    }
}
