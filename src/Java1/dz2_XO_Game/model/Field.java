package Java1.dz2_XO_Game.model;

import Java1.dz2_XO_Game.controller.Control;

/**
 * Created by Anton on 29.05.2018.
 */
public class Field {
    public final static int SIZE = 3;
    public final static char[][] field = new char[SIZE][SIZE];

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

    public static void FieldInitialize() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = '⬜';
            }
        }
    }

    public static void fieldPrint() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == '⬜') {
                    System.out.print(field[i][j] + " ");
                } else
                    System.out.print(Control.ANSI_CYAN + field[i][j] + " " + Control.ANSI_RESET);
            }
            System.out.println();
        }
    }
}
