/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software2;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author SFFPC
 */
public class CalendarViewController implements Initializable {
    @FXML
    private ComboBox SortByBox;
    @FXML
    private TableView AppointmentTable;
    @FXML
    private Button NewCustomer;
    @FXML
    private Button EditCustomer;
    @FXML
    private Button ScheduleAppointment;
    @FXML
    private Button EditAppointment;
    @FXML
    private Button Reports;
    @FXML
    private RadioButton local;
    @FXML
    private RadioButton GMT;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AppointmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        
        //Setting up Button Listeners
        NewCustomer.setOnAction((ActionEvent e) -> {
            Parent window1;
            try {
                window1 = FXMLLoader.load(getClass().getResource("NewCustomer.fxml"));
                Stage mainStage;
                mainStage = Main.parentWindow;
                mainStage.getScene().setRoot(window1);
                mainStage.sizeToScene();
            } catch (IOException ex) {
                Logger.getLogger(CalendarViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });   
        
        EditCustomer.setOnAction((ActionEvent e) -> {
            Parent window1;
            try {
                window1 = FXMLLoader.load(getClass().getResource("EditCustomer.fxml"));
                Stage mainStage;
                mainStage = Main.parentWindow;
                mainStage.getScene().setRoot(window1);
                mainStage.sizeToScene();
            } catch (IOException ex) {
                Logger.getLogger(CalendarViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        ScheduleAppointment.setOnAction((ActionEvent e) -> {
            Parent window1;
            try {
                window1 = FXMLLoader.load(getClass().getResource("NewAppointment.fxml"));
                Stage mainStage;
                mainStage = Main.parentWindow;
                mainStage.getScene().setRoot(window1);
                mainStage.sizeToScene();
            } catch (IOException ex) {
                Logger.getLogger(CalendarViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        EditAppointment.setOnAction((ActionEvent e) -> {
            Parent window;
            try {
                window = FXMLLoader.load(getClass().getResource("EditAppointment.fxml"));
                Stage mainStage;
                mainStage = Main.parentWindow;
                mainStage.getScene().setRoot(window);
                mainStage.sizeToScene();
            } catch (IOException ex) {
                Logger.getLogger(CalendarViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Reports.setOnAction((ActionEvent e) -> {
            Parent window;
            try {
                window = FXMLLoader.load(getClass().getResource("Reports.fxml"));
                Stage mainStage;
                mainStage = Main.parentWindow;
                mainStage.getScene().setRoot(window);
                mainStage.sizeToScene();
            } catch (IOException ex) {
                Logger.getLogger(CalendarViewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }    
    
}
