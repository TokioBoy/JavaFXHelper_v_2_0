package Helper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;

public class ControllerMain {

    @FXML
    private Button btngames;

    @FXML
    private Button btnmvideo;

    @FXML
    private Button btnsites;

    @FXML
    private Button btnpogodnik;

    @FXML
    private Button btnexit;

    @FXML
    private ImageView imgnew3;
// Меню
    @FXML
    void initialize() throws IOException {
        btngames.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Page5.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Helper");
            stage.setResizable(false);
            stage.show();
            Stage stage1 = (Stage) btngames.getScene().getWindow();
            stage1.close();
        });
        btnmvideo.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Page2.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Helper");
            stage.setResizable(false);
            stage.show();
            Stage stage1 = (Stage) btnmvideo.getScene().getWindow();
            stage1.close();
        });
        btnpogodnik.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Page3.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Helper");
            stage.setResizable(false);
            stage.show();
            Stage stage1 = (Stage) btnpogodnik.getScene().getWindow();
            stage1.close();
        });
        btnsites.setOnAction(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Page1.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Helper");
            stage.setResizable(false);
            stage.show();
            Stage stage1 = (Stage) btnsites.getScene().getWindow();
            stage1.close();
        });
        imgnew3.setOnMouseClicked(event -> {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("PageMain.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Helper");
            stage.setResizable(false);
            stage.show();
        });
}
@FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) btnexit.getScene().getWindow();
        // do what you have to do
        stage.close();}
}