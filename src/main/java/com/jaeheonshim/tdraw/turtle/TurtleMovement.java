package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.Vector2;

public abstract class TurtleMovement {
    protected Vector2 position = new Vector2(0, 0);
    protected double heading = 0;

    private static double sinDeg(double a) {
        return Math.sin(Math.toRadians(a));
    }

    private static double cosDeg(double a) {
        return Math.cos(Math.toRadians(a));
    }

    public void forward(int d) {
        position.add(d * cosDeg(heading), d * sinDeg(heading));
        afterMove();
    }

    public void backward(int d) {
        position.add(-d * cosDeg(heading), -d * sinDeg(heading));
        afterMove();
    }

    public void right(int d) {
        position.add(d * cosDeg(heading - 90), d * sinDeg(heading - 90));
        afterMove();
    }

    public void left(int d) {
        position.add(d * cosDeg(heading + 90), d * sinDeg(heading + 90));
        afterMove();
    }

    public void setPos(int x, int y) {
        position.x = x;
        position.y = y;
    }

    public void setX(int x) {
        position.x = x;
    }

    public void setY(int y) {
        position.y = y;
    }

    public void setHeading(double theta) {
        this.heading = theta;
    }

    public void clockwise(double theta) {
        this.heading -= theta;
    }

    public void counterClockwise(double theta) {
        this.heading += theta;
    }

    public Vector2 getPosition() {
        return position;
    }

    public double getHeading() {
        return heading;
    }

    protected abstract void afterMove();
}
