package Java1.dz2_XO_Game.controller;

import Java1.dz2_XO_Game.model.Field;

import java.util.Scanner;

/**
 * Created by Anton on 30.05.2018.
 */
public class Control {
    public static char gameValue = 0;

    public static String playerOneName;
    public static String playerTwoName;
    public static int playersStepOneX;
    public static int playersStepOneY;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public static int IsPlayerWin = 0;
    public static int StepCountX = 0;
    public static int StepCountO = 0;

//    public static void doShoot(Point point, Field.Type type) {
//        User.point = point;
//        User.isShoot = true;
//    }

    public static void GameStart() {
        System.out.println(ANSI_PURPLE + " ✩✩✩ " + ANSI_RESET + ANSI_BLACK + " X" + ANSI_RESET + ANSI_CYAN + " O " + ANSI_RESET + ANSI_RED + " GAME " + ANSI_RESET + ANSI_PURPLE + " ✩✩✩ " + ANSI_RESET);
    }

    public static void SetPlayerOneName() {
        System.out.println(ANSI_BLUE + "⇨ Who plays by 'X' ? Enter your name:" + ANSI_RESET);
        Scanner scannerPlayerOneName = new Scanner(System.in);
        final String playerOneName = scannerPlayerOneName.nextLine();
        Control.playerOneName = playerOneName;
    }

    public static void SetPlayerTwoName() {
        System.out.println(ANSI_BLUE + "⇨ Who plays by 'O' ? Enter your name:" + ANSI_RESET);
        Scanner scannerPlayerTwoName = new Scanner(System.in);
        final String playerTwoName = scannerPlayerTwoName.nextLine();
        Control.playerTwoName = playerTwoName;
    }

    public static void PlayerOneNameCheck() {
        if (Control.playerOneName == null) {
            System.out.println(ANSI_BLUE + " Enter real name, please! " + ANSI_RESET);
            SetPlayerOneName();
        }
    }

    public static void PlayerTwoNameCheck() {
        if (Control.playerTwoName == null) {
            System.out.println(ANSI_BLUE + " Enter real name, please! " + ANSI_RESET);
            SetPlayerTwoName();
        }
    }

    public static void playerOneEnterY() {
        System.out.println(ANSI_BLUE + "⇨" + Control.playerOneName + ", enter Y (1-3):" + ANSI_RESET);
    }

    public static void playerOneEnterX() {
        System.out.println(ANSI_BLUE + "⇨" + Control.playerOneName + ", enter X (1-3):" + ANSI_RESET);
    }

    public static void playerTwoEnterY() {
        System.out.println(ANSI_BLUE + "⇨" + Control.playerTwoName + ", enter Y (1-3):" + ANSI_RESET);
    }

    public static void playerTwoEnterX() {
        System.out.println(ANSI_BLUE + "⇨" + Control.playerTwoName + ", enter X (1-3):" + ANSI_RESET);
    }

    public static void playerOneWinPrint() {
        System.out.println(ANSI_RED + " ✩✩✩ " + Control.playerOneName + " WIN ! ✩✩✩ " + ANSI_RESET);
    }

    public static void checkX() {

        if (Field.field[0][0] == 'X' && Field.field[0][1] == 'X' && Field.field[0][2] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[1][0] == 'X' && Field.field[1][1] == 'X' && Field.field[1][2] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[2][0] == 'X' && Field.field[2][1] == 'X' && Field.field[2][2] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][0] == 'X' && Field.field[1][0] == 'X' && Field.field[2][0] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][1] == 'X' && Field.field[1][1] == 'X' && Field.field[2][1] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][2] == 'X' && Field.field[1][2] == 'X' && Field.field[2][2] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][0] == 'X' && Field.field[1][1] == 'X' && Field.field[2][2] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][2] == 'X' && Field.field[1][1] == 'X' && Field.field[2][0] == 'X') {
            playerOneWinPrint();
            IsPlayerWin = 1;
        }
    }

    public static void playerTwoWinPrint() {
        System.out.println(ANSI_RED + " ✩✩✩ " + Control.playerTwoName + " WIN ! ✩✩✩ " + ANSI_RESET);
    }

    public static void checkO() {
        if (Field.field[0][0] == 'O' && Field.field[0][1] == 'O' && Field.field[0][2] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[1][0] == 'O' && Field.field[1][1] == 'O' && Field.field[1][2] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[2][0] == 'O' && Field.field[2][1] == 'O' && Field.field[2][2] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][0] == 'O' && Field.field[1][0] == 'O' && Field.field[2][0] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][1] == 'O' && Field.field[1][1] == 'O' && Field.field[2][1] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][2] == 'O' && Field.field[1][2] == 'O' && Field.field[2][2] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][0] == 'O' && Field.field[1][1] == 'O' && Field.field[2][2] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
        if (Field.field[0][2] == 'O' && Field.field[1][1] == 'O' && Field.field[2][0] == 'O') {
            playerTwoWinPrint();
            IsPlayerWin = 1;
        }
    }
}













