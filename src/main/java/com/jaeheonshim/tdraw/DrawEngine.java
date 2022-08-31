package com.jaeheonshim.tdraw;

import javax.swing.*;
import java.awt.*;

public class DrawEngine {
    private Turtle turtle;

    public DrawEngine(Turtle turtle) {
        this.turtle = turtle;

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception e) {
                    e.printStackTrace();
                }

                JFrame frame = new JFrame("TDraw");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new TDrawPane(turtle));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}
