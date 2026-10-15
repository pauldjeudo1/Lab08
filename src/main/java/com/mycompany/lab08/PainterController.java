/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab08;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 * FXML Controller class
 *
 * @author Paul Djeudo - 2586403
 */
public class PainterController implements Initializable {

    @FXML
    private Pane drawingAreaPane;
    @FXML
    private RadioButton blackRadioButton;
    @FXML
    private ToggleGroup colorToggleGroup;
    @FXML
    private RadioButton redRadioButton;
    @FXML
    private RadioButton greenRadioButton;
    @FXML
    private RadioButton blueRadioButton;
    @FXML
    private RadioButton smallRadioButton;
    @FXML
    private ToggleGroup sizeToggleGroup;
    @FXML
    private RadioButton mediumRadioButton;
    @FXML
    private RadioButton largeRadioButton;
    @FXML
    private Button undoButton;
    @FXML
    private Button clearButton;
    
    private PenSize radius = PenSize.MEDIUM; // circle radius
    private Paint brushColor = Color.BLACK;

    @FXML
    void colorRadioButtonSelected(ActionEvent event) {
        Color newColor = (Color) colorToggleGroup.getSelectedToggle().getUserData();
        brushColor = newColor;
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle circle = new Circle(event.getX(), event.getY(), radius.getRadius());
        circle.setFill(brushColor);
        drawingAreaPane.getChildren().add(circle);
    }

    @FXML
    void sizeRadioButtonSelected(ActionEvent event) {
        PenSize newPenSize = (PenSize) sizeToggleGroup.getSelectedToggle().getUserData();
        radius = newPenSize;
    }

    @FXML
    void undoButtonPressed(ActionEvent event) {
        List elements = drawingAreaPane.getChildren();
        if (!elements.isEmpty()) {
            elements.remove(elements.get(elements.size() - 1));
        }
    }
    
    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    /**
     * Initializes the controller class.
     */
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        blackRadioButton.setUserData(Color.BLACK);
        redRadioButton.setUserData(Color.RED);
        blueRadioButton.setUserData(Color.BLUE);
        greenRadioButton.setUserData(Color.GREEN);
        smallRadioButton.setUserData(PenSize.SMALL);
        mediumRadioButton.setUserData(PenSize.MEDIUM);
        largeRadioButton.setUserData(PenSize.LARGE);
    }    
    
    public enum PenSize {
        SMALL(2), MEDIUM(4), LARGE(6);
        
        private final int radius;
        
        PenSize(int radius) {
            this.radius = radius;
        }

        public int getRadius() {
            return radius;
        }
        
    }
    
}
