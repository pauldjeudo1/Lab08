/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.lab08;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author djeud
 */
public class PrimaryController implements Initializable {

    @FXML
    private VBox drawingAreaPane;
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

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
