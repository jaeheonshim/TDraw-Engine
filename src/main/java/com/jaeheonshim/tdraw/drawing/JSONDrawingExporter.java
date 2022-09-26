package com.jaeheonshim.tdraw.drawing;

import com.jaeheonshim.tdraw.turtle.TurtleDrawing;
import org.json.JSONArray;
import org.json.JSONObject;

import java.awt.*;

public class JSONDrawingExporter {
    public static JSONObject export(TurtleDrawing turtleDrawing) {
        JSONArray points = new JSONArray();
        for(TurtleDrawing.DrawPoint drawPoint : turtleDrawing.getDrawPoints()) {
            JSONObject drawPointJSON = new JSONObject();
            drawPointJSON.put("x", drawPoint.getLocation().x);
            drawPointJSON.put("y", drawPoint.getLocation().y);
            drawPointJSON.put("heading", drawPoint.getHeading());
            drawPointJSON.put("draw", drawPoint.isDraw());

            Color color = drawPoint.getColor();
            drawPointJSON.put("color", String.format("#%02x%02x%02x", color.getRed(), color.getGreen(), color.getBlue()));

            points.put(drawPointJSON);
        }

        JSONObject exportObject = new JSONObject();
        exportObject.put("width", turtleDrawing.getWidth());
        exportObject.put("height", turtleDrawing.getHeight());

        Color backgroundColor = turtleDrawing.getBackgroundColor();
        exportObject.put("backgroundColor", String.format("#%02x%02x%02x", backgroundColor.getRed(), backgroundColor.getGreen(), backgroundColor.getBlue()));
        exportObject.put("points", points);

        return exportObject;
    }
}
