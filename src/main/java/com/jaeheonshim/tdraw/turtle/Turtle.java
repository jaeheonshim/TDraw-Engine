package com.jaeheonshim.tdraw.turtle;

import com.jaeheonshim.tdraw.DrawEngine;

public class Turtle extends TurtleDrawing {
    private DrawEngine drawEngine;
    private static boolean headless;

    private static boolean allowOneInstance = false;
    private static Turtle instance = null;

    public Turtle() {
        super(760, 610);

        if(!headless) {
            drawEngine = new DrawEngine(this, 760, 610);
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
}
