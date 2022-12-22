package com.example.prototype;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public TextField lbl;
    public Button btn;
    public Canvas can;
    public ListView listik;
    public ColorPicker colorPic;
    public TextField txt;
    @FXML
    private Label welcomeText;
    private ObservableList<Shape> itemsList;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void addPicker(ActionEvent actionEvent) {
        GraphicsContext gr = can.getGraphicsContext2D();
        gr.clearRect(0, 0, can.getWidth(), can.getHeight());
    }

    public void onClick(MouseEvent mouseEvent) {
        double x = mouseEvent.getX();
        double y = mouseEvent.getY();

        listik.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        int index = listik.getSelectionModel().getSelectedIndex();
        int stx = Integer.parseInt(String.valueOf(txt.getText()));
        Shape shape = itemsList.get(index);
        shape.setX(x);
        shape.setY(y);
        shape.setH(stx);
        shape.setColor(colorPic.getValue());
        shape.draw(can.getGraphicsContext2D());

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*Angle ang = new Angle(1,1, colorPic.getValue());
        Triangle tri = new Triangle(1,1, colorPic.getValue());
        Circle cir = new Circle(1,1,100, colorPic.getValue());
        Square sqr = new Square(1,1, colorPic.getValue());*/

        /*itemsList = FXCollections.observableArrayList(ang, tri, cir, sqr);
        listik.setItems(itemsList);*/
        itemsList = FXCollections.observableArrayList(new Angle(1), new Circle(1), new Square(1), new Triangle(1));
        listik.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listik.setCellFactory(new Callback<ListView<Shape>,ListCell<Shape>>() {
            @Override
            public ListCell<Shape> call(ListView<Shape> list) {
                return new ShapeCell();
            }
        });
        listik.setItems(itemsList);
    }
}