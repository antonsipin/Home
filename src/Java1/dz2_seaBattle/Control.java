package Java1.dz2_seaBattle;

import java.util.Scanner;

/**
 * Created by Anton on 01.06.2018.
 */
public class Control {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static String CaptainOneName;
    public static String CaptainTwoName;
    public static String CaptainOneAnswer;
    public static String CaptainTwoAnswer;
    public static String CaptainOneAnswerToShowShips;
    public static String CaptainTwoAnswerToShowShips;
    public static String CaptainOneAnswerToHideShips;
    public static String CaptainTwoAnswerToHideShips;
    public static String CaptainTwoAnswerToSeeCaptainOneShips;
    public static String CaptainOneAnswerToSeeCaptainTwoShips;


    public static String whoNextShoot = "CaptainOne";
    public static int captainOneShipAfterDoShootCount = 0;
    public static int captainTwoShipAfterDoShootCount = 0;

    public static String ship = String.valueOf('⚓');
    public static String bomb = String.valueOf('\u058D');
    public static String point = String.valueOf('.');
    public static String space = String.valueOf(' ');
    public static String afterDoShootsShip = String.valueOf('⛵');

    public static void gameStartPrint() {
        System.out.println(ANSI_BLUE + "\t\t\t\t\t\t   ⚓⚓⚓ SEA BATTLE ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void gameOverPrint() {
        System.out.println(ANSI_BLUE + "\t\t\t\t\t\t   ⚓⚓⚓ SEA BATTLE ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void goalIsAlreadyPaddedPrint() {
        System.out.println(ANSI_RED + "\t\t\t      ⚓⚓⚓ This goal is already padded ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void cannotSetShipPrint() {
        System.out.println(ANSI_RED + "\t\t\t      ⚓⚓⚓ You can't set ship here ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void shipSuccessfullySetPrint() {
        System.out.println(ANSI_GREEN + "\t\t\t      ⚓⚓⚓ Ship successfully set ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void everythingPreparePrint() {
        System.out.println(ANSI_GREEN + "\t\t\t   ⚓⚓⚓ Everything prepared for sea battle ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void missPrint() {
        System.out.println(ANSI_RED + "\t\t      ⚓⚓⚓ MISS ! Everything will be OK ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void targetKilledPrint() {
        System.out.println(ANSI_RED + "\t\t\t\t\t     ⚓⚓⚓ TARGET KILLED ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void targetDamagedPrint() {
        System.out.println(ANSI_RED + "\t\t\t\t\t     ⚓⚓⚓ TARGET DAMAGED ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void missPrintSecondShoot() {
        System.out.println(ANSI_RED + "\t\t\t   ⚓⚓⚓ MISS ! You're repeating yourself ! ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
    }

    public static void setCaptainOneName() {
        System.out.println(ANSI_BLUE + "\t\t\t ⚓⚓⚓ Who's shoot will be first ? Enter your name: ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainOneName = new Scanner(System.in);
        final String CaptainOneName = scannerCaptainOneName.nextLine();
        Control.CaptainOneName = CaptainOneName;
    }

    public static void setCaptainTwoName() {
        System.out.println(ANSI_BLUE + "\t\t\t ⚓⚓⚓ Who's shoot will be second ? Enter your name: ⚓⚓⚓" + ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainTwoName = new Scanner(System.in);
        final String CaptainTwoName = scannerCaptainTwoName.nextLine();
        Control.CaptainTwoName = CaptainTwoName;
    }

    public static void checkSetCaptainOneShips() {
        if (CaptainOneShips.fourDeckShipDeckCount == 4 && CaptainOneShips.threeDeckShip1DeckCount == 3 && CaptainOneShips.threeDeckShip2DeckCount == 3 && CaptainOneShips.twoDeckShip1DeckCount == 2 && CaptainOneShips.twoDeckShip2DeckCount == 2 && CaptainOneShips.twoDeckShip3DeckCount == 2 && CaptainOneShips.oneDeckShip1DeckCount == 1 && CaptainOneShips.oneDeckShip2DeckCount == 1 && CaptainOneShips.oneDeckShip3DeckCount == 1 && CaptainOneShips.oneDeckShip4DeckCount == 1) {
            System.out.println(Control.ANSI_GREEN + "\t\t ⚓⚓⚓ " + Control.CaptainOneName + ", it's OK ! Your ships successfully set ! ⚓⚓⚓" + Control.ANSI_RESET);
            System.out.println();
        }
    }

    public static void checkSetCaptainTwoShips() {
        if (CaptainTwoShips.fourDeckShipDeckCount == 4 && CaptainTwoShips.threeDeckShip1DeckCount == 3 && CaptainTwoShips.threeDeckShip2DeckCount == 3 && CaptainTwoShips.twoDeckShip1DeckCount == 2 && CaptainTwoShips.twoDeckShip2DeckCount == 2 && CaptainTwoShips.twoDeckShip3DeckCount == 2 && CaptainTwoShips.oneDeckShip1DeckCount == 1 && CaptainTwoShips.oneDeckShip2DeckCount == 1 && CaptainTwoShips.oneDeckShip3DeckCount == 1 && CaptainTwoShips.oneDeckShip4DeckCount == 1) {
            System.out.println(Control.ANSI_GREEN + "\t\t ⚓⚓⚓ " + Control.CaptainTwoName + ", it's OK ! Your ships successfully set ! ⚓⚓⚓" + Control.ANSI_RESET);
            System.out.println();
        }
    }

    public static void getCaptainOneAnswerToSetShipsAutomatically() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", do you want to set your ships automatically ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainOneAnswer = new Scanner(System.in);
        final String CaptainOneAnswer = scannerCaptainOneAnswer.nextLine();
        Control.CaptainOneAnswer = CaptainOneAnswer;
    }

    public static void getCaptainTwoAnswerToSetShipsAutomatically() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", do you want to set your ships automatically ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainTwoAnswer = new Scanner(System.in);
        final String CaptainTwoAnswer = scannerCaptainTwoAnswer.nextLine();
        Control.CaptainTwoAnswer = CaptainTwoAnswer;
    }

    public static void getCaptainOneAnswerToShowShips() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", do you want to see your ships  ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainOneAnswerToShowShips = new Scanner(System.in);
        final String CaptainOneAnswerToShowShips = scannerCaptainOneAnswerToShowShips.nextLine();
        Control.CaptainOneAnswerToShowShips = CaptainOneAnswerToShowShips;
    }

    public static void getCaptainTwoAnswerToShowShips() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", do you want to see your ships  ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainTwoAnswerToShowShips = new Scanner(System.in);
        final String CaptainTwoAnswerToShowShips = scannerCaptainTwoAnswerToShowShips.nextLine();
        Control.CaptainTwoAnswerToShowShips = CaptainTwoAnswerToShowShips;
    }

    public static void getCaptainOneAnswerToHideShips() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", do you want to hide your ships from your partner ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainOneAnswerToHideShips = new Scanner(System.in);
        final String CaptainOneAnswerToHideShips = scannerCaptainOneAnswerToHideShips.nextLine();
        Control.CaptainOneAnswerToHideShips = CaptainOneAnswerToHideShips;
    }

    public static void getCaptainTwoAnswerToHideShips() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", do you want to hide your ships from your partner ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainTwoAnswerToHideShips = new Scanner(System.in);
        final String CaptainTwoAnswerToHideShips = scannerCaptainTwoAnswerToHideShips.nextLine();
        Control.CaptainTwoAnswerToHideShips = CaptainTwoAnswerToHideShips;
    }

    public static void getCaptainOneAnswerToSeeCaptainTwoShips() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainOneName + ", do you want to see your partner ships ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainOneAnswerToSeeCaptainTwoShips = new Scanner(System.in);
        final String CaptainOneAnswerToSeeCaptainTwoShips = scannerCaptainOneAnswerToSeeCaptainTwoShips.nextLine();
        Control.CaptainOneAnswerToSeeCaptainTwoShips = CaptainOneAnswerToSeeCaptainTwoShips;
    }

    public static void getCaptainTwoAnswerToSeeCaptainOneShips() {
        System.out.println(Control.ANSI_BLUE + "⚓⚓⚓ " + Control.CaptainTwoName + ", do you want to see your partner ships ? Enter Y or N: ⚓⚓⚓" + Control.ANSI_RESET);
        System.out.println();
        Scanner scannerCaptainTwoAnswerToSeeCaptainOneShips = new Scanner(System.in);
        final String CaptainTwoAnswerToSeeCaptainOneShips = scannerCaptainTwoAnswerToSeeCaptainOneShips.nextLine();
        Control.CaptainTwoAnswerToSeeCaptainOneShips = CaptainTwoAnswerToSeeCaptainOneShips;
    }
}
