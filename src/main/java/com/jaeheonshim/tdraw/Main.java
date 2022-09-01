package com.jaeheonshim.tdraw;

import com.jaeheonshim.tdraw.turtle.Turtle;

public class Main {
    public static void main(String[] args) {
        Turtle t = new Turtle();
        t.penDown();
        t.forward(50);
        t.counterClockwise(90);
        t.forward(50);
        t.counterClockwise(135);
        t.forward((int) Math.sqrt(50 * 50 * 2));
    }
}
