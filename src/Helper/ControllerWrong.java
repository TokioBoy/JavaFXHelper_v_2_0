package Helper;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerWrong {
    @FXML
    private ImageView imgend;

    @FXML
    void initialize() throws IOException {
        imgend.setOnMouseClicked(event -> {
            Stage stage1 = (Stage) imgend.getScene().getWindow();
            stage1.close();
        });
    }
}