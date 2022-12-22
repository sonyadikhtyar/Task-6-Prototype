package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;

public class Square extends Shape {
    @Override
    double area() {
        return 0;
    }

    public Square(int h) {
        this.h = h;
        //super(x, y, color);
    }
    @Override
    void draw(GraphicsContext gr) {
        gr.setStroke(color);
        gr.setLineWidth(10);
        gr.strokeRect(x, y, h, 150);
    }

    @Override
    public String toString() {
        return "Square";
    }
}
