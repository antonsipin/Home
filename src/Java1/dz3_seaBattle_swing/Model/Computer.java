package Java1.dz3_seaBattle_swing.Model;

/**
 * Created by Anton on 19.06.2018.
 */
public class Computer implements Shootable {
    @Override
    public Point getShoot() {
        return Point.getRandomPoint();
    }
}
