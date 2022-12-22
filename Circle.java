package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Circle extends Shape {
    double radius = 5;

    public Circle(int h) {
        this.h = h;
    }

    @Override
    double area() {
        return 0;
    }

    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(100);
        gr.strokeOval(x, y, h, h);
    }

    @Override
    public String toString() {
        return "Circle";
    }
}
