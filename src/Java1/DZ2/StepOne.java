package Java1.DZ2;

import java.util.Scanner;

/**
 * Created by Anton on 19.05.2018.
 */
public class StepOne extends Field {
    public static void doShoot() {

        int shootCount = 0;
        int goalCount = 0;
        int bombsCount = 0;
        System.out.println("Enter bombs count: ");
        Scanner scannerBombs = new Scanner(System.in);
        int bombs = Integer.parseInt(scannerBombs.nextLine());
        bombsCount = bombs;
        if (bombs == 0) {
            System.out.println(ANSI_RED + "⇨ We don't have Ⳝ bombs ! Game over!");
        } else

            do {
                System.out.println("Enter Y: ");
                Scanner scannerY = new Scanner(System.in);
                int y = Integer.parseInt(scannerY.nextLine());
                System.out.println("Enter X: ");
                Scanner scannerX = new Scanner(System.in);
                int x = Integer.parseInt(scannerX.nextLine());
                shootCount++;
                bombs--;

                if (FIELD[y - 1][x - 1] == '\u058D') {
                    System.out.println(ANSI_BLUE + "⇨ Second shoot on this target! Bombs Ⳝ we have:" + bombs + ANSI_RESET);
                } else {
                    if (y >= 3 && y <= 8 && x == 1 || y == 9 && x >= 4 && x <= 7) {
                        for (int i = 0; i < SIZE; i++) {
                            for (int j = 0; j < SIZE; j++) {
                                FIELD[y - 1][x - 1] = '\u058D';
                            }
                        }
                        System.out.println(ANSI_BLUE + "⇨ ON TARGET! Bombs Ⳝ we have:" + bombs + ANSI_RESET);
                        goalCount++;
                    } else System.out.println(ANSI_BLUE + "⇨ Miss! ⛔ Bombs Ⳝ we have: " + bombs + ANSI_RESET);
                }
                shipsShow();

                if (goalCount == 10) {
                    System.out.println(ANSI_BLUE + "✩✩✩ YOU WIN!!! ✩✩✩");
                    break;
                }
                if (bombs == 0) {
                    System.out.println(ANSI_RED + "⇨ Bombs Ⳝ ended! Game over!");
                }
            } while (shootCount < bombsCount);

    }
}