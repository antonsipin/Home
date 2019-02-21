package Java1.dz2_seaBattle;

import java.util.Scanner;

/**
 * Created by Anton on 24.05.2018.
 */
public class CaptainTwo {
    public static int CaptainTwoShootY = 0;
    public static int CaptainTwoShootX = 0;

    public static void doCaptainTwoShoot() {
        try {
            System.out.println(Control.ANSI_BLUE + "\t\t ⚓⚓⚓ " + Control.CaptainTwoName + ", let's shoot ! Enter Y coordinate (1-9): ⚓⚓⚓" + Control.ANSI_RESET);
            Scanner scannerCaptainTwoShootY = new Scanner(System.in);
            int CaptainTwoShootY = Integer.parseInt(scannerCaptainTwoShootY.nextLine());
            CaptainTwo.CaptainTwoShootY = CaptainTwoShootY;
            System.out.println();

            System.out.println(Control.ANSI_BLUE + "\t\t ⚓⚓⚓ " + Control.CaptainTwoName + ", let's shoot ! Enter X coordinate (1-9): ⚓⚓⚓" + Control.ANSI_RESET);
            Scanner scannerCaptainTwoShootX = new Scanner(System.in);
            int CaptainTwoShootX = Integer.parseInt(scannerCaptainTwoShootX.nextLine());
            CaptainTwo.CaptainTwoShootX = CaptainTwoShootX;
            System.out.println();

            Control.gameStartPrint();
            if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(Control.point)) {
//                for (int i = 0; i < BattleField.SIZE; i++) {
//                    for (int j = 0; j < BattleField.SIZE; j++) {
                BattleFieldAfterDoShoots.CaptainOneFieldAfterDoShoots[CaptainTwoShootY][CaptainTwoShootX] = String.valueOf('\u058D');
                BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX] = String.valueOf('\u058D');
//                    }
//                }
                Control.missPrint();
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainOne";
            } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(Control.afterDoShootsShip)) {
                Control.goalIsAlreadyPaddedPrint();
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainOne";
            } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(Control.bomb)) {
                Control.missPrintSecondShoot();
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainOne";
            } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(4)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(31)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(32)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(21)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(22)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(23)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(11)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(12)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(13)) || BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(14))) {
                if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(4)) && CaptainOneShips.fourDeckShipDeckCount >= 2) {
                    Control.targetDamagedPrint();
                    CaptainOneShips.fourDeckShipDeckCount--;
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(4)) && CaptainOneShips.fourDeckShipDeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.fourDeckShipDeckCount--;
                    CaptainOneShips.fourDeckShipDeckCount--;
                    if (Statistics.captainOneFourDeckShipCount > 0 && CaptainOneShips.fourDeckShipDeckCount == 0) {
                        Statistics.captainOneFourDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[2][3] = String.valueOf(Statistics.captainOneFourDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(31)) && CaptainOneShips.threeDeckShip1DeckCount >= 2) {
                    Control.targetDamagedPrint();
                    CaptainOneShips.threeDeckShip1DeckCount--;
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(31)) && CaptainOneShips.threeDeckShip1DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.threeDeckShip1DeckCount--;
                    if (Statistics.captainOneThreeDeckShipCount > 0 && CaptainOneShips.threeDeckShip1DeckCount == 0) {
                        Statistics.captainOneThreeDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[4][3] = String.valueOf(Statistics.captainOneThreeDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(32)) && CaptainOneShips.threeDeckShip2DeckCount >= 2) {
                    Control.targetDamagedPrint();
                    CaptainOneShips.threeDeckShip2DeckCount--;
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(32)) && CaptainOneShips.threeDeckShip2DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.threeDeckShip2DeckCount--;
                    if (Statistics.captainOneThreeDeckShipCount > 0 && CaptainOneShips.threeDeckShip2DeckCount == 0) {
                        Statistics.captainOneThreeDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[4][3] = String.valueOf(Statistics.captainOneThreeDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(21)) && CaptainOneShips.twoDeckShip1DeckCount > 1) {
                    Control.targetDamagedPrint();
                    CaptainOneShips.twoDeckShip1DeckCount--;
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(21)) && CaptainOneShips.twoDeckShip1DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.twoDeckShip1DeckCount--;
                    if (Statistics.captainOneTwoDeckShipCount > 0 && CaptainOneShips.twoDeckShip1DeckCount == 0) {
                        Statistics.captainOneTwoDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[6][3] = String.valueOf(Statistics.captainOneTwoDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(22)) && CaptainOneShips.twoDeckShip2DeckCount > 1) {
                    Control.targetDamagedPrint();
                    CaptainOneShips.twoDeckShip2DeckCount--;
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(22)) && CaptainOneShips.twoDeckShip2DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.twoDeckShip2DeckCount--;
                    if (Statistics.captainOneTwoDeckShipCount > 0 && CaptainOneShips.twoDeckShip2DeckCount == 0) {
                        Statistics.captainOneTwoDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[6][3] = String.valueOf(Statistics.captainOneTwoDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(23)) && CaptainOneShips.twoDeckShip3DeckCount > 1) {
                    Control.targetDamagedPrint();
                    CaptainOneShips.twoDeckShip3DeckCount--;
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(23)) && CaptainOneShips.twoDeckShip3DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.twoDeckShip3DeckCount--;
                    if (Statistics.captainOneTwoDeckShipCount > 0 && CaptainOneShips.twoDeckShip3DeckCount == 0) {
                        Statistics.captainOneTwoDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[6][3] = String.valueOf(Statistics.captainOneTwoDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(11)) && CaptainOneShips.oneDeckShip1DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.oneDeckShip1DeckCount--;
                    if (Statistics.captainOneOneDeckShipCount > 0 && CaptainOneShips.oneDeckShip1DeckCount == 0) {
                        Statistics.captainOneOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][3] = String.valueOf(Statistics.captainOneOneDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(12)) && CaptainOneShips.oneDeckShip2DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.oneDeckShip2DeckCount--;
                    if (Statistics.captainOneOneDeckShipCount > 0 && CaptainOneShips.oneDeckShip2DeckCount == 0) {
                        Statistics.captainOneOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][3] = String.valueOf(Statistics.captainOneOneDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(13)) && CaptainOneShips.oneDeckShip3DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.oneDeckShip3DeckCount--;
                    if (Statistics.captainOneOneDeckShipCount > 0 && CaptainOneShips.oneDeckShip3DeckCount == 0) {
                        Statistics.captainOneOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][3] = String.valueOf(Statistics.captainOneOneDeckShipCount);
                    }
                } else if (BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX].equals(String.valueOf(14)) && CaptainOneShips.oneDeckShip4DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainOneShips.oneDeckShip4DeckCount--;
                    if (Statistics.captainOneOneDeckShipCount > 0 && CaptainOneShips.oneDeckShip4DeckCount == 0) {
                        Statistics.captainOneOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][3] = String.valueOf(Statistics.captainOneOneDeckShipCount);
                    }
                }
//                for (int i = 0; i < BattleField.SIZE; i++) {
//                    for (int j = 0; j < BattleField.SIZE; j++) {
                BattleFieldAfterDoShoots.CaptainOneFieldAfterDoShoots[CaptainTwoShootY][CaptainTwoShootX] = String.valueOf('⛵');
                BattleField.CaptainOneField[CaptainTwoShootY][CaptainTwoShootX] = String.valueOf('⛵');
//                    }
//                }
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainTwo";
                Control.captainOneShipAfterDoShootCount++;
            }
        } catch (Exception e) {
//            BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
            System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9! ⚓⚓⚓" + Control.ANSI_RESET);
            System.out.println();
            doCaptainTwoShoot();
        }
    }
}
