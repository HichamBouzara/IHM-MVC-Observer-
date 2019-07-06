package sample;

import javafx.event.*;
public class Controller {
    private Model model;
    private View view;
    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }
    public void control(){
        view.getButton().setOnAction(e -> traitClicMethod());
    }
    private void traitClicMethod(){
        int valeur = model.getValue();
        valeur++;
        model.setValue(valeur);
        view.setText(Integer.toString(model.getValue()));}
}