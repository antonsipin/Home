package Ex_swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Anton on 04.03.2018.
 */
public class MyWindow extends JFrame {
    public MyWindow() throws HeadlessException {
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT'S JAVA PROGRAMM");
        JButton jButton = new JButton("Learn Java");
        add(jButton);
        JButton jButton1 = new JButton("Learn Spring");
        add(jButton1, BorderLayout.SOUTH);
        JButton jButton2 = new JButton("Lern Swing");
        add(jButton2, BorderLayout.EAST);
        JButton jButton3 = new JButton("Learn Gibernate");
        add(jButton3, BorderLayout.LINE_START);
        setVisible(true);
    }
}
