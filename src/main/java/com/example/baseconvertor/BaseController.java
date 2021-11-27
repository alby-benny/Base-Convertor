package com.example.baseconvertor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.net.URL;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.*;

public class BaseController implements Initializable {


    @FXML
    private ChoiceBox<String> fchoice;

    private String[] fbase = {"Decimal","Hexadecimal","Octal","Binary"};

    @FXML
    private TextField ftext;

    @FXML
    private TextField rtext;

    @FXML
    private Label rlabel;

    @FXML
    private ChoiceBox<String> rchoice;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1){

        fchoice.getItems().addAll(fbase);
        fchoice.setOnAction(this::convert);
        rchoice.getItems().addAll(fbase);
        rchoice.setOnAction(this::convert);

    }

    int dec,temp;
    String fbase1,rbase1,result,biny;

    public void convert (ActionEvent event){
        fbase1 = fchoice.getValue();
        rbase1 = rchoice.getValue();
        rlabel.setText("");

        if(fbase1 == "Decimal") {
            biny=ftext.getText();
            if (biny != "") {
                try {
                    dec = Integer.parseInt(biny);
                    if (rbase1 == "Decimal") {
                        rtext.setText(String.valueOf(dec));
                    } else {
                        deciall s1 = new deciall();
                        result = s1.deci(dec, rbase1);
                        rtext.setText(String.valueOf(result));
                    }
                    rlabel.setText("");
                } catch (NumberFormatException e) {
                    rlabel.setText("Enter only decimal numbers");
                    rtext.setText("");
                }
            }
        }

        else if(fbase1 == "Binary") {
            biny=ftext.getText();
            if (biny !="") {
                try {
                    temp = Integer.parseInt(biny, 2);
                    if(rbase1=="Binary") {
                        rtext.setText(String.valueOf(biny));
                        rlabel.setText("");
                    }
                    else {
                        deciall s1 = new deciall();
                        result=s1.bina(temp,rbase1);
                        rtext.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    rlabel.setText("Enter Binary code only");
                    result = "";
                }
            }
        }

        else if (fbase1 == "Octal"){
            biny=ftext.getText();
            if (biny !="") {
                try {
                    temp = Integer.parseInt(biny, 8);
                    if(rbase1=="Octal") {
                        rtext.setText(String.valueOf(biny));
                        rlabel.setText("");
                    }
                    else {
                        deciall s1 = new deciall();
                        result=s1.octal(temp,rbase1);
                        rtext.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    rlabel.setText("Enter Octal code only");
                    result = "";
                }
            }
        }

        else if (fbase1 == "Hexadecimal"){
            biny=ftext.getText();
            if (biny !="") {
                try {
                    temp = Integer.parseInt(biny, 16);
                    if(rbase1=="Hexadecimal") {
                        rtext.setText(String.valueOf(biny));
                        rlabel.setText("");
                    }
                    else {
                        deciall s1 = new deciall();
                        result=s1.hexa(temp,rbase1);
                        rtext.setText(String.valueOf(result));
                    }
                } catch (NumberFormatException e) {
                    rlabel.setText("Enter Hexadecimal code only");
                    result = "";
                }
            }
        }


    }

    public void rset(){
        ftext.setText("");
        rtext.setText("");
        rlabel.setText("");
    }
}
