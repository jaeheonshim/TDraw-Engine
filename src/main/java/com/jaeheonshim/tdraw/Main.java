package com.jaeheonshim.tdraw;

import com.jaeheonshim.tdraw.drawing.JSONDrawingExporter;
import com.jaeheonshim.tdraw.turtle.Turtle;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    static {
        Turtle.setAllowOneInstance(true);
        Turtle.setHeadless(true);

        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                Turtle instance = Turtle.getInstance();
                if(instance == null) throw new RuntimeException("No Turtle object was created.");

                try {
                    File output = new File("out.txt");
                    BufferedWriter writer = new BufferedWriter(new FileWriter(output));
                    writer.write(JSONDrawingExporter.export(instance).toString());
                    writer.close();
                } catch(Exception e) {
                    throw new RuntimeException("There was an error exporting the Turtle drawing.", e);
                }
            }
        });
    }

    public static void main(String[] args) throws IOException {
        Turtle t = new Turtle();
        t.setHeading(60);

        triangle(t, new double[] {-240.0, -240.0, 0.0, 175.0}, 0);
    }

    public static void triangle(Turtle t, double[] points, int depth) {
        if(depth > 2) return;

        System.out.printf("%f, %f%n", points[0], points[1]);
        System.out.printf("%f, %f%n%n", points[2], points[3]);

        t.setPosition((int) Math.round(points[0]), (int) Math.round(points[1]));
        t.penDown();

        for(int i = 0; i < 3; ++i) {
            t.forward((int) Math.sqrt(Math.pow(points[3] - points[1], 2) + Math.pow(points[2] - points[0], 2)));
            t.cw(120);
        }
        t.penUp();

        triangle(t, new double[] { points[0], points[1], points[0] + (points[2] - points[0]) / 2, points[1] + (points[3] - points[1]) / 2 }, depth + 1);
        triangle(t, new double[] { points[2], points[1], points[0] + (points[2] - points[0]) * 3 / 2, points[1] + (points[3] - points[1]) / 2 }, depth + 1);
        triangle(t, new double[] { points[0] + (points[2] - points[0]) / 2, points[1] + (points[3] - points[1]) / 2, points[2], points[3] }, depth + 1);
    }
}
