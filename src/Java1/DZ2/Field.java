package Java1.DZ2;

/**
 * Created by Anton on 18.05.2018.
 */

public class Field {
    final static int SIZE = 11;
    static char[][] FIELD = new char[SIZE][SIZE];
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void fieldPrint() {

        System.out.println(ANSI_BLUE + " ⚓⚓⚓ SEA BATTLE ⚓⚓⚓" + ANSI_RESET);
        shipsInitialize();
        shipsShow();
    }

    public static void shipsShow() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(FIELD[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void shipsInitialize() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                FIELD[i][j] = '.';
            }
            setShips();
        }
    }

    private static void setShips() {
        for (int i = 2; i < 8; i++) {
            FIELD[i][0] = '⛵';
        }
        for (int j = 2; j < 6; j++) {
            FIELD[8][j] = '⛵';
        }
    }
}