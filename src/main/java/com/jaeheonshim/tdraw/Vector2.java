package com.jaeheonshim.tdraw;

public class Vector2 {
    public double x;
    public double y;

    public Vector2() {
        x = 0;
        y = 0;
    }

    public Vector2(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(Vector2 vector2) {
        this.x = vector2.x;
        this.y = vector2.y;
    }

    public void add(Vector2 vec2) {
        x += vec2.x;
        y += vec2.y;
    }

    public void add(double x, double y) {
        this.x += x;
        this.y += y;
    }
}
