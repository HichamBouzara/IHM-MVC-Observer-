package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;


public class InputController {
    private Model model;
    private InputView view;
    private TextField textField;
    private SpinnerView view2;
    public InputController(Model model, InputView view, SpinnerView view2) {
        this.model = model;
        this.view = view;
        this.view2 = view2;

    }

    public void control() {
        this.textField = view.getTextField();
        view.getButton().setOnAction(e -> traitClicMethod());
    }

    private void traitClicMethod() {
        int value =  Integer.parseInt(textField.getText());
        model.setValue(value);
        view.setText(Integer.toString(value));
        view2.setText(Integer.toString(value));
        view2.getSpinner().getValueFactory().setValue(value);
    }
}
