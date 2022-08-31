package com.jaeheonshim.tdraw;

public class Turtle extends TurtleMovement {
    private DrawEngine drawEngine;

    public Turtle() {
        drawEngine = new DrawEngine(this);
    }
}
