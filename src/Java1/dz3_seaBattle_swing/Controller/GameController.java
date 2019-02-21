package Java1.dz3_seaBattle_swing.Controller;

import Java1.dz3_seaBattle_swing.Model.Field;
import Java1.dz3_seaBattle_swing.Model.Point;
import Java1.dz3_seaBattle_swing.Model.User;

/**
 * Created by Anton on 20.06.2018.
 */
public class GameController {
    public static void doShoot(Point point, Field.Type type) {
        User.point = point;
        User.isShoot = true;
    }
}
