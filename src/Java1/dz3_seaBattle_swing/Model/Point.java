package Java1.dz3_seaBattle_swing.Model;

import java.util.Random;

/**
 * Created by Anton on 19.06.2018.
 */
public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point getRandomPoint() {
        return new Point(new Random().nextInt(3), new Random().nextInt(3));
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
