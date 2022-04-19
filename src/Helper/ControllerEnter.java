package Helper;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ControllerEnter {
    @FXML
    private Label fieldenter;

    @FXML
    private TextField password;
    @FXML
    private Button btnenter;

    @FXML
    private Label text;
    @FXML
    private Text texthello;
    @FXML
    private Button btnclose;

    int a = 1;

    //Окно входа
    @FXML
    void initialize() throws IOException {
        String pwd = password.getText();
        if (pwd.equals("dragon90")) {
            btnenter.setOnAction(event1 -> {
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
                Stage stage1 = (Stage) btnenter.getScene().getWindow();
                stage1.close();
            });

        } else if (pwd.equals("вкфпщт90")) {
            btnenter.setOnAction(event1 -> {
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
                Stage stage1 = (Stage) btnenter.getScene().getWindow();
                stage1.close();
            });

        } else if (a == 3) {
            texthello.setText("Неверный пароль");
        } else if (a == 2) {

            try (FileReader reader = new FileReader("C:\\\\Игры\\\\info.txt")) {
                int a;
                while ((a = reader.read()) != -1) {
                    System.out.println(((char)a));
                    String s =String.valueOf((char)a);
                    texthello.setText(s);
                }
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        } else if (a == 6) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Пароль введен неверно 5 раз , вы точно Владислав?");
            alert.showAndWait();
        } else if (a == 10) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Пароль введен неверно 9 раз , осталась 1 попытка");
            alert.showAndWait();
        }
        if (a == 10) {
            btnenter.setOnAction(event1 -> {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("PageWrong.fxml"));
                try {
                    loader.load();
                } catch (IOException e) {
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.setTitle("END");
                stage.setResizable(true);
                stage.show();
                Stage stage1 = (Stage) btnenter.getScene().getWindow();
                stage1.close();
            });
        } else if (pwd.equals("fake")) {
            Stage stage1 = (Stage) btnenter.getScene().getWindow();
            stage1.close();
        } else if (pwd.equals("money")) {
            try {
                Desktop.getDesktop().open(new File("C:\\Игры\\info.txt"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnenter.getScene().getWindow();
            stage.close();
        } else if (pwd.equals("деньги")) {
            try {
                Desktop.getDesktop().open(new File("C:\\Игры\\info.txt"));

            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = (Stage) btnenter.getScene().getWindow();
            stage.close();

        } else {
            a++;
        }

    }

    @FXML
    private void closeButtonAction() {
        // get a handle to the stage
        Stage stage = (Stage) btnclose.getScene().getWindow();
        // do what you have to do
        stage.close();
    }
}