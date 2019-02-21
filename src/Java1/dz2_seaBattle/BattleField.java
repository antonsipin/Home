package Java1.dz2_seaBattle;


/**
 * Created by Anton on 23.05.2018.
 */
public class BattleField {
    final static int SIZE = 10;
    static String[][] CaptainOneField = new String[SIZE][SIZE];
    static String[][] CaptainTwoField = new String[SIZE][SIZE];
    static String[][] CaptainTwoShipsToShow = new String[SIZE][SIZE];
    static String[][] CaptainOneShipsToShow = new String[SIZE][SIZE];
    static String[][] CaptainOneFieldInitialize = new String[SIZE][SIZE];
    static String[][] CaptainTwoFieldInitialize = new String[SIZE][SIZE];

    public static void captainOneFieldInitialize() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                CaptainOneField[i][j] = String.valueOf('.');
                CaptainOneShipsToShow[i][j] = String.valueOf('.');
                CaptainOneFieldInitialize[i][j] = String.valueOf('.');
            }
        }
    }

    public static void captainTwoFieldInitialize() {
        for (int k = 0; k < SIZE; k++) {
            for (int m = 0; m < SIZE; m++) {
                CaptainTwoField[k][m] = String.valueOf('.');
                CaptainTwoShipsToShow[k][m] = String.valueOf('.');
                CaptainTwoFieldInitialize[k][m] = String.valueOf('.');
            }
        }
    }

    public static void battleFieldsPrint() {
        Control.gameStartPrint();
        System.out.println(Control.ANSI_BLUE + "\t  ⛵⛵⛵ " + Control.CaptainOneName + "\t\t\t\t\t\t\t\t\t\t" + Control.CaptainTwoName + " ⛵⛵⛵" + Control.ANSI_RESET);
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(CaptainOneField[i][j] + "  ");
            }
            System.out.print("\t\t\t\t");
            for (int m = 0; m < SIZE; m++) {
                System.out.print(CaptainTwoField[i][m] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void CaptainOneShipsPrint() {
        Control.gameStartPrint();
        System.out.println(Control.ANSI_BLUE + "\t  ⛵⛵⛵ " + Control.CaptainOneName + "\t\t\t\t\t\t\t\t\t\t" + Control.CaptainTwoName + " ⛵⛵⛵" + Control.ANSI_RESET);
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(CaptainOneShipsToShow[i][j] + "  ");
            }
            System.out.print("\t\t\t\t");
            for (int m = 0; m < SIZE; m++) {
                System.out.print(CaptainTwoFieldInitialize[i][m] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void CaptainTwoShipsPrint() {
        Control.gameStartPrint();
        System.out.println(Control.ANSI_BLUE + "\t  ⛵⛵⛵ " + Control.CaptainOneName + "\t\t\t\t\t\t\t\t\t\t" + Control.CaptainTwoName + " ⛵⛵⛵" + Control.ANSI_RESET);
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(CaptainOneFieldInitialize[i][j] + "  ");
            }
            System.out.print("\t\t\t\t");
            for (int m = 0; m < SIZE; m++) {
                System.out.print(CaptainTwoShipsToShow[i][m] + "  ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void setCaptainOneFieldCoordinates() {
        for (int j = 0; j < SIZE; j++) {
            CaptainOneField[0][j] = String.valueOf(j);
            CaptainOneShipsToShow[0][j] = String.valueOf(j);
            CaptainOneFieldInitialize[0][j] = String.valueOf(j);
        }
        for (int i = 0; i < SIZE; i++) {
            CaptainOneField[i][0] = String.valueOf(i);
            CaptainOneShipsToShow[i][0] = String.valueOf(i);
            CaptainOneFieldInitialize[i][0] = String.valueOf(i);
        }
        CaptainOneField[0][0] = String.valueOf(' ');
        CaptainOneShipsToShow[0][0] = String.valueOf(' ');
        CaptainOneFieldInitialize[0][0] = String.valueOf(' ');
    }

    public static void setCaptainTwoFieldCoordinates() {
        for (int j = 0; j < SIZE; j++) {
            CaptainTwoField[0][j] = String.valueOf(j);
            CaptainTwoShipsToShow[0][j] = String.valueOf(j);
            CaptainTwoFieldInitialize[0][j] = String.valueOf(j);
        }
        for (int i = 0; i < SIZE; i++) {
            CaptainTwoField[i][0] = String.valueOf(i);
            CaptainTwoShipsToShow[i][0] = String.valueOf(i);
            CaptainTwoFieldInitialize[i][0] = String.valueOf(i);
        }
        CaptainTwoField[0][0] = String.valueOf(' ');
        CaptainTwoShipsToShow[0][0] = String.valueOf(' ');
        CaptainTwoFieldInitialize[0][0] = String.valueOf(' ');
    }
}
