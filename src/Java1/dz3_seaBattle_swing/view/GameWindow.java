package Java1.dz3_seaBattle_swing.view;

import Java1.dz3_seaBattle_swing.Controller.GameController;
import Java1.dz3_seaBattle_swing.Model.*;
import Java1.dz3_seaBattle_swing.Model.Point;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Anton on 16.06.2018.
 */
public class GameWindow extends JFrame {

    JPanel jPanel = new JPanel();
    JButton[][] buttons = new JButton[3][3];

    public void init() {
        try {
            setSize(400, 400);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setTitle("XO GAME ");
            jPanel.setLayout(new GridLayout(3, 3));
//        jPanel.setLayout(new FlowLayout());

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    JButton jButton = new JButton();
//                        jButton.setText(j % 2 == 0 ? "X" : "O");
                    buttons[i][j] = jButton;
                    jPanel.add(jButton);
//                        jButton.setText(j % 2 == 0 ? "X" : "O");


                    final int finalJ = j;
                    final int finalI = i;


                    jButton.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String buttonText = e.getActionCommand();

                            for (int i = 0; i < 3; i++) {
                                for (int j = 0; j < 3; j++) {
                                    System.out.printf("Button: %s, x: %d, y: %d", buttonText, finalJ, finalI);
                                    GameController.doShoot(new Point(finalI, finalJ), buttonText.equals("X") ? Field.Type.X : Field.Type.O);
                                    if (buttonText.equals("X")) {
                                        jButton.setText("X");
                                    }
                                }
                            }
                        }
                    });
                }
            }
            add(jPanel);
            setVisible(true);

        } catch (Exception e) {
            System.out.println("Hello !");
        }
    }

}
