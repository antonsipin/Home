package Java1.dz3_seaBattle_swing.Model;

/**
 * Created by Anton on 19.06.2018.
 */
public class Field {
    public enum Type {X, O, NOT_SET}

    Type[][] cells;

    public Field() {
        cells = new Type[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cells[i][j] = Type.NOT_SET;
            }
        }
    }

    public void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (cells[i][j]) {
                    case X:
                        System.out.print("X");
                        break;
                    case O:
                        System.out.print("X");
                        break;
                    case NOT_SET:
                        System.out.print(".");
                        break;
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public void doShoot(Point point, Type type) {
        if (cells[point.getX()][point.getY()] == Type.NOT_SET) {
            cells[point.getX()][point.getY()] = type;
        }
    }

    public boolean checkWin(Type t) {
        boolean isWin = false;

        if (cells[0][0] == t && cells[1][1] == t && cells[2][2] == t) {
            isWin = true;
        }

        return isWin;
    }
}
