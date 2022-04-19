package Helper;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ControllerSecond {
    @FXML
    private Button btnpw;

    @FXML
    private Button btnaria;

    @FXML
    private Button btns;

    @FXML
    private Button btnx1;

    @FXML
    private Button btnx2;

    @FXML
    private Button btnx3;

    @FXML
    private Button btnx4;

    @FXML
    private Button btnx5;

    @FXML
    private Button btnx6;

    @FXML
    private Button btnx7;

    @FXML
    private Button btnx8;

    @FXML
    private Button btnx9;

    @FXML
    private Button btnx10;

    @FXML
    private Button btnx11;

    @FXML
    private Button btnx12;

    @FXML
    private Button btnx13;

    @FXML
    private Button btnx14;

    @FXML
    private Button btnx15;

    @FXML
    private Button btnx16;

    @FXML
    private Button btnsg;

    @FXML
    private Button next2;

    @FXML
    private Button back1;

    //Возвразение в меню
    @FXML
    void initialize() throws IOException {
        back1.setOnAction(event -> {
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
            Stage stage1 = (Stage) back1.getScene().getWindow();
            stage1.close();

            //кнопки ведущие по ссылкам на сайты , закрывают окно
        });
        btnaria.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=LKfgZWcSDMA&t=601s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnaria.getScene().getWindow();
            stage.close();
        });
        btnpw.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=_ODpg3ZPZ2w"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnpw.getScene().getWindow();
            stage.close();
        });
        btns.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=5oV-vhsk7Ns"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btns.getScene().getWindow();
            stage.close();
        });
        btnsg.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=skZWCYRyF5M&t=4749s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnsg.getScene().getWindow();
            stage.close();
        });
        btnx1.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=Nm69iFPVJzQ&t=2445s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx1.getScene().getWindow();
            stage.close();
        });
        btnx2.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=0-C0lCPFTj8&t=161s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx2.getScene().getWindow();
            stage.close();
        });
        btnx3.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=yHNx_wP9Pvk&t=2835s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx3.getScene().getWindow();
            stage.close();
        });
        btnx4.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=jqc1g0Nr4uk"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx4.getScene().getWindow();
            stage.close();
        });
        btnx5.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=zHQhQVFgKU4"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx5.getScene().getWindow();
            stage.close();
        });
        btnx6.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=aiY3gHELPzM"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx6.getScene().getWindow();
            stage.close();
        });
        btnx7.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=dQFJWwtBCUc"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx7.getScene().getWindow();
            stage.close();
        });
        btnx8.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=pAyCpmsriq4&t=1209s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx8.getScene().getWindow();
            stage.close();
        });
        btnx9.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=gMR4uWcSU00&t=345s"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx9.getScene().getWindow();
            stage.close();
        });
        btnx10.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=YfrTWY7AMf0"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx10.getScene().getWindow();
            stage.close();
        });
        btnx11.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=IzopIXnCpsU"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx11.getScene().getWindow();
            stage.close();
        });
        btnx12.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=e7kJRGPgvRQ"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx12.getScene().getWindow();
            stage.close();
        });
        btnx13.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=Q9yYIAC8hvY"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx13.getScene().getWindow();
            stage.close();
        });
        btnx14.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=f55CqLc6IR0"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx14.getScene().getWindow();
            stage.close();
        });
        btnx15.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=W-zdCa31gME"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx15.getScene().getWindow();
            stage.close();
        });
        btnx16.setOnAction(event -> {

            try {
                Desktop d = Desktop.getDesktop();

                d.browse(new URI("https://www.youtube.com/watch?v=UvMDCwW5tlk"));
            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (URISyntaxException use) {
                use.printStackTrace();
            }
            Stage stage = (Stage) btnx16.getScene().getWindow();
            stage.close();
        });

    }
}
