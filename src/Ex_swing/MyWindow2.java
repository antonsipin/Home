package Ex_swing;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Anton on 04.03.2018.
 */
public class MyWindow2 extends JFrame {
    static JTextArea textArea;

    public MyWindow2() throws HeadlessException {
        setSize(400, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("IT'S JAVA PROGRAMM");
        textArea = new JTextArea();
        add(textArea);
        for (int i = 0; i < 20; i++) {
            textArea.append("Just do it!\n");
        }
        add(new JButton("GO!"), BorderLayout.SOUTH);
        setVisible(true);
    }
}
