package Java1.dz2_XO_Game.model;

import Java1.dz2_XO_Game.controller.Control;
import Java1.dz2_XO_Game.view.GameWindow;

import java.util.Scanner;

import static Java1.dz2_XO_Game.model.Field.fieldPrint;
import static Java1.dz2_XO_Game.view.GameWindow.*;

/**
 * Created by Anton on 29.05.2018.
 */
public class PlayerOne {
    public static void setX() {
        try {
            Control.playerOneEnterY();
            Scanner scannerY = new Scanner(System.in);
            int y = Integer.parseInt(scannerY.nextLine());
            Control.playersStepOneY = y;

            Control.playerOneEnterX();
            Scanner scannerX = new Scanner(System.in);
            int x = Integer.parseInt(scannerX.nextLine());
            Control.playersStepOneX = x;

            if (Field.field[Control.playersStepOneY - 1][Control.playersStepOneX - 1] == '⬜') {
                Control.StepCountX++;
                for (int i = 0; i < Field.SIZE; i++) {
                    for (int j = 0; j < Field.SIZE; j++) {
                        Field.field[Control.playersStepOneY - 1][Control.playersStepOneX - 1] = 'X';
                        Control.gameValue = 'X';
                    }
                }
            } else {
                System.out.println(Control.ANSI_GREEN + "⇨" + Control.playerOneName + " , use free boxes, please! Try again!" + Control.ANSI_RESET);
                fieldPrint();
                setX();
            }
        } catch (Exception e) {
            System.out.println(Control.ANSI_GREEN + " ⇨ You are entering impossible value! Try again, enter value 1-3!" + Control.ANSI_RESET);
            fieldPrint();
            setX();
        }
    }
}
