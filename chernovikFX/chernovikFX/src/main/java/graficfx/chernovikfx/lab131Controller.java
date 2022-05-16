package graficfx.chernovikfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class lab131Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button rasschet;

    @FXML
    private TextArea vivodField;

    @FXML
    void resultbtn(ActionEvent event) {
        List<String> str = new ArrayList<>();
        double xn = 0;
        double xk = 1;
        double h = (xk - xn) / 10;
        for (double x = xn; x <= xk; x += h) {
            double func0 = (Math.exp(x) - Math.exp(-x)) / 2;
            String s = String.valueOf((float) x);
            String s1 = String.valueOf((float) func0);
            str.add("При x = " + s + ", " + "Y(x) = " + s1);
        }
        for (String a: str) {
            vivodField.setText(vivodField.getText() + System.lineSeparator() + a);
        }
    }
}
