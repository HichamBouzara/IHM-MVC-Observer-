package sample2;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.stage.Stage;

public class SpinnerView implements ChangedValueListener{
    private Label label;
    private Button bouton;
    private Scene scene;
    private Spinner<Integer> spinner;
    public SpinnerView(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        scene=new Scene(root);
//ajouter un spinner
        spinner = new Spinner<Integer>();
        spinner.setLayoutX(140);
        spinner.setLayoutY(70);
//ajouter un label
        label=new Label("?");
        label.setLayoutX(175);
        label.setLayoutY(40);
//ajouter un bouton
        bouton = new Button("Valider");
        bouton.setLayoutX(140);
        bouton.setLayoutY(100);
        root.getChildren().add(spinner);
        root.getChildren().add(bouton);
        root.getChildren().add(label);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public Button getButton(){
        return bouton;
    }
    public Spinner getSpinner(){
        return spinner;
    }
    public void setText(String text){label.setText(text);}

    @Override
    public void volumeChanged(ChangedValueEvent event) {
        int value = event.getNewValue();
        label.setText(Integer.toString(value));
        spinner.setValueFactory(new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 1000, value));
    }
}
