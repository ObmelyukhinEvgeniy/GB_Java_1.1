package lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainApp extends JFrame {

    public MainApp() {
        setTitle("Hello Human!");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(400,100, 500,400);
/*
        JButton button1 = new JButton("Button #1");
        JButton button2 = new JButton("Button #2");
        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
*//*
        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        for(int i = 1; i <= 10; i++) {
            add(new JButton("#" + i));
        }
*//*
        setLayout(new FlowLayout());
        for(int i = 1; i <= 15; i++) {
            add(new JButton("#" + i));
        }
*//*
        setLayout(new GridLayout(3, 3));
        for(int i = 0; i < 9; i++) {
            add(new JButton(String.valueOf(i + 1)));
        }
*//*
        setLayout(null);
        JTextField field = new JTextField();
        field.setBounds(20, 20, 150, 40);
        add(field);

        JButton button = new JButton("PLAY");
        button.setBounds(20, 65, 150, 40);
        add(button);
*//*
        JButton button = new JButton("PLAY");
        add(button, BorderLayout.CENTER);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ActionEvent) {
            button.setText("PAUSE");
            }
        });
*//*
        JTextField textField = new JTextField();
        add(textField, BorderLayout.CENTER);
        textField.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            System.out.println(textField.getText());
            }
        });
*/
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("Окно закрывается!");
            }
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new MainApp();
    }
}
