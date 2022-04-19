package Helper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ControllerFifth {

    @FXML
    private Button btnAO;

    @FXML
    private Button btnES;

    @FXML
    private Button btnHE;

    @FXML
    private Button btnTW3;

    @FXML
    private Button btnS;

    @FXML
    private Button btnII;

    @FXML
    private Button btnSB;

    @FXML
    private Button btnD;

    @FXML
    private Button btnT;

    @FXML
    private Button btnV;

    @FXML
    private Button btnEXIT;

    @FXML
    void initialize() throws IOException {
        //Открывают Приложение или папку по указанному пути и закрывают окно
        btnV.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Users\\Vlad\\AppData\\Local\\Viber\\Viber.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnV.getScene().getWindow();
            stage.close();
        });
        btnII.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Program Files\\JetBrains\\IntelliJ IDEA Community Edition 2020.3.1\\bin\\Idea64.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnII.getScene().getWindow();
            stage.close();
        });
        btnES.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Everlasting Summer\\Everlasting Summer.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnES.getScene().getWindow();
            stage.close();
        });

        btnD.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Users\\Vlad\\AppData\\Local\\Discord\\app-0.0.309\\Discord.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnD.getScene().getWindow();
            stage.close();
        });
        btnAO.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Users\\Vlad\\Desktop\\albion\\launcher\\AlbionLauncher.exe"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnAO.getScene().getWindow();
            stage.close();
        });
        btnHE.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Users\\Vlad\\Desktop\\Hellish.Quart.v0.21011\\Hellish Quart\\Hellish Quart.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnHE.getScene().getWindow();
            stage.close();
        });
        btnT.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Users\\Vlad\\AppData\\Roaming\\Telegram Desktop\\Telegram.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnT.getScene().getWindow();
            stage.close();
        });
        btnTW3.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Users\\Vlad\\Desktop\\The.Witcher.3.Wild.Hunt.GOTY.v1.32\\The Witcher 3 Wild Hunt GOTY\\bin\\x64\\witcher3.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnTW3.getScene().getWindow();
            stage.close();
        });
        btnS.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Program Files (x86)\\Steam\\Steam.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnS.getScene().getWindow();
            stage.close();
        });
        btnSB.setOnAction(event -> {
            try {
                Desktop.getDesktop().open(new File("C:\\Program Files (x86)\\Steam\\steamapps\\common\\Total War SHOGUN 2\\Shogun2.exe"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnSB.getScene().getWindow();
            stage.close();
        });
        btnEXIT.setOnAction(event -> {
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
            Stage stage1 = (Stage) btnEXIT.getScene().getWindow();
            stage1.close();
        });

    }
}
