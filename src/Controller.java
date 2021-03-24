import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;


public class Controller {

    public Button one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, repeat, divide, equal, comma;
    public Label display;
    public Button resetB;
    boolean canWrite = true;

    public void setDisplay(String n) {
        if(canWrite) {
            if (display.getText().equals("0"))
                display.setText(n);
            else
                display.setText(display.getText() + n);
        }
    }

    public void displayn(ActionEvent actionEvent) {
        Button buttonpressed = (Button)actionEvent.getSource();
        setDisplay(buttonpressed.getText());
    }
    public void operand(ActionEvent actionEvent){
        Button buttonpressed = (Button)actionEvent.getSource();
        setDisplay(buttonpressed.getText());
    }

    public void equal(ActionEvent actionEvent) throws ArithmeticException{
        try{
        Expression result = new ExpressionBuilder(display.getText()).build();
        display.setText(String.valueOf(result.evaluate()));
        canWrite = false;
        }catch(Exception e){display.setText("Math error");}

    }

    public void reset(ActionEvent actionEvent) {
        display.setText("0");
        canWrite = true;
    }
}
