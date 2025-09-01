package showhide;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
* written by Solomon Ibrayev on 28/08/2025
*/public class ShowHideController {
    @FXML
    private Label lblShowHide;

    @FXML
    private Button btnShowHide;

    @FXML
    protected void onShowHideButtonClick(){
        if(btnShowHide.getText().equals("SHOW")){
            lblShowHide.setText("Hello");
            btnShowHide.setText("HIDE");
        }else{
            lblShowHide.setText("...");
            btnShowHide.setText("SHOW");
        }
    }
}
