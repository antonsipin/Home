package Java1.dz3_seaBattle_swing.Model;

/**
 * Created by Anton on 19.06.2018.
 */
public class User implements Shootable {
    public static Point point;
    public volatile static boolean isShoot;

    @Override
    public Point getShoot() {
        isShoot = false;
        while (!isShoot) ;
        return point;
    }
}
