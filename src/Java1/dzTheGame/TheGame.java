package Java1.dzTheGame;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Anton on 15.05.2018.
 */
public class TheGame {
    public static void main(String[] args) {
        char[][] field = new char[3][3];
//        field[0] = new char[3];
//        field[1] = new char[3];
//        field[2] = new char[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                field[i][j] = '.';
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(field[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введи номер строки: ");
        Scanner scannerY = new Scanner(System.in);
        int y = Integer.parseInt(scannerY.nextLine());
        System.out.println("Введи номер столбца: ");
        Scanner scannerX = new Scanner(System.in);
        int x = Integer.parseInt(scannerX.nextLine());

        if (y == 1 && x == 1) {
            field[0][0] = 'X';
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Мой ход: ");

            field[1][1] = 'O';
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(field[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println("Введи номер строки: ");
            Scanner scannerYstepTwo13 = new Scanner(System.in);
            int y5 = Integer.parseInt(scannerYstepTwo13.nextLine());
            System.out.println("Введи номер столбца: ");
            Scanner scannerXstepTwo13 = new Scanner(System.in);
            int x5 = Integer.parseInt(scannerXstepTwo13.nextLine());

            if (y5 == 1 && x5 == 3) {
                field[0][2] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход:");

                field[0][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Введи номер строки: ");
            Scanner scannerYstepThree32 = new Scanner(System.in);
            int y6 = Integer.parseInt(scannerYstepThree32.nextLine());
            System.out.println("Введи номер столбца: ");
            Scanner scannerXstepThree32 = new Scanner(System.in);
            int x6 = Integer.parseInt(scannerXstepThree32.nextLine());

            if (y6 == 3 && x6 == 2) {
                field[2][1] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход:");

                field[2][2] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Введи номер строки: ");
            Scanner scannerYstepFour31 = new Scanner(System.in);
            int y7 = Integer.parseInt(scannerYstepFour31.nextLine());
            System.out.println("Введи номер столбца: ");
            Scanner scannerXstepFour31 = new Scanner(System.in);
            int x7 = Integer.parseInt(scannerXstepFour31.nextLine());

            if (y7 == 3 && x7 == 1) {
                field[2][0] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Победила дружба! Мой ход:");

                field[1][0] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Введи номер строки: ");
            Scanner scannerYstepTwo = new Scanner(System.in);
            int y2 = Integer.parseInt(scannerYstepTwo.nextLine());
            System.out.println("Введи номер столбца: ");
            Scanner scannerXstepTwo = new Scanner(System.in);
            int x2 = Integer.parseInt(scannerXstepTwo.nextLine());

            if (y2 == 2 && x2 == 1) {
                field[1][0] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[2][0] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Введи номер строки: ");
            Scanner scannerYstepThree = new Scanner(System.in);
            int y3 = Integer.parseInt(scannerYstepThree.nextLine());
            System.out.println("Введи номер столбца: ");
            Scanner scannerXstepThree = new Scanner(System.in);
            int x3 = Integer.parseInt(scannerXstepThree.nextLine());

            if (y3 == 1 && x3 == 3) {
                field[0][2] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[0][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            System.out.println("Введи номер строки: ");
            Scanner scannerYstepFour = new Scanner(System.in);
            int y4 = Integer.parseInt(scannerYstepFour.nextLine());
            System.out.println("Введи номер столбца: ");
            Scanner scannerXstepFour = new Scanner(System.in);
            int x4 = Integer.parseInt(scannerXstepFour.nextLine());

            if (y4 == 3 && x4 == 2) {
                field[2][1] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Победила дружба! Мой ход:");

                field[2][2] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }

            }

            if (y == 2 && x == 2) {
                field[1][1] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[0][0] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
            if (y == 3 && x == 3) {
                field[2][2] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (y == 1 && x == 3) {
                field[0][2] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (y == 3 && x == 1) {
                field[2][0] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (y == 1 && x == 2) {
                field[0][1] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (y == 3 && x == 2) {
                field[2][1] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (y == 2 && x == 1) {
                field[1][0] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }

            if (y == 2 && x == 3) {
                field[1][2] = 'X';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println("Мой ход: ");

                field[1][1] = 'O';
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        System.out.print(field[i][j] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}
