package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Triangle extends Shape {
    @Override
    double area() {
        return 0;
    }

    public Triangle(int h) {
        this.h = h;
        //super(x, y, color);
    }

    @Override
    void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(h);
        gr.strokePolygon(new double[]{x, x-30, x+30, 40, 35},
                new double[]{y-100, y, y},
                3
        );
    }

    @Override
    public String toString() {
        return "Triangle";
    }
}
