package graficfx.chernovikfx;

import java.net.URL;
import java.util.*;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class lab14Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField aField;

    @FXML
    private TextField bField;

    @FXML
    private TextField cField;

    @FXML
    private TextField dField;

    @FXML
    private TextField eField;

    @FXML
    private Button sortirovkaBtn;

    @FXML
    void sortBtnClick() {
       /* Map<Integer,TextField> textFieldsArr = new HashMap();
        textFieldsArr.put(1, aField);
        textFieldsArr.put(2,bField);
        textFieldsArr.put(3,cField);
        textFieldsArr.put(4,dField);
        textFieldsArr.put(5,eField); */
        String arr2 = aField.getText() + bField.getText() + cField.getText() + dField.getText() + eField.getText();
        char[] sim = arr2.toCharArray();
        char[] sim2 = logic(sim);
        String sim3 = Arrays.toString(sim2);
        String nexText = sim3.replaceAll("[\\[\\]]", "");
        String nexText1 = nexText.replaceAll(",", "");
        String[] word = nexText1.split(" ");
        aField.setText(word[0]);
        bField.setText(word[1]);
        cField.setText(word[2]);
        dField.setText(word[3]);
        eField.setText(word[4]);
        }

    boolean isDigit(char ch) {
        return Character.isDigit(ch);
    }

    char[] logic(char[] sim) {
        int kkk = sim.length;
        char[] sim2 = new char[kkk];
        int count = 0;
        for (int i = 0; i < kkk; i++) {
            char ch = sim[i];
            if (isDigit(ch) == true) {
                sim2[count] = ch;
                count++;
            }
        }
        for (int i = 0; i < kkk; i++) {
            char ch = sim[i];
            if (isDigit(ch) != true) {
                sim2[count] = ch;
                count++;
            }
        }
        return sim2;
    }
}
