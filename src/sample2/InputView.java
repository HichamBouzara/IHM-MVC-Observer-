package sample2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class InputView implements ChangedValueListener {
    private Label label;
    private Button bouton;
    private Scene scene;
    private TextField textField;
    public InputView(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        scene=new Scene(root);

//ajouter un text field
        textField = new TextField();
        textField.setLayoutX(140);
        textField.setLayoutY(70);
        // force the field to be numeric only
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
//ajouter un label
        label=new Label("?");
        label.setLayoutX(175);
        label.setLayoutY(40);
//ajouter un bouton
        bouton = new Button("Valider");
        bouton.setLayoutX(140);
        bouton.setLayoutY(100);
        root.getChildren().add(textField);
        root.getChildren().add(bouton);
        root.getChildren().add(label);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public Button getButton(){
        return bouton;
    }
    public TextField getTextField(){
        return textField;
    }
    public void setText(String text){label.setText(text);}

    @Override
    public void volumeChanged(ChangedValueEvent event) {
        String value = Integer.toString(event.getNewValue());
        label.setText(value);
        textField.setText(value);
    }
}
