package Java1.dz3_seaBattle_swing;


import Java1.dz3_seaBattle_swing.Model.MainGame;
import Java1.dz3_seaBattle_swing.view.GameWindow;

/**
 * Created by Anton on 16.06.2018.
 */
public class Main {
    public static void main(String[] args) {

//        GameWindow2 gameWindow2 = new GameWindow2();
//        gameWindow2.init();

        GameWindow gameWindow = new GameWindow();
        gameWindow.init();

        MainGame.start();
    }
}
