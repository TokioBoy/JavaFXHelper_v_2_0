package Helper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.json.JSONObject;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ResourceBundle;

public class ControllerThird {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField gorod;

    @FXML
    private Button pogoda;

    @FXML
    private Text infopogoda;

    @FXML
    private Text tempnow;

    @FXML
    private Label lblwrong;

    @FXML
    private Text feellike;

    @FXML
    private Text Maxtemp;

    @FXML
    private Text MinTemp;

    @FXML
    private Text pressure;

    @FXML
    private Text pozelanie;

    @FXML
    private Button btnclose;

    @FXML
    private Button btnnew1;

    @FXML
    private Button back2;

    //Возвращает в меню
    @FXML
    void initialize() {
        back2.setOnAction(event -> {
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
            Stage stage1 = (Stage) back2.getScene().getWindow();
            stage1.close();
        });
        //Собственно код к погоднику  , получение информации и вывод по указанным параметрам
        pogoda.setOnAction(event -> {
            String getUserCity = gorod.getText().trim();
            if (!getUserCity.equals("")) {
                String output = getUrlContent("http://api.openweathermap.org/data/2.5/weather?q=" + getUserCity + "&appid=7e71e0840dd0f838aa183f8a5cfcbc96&units=metric&lang=ru");

                if (!output.isEmpty()) {
                    JSONObject obj = new JSONObject(output);
                    tempnow.setText("Температура: " + obj.getJSONObject("main").getDouble("temp"));
                    feellike.setText("Ощущается: " + obj.getJSONObject("main").getDouble("feels_like"));
                    Maxtemp.setText("Максимум: " + obj.getJSONObject("main").getDouble("temp_max"));
                    MinTemp.setText("Минимум: " + obj.getJSONObject("main").getDouble("temp_min"));
                    pressure.setText("Давление: " + obj.getJSONObject("main").getDouble("pressure"));
                }
            }
        });
    }

    private static String getUrlContent(String urlAdress) {
        StringBuffer content = new StringBuffer();

        try {
            URL url = new URL(urlAdress);
            URLConnection urlConn = url.openConnection();

            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                content.append(line + "\n");
            }
            bufferedReader.close();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Ошибка");
            alert.setHeaderText(null);
            alert.setContentText("Такого города нет или язык не поддерживаеться , попробуйте ввести название города на английском ");
            alert.showAndWait();
        }
        return content.toString();
    }

}
