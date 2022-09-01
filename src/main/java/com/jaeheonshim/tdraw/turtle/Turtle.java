package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.DrawEngine;

public class Turtle extends TurtleDrawing {
    private DrawEngine drawEngine;

    public Turtle() {
        drawEngine = new DrawEngine(this);
    }

    @Override
    protected void afterMove() {
        super.afterMove();
        drawEngine.repaint();
    }
}
