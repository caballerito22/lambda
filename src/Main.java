import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {


        JButton button1 = new JButton("Mega Button1");
        add(button1);

        JButton button2 = new JButton("Mega Button2");
        add(button2);

        JButton button3 = new JButton("Mega Button3");
        add(button3);

        setSize(600, 200);
        setLayout(new GridLayout(1, 3));
        setVisible(true);


        button1.addActionListener(_ -> System.out.println("Button1"));

        ActionListener accion = e -> System.out.println(e.getActionCommand());
        button2.addActionListener(accion);
        button3.addActionListener(accion);
    }
}