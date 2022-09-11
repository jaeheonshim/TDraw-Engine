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

        for(int n = 0; n < 50; ++n) {
            t.penDown();
            for (int i = 0; i < 360; ++i) {
                t.forward(1);
                t.counterClockwise(1);
            }
            t.setColor(new Color((int)(Math.random() * 0x1000000)));
            t.counterClockwise(360 / 50.0 * n);
        }
    }
}
