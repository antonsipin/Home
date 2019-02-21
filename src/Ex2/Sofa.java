package Ex2;

/**
 * Created by Anton on 23.02.2018.
 */


public class Sofa {
    public static void main(String[] args) {
        try {
            TV pult = new TV();
            pult = null;
            pult.whatIsCurrentChannel();
        } catch (Exception e) {
            System.out.println("Телевизора нет. Канал неизвестен");
        }
    }
}
