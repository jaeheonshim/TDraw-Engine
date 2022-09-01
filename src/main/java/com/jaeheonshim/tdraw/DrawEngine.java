package com.jaeheonshim.tdraw;

import com.jaeheonshim.tdraw.turtle.Turtle;

import javax.swing.*;
import java.awt.*;

public class DrawEngine {
    private Turtle turtle;
    private JFrame frame;

    public DrawEngine(Turtle turtle) {
        this.turtle = turtle;

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        DrawEngine.this.frame = new JFrame("TDraw");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new TDrawPane(turtle));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void repaint() {
        frame.repaint();
    }
}
