package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.Vector2;

import java.util.LinkedList;
import java.util.List;

public class TurtleDrawing extends TurtleMovement {
    public class DrawPoint {
        private Vector2 location;

        public DrawPoint(Vector2 location) {
            this.location = location;
        }

        public Vector2 getLocation() {
            return location;
        }
    }

    private List<DrawPoint> drawPoints = new LinkedList<>();
    protected boolean isPenDown;

    public TurtleDrawing() {
        drawPoints.add(new DrawPoint(new Vector2(0, 0)));
    }

    public void penDown() {
        isPenDown = true;
    }

    public void penUp() {
        isPenDown = false;
    }

    public void setWidth() {

    }

    public boolean isPenDown() {
        return isPenDown;
    }

    public void addDrawPoint(Vector2 vector2) {
        drawPoints.add(new DrawPoint(vector2));
    }

    public List<DrawPoint> getDrawPoints() {
        return drawPoints;
    }

    @Override
    protected void afterMove() {
        if(isPenDown) {
            addDrawPoint(new Vector2(getPosition()));
        }
    }
}
