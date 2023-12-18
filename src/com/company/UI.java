package com.company;


import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    public UI() {
        setSize(500,500);
        setLayout(null);
        JButton b = new JButton("ok");
        b.setBounds(50,50,100,100);
        b.setBackground(Color.GREEN);
        b.setForeground(new Color(42, 40, 0, 55));
        add(b);

        setVisible(true);
    }


}
