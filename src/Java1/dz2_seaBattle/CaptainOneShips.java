package Java1.dz2_seaBattle;

import java.util.Scanner;

import static Java1.dz2_seaBattle.BattleField.CaptainOneShipsPrint;
import static Java1.dz2_seaBattle.Control.shipSuccessfullySetPrint;

/**
 * Created by Anton on 23.05.2018.
 */
public class CaptainOneShips {
    public static int fourDeckShipDeckCount = 0;
    public static int threeDeckShip1DeckCount = 0;
    public static int threeDeckShip2DeckCount = 0;

    public static int twoDeckShip1DeckCount = 0;
    public static int twoDeckShip2DeckCount = 0;
    public static int twoDeckShip3DeckCount = 0;

    public static int oneDeckShip1DeckCount = 0;
    public static int oneDeckShip2DeckCount = 0;
    public static int oneDeckShip3DeckCount = 0;
    public static int oneDeckShip4DeckCount = 0;

    public static int CaptainOneFourDeckShipY = 0;
    public static int CaptainOneFourDeckShipX = 0;
    public static int CaptainOneThreeDeckShip1Y = 0;
    public static int CaptainOneThreeDeckShip1X = 0;
    public static int CaptainOneThreeDeckShip2Y = 0;
    public static int CaptainOneThreeDeckShip2X = 0;

    public static int CaptainOneTwoDeckShip1Y = 0;
    public static int CaptainOneTwoDeckShip1X = 0;

    public static int CaptainOneTwoDeckShip2Y = 0;
    public static int CaptainOneTwoDeckShip2X = 0;

    public static int CaptainOneTwoDeckShip3Y = 0;
    public static int CaptainOneTwoDeckShip3X = 0;

    public static int CaptainOneOneDeckShip1Y = 0;
    public static int CaptainOneOneDeckShip1X = 0;
    public static int CaptainOneOneDeckShip2Y = 0;
    public static int CaptainOneOneDeckShip2X = 0;
    public static int CaptainOneOneDeckShip3Y = 0;
    public static int CaptainOneOneDeckShip3X = 0;
    public static int CaptainOneOneDeckShip4Y = 0;
    public static int CaptainOneOneDeckShip4X = 0;

    public static void setCaptainOneFourDeckShip() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵⛵⛵⛵ four-deck ship: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneFourDeckShipY = new Scanner(System.in);
                int CaptainOneFourDeckShipY = Integer.parseInt(scannerCaptainOneFourDeckShipY.nextLine());
                CaptainOneShips.CaptainOneFourDeckShipY = CaptainOneFourDeckShipY;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵⛵⛵⛵ four-deck ship: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneFourDeckShipX = new Scanner(System.in);
                int CaptainOneFourDeckShipX = Integer.parseInt(scannerCaptainOneFourDeckShipX.nextLine());
                CaptainOneShips.CaptainOneFourDeckShipX = CaptainOneFourDeckShipX;

                if (fourDeckShipDeckCount >= 2) {
                    if (CaptainOneFourDeckShipY != 9 && CaptainOneFourDeckShipX != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipY == 9 && CaptainOneFourDeckShipX == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipY == 9 && CaptainOneFourDeckShipX != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneFourDeckShipY != 9 && CaptainOneFourDeckShipX == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (fourDeckShipDeckCount == 1) {
                    if (CaptainOneFourDeckShipY != 9 && CaptainOneFourDeckShipX != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipY == 9 && CaptainOneFourDeckShipX == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipY == 9 && CaptainOneFourDeckShipX != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneFourDeckShipY != 9 && CaptainOneFourDeckShipX == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip))) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else {
                    if (CaptainOneFourDeckShipY == 9 && CaptainOneFourDeckShipX == 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipY == 9 && CaptainOneFourDeckShipX != 9) {
                        if (!BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipX == 9 && CaptainOneFourDeckShipY != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneFourDeckShipY != 9 && CaptainOneFourDeckShipX != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY - 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY + 1][CaptainOneFourDeckShipX + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainOneShipsToShow[CaptainOneFourDeckShipY][CaptainOneFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (fourDeckShipDeckCount < 4);
    }

    public static void setCaptainOneThreeDeckShip1() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵⛵⛵ three-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneThreeDeckShip1Y = new Scanner(System.in);
                int CaptainOneThreeDeckShip1Y = Integer.parseInt(scannerCaptainOneThreeDeckShip1Y.nextLine());
                CaptainOneShips.CaptainOneThreeDeckShip1Y = CaptainOneThreeDeckShip1Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵⛵⛵ three-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneThreeDeckShip1X = new Scanner(System.in);
                int CaptainOneThreeDeckShip1X = Integer.parseInt(scannerCaptainOneThreeDeckShip1X.nextLine());
                CaptainOneShips.CaptainOneThreeDeckShip1X = CaptainOneThreeDeckShip1X;

                if (threeDeckShip1DeckCount == 2) {
                    if (CaptainOneThreeDeckShip1Y != 9 && CaptainOneThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1Y == 9 && CaptainOneThreeDeckShip1X == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1Y == 9 && CaptainOneThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneThreeDeckShip1Y != 9 && CaptainOneThreeDeckShip1X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (threeDeckShip1DeckCount == 1) {
                    if (CaptainOneThreeDeckShip1Y != 9 && CaptainOneThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1Y == 9 && CaptainOneThreeDeckShip1X == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1Y == 9 && CaptainOneThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneThreeDeckShip1Y != 9 && CaptainOneThreeDeckShip1X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else {
                    if (CaptainOneThreeDeckShip1Y == 9 && CaptainOneThreeDeckShip1X == 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1Y == 9 && CaptainOneThreeDeckShip1X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1X == 9 && CaptainOneThreeDeckShip1Y != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip1Y != 9 && CaptainOneThreeDeckShip1X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y - 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y + 1][CaptainOneThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip1Y][CaptainOneThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (threeDeckShip1DeckCount < 3);
    }

    public static void setCaptainOneThreeDeckShip2() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵⛵⛵ three-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneThreeDeckShip2Y = new Scanner(System.in);
                int CaptainOneThreeDeckShip2Y = Integer.parseInt(scannerCaptainOneThreeDeckShip2Y.nextLine());
                CaptainOneShips.CaptainOneThreeDeckShip2Y = CaptainOneThreeDeckShip2Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵⛵⛵ three-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneThreeDeckShip2X = new Scanner(System.in);
                int CaptainOneThreeDeckShip2X = Integer.parseInt(scannerCaptainOneThreeDeckShip2X.nextLine());
                CaptainOneShips.CaptainOneThreeDeckShip2X = CaptainOneThreeDeckShip2X;


                if (threeDeckShip2DeckCount == 2) {
                    if (CaptainOneThreeDeckShip2Y != 9 && CaptainOneThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2Y == 9 && CaptainOneThreeDeckShip2X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2Y == 9 && CaptainOneThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneThreeDeckShip2Y != 9 && CaptainOneThreeDeckShip2X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (threeDeckShip2DeckCount == 1) {
                    if (CaptainOneThreeDeckShip2Y != 9 && CaptainOneThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2Y == 9 && CaptainOneThreeDeckShip2X == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2Y == 9 && CaptainOneThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneThreeDeckShip2Y != 9 && CaptainOneThreeDeckShip2X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else {
                    if (CaptainOneThreeDeckShip2Y == 9 && CaptainOneThreeDeckShip2X == 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2Y == 9 && CaptainOneThreeDeckShip2X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2X == 9 && CaptainOneThreeDeckShip2Y != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneThreeDeckShip2Y != 9 && CaptainOneThreeDeckShip2X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y - 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y + 1][CaptainOneThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainOneShipsToShow[CaptainOneThreeDeckShip2Y][CaptainOneThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (threeDeckShip2DeckCount < 3);
    }

    public static void setCaptainOneTwoDeckShip1() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵⛵ two-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneTwoDeckShip1Y = new Scanner(System.in);
                int CaptainOneTwoDeckShip1Y = Integer.parseInt(scannerCaptainOneTwoDeckShip1Y.nextLine());
                CaptainOneShips.CaptainOneTwoDeckShip1Y = CaptainOneTwoDeckShip1Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵⛵ two-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneTwoDeckShip1X = new Scanner(System.in);
                int CaptainOneTwoDeckShip1X = Integer.parseInt(scannerCaptainOneTwoDeckShip1X.nextLine());
                CaptainOneShips.CaptainOneTwoDeckShip1X = CaptainOneTwoDeckShip1X;

                if (twoDeckShip1DeckCount == 1) {
                    if (CaptainOneTwoDeckShip1Y != 9 && CaptainOneTwoDeckShip1X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip1Y == 9 && CaptainOneTwoDeckShip1X == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip1Y == 9 && CaptainOneTwoDeckShip1X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneTwoDeckShip1Y != 9 && CaptainOneTwoDeckShip1X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (twoDeckShip1DeckCount == 0) {
                    if (CaptainOneTwoDeckShip1Y == 9 && CaptainOneTwoDeckShip1X == 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip1Y == 9 && CaptainOneTwoDeckShip1X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip1X == 9 && CaptainOneTwoDeckShip1Y != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip1Y != 9 && CaptainOneTwoDeckShip1X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y - 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y + 1][CaptainOneTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip1Y][CaptainOneTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (twoDeckShip1DeckCount < 2);
    }

    public static void setCaptainOneTwoDeckShip2() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵⛵ two-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneTwoDeckShip2Y = new Scanner(System.in);
                int CaptainOneTwoDeckShip2Y = Integer.parseInt(scannerCaptainOneTwoDeckShip2Y.nextLine());
                CaptainOneShips.CaptainOneTwoDeckShip2Y = CaptainOneTwoDeckShip2Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵⛵ two-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneTwoDeckShip2X = new Scanner(System.in);
                int CaptainOneTwoDeckShip2X = Integer.parseInt(scannerCaptainOneTwoDeckShip2X.nextLine());
                CaptainOneShips.CaptainOneTwoDeckShip2X = CaptainOneTwoDeckShip2X;

                if (twoDeckShip2DeckCount == 1) {
                    if (CaptainOneTwoDeckShip2Y != 9 && CaptainOneTwoDeckShip2X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip2Y == 9 && CaptainOneTwoDeckShip2X == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip2Y == 9 && CaptainOneTwoDeckShip2X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneTwoDeckShip2Y != 9 && CaptainOneTwoDeckShip2X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (twoDeckShip2DeckCount == 0) {
                    if (CaptainOneTwoDeckShip2Y == 9 && CaptainOneTwoDeckShip2X == 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip2Y == 9 && CaptainOneTwoDeckShip2X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip2X == 9 && CaptainOneTwoDeckShip2Y != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip2Y != 9 && CaptainOneTwoDeckShip2X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y - 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y + 1][CaptainOneTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip2Y][CaptainOneTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (twoDeckShip2DeckCount < 2);
    }

    public static void setCaptainOneTwoDeckShip3() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵⛵ two-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneTwoDeckShip3Y = new Scanner(System.in);
                int CaptainOneTwoDeckShip3Y = Integer.parseInt(scannerCaptainOneTwoDeckShip3Y.nextLine());
                CaptainOneShips.CaptainOneTwoDeckShip3Y = CaptainOneTwoDeckShip3Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵⛵ two-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneTwoDeckShip3X = new Scanner(System.in);
                int CaptainOneTwoDeckShip3X = Integer.parseInt(scannerCaptainOneTwoDeckShip3X.nextLine());
                CaptainOneShips.CaptainOneTwoDeckShip3X = CaptainOneTwoDeckShip3X;

                if (twoDeckShip3DeckCount == 1) {
                    if (CaptainOneTwoDeckShip3Y != 9 && CaptainOneTwoDeckShip3X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip3Y == 9 && CaptainOneTwoDeckShip3X == 9) {
                        if ((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip3Y == 9 && CaptainOneTwoDeckShip3X != 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainOneTwoDeckShip3Y != 9 && CaptainOneTwoDeckShip3X == 9) {
                        if (((BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (twoDeckShip3DeckCount == 0) {
                    if (CaptainOneTwoDeckShip3Y == 9 && CaptainOneTwoDeckShip3X == 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip3Y == 9 && CaptainOneTwoDeckShip3X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip3X == 9 && CaptainOneTwoDeckShip3Y != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainOneTwoDeckShip3Y != 9 && CaptainOneTwoDeckShip3X != 9) {
                        if ((!BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y - 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y + 1][CaptainOneTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainOneField[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainOneShipsToShow[CaptainOneTwoDeckShip3Y][CaptainOneTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainOneShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainOneShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (twoDeckShip3DeckCount < 2);
    }

    public static void setCaptainOneOneDeckShip1() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip1Y = new Scanner(System.in);
                int CaptainOneOneDeckShip1Y = Integer.parseInt(scannerCaptainOneOneDeckShip1Y.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip1Y = CaptainOneOneDeckShip1Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip1X = new Scanner(System.in);
                int CaptainOneOneDeckShip1X = Integer.parseInt(scannerCaptainOneOneDeckShip1X.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip1X = CaptainOneOneDeckShip1X;

                if (CaptainOneOneDeckShip1Y == 9 && CaptainOneOneDeckShip1X == 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip1Y == 9 && CaptainOneOneDeckShip1X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip1X == 9 && CaptainOneOneDeckShip1Y != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y + 1][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y + 1][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip1Y != 9 && CaptainOneOneDeckShip1X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y - 1][CaptainOneOneDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y + 1][CaptainOneOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y + 1][CaptainOneOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y + 1][CaptainOneOneDeckShip1X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip1Y][CaptainOneOneDeckShip1X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip1DeckCount < 1);
    }

    public static void setCaptainOneOneDeckShip2() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip2Y = new Scanner(System.in);
                int CaptainOneOneDeckShip2Y = Integer.parseInt(scannerCaptainOneOneDeckShip2Y.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip2Y = CaptainOneOneDeckShip2Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip2X = new Scanner(System.in);
                int CaptainOneOneDeckShip2X = Integer.parseInt(scannerCaptainOneOneDeckShip2X.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip2X = CaptainOneOneDeckShip2X;

                if (CaptainOneOneDeckShip2Y == 9 && CaptainOneOneDeckShip2X == 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip2Y == 9 && CaptainOneOneDeckShip2X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip2X == 9 && CaptainOneOneDeckShip2Y != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y + 1][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y + 1][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip2Y != 9 && CaptainOneOneDeckShip2X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y - 1][CaptainOneOneDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y + 1][CaptainOneOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y + 1][CaptainOneOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y + 1][CaptainOneOneDeckShip2X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip2Y][CaptainOneOneDeckShip2X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip2DeckCount < 1);
    }

    public static void setCaptainOneOneDeckShip3() {

        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip3Y = new Scanner(System.in);
                int CaptainOneOneDeckShip3Y = Integer.parseInt(scannerCaptainOneOneDeckShip3Y.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip3Y = CaptainOneOneDeckShip3Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip3X = new Scanner(System.in);
                int CaptainOneOneDeckShip3X = Integer.parseInt(scannerCaptainOneOneDeckShip3X.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip3X = CaptainOneOneDeckShip3X;

                if (CaptainOneOneDeckShip3Y == 9 && CaptainOneOneDeckShip3X == 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip3Y == 9 && CaptainOneOneDeckShip3X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip3X == 9 && CaptainOneOneDeckShip3Y != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y + 1][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y + 1][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip3Y != 9 && CaptainOneOneDeckShip3X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y - 1][CaptainOneOneDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y + 1][CaptainOneOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y + 1][CaptainOneOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y + 1][CaptainOneOneDeckShip3X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip3Y][CaptainOneOneDeckShip3X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip3DeckCount < 1);

    }

    public static void setCaptainOneOneDeckShip4() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship4: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip4Y = new Scanner(System.in);
                int CaptainOneOneDeckShip4Y = Integer.parseInt(scannerCaptainOneOneDeckShip4Y.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip4Y = CaptainOneOneDeckShip4Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship4: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainOneOneDeckShip4X = new Scanner(System.in);
                int CaptainOneOneDeckShip4X = Integer.parseInt(scannerCaptainOneOneDeckShip4X.nextLine());
                CaptainOneShips.CaptainOneOneDeckShip4X = CaptainOneOneDeckShip4X;

                if (CaptainOneOneDeckShip4Y == 9 && CaptainOneOneDeckShip4X == 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf('⛵');
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip4Y == 9 && CaptainOneOneDeckShip4X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip4X == 9 && CaptainOneOneDeckShip4Y != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneShips.CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y + 1][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y + 1][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainOneOneDeckShip4Y != 9 && CaptainOneOneDeckShip4X != 9) {
                    if (!BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y - 1][CaptainOneOneDeckShip4X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y + 1][CaptainOneOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y + 1][CaptainOneOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y + 1][CaptainOneOneDeckShip4X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainOneField[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainOneShipsToShow[CaptainOneOneDeckShip4Y][CaptainOneOneDeckShip4X] = String.valueOf('⛵');
                        CaptainOneShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainOneShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainOneShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip4DeckCount < 1);

    }

    public static void autoSetCaptainOneShips() {

        CaptainOneShips.fourDeckShipDeckCount = 4;
        CaptainOneShips.threeDeckShip1DeckCount = 3;
        CaptainOneShips.threeDeckShip2DeckCount = 3;
        CaptainOneShips.twoDeckShip1DeckCount = 2;
        CaptainOneShips.twoDeckShip2DeckCount = 2;
        CaptainOneShips.twoDeckShip3DeckCount = 2;
        CaptainOneShips.oneDeckShip1DeckCount = 1;
        CaptainOneShips.oneDeckShip2DeckCount = 1;
        CaptainOneShips.oneDeckShip3DeckCount = 1;
        CaptainOneShips.oneDeckShip4DeckCount = 1;
        for (int i = 6; i < BattleField.SIZE; i++) {
            BattleField.CaptainOneField[i][9] = String.valueOf(4);
            BattleField.CaptainOneShipsToShow[i][9] = String.valueOf('⛵');
        }
        for (int j = 1; j < 4; j++) {
            BattleField.CaptainOneField[1][j] = String.valueOf(31);
            BattleField.CaptainOneShipsToShow[1][j] = String.valueOf('⛵');
        }
        for (int j = 2; j < 5; j++) {
            BattleField.CaptainOneField[7][j] = String.valueOf(32);
            BattleField.CaptainOneShipsToShow[7][j] = String.valueOf('⛵');
        }
        for (int i = 4; i < 6; i++) {
            BattleField.CaptainOneField[i][1] = String.valueOf(21);
            BattleField.CaptainOneShipsToShow[i][1] = String.valueOf('⛵');
        }
        for (int j = 8; j < 10; j++) {
            BattleField.CaptainOneField[3][j] = String.valueOf(22);
            BattleField.CaptainOneShipsToShow[3][j] = String.valueOf('⛵');
        }
        for (int i = 3; i < 5; i++) {
            BattleField.CaptainOneField[i][4] = String.valueOf(23);
            BattleField.CaptainOneShipsToShow[i][4] = String.valueOf('⛵');
        }
        BattleField.CaptainOneField[2][6] = String.valueOf(11);
        BattleField.CaptainOneField[6][7] = String.valueOf(12);
        BattleField.CaptainOneField[9][7] = String.valueOf(13);
        BattleField.CaptainOneField[9][3] = String.valueOf(14);

        BattleField.CaptainOneShipsToShow[2][6] = String.valueOf('⛵');
        BattleField.CaptainOneShipsToShow[6][7] = String.valueOf('⛵');
        BattleField.CaptainOneShipsToShow[9][7] = String.valueOf('⛵');
        BattleField.CaptainOneShipsToShow[9][3] = String.valueOf('⛵');
    }
}
