package Java1.dz2_seaBattle;

import java.util.Scanner;


/**
 * Created by Anton on 24.05.2018.
 */
public class CaptainOne {
    public static int CaptainOneShootY = 0;
    public static int CaptainOneShootX = 0;

    public static void doCaptainOneShoot() {
        try {
            System.out.println(Control.ANSI_BLUE + "\t\t ⚓⚓⚓ " + Control.CaptainOneName + ", let's shoot ! Enter Y coordinate (1-9): ⚓⚓⚓" + Control.ANSI_RESET);
            Scanner scannerCaptainOneShootY = new Scanner(System.in);
            int CaptainOneShootY = Integer.parseInt(scannerCaptainOneShootY.nextLine());
            CaptainOne.CaptainOneShootY = CaptainOneShootY;
            System.out.println();

            System.out.println(Control.ANSI_BLUE + "\t\t ⚓⚓⚓ " + Control.CaptainOneName + ", let's shoot ! Enter X coordinate (1-9): ⚓⚓⚓" + Control.ANSI_RESET);
            Scanner scannerCaptainOneShootX = new Scanner(System.in);
            int CaptainOneShootX = Integer.parseInt(scannerCaptainOneShootX.nextLine());
            CaptainOne.CaptainOneShootX = CaptainOneShootX;
            System.out.println();

            Control.gameStartPrint();
            if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(Control.point)) {
//                for (int i = 0; i < BattleField.SIZE; i++) {
//                    for (int j = 0; j < BattleField.SIZE; j++) {
                BattleFieldAfterDoShoots.CaptainTwoFieldAfterDoShoots[CaptainOneShootY][CaptainOneShootX] = String.valueOf('\u058D');
                BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX] = String.valueOf('\u058D');
//                    }
//                }
                Control.missPrint();
                Statistics.getCaptainOneStatistic();
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainTwo";
            } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(Control.afterDoShootsShip)) {
                Control.goalIsAlreadyPaddedPrint();
                Statistics.getCaptainOneStatistic();
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainTwo";
            } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(Control.bomb)) {
//                for (int i = 0; i < BattleField.SIZE; i++) {
//                    for (int j = 0; j < BattleField.SIZE; j++) {
//                    }
//                }
                Control.missPrintSecondShoot();
                Statistics.getCaptainOneStatistic();
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainTwo";
            } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(4)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(31)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(32)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(21)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(22)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(23)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(11)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(12)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(13)) || BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(14))) {
                if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(4)) && CaptainTwoShips.fourDeckShipDeckCount >= 2) {
                    Control.targetDamagedPrint();
                    CaptainTwoShips.fourDeckShipDeckCount--;
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(4)) && CaptainTwoShips.fourDeckShipDeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.fourDeckShipDeckCount--;
                    if (Statistics.captainTwoFourDeckShipCount > 0 && CaptainTwoShips.fourDeckShipDeckCount == 0) {
                        Statistics.captainTwoFourDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[2][7] = String.valueOf(Statistics.captainTwoFourDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(31)) && CaptainTwoShips.threeDeckShip1DeckCount >= 2) {
                    Control.targetDamagedPrint();
                    CaptainTwoShips.threeDeckShip1DeckCount--;
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(31)) && CaptainTwoShips.threeDeckShip1DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.threeDeckShip1DeckCount--;
                    if (Statistics.captainTwoThreeDeckShipCount > 0 && CaptainTwoShips.threeDeckShip1DeckCount == 0) {
                        Statistics.captainTwoThreeDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[4][7] = String.valueOf(Statistics.captainTwoThreeDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(32)) && CaptainTwoShips.threeDeckShip2DeckCount >= 2) {
                    Control.targetDamagedPrint();
                    CaptainTwoShips.threeDeckShip2DeckCount--;
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(32)) && CaptainTwoShips.threeDeckShip2DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.threeDeckShip2DeckCount--;
                    if (Statistics.captainTwoThreeDeckShipCount > 0 && CaptainTwoShips.threeDeckShip2DeckCount == 0) {
                        Statistics.captainTwoThreeDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[4][7] = String.valueOf(Statistics.captainTwoThreeDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(21)) && CaptainTwoShips.twoDeckShip1DeckCount == 2) {
                    Control.targetDamagedPrint();
                    CaptainTwoShips.twoDeckShip1DeckCount--;
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(21)) && CaptainTwoShips.twoDeckShip1DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.twoDeckShip1DeckCount--;
                    if (Statistics.captainTwoTwoDeckShipCount > 0 && CaptainTwoShips.twoDeckShip1DeckCount == 0) {
                        Statistics.captainTwoTwoDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[6][7] = String.valueOf(Statistics.captainTwoTwoDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(22)) && CaptainTwoShips.twoDeckShip2DeckCount == 2) {
                    Control.targetDamagedPrint();
                    CaptainTwoShips.twoDeckShip2DeckCount--;
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(22)) && CaptainTwoShips.twoDeckShip2DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.twoDeckShip2DeckCount--;
                    if (Statistics.captainTwoTwoDeckShipCount > 0 && CaptainTwoShips.twoDeckShip2DeckCount == 0) {
                        Statistics.captainTwoTwoDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[6][7] = String.valueOf(Statistics.captainTwoTwoDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(23)) && CaptainTwoShips.twoDeckShip3DeckCount == 2) {
                    Control.targetDamagedPrint();
                    CaptainTwoShips.twoDeckShip3DeckCount--;
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(23)) && CaptainTwoShips.twoDeckShip3DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.twoDeckShip3DeckCount--;
                    if (Statistics.captainTwoTwoDeckShipCount > 0 && CaptainTwoShips.twoDeckShip3DeckCount == 0) {
                        Statistics.captainTwoTwoDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[6][7] = String.valueOf(Statistics.captainTwoTwoDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(11)) && CaptainTwoShips.oneDeckShip1DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.oneDeckShip1DeckCount--;
                    if (Statistics.captainTwoOneDeckShipCount > 0 && CaptainTwoShips.oneDeckShip1DeckCount == 0) {
                        Statistics.captainTwoOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][7] = String.valueOf(Statistics.captainTwoOneDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(12)) && CaptainTwoShips.oneDeckShip2DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.oneDeckShip2DeckCount--;
                    if (Statistics.captainTwoOneDeckShipCount > 0 && CaptainTwoShips.oneDeckShip2DeckCount == 0) {
                        Statistics.captainTwoOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][7] = String.valueOf(Statistics.captainTwoOneDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(13)) && CaptainTwoShips.oneDeckShip3DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.oneDeckShip3DeckCount--;
                    if (Statistics.captainTwoOneDeckShipCount > 0 && CaptainTwoShips.oneDeckShip3DeckCount == 0) {
                        Statistics.captainTwoOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][7] = String.valueOf(Statistics.captainTwoOneDeckShipCount);
                    }
                } else if (BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX].equals(String.valueOf(14)) && CaptainTwoShips.oneDeckShip4DeckCount == 1) {
                    Control.targetKilledPrint();
                    CaptainTwoShips.oneDeckShip4DeckCount--;
                    if (Statistics.captainTwoOneDeckShipCount > 0 && CaptainTwoShips.oneDeckShip4DeckCount == 0) {
                        Statistics.captainTwoOneDeckShipCount--;
                        BattleFieldAfterDoShoots.CaptainsShipsStatistic[8][7] = String.valueOf(Statistics.captainTwoOneDeckShipCount);
                    }
                }
                BattleFieldAfterDoShoots.CaptainTwoFieldAfterDoShoots[CaptainOneShootY][CaptainOneShootX] = String.valueOf('⛵');
                BattleField.CaptainTwoField[CaptainOneShootY][CaptainOneShootX] = String.valueOf('⛵');
                BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
                Control.whoNextShoot = "CaptainOne";
                Control.captainTwoShipAfterDoShootCount++;
            }
        } catch (Exception e) {
//            BattleFieldAfterDoShoots.battleFieldsAfterDoShootsPrint();
            System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
            System.out.println();
            doCaptainOneShoot();
        }
    }
}
