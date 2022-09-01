package com.jaeheonshim.tdraw;

import com.jaeheonshim.tdraw.turtle.Turtle;
import com.jaeheonshim.tdraw.turtle.TurtleDrawing;

import javax.swing.*;
import java.awt.*;
import java.util.List;

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

        List<TurtleDrawing.DrawPoint> drawPointList = turtle.getDrawPoints();
        for(int i = 1; i < drawPointList.size(); ++i) {
            TurtleDrawing.DrawPoint prev = drawPointList.get(i - 1);
            TurtleDrawing.DrawPoint curr = drawPointList.get(i);

            g.drawLine(ccX((int) Math.round(prev.getLocation().x)), ccY((int) Math.round(prev.getLocation().y)), ccX((int) Math.round(curr.getLocation().x)), ccY((int) Math.round(curr.getLocation().y)));
        }
    }

    private int ccX(int x) {
        return x + getWidth() / 2;
    }

    private int ccY(int y) {
        return getHeight() / 2 - y;
    }
}
