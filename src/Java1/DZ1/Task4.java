package Java1.DZ1;

/**
 * Created by Anton on 27.04.2018.
 */
public class Task4 {
    public static void main(String[] args) {
        // Способ №1:
//            int i, N = 20;
//            for (i = 0; i < N; i++){
//                System.out.println("*" + i);
//            }
        // Способ №2:
//        int i, N = 20;
//            for (i = 0; i < N; N--){
//                System.out.println("*" + N);
//            }
        // Способ №3:
//        int i, N = 20;
//        for (i = 0; i < N; --N) {
//            System.out.println("*" + N);
//        }
        int i, N = 20;
        for (i = 0; -i < N; i--) {
            System.out.println("*" + i);
        }
    }
}
