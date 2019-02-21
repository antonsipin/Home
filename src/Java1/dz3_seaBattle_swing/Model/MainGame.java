package Java1.dz3_seaBattle_swing.Model;


/**
 * Created by Anton on 22.06.2018.
 */
public class MainGame {
    public static Field field = new Field();
    public static Computer computer = new Computer();
    public static User user = new User();

    public static void start() {
        field.show();
        for (int i = 0; i < 10; i++) {
            field.doShoot(computer.getShoot(), Field.Type.X);
            field.show();
            //Check Win

            field.doShoot(user.getShoot(), Field.Type.O);
            field.show();
            //Check Win

        }
    }
}
