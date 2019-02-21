package Java1.dz2_seaBattle;

import java.util.Scanner;

import static Java1.dz2_seaBattle.BattleField.CaptainTwoShipsPrint;
import static Java1.dz2_seaBattle.Control.shipSuccessfullySetPrint;

/**
 * Created by Anton on 23.05.2018.
 */
public class CaptainTwoShips {
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

    public static int CaptainTwoFourDeckShipY = 0;
    public static int CaptainTwoFourDeckShipX = 0;
    public static int CaptainTwoThreeDeckShip1Y = 0;
    public static int CaptainTwoThreeDeckShip1X = 0;
    public static int CaptainTwoThreeDeckShip2Y = 0;
    public static int CaptainTwoThreeDeckShip2X = 0;
    public static int CaptainTwoTwoDeckShip1Y = 0;
    public static int CaptainTwoTwoDeckShip1X = 0;
    public static int CaptainTwoTwoDeckShip2Y = 0;
    public static int CaptainTwoTwoDeckShip2X = 0;
    public static int CaptainTwoTwoDeckShip3Y = 0;
    public static int CaptainTwoTwoDeckShip3X = 0;
    public static int CaptainTwoOneDeckShip1Y = 0;
    public static int CaptainTwoOneDeckShip1X = 0;
    public static int CaptainTwoOneDeckShip2Y = 0;
    public static int CaptainTwoOneDeckShip2X = 0;
    public static int CaptainTwoOneDeckShip3Y = 0;
    public static int CaptainTwoOneDeckShip3X = 0;
    public static int CaptainTwoOneDeckShip4Y = 0;
    public static int CaptainTwoOneDeckShip4X = 0;

    public static void setCaptainTwoFourDeckShip() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵⛵⛵⛵ four-deck ship: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoFourDeckShipY = new Scanner(System.in);
                int CaptainTwoFourDeckShipY = Integer.parseInt(scannerCaptainTwoFourDeckShipY.nextLine());
                CaptainTwoShips.CaptainTwoFourDeckShipY = CaptainTwoFourDeckShipY;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵⛵⛵⛵ four-deck ship: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoFourDeckShipX = new Scanner(System.in);
                int CaptainTwoFourDeckShipX = Integer.parseInt(scannerCaptainTwoFourDeckShipX.nextLine());
                CaptainTwoShips.CaptainTwoFourDeckShipX = CaptainTwoFourDeckShipX;

                if (fourDeckShipDeckCount >= 2) {
                    if (CaptainTwoFourDeckShipY != 9 && CaptainTwoFourDeckShipX != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipY == 9 && CaptainTwoFourDeckShipX == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipY == 9 && CaptainTwoFourDeckShipX != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoFourDeckShipY != 9 && CaptainTwoFourDeckShipX == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (fourDeckShipDeckCount == 1) {
                    if (CaptainTwoFourDeckShipY != 9 && CaptainTwoFourDeckShipX != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipY == 9 && CaptainTwoFourDeckShipX == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipY == 9 && CaptainTwoFourDeckShipX != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoFourDeckShipY != 9 && CaptainTwoFourDeckShipX == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip))) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else {
                    if (CaptainTwoFourDeckShipY == 9 && CaptainTwoFourDeckShipX == 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipY == 9 && CaptainTwoFourDeckShipX != 9) {
                        if (!BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipX == 9 && CaptainTwoFourDeckShipY != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoFourDeckShipY != 9 && CaptainTwoFourDeckShipX != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY - 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY + 1][CaptainTwoFourDeckShipX + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf(4);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoFourDeckShipY][CaptainTwoFourDeckShipX] = String.valueOf('⛵');
                            fourDeckShipDeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }

        } while (fourDeckShipDeckCount < 4);
    }

    public static void setCaptainTwoThreeDeckShip1() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵⛵⛵ three-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoThreeDeckShip1Y = new Scanner(System.in);
                int CaptainTwoThreeDeckShip1Y = Integer.parseInt(scannerCaptainTwoThreeDeckShip1Y.nextLine());
                CaptainTwoShips.CaptainTwoThreeDeckShip1Y = CaptainTwoThreeDeckShip1Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵⛵⛵ three-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoThreeDeckShip1X = new Scanner(System.in);
                int CaptainTwoThreeDeckShip1X = Integer.parseInt(scannerCaptainTwoThreeDeckShip1X.nextLine());
                CaptainTwoShips.CaptainTwoThreeDeckShip1X = CaptainTwoThreeDeckShip1X;

                if (threeDeckShip1DeckCount == 2) {
                    if (CaptainTwoThreeDeckShip1Y != 9 && CaptainTwoThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1Y == 9 && CaptainTwoThreeDeckShip1X == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1Y == 9 && CaptainTwoThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoThreeDeckShip1Y != 9 && CaptainTwoThreeDeckShip1X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (threeDeckShip1DeckCount == 1) {
                    if (CaptainTwoThreeDeckShip1Y != 9 && CaptainTwoThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1Y == 9 && CaptainTwoThreeDeckShip1X == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1Y == 9 && CaptainTwoThreeDeckShip1X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoThreeDeckShip1Y != 9 && CaptainTwoThreeDeckShip1X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else {
                    if (CaptainTwoThreeDeckShip1Y == 9 && CaptainTwoThreeDeckShip1X == 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1Y == 9 && CaptainTwoThreeDeckShip1X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1X == 9 && CaptainTwoThreeDeckShip1Y != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip1Y != 9 && CaptainTwoThreeDeckShip1X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y - 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y + 1][CaptainTwoThreeDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf(31);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip1Y][CaptainTwoThreeDeckShip1X] = String.valueOf('⛵');
                            threeDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (threeDeckShip1DeckCount < 3);
    }

    public static void setCaptainTwoThreeDeckShip2() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵⛵⛵ three-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoThreeDeckShip2Y = new Scanner(System.in);
                int CaptainTwoThreeDeckShip2Y = Integer.parseInt(scannerCaptainTwoThreeDeckShip2Y.nextLine());
                CaptainTwoShips.CaptainTwoThreeDeckShip2Y = CaptainTwoThreeDeckShip2Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵⛵⛵ three-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoThreeDeckShip2X = new Scanner(System.in);
                int CaptainTwoThreeDeckShip2X = Integer.parseInt(scannerCaptainTwoThreeDeckShip2X.nextLine());
                CaptainTwoShips.CaptainTwoThreeDeckShip2X = CaptainTwoThreeDeckShip2X;

                if (threeDeckShip2DeckCount == 2) {
                    if (CaptainTwoThreeDeckShip2Y != 9 && CaptainTwoThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2Y == 9 && CaptainTwoThreeDeckShip2X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2Y == 9 && CaptainTwoThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoThreeDeckShip2Y != 9 && CaptainTwoThreeDeckShip2X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (threeDeckShip2DeckCount == 1) {
                    if (CaptainTwoThreeDeckShip2Y != 9 && CaptainTwoThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2Y == 9 && CaptainTwoThreeDeckShip2X == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2Y == 9 && CaptainTwoThreeDeckShip2X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoThreeDeckShip2Y != 9 && CaptainTwoThreeDeckShip2X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else {
                    if (CaptainTwoThreeDeckShip2Y == 9 && CaptainTwoThreeDeckShip2X == 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2Y == 9 && CaptainTwoThreeDeckShip2X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2X == 9 && CaptainTwoThreeDeckShip2Y != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoThreeDeckShip2Y != 9 && CaptainTwoThreeDeckShip2X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y - 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y + 1][CaptainTwoThreeDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf(32);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoThreeDeckShip2Y][CaptainTwoThreeDeckShip2X] = String.valueOf('⛵');
                            threeDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (threeDeckShip2DeckCount < 3);
    }

    public static void setCaptainTwoTwoDeckShip1() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵⛵ two-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoTwoDeckShip1Y = new Scanner(System.in);
                int CaptainTwoTwoDeckShip1Y = Integer.parseInt(scannerCaptainTwoTwoDeckShip1Y.nextLine());
                CaptainTwoShips.CaptainTwoTwoDeckShip1Y = CaptainTwoTwoDeckShip1Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵⛵ two-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoTwoDeckShip1X = new Scanner(System.in);
                int CaptainTwoTwoDeckShip1X = Integer.parseInt(scannerCaptainTwoTwoDeckShip1X.nextLine());
                CaptainTwoShips.CaptainTwoTwoDeckShip1X = CaptainTwoTwoDeckShip1Y;

                if (twoDeckShip1DeckCount == 1) {
                    if (CaptainTwoTwoDeckShip1Y != 9 && CaptainTwoTwoDeckShip1X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip1Y == 9 && CaptainTwoTwoDeckShip1X == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip1Y == 9 && CaptainTwoTwoDeckShip1X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoTwoDeckShip1Y != 9 && CaptainTwoTwoDeckShip1X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (twoDeckShip1DeckCount == 0) {
                    if (CaptainTwoTwoDeckShip1Y == 9 && CaptainTwoTwoDeckShip1X == 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip1Y == 9 && CaptainTwoTwoDeckShip1X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip1X == 9 && CaptainTwoTwoDeckShip1Y != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip1Y != 9 && CaptainTwoTwoDeckShip1X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y - 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y + 1][CaptainTwoTwoDeckShip1X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf(21);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip1Y][CaptainTwoTwoDeckShip1X] = String.valueOf('⛵');
                            twoDeckShip1DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (twoDeckShip1DeckCount < 2);
    }

    public static void setCaptainTwoTwoDeckShip2() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵⛵ two-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoTwoDeckShip2Y = new Scanner(System.in);
                int CaptainTwoTwoDeckShip2Y = Integer.parseInt(scannerCaptainTwoTwoDeckShip2Y.nextLine());
                CaptainTwoShips.CaptainTwoTwoDeckShip2Y = CaptainTwoTwoDeckShip2Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵⛵ two-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoTwoDeckShip2X = new Scanner(System.in);
                int CaptainTwoTwoDeckShip2X = Integer.parseInt(scannerCaptainTwoTwoDeckShip2X.nextLine());
                CaptainTwoShips.CaptainTwoTwoDeckShip2X = CaptainTwoTwoDeckShip2X;

                if (twoDeckShip2DeckCount == 1) {
                    if (CaptainTwoTwoDeckShip2Y != 9 && CaptainTwoTwoDeckShip2X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip2Y == 9 && CaptainTwoTwoDeckShip2X == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip2Y == 9 && CaptainTwoTwoDeckShip2X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoTwoDeckShip2Y != 9 && CaptainTwoTwoDeckShip2X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (twoDeckShip2DeckCount == 0) {
                    if (CaptainTwoTwoDeckShip2Y == 9 && CaptainTwoTwoDeckShip2X == 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip2Y == 9 && CaptainTwoTwoDeckShip2X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip2X == 9 && CaptainTwoTwoDeckShip2Y != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip2Y != 9 && CaptainTwoTwoDeckShip2X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y - 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y + 1][CaptainTwoTwoDeckShip2X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf(22);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip2Y][CaptainTwoTwoDeckShip2X] = String.valueOf('⛵');
                            twoDeckShip2DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (twoDeckShip2DeckCount < 2);
    }

    public static void setCaptainTwoTwoDeckShip3() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵⛵ two-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoTwoDeckShip3Y = new Scanner(System.in);
                int CaptainTwoTwoDeckShip3Y = Integer.parseInt(scannerCaptainTwoTwoDeckShip3Y.nextLine());
                CaptainTwoShips.CaptainTwoTwoDeckShip3Y = CaptainTwoTwoDeckShip3Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵⛵ two-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoTwoDeckShip3X = new Scanner(System.in);
                int CaptainTwoTwoDeckShip3X = Integer.parseInt(scannerCaptainTwoTwoDeckShip3X.nextLine());
                CaptainTwoShips.CaptainTwoTwoDeckShip3X = CaptainTwoTwoDeckShip3X;

                if (twoDeckShip3DeckCount == 1) {
                    if (CaptainTwoTwoDeckShip3Y != 9 && CaptainTwoTwoDeckShip3X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip3Y == 9 && CaptainTwoTwoDeckShip3X == 9) {
                        if ((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) || BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip3Y == 9 && CaptainTwoTwoDeckShip3X != 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                    if (CaptainTwoTwoDeckShip3Y != 9 && CaptainTwoTwoDeckShip3X == 9) {
                        if (((BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) || (BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip))) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                } else if (twoDeckShip3DeckCount == 0) {
                    if (CaptainTwoTwoDeckShip3Y == 9 && CaptainTwoTwoDeckShip3X == 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip3Y == 9 && CaptainTwoTwoDeckShip3X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip3X == 9 && CaptainTwoTwoDeckShip3Y != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    } else if (CaptainTwoTwoDeckShip3Y != 9 && CaptainTwoTwoDeckShip3X != 9) {
                        if ((!BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y - 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y + 1][CaptainTwoTwoDeckShip3X + 1].equals(Control.afterDoShootsShip)) && !BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X].equals(Control.afterDoShootsShip)) {
                            BattleField.CaptainTwoField[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf(23);
                            BattleField.CaptainTwoShipsToShow[CaptainTwoTwoDeckShip3Y][CaptainTwoTwoDeckShip3X] = String.valueOf('⛵');
                            twoDeckShip3DeckCount++;
                            CaptainTwoShipsPrint();
                            shipSuccessfullySetPrint();
                        } else {
                            CaptainTwoShipsPrint();
                            Control.cannotSetShipPrint();
                        }
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainTwoName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (twoDeckShip3DeckCount < 2);
    }

    public static void setCaptainTwoOneDeckShip1() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip1Y = new Scanner(System.in);
                int CaptainTwoOneDeckShip1Y = Integer.parseInt(scannerCaptainTwoOneDeckShip1Y.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip1Y = CaptainTwoOneDeckShip1Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship1: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip1X = new Scanner(System.in);
                int CaptainTwoOneDeckShip1X = Integer.parseInt(scannerCaptainTwoOneDeckShip1X.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip1X = CaptainTwoOneDeckShip1X;

                if (CaptainTwoOneDeckShip1Y == 9 && CaptainTwoOneDeckShip1X == 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip1Y == 9 && CaptainTwoOneDeckShip1X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip1X == 9 && CaptainTwoOneDeckShip1Y != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y + 1][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y + 1][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip1Y != 9 && CaptainTwoOneDeckShip1X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y - 1][CaptainTwoOneDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y + 1][CaptainTwoOneDeckShip1X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y + 1][CaptainTwoOneDeckShip1X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y + 1][CaptainTwoOneDeckShip1X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf(11);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip1Y][CaptainTwoOneDeckShip1X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip1DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip1DeckCount < 1);
    }

    public static void setCaptainTwoOneDeckShip2() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip2Y = new Scanner(System.in);
                int CaptainTwoOneDeckShip2Y = Integer.parseInt(scannerCaptainTwoOneDeckShip2Y.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip2Y = CaptainTwoOneDeckShip2Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship2: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip2X = new Scanner(System.in);
                int CaptainTwoOneDeckShip2X = Integer.parseInt(scannerCaptainTwoOneDeckShip2X.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip2X = CaptainTwoOneDeckShip2X;

                if (CaptainTwoOneDeckShip2Y == 9 && CaptainTwoOneDeckShip2X == 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip2Y == 9 && CaptainTwoOneDeckShip2X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip2X == 9 && CaptainTwoOneDeckShip2Y != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y + 1][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y + 1][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip2Y != 9 && CaptainTwoOneDeckShip2X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y - 1][CaptainTwoOneDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y + 1][CaptainTwoOneDeckShip2X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y + 1][CaptainTwoOneDeckShip2X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y + 1][CaptainTwoOneDeckShip2X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf(12);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip2Y][CaptainTwoOneDeckShip2X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip2DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip2DeckCount < 1);
    }

    public static void setCaptainTwoOneDeckShip3() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip3Y = new Scanner(System.in);
                int CaptainTwoOneDeckShip3Y = Integer.parseInt(scannerCaptainTwoOneDeckShip3Y.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip3Y = CaptainTwoOneDeckShip3Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship3: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip3X = new Scanner(System.in);
                int CaptainTwoOneDeckShip3X = Integer.parseInt(scannerCaptainTwoOneDeckShip3X.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip3X = CaptainTwoOneDeckShip3X;

                if (CaptainTwoOneDeckShip3Y == 9 && CaptainTwoOneDeckShip3X == 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip3Y == 9 && CaptainTwoOneDeckShip3X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip3X == 9 && CaptainTwoOneDeckShip3Y != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y + 1][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y + 1][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip3Y != 9 && CaptainTwoOneDeckShip3X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y - 1][CaptainTwoOneDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y + 1][CaptainTwoOneDeckShip3X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y + 1][CaptainTwoOneDeckShip3X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y + 1][CaptainTwoOneDeckShip3X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf(13);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip3Y][CaptainTwoOneDeckShip3X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip3DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip3DeckCount < 1);
    }

    public static void setCaptainTwoOneDeckShip4() {
        do {
            try {
                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", let's set your ships ! Enter Y coordinate of ⛵ one-deck ship4: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip4Y = new Scanner(System.in);
                int CaptainTwoOneDeckShip4Y = Integer.parseInt(scannerCaptainTwoOneDeckShip4Y.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip4Y = CaptainTwoOneDeckShip4Y;

                System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", let's set your ships ! Enter X coordinate of ⛵ one-deck ship4: ⚓⚓⚓" + Control.ANSI_RESET);
                Scanner scannerCaptainTwoOneDeckShip4X = new Scanner(System.in);
                int CaptainTwoOneDeckShip4X = Integer.parseInt(scannerCaptainTwoOneDeckShip4X.nextLine());
                CaptainTwoShips.CaptainTwoOneDeckShip4X = CaptainTwoOneDeckShip4X;

                if (CaptainTwoOneDeckShip4Y == 9 && CaptainTwoOneDeckShip4X == 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf('⛵');
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip4Y == 9 && CaptainTwoOneDeckShip4X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip4X == 9 && CaptainTwoOneDeckShip4Y != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainOneShips.CaptainOneOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y + 1][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y + 1][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                } else if (CaptainTwoOneDeckShip4Y != 9 && CaptainTwoOneDeckShip4X != 9) {
                    if (!BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y - 1][CaptainTwoOneDeckShip4X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X + 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y + 1][CaptainTwoOneDeckShip4X - 1].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y + 1][CaptainTwoOneDeckShip4X].equals(Control.afterDoShootsShip) && !BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y + 1][CaptainTwoOneDeckShip4X + 1].equals(Control.afterDoShootsShip)) {
                        BattleField.CaptainTwoField[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf(14);
                        BattleField.CaptainTwoShipsToShow[CaptainTwoOneDeckShip4Y][CaptainTwoOneDeckShip4X] = String.valueOf('⛵');
                        CaptainTwoShipsPrint();
                        shipSuccessfullySetPrint();
                        oneDeckShip4DeckCount++;
                    } else {
                        CaptainTwoShipsPrint();
                        Control.cannotSetShipPrint();
                    }
                }
            } catch (Exception e) {
                CaptainTwoShipsPrint();
                System.out.println(Control.ANSI_RED + "⚓⚓⚓ " + Control.CaptainOneName + ", you are entering impossible value! Try again, enter value 1-9 ! ⚓⚓⚓" + Control.ANSI_RESET);
                System.out.println();
            }
        } while (oneDeckShip4DeckCount < 1);
    }

    public static void autoSetCaptainTwoShips() {
        CaptainTwoShips.fourDeckShipDeckCount = 4;
        CaptainTwoShips.threeDeckShip1DeckCount = 3;
        CaptainTwoShips.threeDeckShip2DeckCount = 3;
        CaptainTwoShips.twoDeckShip1DeckCount = 2;
        CaptainTwoShips.twoDeckShip2DeckCount = 2;
        CaptainTwoShips.twoDeckShip3DeckCount = 2;
        CaptainTwoShips.oneDeckShip1DeckCount = 1;
        CaptainTwoShips.oneDeckShip2DeckCount = 1;
        CaptainTwoShips.oneDeckShip3DeckCount = 1;
        CaptainTwoShips.oneDeckShip4DeckCount = 1;
        for (int i = 3; i < 7; i++) {
            BattleField.CaptainTwoField[i][7] = String.valueOf(4);
            BattleField.CaptainTwoShipsToShow[i][7] = String.valueOf('⛵');
        }
        for (int j = 1; j < 4; j++) {
            BattleField.CaptainTwoField[2][j] = String.valueOf(31);
            BattleField.CaptainTwoShipsToShow[2][j] = String.valueOf('⛵');
        }
        for (int j = 2; j < 5; j++) {
            BattleField.CaptainTwoField[7][j] = String.valueOf(32);
            BattleField.CaptainTwoShipsToShow[7][j] = String.valueOf('⛵');
        }
        for (int i = 4; i < 6; i++) {
            BattleField.CaptainTwoField[i][2] = String.valueOf(21);
            BattleField.CaptainTwoShipsToShow[i][2] = String.valueOf('⛵');
        }
        for (int j = 6; j < 8; j++) {
            BattleField.CaptainTwoField[9][j] = String.valueOf(22);
            BattleField.CaptainTwoShipsToShow[9][j] = String.valueOf('⛵');
        }
        for (int i = 4; i < 6; i++) {
            BattleField.CaptainTwoField[i][4] = String.valueOf(23);
            BattleField.CaptainTwoShipsToShow[i][4] = String.valueOf('⛵');
        }
        BattleField.CaptainTwoField[1][6] = String.valueOf(11);
        BattleField.CaptainTwoField[9][3] = String.valueOf(12);
        BattleField.CaptainTwoField[7][9] = String.valueOf(13);
        BattleField.CaptainTwoField[1][8] = String.valueOf(14);

        BattleField.CaptainTwoShipsToShow[1][6] = String.valueOf('⛵');
        BattleField.CaptainTwoShipsToShow[9][3] = String.valueOf('⛵');
        BattleField.CaptainTwoShipsToShow[7][9] = String.valueOf('⛵');
        BattleField.CaptainTwoShipsToShow[1][8] = String.valueOf('⛵');
    }
}
