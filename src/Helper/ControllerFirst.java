package Helper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ControllerFirst {
    @FXML
    private ImageView img1;
    @FXML
    private Button btnx;
    @FXML
    private Button btn;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6_1;

    @FXML
    private Button btn6_2;

    @FXML
    private Button next1;

    @FXML
    void initialize() throws IOException {
        next1.setOnAction(event -> {
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
            Stage stage1 = (Stage) next1.getScene().getWindow();
            stage1.close();
        });
        ////кнопки ведущие по ссылкам на сайты , некоторые закрывают окно
        btn.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("http://www.youtube.com"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn.getScene().getWindow();
            stage.close();
        });
        btn2.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("http://www.google.com"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn2.getScene().getWindow();
            stage.close();
        });
        btn3.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://lms.human.ua/app/home"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn3.getScene().getWindow();
            stage.close();
        });

        btn4.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/user/tenshinryuhyouho"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn4.getScene().getWindow();
            stage.close();
        });

        btn5.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.facebook.com/"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn5.getScene().getWindow();
            stage.close();
        });
        btn6_1.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://author.today/"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn6_1.getScene().getWindow();
            stage.close();
        });
        btn6_2.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://mangalib.me/?section=all-updates"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btn6_2.getScene().getWindow();
            stage.close();
        });
        btn7.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://lkk.crimeagasnet.ru/"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        });
        btn8.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("http://voda.crimea.ru/account"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        });
        btn9.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.mega-billing.ru/ru/summary"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
        });

    }

}



