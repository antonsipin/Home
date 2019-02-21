package Ex0_stackOverflow;

/**
 * Created by Anton on 25.02.2018.
 */
public class Main {
    private static int i;

    public static void main(String[] args) {
        test();

    }

    private static void test() {
        System.out.println("Testing" + i++);
        test();
    }
}


