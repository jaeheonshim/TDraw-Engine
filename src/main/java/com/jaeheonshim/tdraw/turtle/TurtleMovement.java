package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.util.Vector2;

public abstract class TurtleMovement {
    protected Vector2 position = new Vector2(0, 0);
    protected double heading = 0;

    private static double sinDeg(double a) {
        return Math.sin(Math.toRadians(a));
    }

    private static double cosDeg(double a) {
        return Math.cos(Math.toRadians(a));
    }

    /**
     * Moves the turtle forward in the direction it is facing
     *
     * @param d Distance to move forward
     */
    public void forward(int d) {
        position.add(d * cosDeg(heading), d * sinDeg(heading));
        afterMove();
    }

    public void fd(int d) {
        forward(d);
    }

    /**
     * Moves the turtle backward in the opposite direction
     *
     * @param d Distance to move backward
     */
    public void backward(int d) {
        position.add(-d * cosDeg(heading), -d * sinDeg(heading));
        afterMove();
    }

    public void bk(int d) {
        backward(d);
    }

    /**
     * Moves the turtle to the right with respect to its current heading
     *
     * @param d Distance to move right
     */
    public void right(int d) {
        position.add(d * cosDeg(heading - 90), d * sinDeg(heading - 90));
        afterMove();
    }

    /**
     * Moves the turtle to the left with respect to its current heading
     *
     * @param d Distance to move left
     */
    public void left(int d) {
        position.add(d * cosDeg(heading + 90), d * sinDeg(heading + 90));
        afterMove();
    }

    /**
     * Sets the absolute position of the turtle (This method CANNOT be used for drawing)
     *
     * @param x x coordinate of the new position
     * @param y y coordinate of the new position
     */
    public void setPos(int x, int y) {
        position.x = x;
        position.y = y;
    }

    /**
     * Moves the turtle back to the (0, 0) position
     */
    public void home() {
        setPos(0, 0);
    }

    /**
     * Sets the x-coordinate of the turtle (This method CANNOT be used for drawing)
     *
     * @param x x coordinate of the new position
     */
    public void setX(int x) {
        position.x = x;
    }

    /**
     * Sets the y-coordinate of the turtle (This method CANNOT be used for drawing)
     *
     * @param y y coordinate of the new position
     */
    public void setY(int y) {
        position.y = y;
    }

    /**
     * Sets the absolute heading of the turtle
     *
     * 0 degrees is the 3 o'clock position, 90 degrees is the 12 o'clock position, 180 degrees is the 9 o'clock position, 270 degrees is the 6 o'clock position
     *
     * @param theta angle (in degrees) of the new position
     */
    public void setHeading(double theta) {
        this.heading = theta;
    }

    /**
     * Turns the turtle clockwise
     *
     * @param theta angle (in degrees) to turn turtle clockwise by
     */
    public void clockwise(double theta) {
        this.heading -= theta;
    }

    public void cw(double theta) {
        clockwise(theta);
    }

    /**
     * Turns the turtle counterclockwise
     *
     * @param theta angle (in degrees) to turn turtle counterclockwise by
     */
    public void counterClockwise(double theta) {
        this.heading += theta;
    }

    public void ccw(double theta) {
        counterClockwise(theta);
    }

    /**
     * Returns the position of the turtle
     *
     * @return the position of the turtle
     */
    public Vector2 getPosition() {
        return position;
    }

    /**
     * Returns the heading of the turtle
     *
     * @return the heading of the turtle, in degrees
     */
    public double getHeading() {
        return heading;
    }

    protected abstract void afterMove();
}
