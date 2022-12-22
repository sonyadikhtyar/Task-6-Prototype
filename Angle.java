package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Angle extends Shape {
    @Override
    double area() {
        return 0;
    }

    public Angle(int h) {
        this.h = h;
        //super(x, y, color);
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(10);
        gr.fillRect(x, y, h, 5);
        /*
        gr.strokePolygon(new double[]{25, 250},
                new double[]{25,25},2
        );
        gr.strokePolygon(new double[]{30, 30},
                new double[]{25,250},2
        );
        */
        gr.strokeRect(x, y, h, 5);
        gr.strokeRect(x, y, 5, h);
    }

    @Override
    public String toString() {
        return "Angle";
    }
}
