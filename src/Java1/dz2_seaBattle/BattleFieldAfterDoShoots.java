package Java1.dz2_seaBattle;

/**
 * Created by Anton on 03.06.2018.
 */
public class BattleFieldAfterDoShoots {
    static String[][] CaptainOneFieldAfterDoShoots = new String[BattleField.SIZE][BattleField.SIZE];
    static String[][] CaptainTwoFieldAfterDoShoots = new String[BattleField.SIZE][BattleField.SIZE];
    static String[][] CaptainsShipsStatistic = new String[BattleField.SIZE][BattleField.SIZE];

    public static void captainsShipsStatisticInitialize() {
        for (int i = 0; i < BattleField.SIZE; i++) {
            for (int j = 0; j < BattleField.SIZE; j++) {
                CaptainsShipsStatistic[i][j] = String.valueOf(' ');
            }
        }
        CaptainsShipsStatistic[2][0] = String.valueOf("⛵⛵⛵⛵");
        CaptainsShipsStatistic[4][0] = String.valueOf("⛵⛵⛵");
        CaptainsShipsStatistic[6][0] = String.valueOf("⛵⛵  ");
        CaptainsShipsStatistic[8][0] = String.valueOf("⛵   ");
        CaptainsShipsStatistic[0][4] = String.valueOf(Control.CaptainOneName);
        CaptainsShipsStatistic[0][6] = String.valueOf(Control.CaptainTwoName);
        for (int j = 0; j < BattleField.SIZE; j++) {
            CaptainsShipsStatistic[3][j] = String.valueOf("━");
            CaptainsShipsStatistic[5][j] = String.valueOf("━");
            CaptainsShipsStatistic[7][j] = String.valueOf("━");
            CaptainsShipsStatistic[1][j] = String.valueOf("━");
            CaptainsShipsStatistic[9][j] = String.valueOf("━");
        }
        CaptainsShipsStatistic[2][5] = String.valueOf("┃");
        CaptainsShipsStatistic[4][5] = String.valueOf(" ┃");
        CaptainsShipsStatistic[6][5] = String.valueOf(" ┃");
        CaptainsShipsStatistic[8][5] = String.valueOf(" ┃");

        CaptainsShipsStatistic[2][3] = String.valueOf(Statistics.captainOneFourDeckShipCount);
        CaptainsShipsStatistic[4][3] = String.valueOf(Statistics.captainOneThreeDeckShipCount);
        CaptainsShipsStatistic[6][3] = String.valueOf(Statistics.captainOneTwoDeckShipCount);
        CaptainsShipsStatistic[8][3] = String.valueOf(Statistics.captainOneOneDeckShipCount);

        CaptainsShipsStatistic[2][7] = String.valueOf(Statistics.captainTwoFourDeckShipCount);
        CaptainsShipsStatistic[4][7] = String.valueOf(Statistics.captainTwoThreeDeckShipCount);
        CaptainsShipsStatistic[6][7] = String.valueOf(Statistics.captainTwoTwoDeckShipCount);
        CaptainsShipsStatistic[8][7] = String.valueOf(Statistics.captainTwoOneDeckShipCount);

    }

    public static void captainOneFieldAfterDoShootsInitialize() {
        for (int i = 0; i < BattleField.SIZE; i++) {
            for (int j = 0; j < BattleField.SIZE; j++) {
                CaptainOneFieldAfterDoShoots[i][j] = String.valueOf('.');
            }
        }
    }

    public static void captainTwoFieldAfterDoShootsInitialize() {
        for (int k = 0; k < BattleField.SIZE; k++) {
            for (int m = 0; m < BattleField.SIZE; m++) {
                CaptainTwoFieldAfterDoShoots[k][m] = String.valueOf('.');
            }
        }
    }

    public static void battleFieldsAfterDoShootsPrint() {
        System.out.println(Control.ANSI_BLUE + "\t  ⛵⛵⛵ " + Control.CaptainOneName + "\t\t\t\t\t\t\t\t\t\t" + Control.CaptainTwoName + " ⛵⛵⛵ " + "\t\t\t\t\t\t\t" + " Active ships" + Control.ANSI_RESET);
        System.out.println();

//        for (int i = 0; i < 1; i++) {
//            for (int j = 0; j < SIZE; j++) {
//                System.out.print(CaptainOneField[i][j] + "   ");
//            }
//            System.out.print("\t\t\t\t");
//            for (int m = 0; m < SIZE; m++) {
//                System.out.print(CaptainTwoField[i][m] + "  ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < BattleField.SIZE; i++) {
            for (int j = 0; j < BattleField.SIZE; j++) {
                if (BattleFieldAfterDoShoots.CaptainOneFieldAfterDoShoots[CaptainTwo.CaptainTwoShootY][CaptainTwo.CaptainTwoShootX].equals(Control.afterDoShootsShip)) {
                    System.out.print(Control.ANSI_RED + CaptainOneFieldAfterDoShoots[i][j] + "  " + Control.ANSI_RESET);
                } else {
                    System.out.print(CaptainOneFieldAfterDoShoots[i][j] + "  ");
                }
            }
            System.out.print("\t\t\t\t");

            for (int m = 0; m < BattleField.SIZE; m++) {
                if (BattleFieldAfterDoShoots.CaptainTwoFieldAfterDoShoots[CaptainOne.CaptainOneShootY][CaptainOne.CaptainOneShootX].equals(Control.afterDoShootsShip)) {
                    System.out.print(Control.ANSI_RED + CaptainTwoFieldAfterDoShoots[i][m] + "  " + Control.ANSI_RESET);
                } else {
                    System.out.print(CaptainTwoFieldAfterDoShoots[i][m] + "  ");
                }
            }

            System.out.print("\t\t\t\t");

            for (int x = 0; x < BattleField.SIZE; x++) {
                if (BattleFieldAfterDoShoots.CaptainTwoFieldAfterDoShoots[CaptainOne.CaptainOneShootY][CaptainOne.CaptainOneShootX].equals(Control.afterDoShootsShip)) {
                    System.out.print(Control.ANSI_BLUE + CaptainsShipsStatistic[i][x] + " " + Control.ANSI_RESET);
                } else {
                    System.out.print(Control.ANSI_BLUE + CaptainsShipsStatistic[i][x] + " " + Control.ANSI_RESET);
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public static void setCaptainOneFieldAfterDoShootsCoordinates() {
        for (int j = 0; j < BattleField.SIZE; j++) {
            CaptainOneFieldAfterDoShoots[0][j] = String.valueOf(j);
        }
        for (int i = 0; i < BattleField.SIZE; i++) {
            CaptainOneFieldAfterDoShoots[i][0] = String.valueOf(i);
        }
        CaptainOneFieldAfterDoShoots[0][0] = String.valueOf(' ');
    }

    public static void setCaptainTwoFieldAfterDoShootsCoordinates() {
        for (int j = 0; j < BattleField.SIZE; j++) {
            CaptainTwoFieldAfterDoShoots[0][j] = String.valueOf(j);
        }
        for (int i = 0; i < BattleField.SIZE; i++) {
            CaptainTwoFieldAfterDoShoots[i][0] = String.valueOf(i);
        }
        CaptainTwoFieldAfterDoShoots[0][0] = String.valueOf(' ');
    }
}
