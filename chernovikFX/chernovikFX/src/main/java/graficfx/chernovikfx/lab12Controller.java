package graficfx.chernovikfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class lab12Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField fifthField;

    @FXML
    private TextField firstField;

    @FXML
    private TextField fourthField;

    @FXML
    private Button ravnoButton;

    @FXML
    private Text result;

    @FXML
    private TextField secondField;

    @FXML
    private TextField thrdField;

    @FXML
    void initialize() {

    }

    @FXML
    void podschet() {
        String res = logic12();
        result.setText(res);
    }

    String logic12() {
        String fres = firstField.getText();
        String sres = secondField.getText();
        String fhres = thrdField.getText();
        String tfres = fourthField.getText();
        String fires = fifthField.getText();
        int i1 = Integer.parseInt(fres);
        int i2 = Integer.parseInt(sres);
        int i3 = Integer.parseInt(fhres);
        int i4 = Integer.parseInt(tfres);
        int i5 = Integer.parseInt(fires);
        int sum = (i1 + i2 + i3 + i4 + i5) / 5;
        String res = Integer.toString(sum);
        return res;
    }


}
