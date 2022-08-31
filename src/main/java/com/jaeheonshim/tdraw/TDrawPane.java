package com.jaeheonshim.tdraw;

import javax.swing.*;
import java.awt.*;

public class TDrawPane extends JPanel {
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(760, 610);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
}
