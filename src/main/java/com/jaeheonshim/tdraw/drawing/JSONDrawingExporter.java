package com.jaeheonshim.tdraw.drawing;

import com.jaeheonshim.tdraw.turtle.TurtleDrawing;
import org.json.JSONArray;
import org.json.JSONObject;

public class JSONDrawingExporter {
    public static JSONObject export(TurtleDrawing turtleDrawing) {
        JSONArray points = new JSONArray();
        for(TurtleDrawing.DrawPoint drawPoint : turtleDrawing.getDrawPoints()) {
            JSONObject drawPointJSON = new JSONObject();
            drawPointJSON.put("x", drawPoint.getLocation().x);
            drawPointJSON.put("y", drawPoint.getLocation().y);
            drawPointJSON.put("heading", drawPoint.getHeading());
            drawPointJSON.put("draw", drawPoint.isDraw());

            points.put(drawPointJSON);
        }

        JSONObject exportObject = new JSONObject();
        exportObject.put("width", turtleDrawing.getWidth());
        exportObject.put("height", turtleDrawing.getHeight());
        exportObject.put("points", points);

        return exportObject;
    }
}
