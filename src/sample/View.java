package sample;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.stage.Stage;
public class View {
    private Label label;
    private Button bouton;
    private Scene scene;
    public View(Stage primaryStage){
        Group root = new Group();
        primaryStage.setTitle("Illustration du modele MVC ");
        primaryStage.setMinWidth(400);
        primaryStage.setMinHeight(300);
        scene=new Scene(root);
//ajouter un label
        label=new Label("0");
        label.setLayoutX(175);
        label.setLayoutY(70);
//ajouter un bouton
        bouton = new Button("Incrémenter");
        bouton.setLayoutX(140);
        bouton.setLayoutY(100);
        root.getChildren().add(label);
        root.getChildren().add(bouton);
        primaryStage.setScene(scene);
        primaryStage.show();}
    public Button getButton(){
        return bouton;
    }
    public void setText(String text){label.setText(text);}
}