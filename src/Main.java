import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JLabel label = new JLabel();
        label.setBounds(50,50,200,200);
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);

        JLabel label2 = new JLabel();
        label2.setBounds(100,100,200,200);
        label2.setOpaque(true);
        label2.setBackground(Color.GRAY);

        JLabel label3 = new JLabel();
        label3.setBounds(150,150,200,200);
        label3.setOpaque(true);
        label3.setBackground(Color.DARK_GRAY);



        JLayeredPane pane = new JLayeredPane();
        pane.setBounds(0,0,420,400);
        pane.add(label);
        pane.add(label2);
        pane.add(label3);

        JFrame frame = new JFrame();
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setVisible(true);
         frame.setSize(420,420);
         frame.setLayout(null);
         frame.add(pane);


    }
}