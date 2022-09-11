package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.drawing.DrawEngine;

public class Turtle extends TurtleDrawing {
    private DrawEngine drawEngine;
    private static boolean headless;

    private static boolean allowOneInstance = false;
    private static Turtle instance = null;

    private static final int WIDTH = 760;
    private static final int HEIGHT = 510;

    public Turtle() {
        super(WIDTH, HEIGHT);

        if(!headless) {
            drawEngine = new DrawEngine(this, WIDTH, HEIGHT);
        }

        if(allowOneInstance) {
            if(instance == null) {
                instance = this;
            } else {
                throw new RuntimeException("Only one Turtle object can be created.");
            }
        }
    }

    @Override
    protected void afterMove() {
        super.afterMove();

        if(!headless) {
            drawEngine.repaint();
        }
    }

    public static void setAllowOneInstance(boolean allowOneInstance) {
        Turtle.allowOneInstance = allowOneInstance;
    }

    public static Turtle getInstance() {
        return instance;
    }

    public static void setHeadless(boolean headless) {
        Turtle.headless = headless;
    }

    /**
     * Trigonometric sin function, in degrees
     * @param a angle in degrees
     * @return Math.sin(Math.toRadians(a))
     */
    public static double sin(double a) {
        return Math.sin(Math.toRadians(a));
    }

    /**
     * Trigonometric cosine function, in degrees
     * @param a angle in degrees
     * @return Math.cos(Math.toRadians(a))
     */
    public static double cos(double a) {
        return Math.cos(Math.toRadians(a));
    }

    /**
     * Trigonometric tangent function, in degrees
     * @param a angle in degrees
     * @return Math.tan(Math.toRadians(a))
     */
    public static double tan(double a) {
        return Math.tan(Math.toRadians(a));
    }

    /**
     * Trigonometric inverse tangent function, in degrees
     * @param r ratio
     * @return Math.toDegrees(Math.atan(a))
     */
    public static double atan(double r) {
        return Math.toDegrees(Math.atan(r));
    }
}
