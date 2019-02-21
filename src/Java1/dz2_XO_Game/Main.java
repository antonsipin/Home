package Java1.dz2_XO_Game;

import Java1.dz2_XO_Game.controller.Control;
import Java1.dz2_XO_Game.model.PlayerOne;
import Java1.dz2_XO_Game.model.PlayerTwo;
import Java1.dz2_XO_Game.view.GameWindow;

import static Java1.dz2_XO_Game.model.Field.FieldInitialize;
import static Java1.dz2_XO_Game.model.Field.fieldPrint;
import static Java1.dz2_XO_Game.controller.Control.checkX;
import static Java1.dz2_XO_Game.controller.Control.checkO;
import static Java1.dz2_XO_Game.controller.Control.GameStart;
import static Java1.dz2_XO_Game.controller.Control.PlayerOneNameCheck;
import static Java1.dz2_XO_Game.controller.Control.PlayerTwoNameCheck;
import static Java1.dz2_XO_Game.controller.Control.SetPlayerOneName;
import static Java1.dz2_XO_Game.controller.Control.SetPlayerTwoName;


/**
 * Created by Anton on 29.05.2018.
 */
public class Main {
    public static void main(String[] args) {
//        Field field = new Field();
//        PlayerOne playerOne = new PlayerOne();
//        PlayerTwo playerTwo = new PlayerTwo();
        GameStart();
        SetPlayerOneName();
        PlayerOneNameCheck();
        SetPlayerTwoName();
        PlayerTwoNameCheck();
        FieldInitialize();
        fieldPrint();
        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        do {
            if (Control.IsPlayerWin < 1 && Control.StepCountX < 5) {
                PlayerOne.setX();
                fieldPrint();
                checkX();
            }
            if (Control.IsPlayerWin < 1 && Control.StepCountO < 4) {
                PlayerTwo.setO();
                fieldPrint();
                checkO();
            }
        }while (Control.IsPlayerWin < 1 && Control.StepCountO <= 4 && Control.StepCountX < 5);

    if (Control.StepCountO == 4 && Control.StepCountX == 5 && Control.IsPlayerWin < 1){
        System.out.println(Control.ANSI_RED + " ⚓⚓⚓ NOBODY WIN ! ⚓⚓⚓ " + Control.ANSI_RESET);
    }
        System.out.println(Control.ANSI_RED + " ⚓⚓⚓ GAME OVER ⚓⚓⚓ " + Control.ANSI_RESET);

    }
}
