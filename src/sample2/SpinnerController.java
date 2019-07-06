package sample2;

import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class SpinnerController {
    private Model model;
    private SpinnerView view;
    private InputView view2;
    private Spinner spinner;
    public SpinnerController(Model model, SpinnerView view, InputView view2){
        this.model = model;
        this.view = view;
        this.view2 = view2;
        addListenersToModel();
    }
    private void addListenersToModel() {
        model.addVolumeListener(view);
    }
    public void control(){

        this.spinner = view.getSpinner();
        SpinnerValueFactory SVF  = new SpinnerValueFactory.IntegerSpinnerValueFactory(0, 100);
        SVF.setWrapAround(true);
        spinner.setValueFactory(SVF);
        view.getButton().setOnAction(e -> traitClicMethod());
    }
    private void traitClicMethod(){
        int value = (Integer)spinner.getValue();
        int valeur =  value;//model.getValue() + value;
        model.setValue(valeur);
        //view.setText(Integer.toString(valeur));
        //view2.setText(Integer.toString(valeur));
    }
}