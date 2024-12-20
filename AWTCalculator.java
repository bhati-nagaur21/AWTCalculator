import java.awt.*;
import java.awt.event.*;

public class Main extends Frame implements ActionListener {

    TextField tf1, tf2, tf3;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24;

    Main() {

        tf1 = new TextField();
        tf1.setBounds(50, 50, 250, 20);
        tf1.setBackground(Color.LIGHT_GRAY);
        tf1.setForeground(Color.BLACK);

        tf2 = new TextField();
        tf2.setBounds(50, 100, 250, 20);
        tf2.setBackground(Color.LIGHT_GRAY);
        tf2.setForeground(Color.BLACK);

        tf3 = new TextField();
        tf3.setBounds(50, 150, 250, 20);
        tf3.setEditable(false);
        tf3.setBackground(Color.WHITE);
        tf3.setForeground(Color.BLACK);

        b1 = new Button("+");
        b1.setBounds(50, 200, 50, 50);
        b1.setBackground(Color.GREEN);
        b1.setForeground(Color.BLACK);

        b2 = new Button("-");
        b2.setBounds(120, 200, 50, 50);
        b2.setBackground(Color.RED);
        b2.setForeground(Color.BLACK);

        b3 = new Button("%");
        b3.setBounds(50, 260, 50, 50);
        b3.setBackground(Color.YELLOW);
        b3.setForeground(Color.BLACK);

        b4 = new Button("*");
        b4.setBounds(120, 260, 50, 50);
        b4.setBackground(Color.ORANGE);
        b4.setForeground(Color.BLACK);

        // Buttons for tf1
        b5 = new Button("1");
        b5.setBounds(50, 320, 50, 50);
        b5.setBackground(Color.ORANGE);
        b5.setForeground(Color.BLACK);
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "1");
            }
        });

        b6 = new Button("2");
        b6.setBounds(120, 320, 50, 50);
        b6.setBackground(Color.ORANGE);
        b6.setForeground(Color.BLACK);
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "2");
            }
        });

        b7 = new Button("3");
        b7.setBounds(190, 320, 50, 50); // Adjusted position
        b7.setBackground(Color.ORANGE);
        b7.setForeground(Color.BLACK);
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "3");
            }
        });

        b8 = new Button("4");
        b8.setBounds(50, 380, 50, 50);
        b8.setBackground(Color.ORANGE);
        b8.setForeground(Color.BLACK);
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "4");
            }
        });

        b9 = new Button("5");
        b9.setBounds(120, 380, 50, 50);
        b9.setBackground(Color.ORANGE);
        b9.setForeground(Color.BLACK);
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "5");
            }
        });

        b10 = new Button("6");
        b10.setBounds(190, 380, 50, 50); // Adjusted position
        b10.setBackground(Color.ORANGE);
        b10.setForeground(Color.BLACK);
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "6");
            }
        });

        b11 = new Button("7");
        b11.setBounds(50, 440, 50, 50);
        b11.setBackground(Color.ORANGE);
        b11.setForeground(Color.BLACK);
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "7");
            }
        });

        b12 = new Button("8");
        b12.setBounds(120, 440, 50, 50);
        b12.setBackground(Color.ORANGE);
        b12.setForeground(Color.BLACK);
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "8");
            }
        });

        b13 = new Button("9");
        b13.setBounds(190, 440, 50, 50); // Adjusted position
        b13.setBackground(Color.ORANGE);
        b13.setForeground(Color.BLACK);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "9");
            }
        });

        b14 = new Button("0");
        b14.setBounds(120, 500, 50, 50);
        b14.setBackground(Color.ORANGE);
        b14.setForeground(Color.BLACK);
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(tf1.getText() + "0");
            }
        });

        // Buttons for tf2
        b15 = new Button("1");
        b15.setBounds(50, 560, 50, 50);
        b15.setBackground(Color.ORANGE);
        b15.setForeground(Color.BLACK);
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "1");
            }
        });

        b16 = new Button("2");
        b16.setBounds(120, 560, 50, 50);
        b16.setBackground(Color.ORANGE);
        b16.setForeground(Color.BLACK);
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "2");
            }
        });

        b17 = new Button("3");
        b17.setBounds(190, 560, 50, 50); // Adjusted position
        b17.setBackground(Color.ORANGE);
        b17.setForeground(Color.BLACK);
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "3");
            }
        });

        b18 = new Button("4");
        b18.setBounds(50, 620, 50, 50);
        b18.setBackground(Color.ORANGE);
        b18.setForeground(Color.BLACK);
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "4");
            }
        });

        b19 = new Button("5");
        b19.setBounds(120, 620, 50, 50);
        b19.setBackground(Color.ORANGE);
        b19.setForeground(Color.BLACK);
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "5");
            }
        });

        b20 = new Button("6");
        b20.setBounds(190, 620, 50, 50); // Adjusted position
        b20.setBackground(Color.ORANGE);
        b20.setForeground(Color.BLACK);
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "6");
            }
        });

        b21 = new Button("7");
        b21.setBounds(50, 680, 50, 50);
        b21.setBackground(Color.ORANGE);
        b21.setForeground(Color.BLACK);
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "7");
            }
        });

        b22 = new Button("8");
        b22.setBounds(120, 680, 50, 50);
        b22.setBackground(Color.ORANGE);
        b22.setForeground(Color.BLACK);
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "8");
            }
        });

        b23 = new Button("9");
        b23.setBounds(190, 680, 50, 50); // Adjusted position
        b23.setBackground(Color.ORANGE);
        b23.setForeground(Color.BLACK);
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "9");
            }
        });

        b24 = new Button("0");
        b24.setBounds(120, 740, 50, 50); // Adjusted position
        b24.setBackground(Color.ORANGE);
        b24.setForeground(Color.BLACK);
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText(tf2.getText() + "0");
            }
        });

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b21.addActionListener(this);
        b22.addActionListener(this);
        b23.addActionListener(this);
        b24.addActionListener(this);

        add(tf1);
        add(tf2);
        add(tf3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b10);
        add(b11);
        add(b12);
        add(b13);
        add(b14);
        add(b15);
        add(b16);
        add(b17);
        add(b18);
        add(b19);
        add(b20);
        add(b21);
        add(b22);
        add(b23);
        add(b24);

        setSize(300, 800); // Adjusted size to accommodate all buttons
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();

        if (s1.isEmpty() || s2.isEmpty()) {
            tf3.setText("Please enter values in both fields.");
            return;
        }

        try {
            int a = Integer.parseInt(s1);
            int b = Integer.parseInt(s2);
            int c = 0;

            if (e.getSource() == b1) {
                c = a + b;
            } else if (e.getSource() == b2) {
                c = a - b;
            } else if (e.getSource() == b3) {
                c = a % b;
            } else if (e.getSource() == b4) {
                c = a * b;
            }

            String result = String.valueOf(c);
            tf3.setText(result);

        } catch (NumberFormatException ex) {
            tf3.setText("Invalid input. Please enter integers.");
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
