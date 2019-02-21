package Java1.dz3_xo_game_swing;

import Java1.dz3_xo_game_swing.view.GameWindow;

import static Java1.dz3_xo_game_swing.model.Field.FieldInitialize;

/**
 * Created by Anton on 23.06.2018.
 */
public class Main {
    public static void main(String[] args) {

//        GameWindow2 gameWindow2 = new GameWindow2();
//        gameWindow2.init();
        FieldInitialize();

        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

//        MainGame.start();
    }
}