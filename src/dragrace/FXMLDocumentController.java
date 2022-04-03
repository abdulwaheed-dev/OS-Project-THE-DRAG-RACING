/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dragrace;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import com.jfoenix.controls.JFXButton;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


/**
 *
 * @author daniy
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;

    @FXML
    private JFXButton play;

    @FXML
    private JFXButton about;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) 
    {
        // TODO
    }    

    @FXML
    private void playNow(ActionEvent event) throws IOException 
    {
                final Parent root1=FXMLLoader.load(getClass().getResource("drag.fxml"));
                Scene sc1=new Scene(root1);
                Stage mainWin=new Stage();
                mainWin.initStyle(StageStyle.UTILITY);
                mainWin.setScene(sc1);
                mainWin.show();
                mainWin.setResizable(false)  ;
    }

    @FXML
    private void showAbout(ActionEvent event) throws IOException 
    {
                final Parent root1=FXMLLoader.load(getClass().getResource("about.fxml"));
                Scene sc1=new Scene(root1);
                Stage mainWin=new Stage();
                mainWin.initStyle(StageStyle.UTILITY);
                mainWin.setScene(sc1);
                mainWin.show();
                mainWin.setResizable(false)  ;
    }
    
}


