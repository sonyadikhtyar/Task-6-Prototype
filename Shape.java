package com.example.prototype;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape implements Cloneable {
    //параметры фигуры - приватные поля

    protected Color color;
    protected int h;
    protected double x, y;

    // объявление абстрактных методов

    abstract double area();

    abstract void draw( GraphicsContext gr);
    //abstract void draw( GraphicsContext gr, int x, int y);

    // конструктор
    public Object clone() {

        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    public Shape() {
        this.color = Color.BLACK;
        this.x = 1;
        this.y = 1;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setH(int h) {
        this.h = h;
    }
// реализация методов

    public void setColor(Color color) {

        this.color = color;     }
}
