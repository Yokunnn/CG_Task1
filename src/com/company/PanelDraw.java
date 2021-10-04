package com.company;

import javax.swing.*;
import java.awt.*;

public class PanelDraw extends JPanel {
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        g2d.setColor(Color.GREEN);
        drawDot(g2d);
        drawEllipse(g2d);
        drawRectangle(g2d);
        drawTriangle(g2d);
    }

    public void drawDot(Graphics2D g2d){
        g2d.drawLine(5,5,5,5);
    }

    public void drawEllipse(Graphics2D g2d){
        g2d.fillOval(100,300,100,50);
    }

    public void drawTriangle(Graphics2D g2d){
        g2d.fillPolygon(new int[]{300,350,400}, new int[]{300,350,300}, 3);
    }

    public void drawRectangle(Graphics2D g2d){
        g2d.fillPolygon(new int[]{500,500,600,600}, new int[]{300,400,400,300}, 4);
    }
}
