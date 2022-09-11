package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.util.Vector2;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class TurtleDrawing extends TurtleMovement {
    public class DrawPoint {
        private Vector2 location;
        private double heading;
        private boolean draw;
        private Color color;

        public DrawPoint(Vector2 location, double heading, boolean draw, Color color) {
            this.location = location;
            this.heading = heading;
            this.draw = draw;
            this.color = color;
        }

        public Vector2 getLocation() {
            return location;
        }

        public double getHeading() {
            return heading;
        }

        public boolean isDraw() {
            return draw;
        }

        public Color getColor() {
            return color;
        }
    }

    private List<DrawPoint> drawPoints = new LinkedList<>();
    protected boolean isPenDown;
    protected Color color = Color.BLACK;

    protected int width;
    protected int height;

    public TurtleDrawing(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void penDown() {
        isPenDown = true;
        addDrawPoint(new Vector2(getPosition()));
    }

    public void penUp() {
        isPenDown = false;
    }

    public void setWidth() {

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isPenDown() {
        return isPenDown;
    }

    public void addDrawPoint(Vector2 vector2) {
        drawPoints.add(new DrawPoint(vector2, heading, isPenDown, color));
    }

    public List<DrawPoint> getDrawPoints() {
        return drawPoints;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    protected void afterMove() {
        addDrawPoint(new Vector2(getPosition()));
    }
}
