package graficfx.chernovikfx;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class lab132Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button rasButton;

    @FXML
    private TextArea vivodSecondFunction;

    @FXML
    private TextField xkField;

    @FXML
    private TextField xnField;
    @FXML
   void rasButtonClick() {
       String xkZnach = xkField.getText();
       String xnZnach = xnField.getText();
       double xk = Integer.parseInt(xkZnach);
       double xn = Integer.parseInt(xnZnach);
        List<String> arr1 = new ArrayList<>();
        double h = (xk - xn) / 10;
        int N = 8;
        double res;
        for (double x = xn; x <= xk; x += h) {
            res = 0;
            for (int i = 0; i <= N; i++) {
                double a1 = Math.pow(x, 2 * i + 1);
                double a2 = getFactorial(2 * i + 1);
                res += a1 / a2;
            }
            String s = String.valueOf((float) x);
            String res1 = String.valueOf((float) res);
            arr1.add("При x = " + s + ", " + "S(x) = " + res1);
        }
        for (String a : arr1) {
            vivodSecondFunction.setText(vivodSecondFunction.getText() + System.lineSeparator() + a);
        }
   }

    double getFactorial(int f) {
        double result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}
