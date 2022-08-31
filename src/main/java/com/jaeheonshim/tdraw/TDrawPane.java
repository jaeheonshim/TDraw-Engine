package com.jaeheonshim.tdraw;

import javax.swing.*;
import java.awt.*;

public class TDrawPane extends JPanel {
    private Turtle turtle;

    public TDrawPane(Turtle turtle) {
        this.turtle = turtle;
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(760, 610);
    }

    @Override
    protected void paintComponent(Graphics g1) {
        super.paintComponent(g1);
        Graphics2D g = (Graphics2D) g1;

        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g.setColor(Color.BLUE);
        g.drawLine(ccX(0), ccY(0), ccX((int) Math.round(turtle.getPosition().x)), ccY((int) Math.round(turtle.getPosition().y)));
        g.fillRect(ccX((int) Math.round(turtle.getPosition().x)) - 2, ccY((int) Math.round(turtle.getPosition().y)) - 2, 4, 4);
    }

    private int ccX(int x) {
        return x + getWidth() / 2;
    }

    private int ccY(int y) {
        return getHeight() / 2 - y;
    }
}
