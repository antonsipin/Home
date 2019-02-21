package ex3_ArrayList;

import java.util.ArrayList;

/**
 * Created by Anton on 25.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(12);
        list.add("Hello!");
        System.out.println(list);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
